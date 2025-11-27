/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import bean.LvbVenda;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u1845853
 */
public class ControllerVenda extends AbstractTableModel {

    private List lstLvbVenda;

    public void setList(List lstLvbVenda) {
        this.lstLvbVenda = lstLvbVenda;
    }
    
    public LvbVenda getBean(int rowIndex) {
        return (LvbVenda) lstLvbVenda.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstLvbVenda.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       LvbVenda venda = (LvbVenda) lstLvbVenda.get( rowIndex);
        if ( columnIndex == 0 ){
            return venda.getLvbIdVenda();
        } else if (columnIndex ==1) {
            return venda.getLvbCliente();        
        } else if (columnIndex ==2) {
            return venda.getLvbDataVenda();
        } else if (columnIndex ==3) {
            return venda.getLvbTotal();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Cliente";         
        } else if ( columnIndex == 2) {
            return "Data";
        } else if ( columnIndex == 3) {
            return "Total";
        } 
        return "";
    }
    
}
