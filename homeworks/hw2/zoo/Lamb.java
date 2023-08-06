package de.telran.geork.homeworks.hw2.zoo;

public class Lamb extends Herbivore{

    @Override
    void voice() {
        System.out.println("Lamb says Beee.");
    }

    @Override
    void eat(String food) {
        if(food.equalsIgnoreCase("meat")){
            System.out.println("я такое не ем.");
        } else {
            System.out.println("я такое ем.");
        }
    }



}
