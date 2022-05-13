package fr.m2i;

public abstract class Vehicle {

    // Attributs
    protected float currentGas;
    protected float gasCapacity;
    protected float gasConsumption;
    protected int speed;
    protected int  passengerCapacity;

    // Getters

    public float getCurrentGas() {
        return currentGas;
    }

    public float getGasCapacity() {
        return gasCapacity;
    }

    public float getGasConsumption() {
        return gasConsumption;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    // Setters

    public void setCurrentGas(float currentGas) {
        this.currentGas = currentGas;
    }


    public void setGasCapacity(float gasCapacity) {
        this.gasCapacity = gasCapacity;
    }


    public void setGasConsumption(float gasConsumption) {
        this.gasConsumption = gasConsumption;
    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public abstract void fixEngine();

    // Methods:
    public abstract void accelerate();
    public abstract void brake();
    public void refuel(int refuelQuantity) {

        if (currentGas < gasCapacity) {
            if ((refuelQuantity + currentGas) <= gasCapacity) {
                currentGas += refuelQuantity;
            } else {
                float wastedGas = currentGas + refuelQuantity - gasCapacity;
                System.out.println(String.format("Gaspille pas mon gars, tu vas devoir boire %d litres", wastedGas));
            }
        } else {
            System.out.println("Ton réservoir est déjà plein gros c***n !");
        }

    }

    public void drive() throws Exception {


            float conso = (gasConsumption * speed) / 100;
            if (currentGas - conso >= 0) {
                accelerate();
                currentGas -= conso;
                System.out.println("Le véhicule a consommé : " + conso);
            } else {
                throw new Exception("Tu vas devoir pousser mon gars :( ");
            }

    }

}
