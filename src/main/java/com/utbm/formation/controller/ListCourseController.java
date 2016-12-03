/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utbm.formation.controller;

import com.utbm.lo54.entity.Course;
import com.utbm.lo54.service.CourseService;
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
public class ListCourseController {
    
    @Autowired
    CourseService courseService;
    
    @RequestMapping(value = "", method = GET)
    public ModelAndView listCourse( Model model) {
        
        Iterable<Course> list = courseService.getAllCourses();
        model.addAttribute("listCourse",  list);
        return new ModelAndView("listCourse", model.asMap());
    }
 
}
