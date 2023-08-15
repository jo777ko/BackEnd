package de.telran.geork.homeworks.hw4.level1.car;

public abstract class Auto {

    private String brand;
    private String model;
    private int buildYear;
    private int tireQuantity = 4;
    private String energy;

    public Auto() {
    }

    public Auto(String brand, String model, int buildYear, String energy) {
        this.brand = brand;
        this.model = model;
        this.buildYear = buildYear;
        this.energy = energy;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getEnergy() {
        return energy;
    }

    abstract String drive();

    String broke(boolean state){
        if (state == true){
            return "I need to go to auto service.";
        }else {
            return "The car is ok.";
        }
    }

    abstract String start();


}
