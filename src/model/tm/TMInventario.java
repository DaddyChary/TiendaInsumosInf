/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.tm;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Inventario;

/**
 *
 * @author DaddyChary
 */
public class TMInventario extends AbstractTableModel {

    private List<Inventario> inventarioList;

    public TMInventario(List<Inventario> inventarioList) {
        this.inventarioList = inventarioList;
    }

    @Override
    public int getRowCount() {
        return inventarioList.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    // Método para obtener atributos de la clase Estudiante
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Inventario inventario = inventarioList.get(rowIndex);

        return switch (columnIndex) {
            case 0 ->
                inventario.getId();
            case 1 ->
                inventario.getId_producto_fk();
            case 2 ->
                inventario.getId_estanteria_fk();
            case 3 ->
                inventario.getCantidad();
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
                "ID Producto";
            case 2 ->
                "ID Estanteria";
            case 3 ->
                "Cantidad";
            default ->
                " ";
        };
    }

}
