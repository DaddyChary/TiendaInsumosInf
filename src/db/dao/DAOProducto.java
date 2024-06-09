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
import model.Producto;

/**
 *
 * @author DaddyChary
 */
public class DAOProducto implements DAO<Producto> {

    private Conexion conn;

    public DAOProducto(Conexion conn) {
        this.conn = conn;
    }

    @Override
    public void create(Producto t) throws SQLException {
        String sql = "INSERT INTO productos (id, nombre, descripcion, precio) VALUES (null, '" + t.getNombre() + "', '" + t.getDescripcion() + "', " + t.getPrecio() + ")";
        conn.execute(sql);
    }

    @Override
    public void update(Producto t) throws SQLException {
        String sql = "UPDATE productos SET nombre = '" + t.getNombre() + "', descripcion = '" + t.getDescripcion() + "', precio = " + t.getPrecio() + " WHERE id = " + t.getId() + "";
        conn.execute(sql);
    }

    @Override
    public void delete(Producto t) throws SQLException {
        String sql = "DELETE FROM productos WHERE id = " + t.getId() + "";
        conn.execute(sql);
    }

    @Override
    public Producto getOne(int id) throws SQLException {
        String sql = "SELECT * FROM productos WHERE id =" + id + "";
        ResultSet rs = conn.execute(sql);
        Producto producto = new Producto();
        if (rs.next()) {
            producto.setId(rs.getInt("id"));
            producto.setNombre(rs.getString("nombre"));
            producto.setDescripcion(rs.getString("descripcion"));
            producto.setPrecio(rs.getInt("precio"));
        }
        conn.close();
        return producto;
    }

    @Override
    public List<Producto> getAll() throws SQLException {
        String sql = "SELECT * FROM productos";
        ResultSet rs = conn.execute(sql);
        List<Producto> listaProductos = new ArrayList<>();
        while (rs.next()) {
            Producto producto = new Producto();
            producto.setId(rs.getInt("id"));
            producto.setNombre(rs.getString("nombre"));
            producto.setDescripcion(rs.getString("descripcion"));
            producto.setPrecio(rs.getInt("precio"));
            listaProductos.add(producto);
        }
        conn.close();
        return listaProductos;
    }

    public List<Producto> getAll(String dato) throws SQLException {
        String sql = "SELECT * FROM productos WHERE nombre LIKE '%" + dato + "%'";
        //System.out.println(sql);
        ResultSet rs = conn.execute(sql);

        List<Producto> listaProductos = new ArrayList<>();

        while (rs.next()) {
            Producto producto = new Producto();
            producto.setId(rs.getInt("id"));
            producto.setNombre(rs.getString("nombre"));
            producto.setDescripcion(rs.getString("descripcion"));
            producto.setPrecio(rs.getInt("precio"));
            listaProductos.add(producto);
        }
        conn.close();
        return listaProductos;
    }

    public List<String> getNameProducto() throws SQLException {
        String sql = "SELECT DISTINCT nombre FROM productos ";
        ResultSet rs = conn.execute(sql);
        List<String> listaNombreProductos = new ArrayList<>();
        while (rs.next()) {
            String nombreDeProducto = rs.getString("nombre");
            listaNombreProductos.add(nombreDeProducto);
        }
        conn.close();
        return listaNombreProductos;
    }

    public Producto getOneByName(String name) throws SQLException {
        String sql = "SELECT * FROM productos WHERE nombre = '" + name + "'";
        System.out.println(sql);
        ResultSet rs = conn.execute(sql);
        Producto producto = new Producto();
        if (rs.next()) {
            producto.setId(rs.getInt("id"));
            producto.setNombre(rs.getString("nombre"));
            producto.setDescripcion(rs.getString("descripcion"));
            producto.setPrecio(rs.getInt("precio"));
        }
        conn.close();
        return producto;
    }
    
}
