package org.example;

public class Soldier extends AbstractBrawlerChar {

    private int attackDamage;

    public Soldier(String name, int healthPoint, int moveSpeed, int attackDamage) {
        super(name, healthPoint, moveSpeed);
        this.attackDamage = attackDamage;
    }

    @Override
    public void attack(AbstractBrawlerChar charac) {
        System.out.println("Your warrior deal " + attackDamage + "damages to the enemy.");
    }
}
