/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utbm.formation.controller;

import java.util.List;

/**
 *
 * @author jnoblat
 */
public class BeanCourseFilter {
    private List<String> course;
    private List<Integer> location;
    private String dateStartCourse;
    private String dateEndCourse;

    public BeanCourseFilter() {
    }

    public List<String> getCourse() {
        return course;
    }

    public List<Integer> getLocation() {
        return location;
    }

    public String getDateStartCourse() {
        return dateStartCourse;
    }

    public String getDateEndCourse() {
        return dateEndCourse;
    }

    public void setCourse(List<String> course) {
        this.course = course;
    }

    public void setLocation(List<Integer> location) {
        this.location = location;
    }

    public void setDateStartCourse(String dateStartCourse) {
        this.dateStartCourse = dateStartCourse;
    }

    public void setDateEndCourse(String dateEndCourse) {
        this.dateEndCourse = dateEndCourse;
    }


}
