/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utbm.lo54.service;

import com.utbm.formation.representation.BeanCourseFilter;
import com.utbm.lo54.entity.Course;
import com.utbm.lo54.entity.Course_session;
import com.utbm.lo54.entity.Location_course;
import com.utbm.lo54.repository.CourseRepository;
import com.utbm.lo54.repository.CourseSessionRepository;
import com.utbm.lo54.repository.LocationRepository;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
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

    @Autowired
    private CourseRepository courseRepository;
    
    @Autowired
    private LocationRepository locationRepository;
    
    
    
    public Iterable<Course_session> getAllCoursesSession(){
        return courseSessionRepository.findAll();
    }

    
    public Iterable<Course_session> getCourseSessionFilter(BeanCourseFilter bean) throws ParseException {
        
            Date dateStart=null;
            Date dateEnd=null;
          
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            if(bean.getDateStartCourse() != "")
                dateStart = formatter.parse(bean.getDateStartCourse());
            if(bean.getDateEndCourse()!= "")
                dateEnd = formatter.parse(bean.getDateEndCourse());
            
            Collection<Course> courses = null;
            Collection<Location_course> locations = null;
            
            if(bean.getCourse()==null)
                courses = (Collection<Course>) courseRepository.findAll();
            else
                courses = (Collection<Course>) courseRepository.findAll(bean.getCourse());

            if(bean.getLocation()==null)
                    locations = (Collection<Location_course>) locationRepository.findAll();
                else
                    locations = (Collection<Location_course>) locationRepository.findByIdIn(bean.getLocation());
            
            System.out.println(bean.getLocation());
            System.out.println(locations);
            
            if(dateEnd != null && dateStart !=null)
                return courseSessionRepository.findByCourseCodeInAndLocationInAndStartDateLikeAndEndDateLike(courses, locations, dateStart, dateEnd);
            else if(dateEnd != null && dateStart ==null)
                 return courseSessionRepository.findByCourseCodeInAndLocationInAndEndDate(courses, locations,  dateEnd);
                else if(dateEnd == null && dateStart !=null)
                                 return courseSessionRepository.findByCourseCodeInAndLocationInAndStartDate(courses, locations,  dateStart);

            return courseSessionRepository.findByCourseCodeInAndLocationIn(courses, locations);


   
    }
}