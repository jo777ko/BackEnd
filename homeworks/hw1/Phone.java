package de.telran.geork.homeworks.hw1;

public class Phone {
    private String number;
    String model;
    int weight;

    void receiveCall(String whoCall){
        System.out.println("Calls " + whoCall);
    }

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.receiveCall("Piety");
    }
}
