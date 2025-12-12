/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.LvbVendaVeiculos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u1845853
 */
public class ControllerVendaVeiculos extends AbstractTableModel {

    private List lstLvbVendaVeiculos;

    public void setList(List lstLvbVendaVeiculos) {
        this.lstLvbVendaVeiculos = lstLvbVendaVeiculos;
        this.fireTableDataChanged();
    }
    
   public LvbVendaVeiculos getBean(int rowIndex) {
        return (LvbVendaVeiculos) lstLvbVendaVeiculos.get(rowIndex);
    }

    public void addBean(LvbVendaVeiculos pedidosProdutos) {
        this.lstLvbVendaVeiculos.add(pedidosProdutos);
        this.fireTableDataChanged();
    }
    
    public void removeBean(int rowIndex) {
        this.lstLvbVendaVeiculos.remove(rowIndex);
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lstLvbVendaVeiculos.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LvbVendaVeiculos vendaVeiculos = (LvbVendaVeiculos) lstLvbVendaVeiculos.get( rowIndex);
        if ( columnIndex == 0 ){
            return vendaVeiculos.getLvbIdVendaVeiculos();
        } else if (columnIndex ==1) {
            return vendaVeiculos.getLvbVeiculos();        
        } else if (columnIndex ==2) {
            return vendaVeiculos.getLvbQuantidade();
        } else if (columnIndex ==3) {
            return vendaVeiculos.getLvbValotunitario();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Veiculo";         
        } else if ( columnIndex == 2) {
            return "Quantidade";
        } else if ( columnIndex == 3) {
            return "Valor";
        } 
        return "";
    }
    
}
