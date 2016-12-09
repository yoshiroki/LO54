/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utbm.lo54.service;

import com.utbm.lo54.entity.Course_session;
import com.utbm.lo54.repository.CourseSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jnoblat
 */
@Service
public class CourseSessionService {

    @Autowired
    private CourseSessionRepository courseSessionRepository;

    public Iterable<Course_session> getAllCoursesSession(){
        return courseSessionRepository.findAll();
    }

}