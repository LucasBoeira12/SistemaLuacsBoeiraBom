/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author u07273579130
 */
public abstract class AbstractDAO {
     Session session;
     
     public AbstracDAO(){
     SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
     session = sessionFactory.openSession();
     }
     
    
}
