/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DaddyChary
 */
public class Inventario {
    
    private int id;
    private int id_producto_fk;
    private int id_estanteria_fk;
    private int cantidad;

    public Inventario() {
    }

    public Inventario(int id, int id_producto_fk, int id_estanteria_fk, int cantidad) {
        this.id = id;
        this.id_producto_fk = id_producto_fk;
        this.id_estanteria_fk = id_estanteria_fk;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_producto_fk() {
        return id_producto_fk;
    }

    public void setId_producto_fk(int id_producto_fk) {
        this.id_producto_fk = id_producto_fk;
    }

    public int getId_estanteria_fk() {
        return id_estanteria_fk;
    }

    public void setId_estanteria_fk(int id_estanteria_fk) {
        this.id_estanteria_fk = id_estanteria_fk;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Inventario{" + "id=" + id + ", id_producto_fk=" + id_producto_fk + ", id_estanteria_fk=" + id_estanteria_fk + ", cantidad=" + cantidad + '}';
    }
    
    
    
}
