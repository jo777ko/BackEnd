package de.telran.geork.homeworks.hw1.karagudjanov.geork;

import java.util.Random;

public class Person {

    protected String fullName;
    private int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    void talk(){
        System.out.println("It's " + fullName + " speaking.");
    }

    int move(){
        Random random =  new Random();
        int steps = random.nextInt(100);
        System.out.println(steps);
        return steps;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName = '" + fullName + '\'' +
                ", age = " + age +
                '}';
    }
}
