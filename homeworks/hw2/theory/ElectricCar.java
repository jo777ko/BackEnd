package de.telran.geork.homeworks.hw2.theory;

public class ElectricCar extends Car{
    private int batteryCharge;

    public int getBattery() {
        return batteryCharge;
    }

    public void setBattery(int battery) {
        this.batteryCharge = battery;
    }

    @Override
    void accelerate() {
        if (getBattery() < 0){
            System.out.println("You need to charge battery.");
        } else {
            System.out.println("The battery life is " + batteryCharge + "%.");
        }
    }
}
