/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.DesignPattern.impl;

import com.leapfrog.DesignPattern.dao.DepartmentDAO;
import com.leapfrog.DesignPattern.entity.Department;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author welcome
 */
public class DepartmentDAOimpl implements DepartmentDAO {
    List<Department> list=new ArrayList<>();

    @Override
    public void insert(Department d) {
       list.add(d); }

    @Override
    public boolean delete(int id) {
      for(Department d:list){
        if(d.getId()==id)
            return list.remove(d);
        }return false;
    }
 

    @Override
    public Department getbyid(int id) {
    for(Department d:list){
        if(d.getId()==id)
            return d;
    }
    return null;}

    @Override
    public List<Department> getall() {
    return list;
    
    
    }
    
}
