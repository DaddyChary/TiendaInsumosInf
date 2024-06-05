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
import model.Inventario;

/**
 *
 * @author DaddyChary
 */
public class DAOInventario implements DAO<Inventario>{

    private Conexion conn;

    public DAOInventario(Conexion conn) {
        this.conn = conn;
    }
    
    @Override
    public void create(Inventario t) throws SQLException {
        String sql = "INSERT INTO inventario (id, id_producto_fk, id_estanteria_fk, cantidad) VALUES (null, "+t.getId_producto_fk()+", "+ t.getId_estanteria_fk() +", "+ t.getCantidad() +")";
        conn.execute(sql);
    }

    @Override
    public void update(Inventario t) throws SQLException {
        String sql = "UPDATE inventario SET id_estanteria_fk = "+ t.getId_estanteria_fk() +", cantidad = "+ t.getCantidad() +" WHERE id = "+ t.getId() +"";
        conn.execute(sql);
    }

    @Override
    public void delete(Inventario t) throws SQLException {
        String sql = "DELETE FROM inventario WHERE id = " + t.getId() + "";
        conn.execute(sql);
    }

    @Override
    public Inventario getOne(int id) throws SQLException {
        String sql = "SELECT * FROM inventario WHERE id =" + id + "";
        ResultSet rs = conn.execute(sql);
        Inventario inventario = new Inventario();
        if (rs.next()) {
            inventario.setId(rs.getInt("id"));
            inventario.setId_producto_fk(rs.getInt("id_producto_fk"));
            inventario.setId_estanteria_fk(rs.getInt("id_estanteria_fk"));
            inventario.setCantidad(rs.getInt("cantidad"));
        }
        conn.close();
        return inventario;
    }

    @Override
    public List<Inventario> getAll() throws SQLException {
        String sql = "SELECT * FROM inventario";
        ResultSet rs = conn.execute(sql);
        List<Inventario> listaInventario = new ArrayList<>();
        while (rs.next()) {
            Inventario inventario = new Inventario();
            inventario.setId(rs.getInt("id"));
            inventario.setId_producto_fk(rs.getInt("id_producto_fk"));
            inventario.setId_estanteria_fk(rs.getInt("id_estanteria_fk"));
            inventario.setCantidad(rs.getInt("cantidad"));
            listaInventario.add(inventario);
        }
        conn.close();
        return listaInventario;
    }
    
}
