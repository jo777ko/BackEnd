package de.telran.geork.homeworks.hw7.level1;

import java.util.Iterator;

public class ArrayReverseIterator implements Iterator<Integer> {

    private int[] array;
    private int i;

    public ArrayReverseIterator(int[] array) {
        this.array = array;
        this.i = array.length - 1;
    }


    @Override
    public boolean hasNext() {
        return i >= 0;
    }

    @Override
    public Integer next() {
        Integer current = array[i];
        i--;
        return current;
    }
}
