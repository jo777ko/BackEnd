package de.telran.geork.homeworks.hw3.jobs;

public class PopSinger implements Singable, Danceable{
    @Override
    public void dance() {
        sing();
        System.out.println("I can dance.");
    }

    @Override
    public void sing() {
        System.out.println("I can sing.");
    }
}
