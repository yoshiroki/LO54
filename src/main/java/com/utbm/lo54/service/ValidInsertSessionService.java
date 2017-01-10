/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utbm.lo54.service;

import com.utbm.formation.representation.BeanValidInsertSession;
import com.utbm.lo54.entity.Client;
import com.utbm.lo54.repository.ClientRepository;
import com.utbm.lo54.repository.CourseSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service de fonction pour la validation 
 * @author jnoblat
 */
@Service
public class ValidInsertSessionService {
    @Autowired
    private ClientRepository clientRepository;
    
    @Autowired
    private CourseSessionRepository courseSessionRepository;
    
    /**
     * Sauvegarde un client et ces sessions sélectionnées
     * @param bean Représente le client et les cours sélectionés
     */
    public void saveClientFromValidSession(BeanValidInsertSession bean) {
        
        Client client = new Client(bean.getLastName(), bean.getFirstName(), bean.getAddress(), bean.getPhone(),bean.getEmail(), courseSessionRepository.findByIdIn(bean.getSelectCourse()));
        
        clientRepository.save(client);
    }
}
