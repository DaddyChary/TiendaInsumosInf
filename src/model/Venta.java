/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DaddyChary
 */
public class Venta {
    
    private int id;
    private int cantidad;
    private float totalVenta;

    public Venta() {
    }

    public Venta(int id, int cantidad, float totalVenta) {
        this.id = id;
        this.cantidad = cantidad;
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

    public float getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(float totalVenta) {
        this.totalVenta = totalVenta;
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", cantidad=" + cantidad + ", totalVenta=" + totalVenta + '}';
    }

        
    
    
}
