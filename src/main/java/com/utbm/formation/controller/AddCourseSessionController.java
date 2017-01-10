/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utbm.formation.controller;

import com.utbm.lo54.entity.Course_session;
import com.utbm.lo54.service.CourseService;
import com.utbm.lo54.service.CourseSessionService;
import com.utbm.lo54.service.LocationService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller de la page d'ajout des informations de l'étudiant
 * @author jnoblat
 */
@Controller
@RequestMapping(value = "/addCourseSession")
public class AddCourseSessionController {
    
    @Autowired
    CourseSessionService courseSessionService;
    
    @Autowired
    CourseService courseService;
    
    @Autowired
    LocationService locationService;
    
    /**
     * Ajout des sessions sélectionnées et affichage du formulaire d'ajout des infos étudiants²
     * @param data Liste des sessions sélectionnés
     * @param model Le model des données
     * @return Retourne la liste des sessions sélectionnés avec leur nom
     */
    @RequestMapping(value = "", method = POST)
    public ModelAndView listCourse( @RequestParam("selectCourse") List<Integer> data, Model model) {    
        Iterable<Integer> selectedCourse = data;
        
        Map<Course_session, Integer> mapCourseSession = courseSessionService.getSessionNameById(data);
        
        model.addAttribute("selectedCourse", selectedCourse);
        model.addAttribute("selectedCourseName", mapCourseSession);
        return new ModelAndView("addCourseSession", model.asMap());
    } 
}
