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
 *
 * @author jnoblat
 */

@Service
public class ValidInsertSessionService {
    @Autowired
    private ClientRepository clientRepository;
    
    @Autowired
    private CourseSessionRepository courseSessionRepository;
    
    
    public void saveClientFromValidSession(BeanValidInsertSession bean) {
        
        Client client = new Client(bean.getLastName(), bean.getFirstName(), bean.getAddress(), bean.getPhone(),bean.getEmail(), courseSessionRepository.findByIdIn(bean.getSelectCourse()));
        
        clientRepository.save(client);
    }
}
