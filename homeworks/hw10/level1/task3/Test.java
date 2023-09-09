package de.telran.geork.homeworks.hw10.level1.task3;

import java.util.*;

public class Test  {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        fillCollection(list, 10);
        System.out.println(list);

        System.out.println("Version 1");
        System.out.println("Max value of collection = " + getMaxCollection(list));
        System.out.println("Min value of collection = " + getMinCollection(list));

        System.out.println("Version 2");
        Comparator<Integer> comparator = new ComparatorSortMinToMax();
        Collections.sort(list, comparator);
        System.out.println("Max value of collection = " + list.get(list.size()-1));
        System.out.println("Min value of collection = " + list.get(0));

    }

    public static List<Integer> fillCollection(List<Integer> collection, int k){
        Random random = new Random();
        for (int i = 0; i < k; i++) {
            collection.add(random.nextInt(100));
        }
        return collection;
    }

    public static Integer getMaxCollection(List<Integer> collection){
        List<Integer> list = new ArrayList<>(collection);
        list.sort(null);
        return list.get(list.size()-1);
    }

    public static Integer getMinCollection(List<Integer> collection){
        List<Integer> list = new ArrayList<>(collection);
        list.sort(null);
        return list.get(0);
    }

}
