/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.LvbUsuarios;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u1845853
 */
public class UsuariosDAO extends AbstractDAO {

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
        Criteria criteria = session.createCriteria(LvbUsuarios.class);
        criteria.add(Restrictions.eq("lvbIdUsuarios", codigo) );
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public Object listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LvbUsuarios.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public static void main(String[] args) {
        UsuariosDAO usuariosDAO = new UsuariosDAO();
        usuariosDAO.listAll();
        System.out.println("teste ok");
    }
    public LvbUsuarios login(String apelido, String senha) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LvbUsuarios.class);
        criteria.add(Restrictions.and(Restrictions.eq("lvbApelido", apelido), Restrictions.eq("lvbSenha", senha)));
        List<LvbUsuarios> lista = criteria.list();
        session.getTransaction().commit();
        if(!lista.isEmpty()){
        return lista.get(0);
       }
        
    return null;
    
    }
    public boolean verificarApelido(String apelido) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LvbUsuarios.class);
        criteria.add(Restrictions.eq("lvbApelido", apelido));
        List lista = criteria.list();
        session.getTransaction().commit();
        return !lista.isEmpty();
    }
}
