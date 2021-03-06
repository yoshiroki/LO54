/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utbm.lo54.entity;

import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entity représentant un client (étudiant)
 * @author jnoblat
 */
@Entity
@Table(name="CLIENT")
public class Client {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name="LASTNAME")
    private String lastName;
    
    @Column(name="FIRSTNAME")
    private String firstName;
    
    @Column(name="ADDRESS")
    private String address;
    
    @Column(name="PHONE")
    private String phone;
    
    @Column(name="EMAIL")
    private String email;
    
    @OneToMany
    @JoinColumn(name="LIST_CLIENTS", referencedColumnName="id")
    private Collection<Course_session> courseSession;

    public Client(String lastName, String firstName, String address, String phone, String email, Collection<Course_session> courseSession) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.courseSession = courseSession;
    }
    
    public Client(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public Client() {
       
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Collection<Course_session> getCourseSession() {
        return courseSession;
    }

    public void setCourseSession(Collection<Course_session> courseSession) {
        this.courseSession = courseSession;
    }

    @Override
    public String toString() {
        return "Client{" + "id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", address=" + address + ", phone=" + phone + ", email=" + email + ", courseSession=" + courseSession + '}';
    }
}
