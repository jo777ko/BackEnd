package de.telran.geork.homeworks.hw3.jobs;

public class DanceFloor {
    public static void main(String[] args) {
        Danceable[] dancers = new Danceable[2];
        dancers[0] = new Dancer();
        dancers[1] = new PopDancer();

        Danceable[] dancers1 = new Danceable[6];
        for (int i = 0; i < dancers1.length; i++) {
            if (i < 3) {
                dancers1[i] = new Dancer();
            } else {
                dancers1[i] = new PopDancer();
            }
        }
        dancers1[0].dance();
        dancers1[3].dance();


    }
}
