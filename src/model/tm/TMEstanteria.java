/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.tm;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Estanteria;

/**
 *
 * @author DaddyChary
 */
public class TMEstanteria extends AbstractTableModel{
 
    private List<Estanteria> estanteriaList;

    public TMEstanteria(List<Estanteria> estanteriaList) {
        this.estanteriaList = estanteriaList;
    }

    @Override
    public int getRowCount() {
        return estanteriaList.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    // Método para obtener atributos de la clase Estudiante
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Estanteria estanteria = estanteriaList.get(rowIndex);

        return switch (columnIndex) {
            case 0 ->
                estanteria.getId();
            case 1 ->
                estanteria.getId_tienda_fk();
            case 2 ->
                estanteria.getTiempo_descuento();
            default ->
                "";
        };
    }

    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 ->
                "ID";
            case 1 ->
                "ID Tienda";
            case 2 ->
                "Tiempo Descuento";
            default ->
                " ";
        };
    }
    
}
