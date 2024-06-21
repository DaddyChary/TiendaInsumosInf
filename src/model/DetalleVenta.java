/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author DaddyChary
 */
public class DetalleVenta {
    
    private int id;
    private int id_venta_fk;
    private int id_producto_fk;
    private String producto;
    private int total_vendido;

    public DetalleVenta() {
    }

    public DetalleVenta(int id, int id_venta_fk, int id_producto_fk, String producto, int total_vendido) {
        this.id = id;
        this.id_venta_fk = id_venta_fk;
        this.id_producto_fk = id_producto_fk;
        this.producto = producto;
        this.total_vendido = total_vendido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_venta_fk() {
        return id_venta_fk;
    }

    public void setId_venta_fk(int id_venta_fk) {
        this.id_venta_fk = id_venta_fk;
    }

    public int getId_producto_fk() {
        return id_producto_fk;
    }

    public void setId_producto_fk(int id_producto_fk) {
        this.id_producto_fk = id_producto_fk;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getTotal_vendido() {
        return total_vendido;
    }

    public void setTotal_vendido(int total_vendido) {
        this.total_vendido = total_vendido;
    }

    @Override
    public String toString() {
        return "DetalleVenta{" + "id=" + id + ", id_venta_fk=" + id_venta_fk + ", id_producto_fk=" + id_producto_fk + ", producto=" + producto + ", total_vendido=" + total_vendido + '}';
    }

    
    
    
}
