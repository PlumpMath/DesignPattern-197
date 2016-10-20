/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.DesignPattern.controller;

import com.leapfrog.DesignPattern.dao.DepartmentDAO;
import com.leapfrog.DesignPattern.entity.Department;
import com.leapfrog.DesignPattern.impl.DepartmentDAOimpl;
import java.util.Scanner;

/**
 *
 * @author welcome
 */
public class Controller {
    DepartmentDAO dao=new DepartmentDAOimpl();
    private Scanner in;
    
    
    public Controller(Scanner in){
      this.in=in;
    }
    


private void menu(){
     System.out.println("enter your choice");
        System.out.println("1.Add information of department");
        System.out.println("2.Search by id");
        System.out.println("3.Delete id");
        System.out.println("4.Show list");
        System.out.println("5.exit");
        
          
}

private void insert(){
     Department dpt=new Department();
                System.out.println("enter id");
                dpt.setId(in.nextInt());
                 System.out.println("enter contact no");
                dpt.setContactNo(in.nextInt());
                 System.out.println("enter email");
                dpt.setEmail(in.next());
                 System.out.println("enter Status");
                dpt.setStatus(in.nextBoolean());
                dao.insert(dpt);
}

private void delete(){
     System.out.println("enter id you want to delete");
                int i=in.nextInt();
                dao.delete(i);
                showAll();
                      
                }
                


private void search(){
     System.out.println("enter id you want to search");
                int id=in.nextInt();
                Department de=dao.getbyid(id);
                if(de!=null)
                System.out.println(de.toString());
                else
                    System.out.println("id not found");
}

private void showAll(){
     System.out.println("showing all the list");
                for(Department d:dao.getall()){
                System.out.println(d.toString());}
}        

private void exit(){
     System.exit(0);
}   

public void process(){
    while(true){
    menu();
    switch(in.nextInt()){
        case 1:
            insert();
            break;
        case 2:
            search();
            break;
        case 3:
            delete();
            break;
        case 4:
            showAll();
            break;
        case 5:
            exit();
    }
}
}}