DROP DATABASE IF EXISTS tienda_insumos_inf;

CREATE DATABASE IF NOT EXISTS tienda_insumos_inf;

USE tienda_insumos_inf;

CREATE TABLE IF NOT EXISTS tienda(
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS estanterias(
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_tienda_fk INT NOT NULL,
    tiempo_descuento INT NOT NULL,
    FOREIGN KEY (id_tienda_fk) REFERENCES tienda(id)
);

CREATE TABLE IF NOT EXISTS productos(
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL,
    descripcion TEXT NOT NULL,
    precio int NOT NULL
);

CREATE TABLE IF NOT EXISTS inventario(
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_producto_fk INT NOT NULL,
    id_estanteria_fk INT NOT NULL,
    cantidad INT NOT NULL,
    FOREIGN KEY (id_producto_fk) REFERENCES productos(id),
    FOREIGN KEY (id_estanteria_fk) REFERENCES estanterias(id)
);

CREATE TABLE IF NOT EXISTS ventas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_producto_fk INT NOT NULL,
    cantidad INT NOT NULL,
    total DECIMAL (10,2) NOT NULL,
    FOREIGN KEY (id_producto_fk) REFERENCES productos(id)
);

CREATE TABLE IF NOT EXISTS detalle_venta(
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_venta_fk INT NOT NULL,
    id_producto_fk INT NOT NULL,
    cantidad INT NOT NULL,
    FOREIGN KEY (id_venta_fk) REFERENCES ventas(id),
    FOREIGN KEY (id_producto_fk) REFERENCES productos(id)
);

DELIMITER //

CREATE TRIGGER after_venta_insert
AFTER INSERT ON ventas
FOR EACH ROW
BEGIN
    DECLARE id_producto INT;
    DECLARE cantidad INT;
    
    SET id_producto = (SELECT id FROM productos ORDER BY id LIMIT 1); 
    SET cantidad = NEW.cantidad;

    INSERT INTO detalle_venta (id_venta_fk, id_producto_fk, cantidad)
    VALUES (NEW.id, id_producto, cantidad);
END//

DELIMITER ;

DELIMITER //

CREATE TRIGGER after_venta_insert_prduct
AFTER INSERT ON ventas
FOR EACH ROW
BEGIN
    DECLARE cantidad_en_inventario INT;

    -- Obtener la cantidad actual en el inventario del producto vendido
    SELECT cantidad INTO cantidad_en_inventario
    FROM inventario
    WHERE id_producto_fk = NEW.id_producto_fk
    LIMIT 1;

    -- Verificar si hay suficiente cantidad en inventario
    IF cantidad_en_inventario >= NEW.cantidad THEN
        -- Actualizar el inventario restando la cantidad vendida
        UPDATE inventario
        SET cantidad = cantidad - NEW.cantidad
        WHERE id_producto_fk = NEW.id_producto_fk;
    ELSE
        -- Si no hay suficiente cantidad, puedes manejarlo según tus requisitos (por ejemplo, lanzar un error)
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'No hay suficiente cantidad en inventario para este producto';
    END IF;
END//

DELIMITER ;

