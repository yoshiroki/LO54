/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utbm.formation.controller;

import com.utbm.lo54.service.CourseService;
import com.utbm.lo54.service.CourseSessionService;
import com.utbm.lo54.service.LocationService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
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
    
    @RequestMapping(value = "", method = POST)
    public ModelAndView listCourse( @RequestParam("selectCourse") List<String> data, Model model) {    
        Iterable<String> selectedCourse = data;
        
        ArrayList<String> scName = new ArrayList<String>();
        Iterator it = data.iterator();
        while(it.hasNext()) {
            String next = (String) it.next();
            System.out.println(next);
            scName.add(next);
        }         
        Iterable<String> selectedCourseName = scName;
        
        model.addAttribute("selectedCourse", selectedCourse);
        model.addAttribute("selectedCourseName", selectedCourseName);
        return new ModelAndView("addCourseSession", model.asMap());
    } 
}
