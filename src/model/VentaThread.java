package model;

import db.dao.DAOManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VentaThread extends Thread {

    private boolean running = true;
    private DAOManager manager;

    @Override
    public void run() {
        
        try {
            manager = new DAOManager();
        } catch (SQLException ex) {
            Logger.getLogger(VentaThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while (running) {
            try {
                
                Thread.sleep(10000); // Espera de 10 segundos (10000 milisegundos)
                crearVentas();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (SQLException ex) {
                Logger.getLogger(VentaThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void stopThread() {
        running = false;
    }

    private void crearVentas() throws SQLException {
        // Obtener todas las estanterías
        List<Estanteria> estanterias = manager.getdEstanteria().getAll(); // Reemplaza con tu método DAO para obtener estanterías

        // Iterar sobre cada estantería
        for (Estanteria estanteria : estanterias) {
            // Obtener todos los productos en esta estantería
            List<Inventario> inventario = manager.getdInventario().getProductosEnEstanteria(estanteria.getId()); // Reemplaza con tu método DAO para obtener inventario por estantería

            // Crear una venta para cada producto en inventario
            for (Inventario item : inventario) {
                Producto producto = manager.getdProducto().getProductoById(item.getId_producto_fk()); // Reemplaza con tu método DAO para obtener el producto por ID

                if (producto != null) {
                    // Crear una nueva venta
                    Venta venta = new Venta();
                    venta.setId(producto.getId());
                    venta.setCantidad(1); // Venta de 1 unidad por cada producto
                    venta.setTotalVenta(producto.getPrecio()); // Total de la venta basado en el precio del producto

                    // Guardar la venta en la base de datos o realizar cualquier acción necesaria
                    manager.getdVenta().create(venta); // Reemplaza con tu método DAO para guardar la venta
                }
            }
        }
    }
}
