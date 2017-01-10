/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utbm.lo54.service;

import com.utbm.lo54.entity.Course;
import com.utbm.lo54.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service de fonction pour les cours
 * @author jnoblat
 */
@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Iterable<Course> getAllCourses(){
        return courseRepository.findAll();
    }

}