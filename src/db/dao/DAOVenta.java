/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db.dao;

import db.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.Venta;

/**
 *
 * @author DaddyChary
 */
public class DAOVenta implements DAO<Venta> {

    private Conexion conn;

    public DAOVenta(Conexion conn) {
        this.conn = conn;
    }

    @Override
    public void create(Venta t) throws SQLException {
        String sql = "INSERT INTO ventas (id, cantidad, total) VALUES "
                + "(null, '" + t.getCantidad() + "', " + t.getTotalVenta() + ");";
        conn.execute(sql);
    }

    @Override
    public void update(Venta t) throws SQLException {
        String sql = "UPDATE ventas SET cantidad = '" + t.getCantidad() + "', total = " + t.getTotalVenta() + ""
                + "WHERE id = " + t.getId() + ");";
        conn.execute(sql);
    }

    @Override
    public void delete(Venta t) throws SQLException {
        String sql = "DELETE FROM ventas WHERE id = " + t.getId() + "";
        conn.execute(sql);
    }

    @Override
    public Venta getOne(int id) throws SQLException {
        String sql = "SELECT * FROM ventas WHERE id =" + id + "";
        ResultSet rs = conn.execute(sql);
        Venta venta = new Venta();
        if (rs.next()) {
            venta.setId(rs.getInt("id"));
            venta.setCantidad(rs.getInt("cantidad"));
            venta.setTotalVenta(rs.getFloat("total"));
        }
        conn.close();
        return venta;
    }

    @Override
    public List<Venta> getAll() throws SQLException {
        String sql = "SELECT * FROM ventas";
        ResultSet rs = conn.execute(sql);
        List<Venta> listaVentas = new ArrayList<>();
        while (rs.next()) {
            Venta venta = new Venta();
            venta.setId(rs.getInt("id"));
            venta.setCantidad(rs.getInt("cantidad"));
            venta.setTotalVenta(rs.getFloat("total"));
            listaVentas.add(venta);
        }
        conn.close();
        return listaVentas;
    }
}
