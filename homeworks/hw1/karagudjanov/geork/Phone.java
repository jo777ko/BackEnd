package de.telran.geork.homeworks.hw1.karagudjanov.geork;

import java.util.Random;

public class Phone {

    private String number;
    public String model;
    int weight;

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String setWeight(int weight) {
        if (weight > 0){
            return  String.valueOf(this.weight = weight);
        }else{
            return "Weight have to be more than 0";
        }
    }

    void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    void call(String name){
        Random random = new Random();
        boolean callWho = random.nextBoolean();
        if (callWho){
            System.out.println("Дозвонился до " + name);
        } else{
            System.out.println("Абонент " + name + " не доступен.");
        }
    }

    @Override
    public String toString() {
        return  "Phone {" +
                "number = " + number +
                ", model = '" + model + '\'' +
                ", weight = " + weight +
                '}';
    }
}
