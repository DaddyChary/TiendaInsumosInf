/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db.dao;

import db.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.DetalleVenta;

/**
 *
 * @author DaddyChary
 */
public class DAODetalleVenta implements DAO<DetalleVenta> {

    private Conexion conn;

    public DAODetalleVenta(Conexion conn) {
        this.conn = conn;
    }

    @Override
    public void create(DetalleVenta t) throws SQLException {
        String sql = "INSERT INTO detalle_venta (id, id_venta_fk, id_producto_fk, fecha) VALUES (null, "+ t.getId_venta_fk() +", "+ t.getId_producto_fk()+", "+ t.getFecha() +")";
        conn.execute(sql);
    }

    @Override
    public void update(DetalleVenta t) throws SQLException {
        String sql = "UPDATE detalle_venta SET id_venta_fk = "+ t.getId_producto_fk() +", id_producto_fk = "+ t.getId_producto_fk() +", fecha = "+ t.getFecha() +"";
        conn.execute(sql);
    }

    @Override
    public void delete(DetalleVenta t) throws SQLException {
        String sql = "DELETE FROM detalle_venta WHERE id = " + t.getId() + "";
        conn.execute(sql);
    }

    @Override
    public DetalleVenta getOne(int id) throws SQLException {
        String sql = "SELECT * FROM detalle_venta WHERE id =" + id + "";
        ResultSet rs = conn.execute(sql);
        DetalleVenta detalle_venta = new DetalleVenta();
        if (rs.next()) {
            detalle_venta.setId(rs.getInt("id"));
            detalle_venta.setId_venta_fk(rs.getInt("id_venta_fk"));
            detalle_venta.setId_producto_fk(rs.getInt("id_producto_fk"));
            detalle_venta.setFecha(rs.getDate("fecha"));
        }
        conn.close();
        return detalle_venta;
    }

    @Override
    public List<DetalleVenta> getAll() throws SQLException {
        String sql = "SELECT * FROM detalle_venta";
        ResultSet rs = conn.execute(sql);
        List<DetalleVenta> listaDetalle_Venta = new ArrayList<>();
        while (rs.next()) {
            DetalleVenta detalle_venta = new DetalleVenta();
            detalle_venta.setId(rs.getInt("id"));
            detalle_venta.setId_venta_fk(rs.getInt("id_venta_fk"));
            detalle_venta.setId_producto_fk(rs.getInt("id_producto_fk"));
            detalle_venta.setFecha(rs.getDate("fecha"));
            listaDetalle_Venta.add(detalle_venta);
        }
        conn.close();
        return listaDetalle_Venta;
    }

}
