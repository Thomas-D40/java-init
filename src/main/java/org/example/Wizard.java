package org.example;

public class Wizard extends AbstractBrawlerChar{

    private int mana;

    public Wizard(String name, int healthPoint, int moveSpeed, int mana) {
        super(name, healthPoint, moveSpeed);
        this.mana = mana;
    }

    @Override
    public void attack(AbstractBrawlerChar charac) {
        System.out.println(String.format("%s launch a fireball, dealing %d damage.", getName(), mana));
    }
}
