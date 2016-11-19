/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utbm.lo54.entity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author avigoure
 */
public class TestClient {
    
    @PersistenceContext( unitName = "Formation2_PU" )
    private EntityManager       em;
    
    public void testClient() throws Exception {
        Client cli = new Client("tto", "gkopie");
        try {
            em.persist(cli);
        } catch(Exception e) {
            throw new Exception(e);
        }
    }
    
}
