package fr.m2i;

public class ElectricCar extends Car {
    private int batteryLevel;

    private char e;

    public ElectricCar(float currentGas, float gasCapacity, float gasConsumption, int speed, int passengerCapacity, int batteryLevel) {
        super(currentGas, gasCapacity, gasConsumption, speed, passengerCapacity);
        this.batteryLevel = batteryLevel;
    }

    protected void rechargeBattery () {
        System.out.println("Recharging in progress");
    }

    protected void rechargeBattery(int percentage) {
        System.out.println(String.format("You recharge %d%%", percentage));
        batteryLevel += percentage;
    }
}
