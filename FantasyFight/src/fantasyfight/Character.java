/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fantasyfight;

import java.util.ArrayList;

/**
 *
 * @author andyd
 */
public class Character {

    private int health;
    private int damage;
    public String name;
    public int agility;

    public Character(int health, int damage, String name, int agility) {
        this.health = health;
        this.damage = damage;
        this.name = name;
        this.agility = agility;
    }

    public void attack(Character toAttack, ArrayList<Character> list) {

        toAttack.health -= damage;
        System.out.println("hráč " + toAttack.name + " má nyní " + toAttack.health + " životů.");
        if (toAttack.health < 1) {
            System.out.println("Hráč " + toAttack.name + " je vyřazen.");
            list.remove(toAttack);
        }

    }

    

}
