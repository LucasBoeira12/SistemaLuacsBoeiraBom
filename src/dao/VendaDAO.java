/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import bean.LvbVenda;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u1845853
 */
public class VendaDAO extends AbstractDAO {

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

    @Override
    public Object list(int codigo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LvbVenda.class);
        criteria.add(Restrictions.eq("lvbIdVenda", codigo) );
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
     public Object listVendedor(String nomeVendedor) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LvbVenda.class,"v");
        criteria.createAlias("v.lvbVendedor", "ve");
        criteria.add(Restrictions.like("ve.lvbNome", "%" + nomeVendedor + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
     public Object listProfissao(String Profissao) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LvbVenda.class);
        criteria.add(Restrictions.like("lvbProfissao", "%"+Profissao+"%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public Object listClienteVendedor(String nomeCliente, String nomeVendedor) {
    session.beginTransaction();
    Criteria criteria = session.createCriteria(LvbVenda.class, "v");
    criteria.createAlias("v.lvbCliente", "c");   
    criteria.createAlias("v.lvbVendedor", "ve");    
    criteria.add(Restrictions.like("c.lvbNome", "%" + nomeCliente + "%"));   
    criteria.add(Restrictions.like("ve.lvbNome", "%" + nomeVendedor + "%"));
    

    List lista = criteria.list();
    session.getTransaction().commit();
    return lista;
}

    @Override
    public Object listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LvbVenda.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public static void main(String[] args) {
        VendaDAO usuariosDAO = new VendaDAO();
        usuariosDAO.listAll();
        System.out.println("teste ok");
    }
}
