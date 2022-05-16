package org.example;

public abstract class AbstractBrawlerChar {

    private String name;
    private int HealthPoint;
    private int moveSpeed;

    public AbstractBrawlerChar(String name, int healthPoint, int moveSpeed) {
        this.name = name;
        HealthPoint = healthPoint;
        this.moveSpeed = moveSpeed;
    }

    public void speak(String string) {
        System.out.println(string);
    };

    public void move() {

    }

    public int getHealthPoint() {
        return HealthPoint;
    }

    public String getName() {
        return name;
    }

    public void setHealthPoint(int healthPoint) {
        HealthPoint = healthPoint;
    }

    public abstract void attack(AbstractBrawlerChar charac);
}

