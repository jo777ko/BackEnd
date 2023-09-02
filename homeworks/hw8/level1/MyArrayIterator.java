package de.telran.geork.homeworks.hw8.level1;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {

    private Integer[] array;
    private int i;
    public MyArrayIterator(Integer[] array) {
        this.array = array;
        this.i = 0;
    }

    @Override
    public boolean hasNext() {
        return i < array.length;
    }

    @Override
    public Integer next() {
        Integer current = array[i];
        i++;
        return current;
    }
}
