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
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
    
    @OneToOne
    @JoinColumn(name="COURSE", referencedColumnName="code")
    private Course courseCode;
    
    @OneToOne
    @JoinColumn(name="LOCATION", referencedColumnName="id")
    private Location_course location;

    public Course_session(Date startDate, Date endDate, Course courseCode, Location_course location) {
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

    public Course getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(Course courseCode) {
        this.courseCode = courseCode;
    }

    public Location_course getLocation() {
        return location;
    }

    public void setLocation(Location_course location) {
        this.location = location;
    }
    
    
}
