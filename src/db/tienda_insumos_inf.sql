DROP DATABASE IF EXISTS tienda_insumos_inf;

CREATE DATABASE IF NOT EXISTS tienda_insumos_inf;

USE tienda_insumos_inf;

CREATE TABLE IF NOT EXISTS tienda(
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL,
    cantidad_estanterias INT NOT NULL
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

CREATE TABLE IF NOT EXISTS ventas(
    id INT PRIMARY KEY AUTO_INCREMENT,
    cantidad INT NOT NULL,
    total DECIMAL (10,2) NOT NULL
);

CREATE TABLE IF NOT EXISTS detalle_venta(
    id INT PRIMARY KEY AUTO_INCREMENT,
    id_venta_fk INT NOT NULL,
    id_producto_fk INT NOT NULL,
    fecha DATE NOT NULL,
    FOREIGN KEY (id_venta_fk) REFERENCES ventas(id),
    FOREIGN KEY (id_producto_fk) REFERENCES productos(id)
);