package de.telran.geork.homeworks.hw2.theory;

public class PetrolCar extends Car{
    private double petrolTankCapacity;

    public double getPetrolTankCapacity() {
        return petrolTankCapacity;
    }

    public void setPetrolTankCapacity(double petrolTankCapacity) {
        this.petrolTankCapacity = petrolTankCapacity;
    }

    @Override
    void accelerate() {
        if (getPetrolTankCapacity() < 0){
            System.out.println("You need to tank petrol.");
        } else {
            System.out.println("The tank capacity is " + petrolTankCapacity + ".");
        }
    }
}
