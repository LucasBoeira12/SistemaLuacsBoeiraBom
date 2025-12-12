/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.LvbCliente;

import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Marcos
 */
public class ControllerConsultasVenda extends AbstractTableModel {

    private List lstCliente;

    public void setList(List lstCliente) {
        this.lstCliente = lstCliente;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lstCliente.size();
                
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        LvbCliente produtos = (LvbCliente) lstCliente.get( rowIndex);
        if ( columnIndex == 0 ){
            return produtos.getLvbIdCliente();
        } else if (columnIndex ==1) {
            return produtos.getLvbNome();        
        } else if (columnIndex ==2) {
            return produtos.getLvbProfissao();
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
            return "Profissão";
        }
        return "";
    }
}
