package de.telran.geork.homeworks.hw2.zoo;

public class Cow extends Herbivore{

    @Override
    void eat(String food) {
        if(food.equalsIgnoreCase("meat")){
            System.out.println("я такое не ем.");
        } else {
            System.out.println("я такое ем.");
        }
    }

    @Override
    void voice() {
        System.out.println("Cow says Muuuu.");
    }
}
