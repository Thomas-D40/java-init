package org.example;

public class Main {
    public static void main(String[] args) {

        Soldier tom = new Soldier("Tom", 150, 200, 20);
        Wizard anga = new Wizard("Anga", 150, 200, 20);

        tom.attack(anga);
    }
}