package de.telran.geork.homeworks.hw4.level1.car;

public class DieselCar extends Auto{

    private String typeOfEngine = "diesel";

    public DieselCar() {
    }

    public DieselCar(String brand, String model, int buildYear, String energy) {
        super(brand, model, buildYear, energy);
    }

    @Override
    String drive() {
        if (super.getEnergy().equalsIgnoreCase(typeOfEngine)){
            return "We can go.";
        } else{
            return "Before to drive, check the type of energy.";
        }

    }


    @Override
    String start() {
        if (super.getEnergy().equalsIgnoreCase(typeOfEngine)){
            return "I am ready.";
        } else{
            return super.getBrand() + " " + super.getModel() + " can't use " + super.getEnergy()
                    + ". It needs " + typeOfEngine +".";
        }
    }
}
