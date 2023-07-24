
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author andyd
 */
public class PrimeGenerate {

    public static ArrayList<Integer> primeList = new ArrayList<Integer>();
    public static ArrayList<Integer> nextArray = new ArrayList<Integer>();

//generating prime numbers
    public static void Generate(float user) {
        int x;
        for (int i = 2; i < user; i++) {
            x = 0;
            for (int j = 2; j < i + 1; j++) {
                if (i % j == 0) {
                    x++;
                }
            }
            if (x == 1) {
                primeList.add(i);

            }
        }
        
    }
// using PN for users number
    public static void Count(float user) {
        float modulo;
        while (true) {
            for (int i = 0; i < primeList.size(); i++) {
                modulo = user % primeList.get(i);
                if (modulo == 0) {
                    nextArray.add(primeList.get(i));
                    user = user / primeList.get(i);
                    break;
                }
            }
            if (user == 1) {
                break;
            }
        }
    }
// printing
    public static void Print() {
        for (int i = 0; i < nextArray.size(); i++) {
            if (i != nextArray.size() - 1) {
                System.out.print(nextArray.get(i) + "*");
            } else {
                System.out.println(nextArray.get(i));
            }
        }
    }
}
