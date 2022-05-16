package fr.m2i;

public class Car extends Vehicle {


    @Override
    public void fixEngine() {

    }

    @Override
    public void accelerate() {
        System.out.println("Vrooooom !");
    }

    @Override
    public void brake() {
        System.out.println("Je freine");
    }
}
