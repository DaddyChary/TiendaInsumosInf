/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DaddyChary
 */
public class Estanteria {
    
    private int id;
    private int id_tienda_fk;
    private int tiempoDescuento;

    public Estanteria() {
    }

    public Estanteria(int id, int id_tienda_fk, int tiempo_descuento) {
        this.id = id;
        this.id_tienda_fk = id_tienda_fk;
        this.tiempoDescuento = tiempo_descuento;
    }

    public int getId() {
        return id;
    }

    public String getIdString() {
        return String.valueOf(id);
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public int getId_tienda_fk() {
        return id_tienda_fk;
    }

    public String getId_tienda_fk_String() {
        return String.valueOf(id_tienda_fk);
    }
    
    public void setId_tienda_fk(int id_tienda_fk) {
        this.id_tienda_fk = id_tienda_fk;
    }

    public int getTiempo_descuento() {
        return tiempoDescuento;
    }
    
    public String getTiempo_descuento_String() {
        return String.valueOf(tiempoDescuento);
    }

    public void setTiempo_descuento(int tiempo_descuento) {
        this.tiempoDescuento = tiempo_descuento;
    }

    @Override
    public String toString() {
        return "Estanteria{" + "id=" + id + ", id_tienda_fk=" + id_tienda_fk + ", tiempo_descuento=" + tiempoDescuento + '}';
    }
    
    
    
}
