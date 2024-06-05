
package db.dao;

import db.Conexion;
import java.sql.SQLException;

/**
 *
 * @author DaddyChary
 */
public class DAOManager {

    private Conexion conn;
    
    private DAODetalleVenta dDetalle_Venta;
    private DAOEstanteria dEstanteria;
    private DAOInventario dInventario;
    private DAOProducto dProducto;
    private DAOTienda dTienda;
    private DAOVenta dVenta;
    
    public DAOManager() throws SQLException {
        conn = Conexion.getConexion();
        this.dDetalle_Venta = new DAODetalleVenta(conn);
        this.dEstanteria = new DAOEstanteria(conn);
        this.dInventario = new DAOInventario(conn);
        this.dProducto = new DAOProducto(conn);
        this.dTienda = new DAOTienda(conn);
        this.dVenta = new DAOVenta(conn);
    }

    public DAODetalleVenta getdDetalle_Venta(){
        return dDetalle_Venta;
    }
    
    public DAOEstanteria getdEstanteria(){
        return dEstanteria;
    }
    
    public DAOInventario getdInventario(){
        return dInventario;
    }
    
    public DAOProducto getdProducto(){
        return dProducto;
    }
    
    public DAOTienda getdTienda(){
        return dTienda;
    }

    public DAOVenta getdVenta() {
        return dVenta;
    }
}
