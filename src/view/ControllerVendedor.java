/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import bean.LvbVendedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u1845853
 */
public class ControllerVendedor extends AbstractTableModel {

    private List lstLvbVendedor;

    public void setList(List lstLvbVendedor) {
        this.lstLvbVendedor = lstLvbVendedor;
    }
    
    public LvbVendedor getBean(int rowIndex) {
        return (LvbVendedor) lstLvbVendedor.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstLvbVendedor.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       LvbVendedor vendedor = (LvbVendedor) lstLvbVendedor.get( rowIndex);
        if ( columnIndex == 0 ){
            return vendedor.getLvbIdVendedor();
        } else if (columnIndex ==1) {
            return vendedor.getLvbNome();        
        } else if (columnIndex ==2) {
            return vendedor.getLvbCargo();
        } else if (columnIndex ==3) {
            return vendedor.getLvbSalario();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Vendedor";         
        } else if ( columnIndex == 2) {
            return "Cargo";
        } else if ( columnIndex == 3) {
            return "Salário";
        } 
        return "";
    }
    
}
