package de.telran.geork.homeworks.hw8.level1;

import de.telran.geork.homeworks.hw7.level1.ArrayIterator;

import java.util.*;

public class MyArrayList implements List<Integer> {

    private Integer[] array;
    private int length;

    public MyArrayList(Integer[] array) {
        this.array = array;
    }

    public MyArrayList() {
        array = new Integer[0];
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "array=" + Arrays.toString(array) +
                ", length=" + length +
                '}';
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public boolean isEmpty() {
        return array.length == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Integer val : this) {
            if (Objects.equals(o, val)) { //(a == b) || (a != null && a.equals(b));
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator(array);
    }

    @Override
    public boolean add(Integer integer) {
        Integer[] tmp = array;
        array =  new Integer[tmp.length + 1];
        if (!isEmpty()){
            for (int i = 0; i < tmp.length; i++) {
                array[i] = tmp[i];
            }
            array[array.length-1] =  integer;
        } else {
            array[0] = integer;
        }
        this.length++;
        return true;
    }

    @Override
    public void clear() {
        array = new Integer[0];
        length = 0;
    }

    @Override
    public Integer get(int index) {
        return array[index];
    }

    @Override
    public Integer set(int index, Integer element) {
        return array[index] = element;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]==o){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i]==o){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void add(int index, Integer element) {

    }

    @Override
    public Integer remove(int index) {
        return null;
    }

    @Override
    public ListIterator<Integer> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        return null;
    }

    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

}
