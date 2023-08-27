package de.telran.geork.homeworks.hw7.level1;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayIterator implements Iterator<Integer>{

    private int[] array;
    private int i;

    public ArrayIterator(int[] array) {
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
