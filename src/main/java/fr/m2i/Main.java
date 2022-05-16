package fr.m2i;


public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        ElectricCar electricCar = new ElectricCar();


        car.accelerate();
        electricCar.accelerate();
        electricCar.rechargeBattery(50);


    }
}

