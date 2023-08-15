package de.telran.geork.homeworks.hw4.level1.car;

public class HybridCar extends Auto{

    private String typeOfEngine = "benzine";
    private String typeOfEngine2 = "electricity";

    public HybridCar(String brand, String model, int buildYear, String energy) {
        super(brand, model, buildYear, energy);
    }

    @Override
    String drive() {
        if (super.getEnergy().equalsIgnoreCase(typeOfEngine) ||
                super.getEnergy().equalsIgnoreCase(typeOfEngine2)){
            return "We can go.";
        } else{
            return "Before to drive, check the type of energy.";
        }

    }

    @Override
    String start() {
        if (super.getEnergy().equalsIgnoreCase(typeOfEngine) ||
                super.getEnergy().equalsIgnoreCase(typeOfEngine2)){
            return "I am ready.";
        } else{
            return super.getBrand() + " " + super.getModel() + " can't use "
                    + super.getEnergy() + ". It needs " + typeOfEngine + " or " +typeOfEngine2 + ".";
        }
    }
}
