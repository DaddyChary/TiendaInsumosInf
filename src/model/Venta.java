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
public class Venta {
    
    private int id;
    private int cantidad;
    private Date fecha;
    private float totalVenta;

    public Venta() {
    }

    public Venta(int id, int cantidad, Date fecha, float totalVenta) {
        this.id = id;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.totalVenta = totalVenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(float totalVenta) {
        this.totalVenta = totalVenta;
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", cantidad=" + cantidad + ", fecha=" + fecha + ", totalVenta=" + totalVenta + '}';
    }

        
    
}
