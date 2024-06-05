/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DaddyChary
 */
public class Tienda {
    
    private int id;
    private String nombre;
    private int cantidadEstantes;

    public Tienda() {
    }

    public Tienda(int id, String nombre, int cantidadEstantes) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadEstantes = cantidadEstantes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadEstantes() {
        return cantidadEstantes;
    }

    public void setCantidadEstantes(int cantidadEstantes) {
        this.cantidadEstantes = cantidadEstantes;
    }

    @Override
    public String toString() {
        return "Tienda{" + "id=" + id + ", nombre=" + nombre + ", cantidadEstantes=" + cantidadEstantes + '}';
    }
    
    
    
}
