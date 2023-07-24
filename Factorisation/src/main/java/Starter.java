/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author andyd
 */
public class Starter {
    // generating PN + factorisation

    public static void main(String[] args) {
        float user;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hi, welcome in factorisation prog.\nInsert any number for factorising.");
        
        user = sc.nextFloat();

        PrimeGenerate.Generate(user);
        PrimeGenerate.Count(user);
        System.out.println("Well done, here is the factorisation.");
        PrimeGenerate.Print();

    }
}
