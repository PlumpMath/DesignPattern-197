/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.DesignPattern;

import com.leapfrog.DesignPattern.controller.Controller;
import java.util.Scanner;


public class program {

    
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        Controller controller=new Controller(new Scanner(System.in));
        controller.process();
       
    }
    
}
