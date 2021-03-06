/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utbm.formation.controller;

import com.utbm.formation.representation.BeanValidInsertSession;
import com.utbm.lo54.service.ValidInsertSessionService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller de la page de validation de l'inscription à une session
 * @author jnoblat
 */
@Controller
@RequestMapping(value = "/validInsertSession")
public class ValidInsertSessionController {
    
    @Autowired
    ValidInsertSessionService validInsertSessionService;
    
    /**
     * Ajout d'un client à une/des sessions sélectionnées
     * @param itemid Les informations du client et les sessions sélectionnées
     * @param model Le model des données
     * @return Retourne la validation de l'inscription
     */
    @RequestMapping(value = "", method = POST)
    public ModelAndView listCourse( @Valid BeanValidInsertSession itemid, Model model) {
        
        validInsertSessionService.saveClientFromValidSession(itemid);
        return new ModelAndView("validInsertSession", model.asMap());
    }
}
