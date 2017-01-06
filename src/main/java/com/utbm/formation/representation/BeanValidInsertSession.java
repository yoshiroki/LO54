/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utbm.formation.representation;

import java.util.List;

/**
 * Bean for the registation of user in course session
 * The bean will contain the information :
 * @value firstName 
 * @value lastName 
 * @value email
 * @value address
 * @author jnoblat
 */
public class BeanValidInsertSession {
    private List<Integer> selectCourse;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phone;

    public BeanValidInsertSession() {
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    
    public List<Integer> getSelectCourse() {
        return selectCourse;
    }

    public void setSelectCourse(List<Integer> selectCourse) {
        this.selectCourse = selectCourse;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "BeanValidInsertSession{" + "selectCourse=" + selectCourse + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", address=" + address + '}';
    }

   

}
