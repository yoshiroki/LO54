/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utbm.formation.controller;

import com.utbm.lo54.entity.Course;
import com.utbm.lo54.entity.Course_session;
import com.utbm.lo54.entity.Location_course;
import com.utbm.lo54.service.CourseService;
import com.utbm.lo54.service.CourseSessionService;
import com.utbm.lo54.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author jnoblat
 */
@Controller
@RequestMapping(value = "/listCourse")
public class ListCourseSessionController {
    
    @Autowired
    CourseSessionService courseSessionService;
    
    @Autowired
    CourseService courseService;
    
    @Autowired
    LocationService locationService;
    
    @RequestMapping(value = "", method = GET)
    public ModelAndView listCourse( Model model) {
        
        Iterable<Course_session> listSession = courseSessionService.getAllCoursesSession();
        Iterable<Course> listCourse = courseService.getAllCourses();
        Iterable<Location_course> listLocation = locationService.getAllLocation();
        
        
        model.addAttribute("listCourse",  listCourse);
        model.addAttribute("listLocation",  listLocation);
        model.addAttribute("listCourseSession",  listSession);
        return new ModelAndView("listCourse", model.asMap());
    }
 
}
