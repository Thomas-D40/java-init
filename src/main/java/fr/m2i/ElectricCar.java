package fr.m2i;

public class ElectricCar extends Car {
    private int batteryLevel;

    protected void rechargeBattery () {
        System.out.println("Recharging in progress");
    }

    protected void rechargeBattery(int percentage) {
        System.out.println(String.format("You recharge %d%%", percentage));
        batteryLevel += percentage;
    }
}
