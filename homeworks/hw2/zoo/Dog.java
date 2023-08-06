package de.telran.geork.homeworks.hw2.zoo;

public class Dog extends Predator{

    @Override
    void voice() {
        System.out.println("Dog says: HawHaw.");
    }

    @Override
    void eat(String food) {
        System.out.println("Я ем " + food);
    }
}
