/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import bean.LvbVenda;
import bean.LvbVendaVeiculos;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u1845853
 */
public class VendaVeiculosDAO extends AbstractDAO {

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit();
    }
    public void deleteProdutos(LvbVenda venda) {
        //listar todos os produtos do pedido
        List lista = (List) listVenda(venda);
        //deleta  a lista acima 
        session.beginTransaction();
        for (int i = 0; i < lista.size(); i++) {
            LvbVendaVeiculos vendaVeiculos = (LvbVendaVeiculos) lista.get(i);
            
            session.flush();
            session.clear();
            session.delete(vendaVeiculos);
        }
        session.getTransaction().commit();
    }

    @Override
    public Object list(int codigo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LvbVendaVeiculos.class);
        criteria.add(Restrictions.eq("lvbIdVendaVeiculos", codigo) );
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public Object listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LvbVendaVeiculos.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public Object listVenda(LvbVenda venda) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LvbVendaVeiculos.class);
        criteria.add(Restrictions.eq("lvbVenda", venda));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public static void main(String[] args) {
        VendaVeiculosDAO usuariosDAO = new VendaVeiculosDAO();
        usuariosDAO.listAll();
        System.out.println("teste ok");
    }
}
