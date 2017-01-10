/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utbm.lo54.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity représentant un un cours
 * @author jnoblat
 */
@Entity
@Table(name="COURSE")
public class Course {
 
    @Id
    private String code;
    
    @Column(name="TITLE")
    private String title;

    public Course(String title) {
        this.title = title;
    }
    public Course() {
    }    

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Course{" + "code=" + code + ", title=" + title + '}';
    }
}
