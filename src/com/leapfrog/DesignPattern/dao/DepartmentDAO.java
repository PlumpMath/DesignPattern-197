/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.DesignPattern.dao;

import com.leapfrog.DesignPattern.entity.Department;
import java.util.List;

/**
 *
 * @author welcome
 */
public interface DepartmentDAO {
    void insert(Department d);
    boolean delete(int id);
    Department getbyid(int id);
    List<Department> getall();
}
