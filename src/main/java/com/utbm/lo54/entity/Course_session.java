/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utbm.lo54.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.stream.Location;

/**
 *
 * @author jnoblat
 */
@Entity
@Table(name="COURSE_SESSION")
public class Course_session {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name="START_DATE")
    private Date startDate;
    
    @Column(name="END_DATE")
    private Date endDate;
    
    @Column(name="COURSE_CODE")
    private String courseCode;
    
    @Column(name="LOCATION")
    private Location location;

    public Course_session(Date startDate, Date endDate, String courseCode, Location location) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.courseCode = courseCode;
        this.location = location;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    
    
}
