package de.telran.geork.homeworks.hw2.zoo;

public class Cat extends Predator{

    @Override
    void voice() {
        System.out.println("Cat says: Miauuw.");
    }

    @Override
    void eat(String food) {
        System.out.println("Я ем " + food);
    }


}
