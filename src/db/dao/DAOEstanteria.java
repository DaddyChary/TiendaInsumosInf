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
import model.Estanteria;

/**
 *
 * @author DaddyChary
 */
public class DAOEstanteria implements DAO<Estanteria> {

    private Conexion conn;

    public DAOEstanteria(Conexion conn) {
        this.conn = conn;
    }

    @Override
    public void create(Estanteria t) throws SQLException {
        String sql = "INSERT INTO estanterias (id, id_tienda_fk, tiempo_descuento) VALUES (null, "+ t.getId_tienda_fk() +", "+ t.getTiempo_descuento() +")";
        conn.execute(sql);
    }

    @Override
    public void update(Estanteria t) throws SQLException {
        String sql = "UPDATE estanterias SET tiempo_descuento = "+ t.getTiempo_descuento() +" WHERE id = "+ t.getId() +"";
        conn.execute(sql);
    }

    @Override
    public void delete(Estanteria t) throws SQLException {
        String sql = "DELETE FROM estanterias WHERE id = " + t.getId() + "";
        conn.execute(sql);
    }

    @Override
    public Estanteria getOne(int id) throws SQLException {
        String sql = "SELECT * FROM estanterias WHERE id =" + id + "";
        ResultSet rs = conn.execute(sql);
        Estanteria estanteria = new Estanteria();
        if (rs.next()) {
            estanteria.setId(rs.getInt("id"));
            estanteria.setId_tienda_fk(rs.getInt("id_tienda_fk"));
            estanteria.setTiempo_descuento(rs.getInt("tiempo_descuento"));
        }
        conn.close();
        return estanteria;
    }

    @Override
    public List<Estanteria> getAll() throws SQLException {
        String sql = "SELECT * FROM estanterias";
        ResultSet rs = conn.execute(sql);
        List<Estanteria> listaEstanterias = new ArrayList<>();
        while (rs.next()) {
            Estanteria estanteria = new Estanteria();
            estanteria.setId(rs.getInt("id"));
            estanteria.setId_tienda_fk(rs.getInt("id_tienda_fk"));
            estanteria.setTiempo_descuento(rs.getInt("tiempo_descuento"));
            listaEstanterias.add(estanteria);
        }
        conn.close();
        return listaEstanterias;
    }

    public List<Estanteria> getAll(String dato) throws SQLException {
        String sql = "SELECT * FROM estanterias WHERE id LIKE '%" + dato + "%'";
        //System.out.println(sql);
        ResultSet rs = conn.execute(sql);

        List<Estanteria> listaEstanterias = new ArrayList<>();

        while (rs.next()) {
            Estanteria estanteria = new Estanteria();
            estanteria.setId(rs.getInt("id"));
            estanteria.setId_tienda_fk(rs.getInt("id_tienda_fk"));
            estanteria.setTiempo_descuento(rs.getInt("tiempo_descuento"));
            listaEstanterias.add(estanteria);
        }
        conn.close();
        return listaEstanterias;
    }
    
    public List<String> getIdEstanterias() throws SQLException {
        String sql = "SELECT DISTINCT id FROM estanterias ";
        ResultSet rs = conn.execute(sql);
        List<String> listaIdEstanterias = new ArrayList<>();
        while (rs.next()) {
            String idEstanteria = rs.getString("id");
            listaIdEstanterias.add(idEstanteria);
        }
        conn.close();
        return listaIdEstanterias;
    }
    
}
