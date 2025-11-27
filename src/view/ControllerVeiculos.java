/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.LvbVeiculos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u1845853
 */
public class ControllerVeiculos extends AbstractTableModel {

    private List lstLvbVeiculos;

    public void setList(List lstLvbVeiculos) {
        this.lstLvbVeiculos = lstLvbVeiculos;
    }
    
    public LvbVeiculos getBean(int rowIndex) {
        return (LvbVeiculos) lstLvbVeiculos.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstLvbVeiculos.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LvbVeiculos veiculos = (LvbVeiculos) lstLvbVeiculos.get( rowIndex);
        if ( columnIndex == 0 ){
            return veiculos.getLvbIdVeiculos();
        } else if (columnIndex ==1) {
            return veiculos.getLvbModelo();        
        } else if (columnIndex ==2) {
            return veiculos.getLvbMarca();
        } else if (columnIndex ==3) {
            return veiculos.getLvbValor();
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
            return "Marca";
        } else if ( columnIndex == 3) {
            return "Valor";
        } 
        return "";
    }
    
}
