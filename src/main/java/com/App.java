/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.utbm.lo54.entity.Client;
import com.utbm.lo54.util.HibernateUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author avigoure
 */
public class App {
    
    @PersistenceContext( unitName = "Formation2_PU" )
    private EntityManager       em;
    
//    public void testClient() throws Exception {
//        Client cli = new Client("tto", "gkopie");
//        try {
//            em.persist(cli);
//        } catch(Exception e) {
//            throw new Exception(e);
//        }
//    }
    
    public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
                
		Query q = session.createQuery("from Client");
		List<Client> client = q.list();
          
		session.getTransaction().commit();
		session.close();
                System.exit(0);
	}
    
}
