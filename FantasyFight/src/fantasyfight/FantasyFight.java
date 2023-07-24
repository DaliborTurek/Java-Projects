/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fantasyfight;

import java.util.List;
import java.util.Scanner;

public class FantasyFight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        

        Manager.addCharacter(10, 3, "Warrior", 2);
        Manager.addCharacter(12, 2, "Magician", 1);
        Manager.addCharacter(8, 4, "Rogue", 3);
        Scanner sc = new Scanner(System.in);
        int index = 0;
        String input;
        while (true) {
            System.out.println("Na tahu je hráč: " + Manager.list.get(index).name + "\n");
            System.out.println("Na koho útočíš?");
            for (int i = 0; i < Manager.list.size(); i++) {
                if (i != index) {
                    System.out.println(Manager.list.get(i).name);
                }
            }
            
            while (true) {
                input = sc.next();
                System.out.println(" ");
                if (Manager.list.get(index).name.equals(input)) {
                    System.out.println("Nemůžeš útočit na sebe, zvol jiného hráče.");
                } else {
                    break;
                }
            }
            Manager.fight(input, index);
            index++;
            if (index >= Manager.list.size()) {
                index = 0;

            }
            if (Manager.winner(index) == true) {
                System.out.println("Hráč " + Manager.list.get(index).name + " vyhrál.");
                break;
            }

        }

    }

}
