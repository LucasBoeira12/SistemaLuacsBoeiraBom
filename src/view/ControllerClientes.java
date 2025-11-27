/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.LvbCliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u1845853
 */
public class ControllerClientes extends AbstractTableModel {

    private List lstLvbClientes;

    public void setList(List lstLvbClientes) {
        this.lstLvbClientes = lstLvbClientes;
    }
    
    public LvbCliente getBean(int rowIndex) {
        return (LvbCliente) lstLvbClientes.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstLvbClientes.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LvbCliente usuarios = (LvbCliente) lstLvbClientes.get( rowIndex);
        if ( columnIndex == 0 ){
            return usuarios.getLvbIdCliente();
        } else if (columnIndex ==1) {
            return usuarios.getLvbNome();        
        } else if (columnIndex ==2) {
            return usuarios.getLvbIdade();
        } else if (columnIndex ==3) {
            return usuarios.getLvbCpf();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Nome";         
        } else if ( columnIndex == 2) {
            return "Idade";
        } else if ( columnIndex == 3) {
            return "Cpf";
        } 
        return "";
    }
    
}
