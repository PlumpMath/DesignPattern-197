/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.DesignPattern.entity;

/**
 *
 * @author welcome
 */
public class Department {
    private int id,contactNo;
    private String email;
    private boolean status;

    public Department() {
    }

    public Department(int id, int contactNo, String email, boolean status) {
        this.id = id;
        this.contactNo = contactNo;
        this.email = email;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", email=" + email + ", contactNo=" + contactNo + ", status=" + status + '}';
    }
    
    
}
