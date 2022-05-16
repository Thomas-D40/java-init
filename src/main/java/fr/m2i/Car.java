package fr.m2i;

public class Car extends Vehicle {


    public Car(float currentGas, float gasCapacity, float gasConsumption, int speed, int passengerCapacity) {
        super(currentGas, gasCapacity, gasConsumption, speed, passengerCapacity);
        this.currentGas = 50;

    }

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
