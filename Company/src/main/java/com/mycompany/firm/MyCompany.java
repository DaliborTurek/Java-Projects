/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firm;

import java.util.ArrayList;

/**
 *
 * @author andyd
 */
public class MyCompany {


    public static void main(String[] args) {
        
        StartUp.addEmployeesId("Jan", 20000, 1235);
        StartUp.addEmployeesId("Martin", 15000, 3568);
        StartUp.addEmployeesId("Lucie", 30000, 7624);

        //remove
        StartUp.removeEmployees(3568);
        StartUp.addEmployeesId("Petra", 30000, 1526);
        
        //print
        for (int i = 0; i < StartUp.employees.size(); i++) {
            System.out.println(StartUp.employees.get(i).name + ", " + StartUp.employees.get(i).wage + ", " + StartUp.employees.get(i).id);           
        }
        System.out.println(" ");
        StartUp.changeWage(35000, 7624);
        
        for (int i = 0; i < StartUp.employees.size(); i++) {
            System.out.println(StartUp.employees.get(i).name + ", " + StartUp.employees.get(i).wage + ", " + StartUp.employees.get(i).id);           
        }
    }
}
