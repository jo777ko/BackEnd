package de.telran.geork.homeworks.hw9.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Level2 {
    public static void main(String[] args) {
        System.out.println("Task1");
        List<Integer> list1 = new LinkedList<>();
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        List<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        list2.add(8);
        list2.add(9);
        list2.add(10);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        System.out.println(collectLinkedList(list1, list2));

        System.out.println("Task2");
        List<Integer> arr = new ArrayList<>();
        fillArrayList(arr, 10);
        System.out.println("Before " + arr);
        turnRightArrayList(arr, 3);
        System.out.println("After " + arr);

    }

    public static List<Integer> collectLinkedList(List<Integer> list, List<Integer> list2){
        List<Integer> tmpList = new LinkedList<>();
        for (int i = 0; i < (list.size() + list2.size()); i++) {
            if (i < list.size()){
                tmpList.add(list.get(i));
            } else {
                tmpList.add(list2.get(i - list.size()));
            }
        }
        tmpList.sort(null);
        return tmpList;
    }

    public static List<Integer> fillArrayList(List list, int i){
        Random random = new Random();
        for (int j = 0; j < i; j++) {
            list.add(random.nextInt(100));
        }
        return list;
    }

    public static List<Integer> turnRightArrayList(List<Integer> list, int k){
        List<Integer> tmpList = new ArrayList<>(list);
        for (int i = 0; i < tmpList.size(); i++) {
            if (i + k < list.size()){
                list.set(i + k, tmpList.get(i));
            } else {
                list.set(Math.abs(tmpList.size() - i - k), tmpList.get(i));
            }
        }
        return list;
    }

    public static List<Integer> turnLeftArrayList(List<Integer> list, int k){
        List<Integer> tmpList = new ArrayList<>(list);
        for (int i = 0; i < tmpList.size(); i++) {
            if (i + k < list.size()){
                list.set(i, tmpList.get(k+i));
            } else {
                list.set(i, tmpList.get(Math.abs(tmpList.size() - i - k)));
            }
        }
        return list;
    }

}
