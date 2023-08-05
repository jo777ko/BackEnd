package de.telran.geork.homeworks.hw1.karagudjanov.geork;

public class Main {

    public static void main(String[] args) {
        Person person1  = new Person();
        Person person2 = new Person("John", 25);

        Phone phone1 = new Phone("123", "Xiaomi", 212);
        Phone phone2 = new Phone("456", "Oppo", 215);
        Phone phone3 = new Phone("789", "Apple", 213);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        phone1.receiveCall("Kathy");
        phone1.call("Anna");
        phone2.receiveCall("John");
        phone2.call("Tom");
        phone3.receiveCall("Mary");
        phone3.call("Henry");

    }
}
