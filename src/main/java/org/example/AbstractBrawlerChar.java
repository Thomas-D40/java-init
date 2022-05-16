package org.example;

public abstract class AbstractBrawlerChar {

    protected String name;
    protected int healthPoint;
    protected int moveSpeed;

    public AbstractBrawlerChar(String name, int healthPoint, int moveSpeed) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.moveSpeed = moveSpeed;
    }

    public void speak(String string) {
        System.out.println(string);
    };

    public void move() {

    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public String getName() {
        return name;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public abstract void attack(AbstractBrawlerChar enemy);
}

