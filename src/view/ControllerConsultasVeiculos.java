/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.LvbVeiculos;

import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Marcos
 */
public class ControllerConsultasVeiculos extends AbstractTableModel {

    private List lstVeiculos;

    public void setList(List lstVeiculos) {
        this.lstVeiculos = lstVeiculos;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lstVeiculos.size();
                
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LvbVeiculos produtos = (LvbVeiculos) lstVeiculos.get( rowIndex);
        if ( columnIndex == 0 ){
            return produtos.getLvbIdVeiculos();
        } else if (columnIndex ==1) {
            return produtos.getLvbModelo();        
        } else if (columnIndex ==2) {
            return produtos.getLvbValor();
        } 
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Modelo";         
        } else if ( columnIndex == 2) {
            return "Valor ";
        }
        return "";
    }
}
