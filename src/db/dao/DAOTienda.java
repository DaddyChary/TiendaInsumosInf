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
import model.Tienda;

/**
 *
 * @author DaddyChary
 */
public class DAOTienda implements DAO<Tienda>{

    private Conexion conn;

    public DAOTienda(Conexion conn) {
        this.conn = conn;
    }
    
    @Override
    public void create(Tienda t) throws SQLException {
        String sql = "INSERT INTO tienda (id, nombre, cantidad_estanterias) VALUES (null, '"+ t.getNombre() +"', "+ t.getCantidadEstantes() +");";
        conn.execute(sql);
    }

    @Override
    public void update(Tienda t) throws SQLException {
        String sql = "UPDATE tienda SET nombre = '"+ t.getNombre() +"', cantidad_estanterias = "+ t.getCantidadEstantes() +" WHERE id = "+ t.getId() +"";
        conn.execute(sql);
    }

    @Override
    public void delete(Tienda t) throws SQLException {
        String sql = "DELETE FORM tienda WHERE id = "+ t.getId() +"";
        conn.execute(sql);
    }

    @Override
    public Tienda getOne(int id) throws SQLException {
        String sql = "SELECT * FROM tienda WHERE id =" + id + "";
        ResultSet rs = conn.execute(sql);
        Tienda tienda = new Tienda();
        if (rs.next()) {
            tienda.setId(rs.getInt("id"));
            tienda.setNombre(rs.getString("nombre"));
            tienda.setCantidadEstantes(rs.getInt("cantidad_estanterias"));
        }
        conn.close();
        return tienda;
    }

    @Override
    public List<Tienda> getAll() throws SQLException {
         String sql = "SELECT * FROM tienda";
        ResultSet rs = conn.execute(sql);
        List<Tienda> listaTienda = new ArrayList<>();
        while (rs.next()) {
            Tienda tienda = new Tienda();
            tienda.setId(rs.getInt("id"));
            tienda.setNombre(rs.getString("nombre"));
            tienda.setCantidadEstantes(rs.getInt("cantidad_estanterias"));
            listaTienda.add(tienda);
        }
        conn.close();
        return listaTienda;
    }
    
    
}
