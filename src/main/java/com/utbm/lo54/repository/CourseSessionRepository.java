/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utbm.lo54.repository;

import com.utbm.lo54.entity.Course;
import com.utbm.lo54.entity.Course_session;
import com.utbm.lo54.entity.Location_course;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * Repository de l'entity course_session
 * @author jnoblat
 */

public interface CourseSessionRepository extends CrudRepository<Course_session, String> {
    
    /**
     * La liste des sessions pour une liste d'id
     * @param id 
     * @return une liste de sessions
     */
    Collection<Course_session> findByIdIn(List<Integer> id);

    /**
     * La liste des sessions en fonction du cours, du lieux, de la date de départ et fin du cours
     * @param courseCode
     * @param location
     * @param startDate
     * @param endDate
     * @return la liste des sessions filtrées
     */
    Iterable<Course_session> findByCourseCodeInAndLocationInAndStartDateLikeAndEndDateLike(Collection<Course> courseCode, Collection<Location_course> location, Date startDate,Date endDate);
    
    /**
     * La liste des sessions en fonction du cours et du lieux
     * @param courseCode
     * @param location
     * @return la liste des sessions filtrées
     */
    Iterable<Course_session> findByCourseCodeInAndLocationIn(Collection<Course> courseCode, Collection<Location_course> location);
    
    
    Iterable<Course_session> findByCourseCodeInAndLocationInAndEndDate(Collection<Course> courseCode, Collection<Location_course> location,Date endDate);
    
    /**
     * La liste des sessions en fonction du cours, du lieux et de la date de départ du cours
     * @param courseCode
     * @param location
     * @param startDate
     * @return la liste des sessions filtrées
     */
    Iterable<Course_session> findByCourseCodeInAndLocationInAndStartDate(Collection<Course> courseCode, Collection<Location_course> location,Date startDate);

}
