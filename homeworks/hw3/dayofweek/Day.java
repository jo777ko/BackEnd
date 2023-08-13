package de.telran.geork.homeworks.hw3.dayofweek;

public enum Day {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private int numberOfDays;
    Day(int number) {
        this.numberOfDays = number;
    }

    public int getNumberOfDays(){
        return numberOfDays;
    }

}
