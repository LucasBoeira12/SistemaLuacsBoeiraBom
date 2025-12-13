/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import bean.LvbVendedor;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u1845853
 */
public class VendedorDAO extends AbstractDAO {

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
        Criteria criteria = session.createCriteria(LvbVendedor.class);
        criteria.add(Restrictions.eq("lvbIdVendedor", codigo) );
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
     public Object listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LvbVendedor.class);
        criteria.add(Restrictions.like("lvbNome", "%" + nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
     public Object listCargo(String cargo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LvbVendedor.class);
        criteria.add(Restrictions.like("lvbCargo", "%"+cargo+"%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
     public Object listNomeCargo(String nome, String cargo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LvbVendedor.class);
        criteria.add(Restrictions.like("lvbNome", "%" + nome + "%"));
        criteria.add(Restrictions.like("lvbCargo","%"+ cargo+"%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public Object listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LvbVendedor.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public static void main(String[] args) {
        VendedorDAO usuariosDAO = new VendedorDAO();
        usuariosDAO.listAll();
        System.out.println("teste ok");
    }
}
