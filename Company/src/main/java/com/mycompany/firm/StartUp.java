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
public class StartUp {

    public static ArrayList<Employee> employees = new ArrayList<>();
    
//add
    public static void addEmployeesId(String name, int wage, int id) {
        boolean similar = true;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).id == id) {
                System.out.println("Toto ID je již použito, zvol jiné.");
                similar = false;
            }
        }
        if (similar) {
            employees.add(new Employee(name, wage, id));
        }
    }
//remove
    public static void removeEmployees(int id) {
        boolean idExist = true;

        for (int i = 0; i < employees.size(); i++) {
            if (id == employees.get(i).id) {
                employees.remove(i);
                idExist = false;
            } 
            
        }if (idExist) {
                System.out.println("Zadané ID neexistuje");
            }
    }
//change
    public static void changeWage(int newWage, int id) {
        boolean idWage = true;
        for (int i = 0; i < employees.size(); i++) {
            if (id == employees.get(i).id) {
                employees.get(i).wage = newWage;
                idWage = false;
            } 
        }if (idWage) {
                System.out.println("Zadané ID neexistuje");
            }
    }
}
