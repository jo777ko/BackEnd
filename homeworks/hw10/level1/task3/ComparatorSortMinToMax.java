package de.telran.geork.homeworks.hw10.level1.task3;

import java.util.Comparator;

public class ComparatorSortMinToMax implements Comparator<Integer> {
    @Override
    public int compare(Integer num1, Integer num2) {
        return Integer.compare(num1, num2);
    }
}
