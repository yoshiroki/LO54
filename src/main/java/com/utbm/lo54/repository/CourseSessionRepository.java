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
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author jnoblat
 */

public interface CourseSessionRepository extends CrudRepository<Course_session, String> {
    
      Iterable<Course_session> findByCourseCodeInAndLocationInAndStartDateLikeAndEndDateLike(Collection<Course> courseCode, Collection<Location_course> location, Date startDate,Date endDate);
      Iterable<Course_session> findByCourseCodeInAndLocationIn(Collection<Course> courseCode, Collection<Location_course> location);
      Iterable<Course_session> findByCourseCodeInAndLocationInAndEndDate(Collection<Course> courseCode, Collection<Location_course> location,Date endDate);
      Iterable<Course_session> findByCourseCodeInAndLocationInAndStartDate(Collection<Course> courseCode, Collection<Location_course> location,Date startDate);

}
