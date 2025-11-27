/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.LvbUsuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u1845853
 */
public class ControllerUsuarios extends AbstractTableModel {

    private List lstLvbUsuarios;

    public void setList(List lstLvbUsuarios) {
        this.lstLvbUsuarios = lstLvbUsuarios;
    }
    
    public LvbUsuarios getBean(int rowIndex) {
        return (LvbUsuarios) lstLvbUsuarios.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstLvbUsuarios.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LvbUsuarios usuarios = (LvbUsuarios) lstLvbUsuarios.get( rowIndex);
        if ( columnIndex == 0 ){
            return usuarios.getLvbIdUsuarios();
        } else if (columnIndex ==1) {
            return usuarios.getLvbNome();        
        } else if (columnIndex ==2) {
            return usuarios.getLvbApelido();
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
            return "Apelido";
        } else if ( columnIndex == 3) {
            return "Cpf";
        } 
        return "";
    }
    
}
