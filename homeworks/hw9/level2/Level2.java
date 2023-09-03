package de.telran.geork.homeworks.hw9.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Level2 {
    public static void main(String[] args) {
        System.out.println("Task1");
        List<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        List<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(3);
        list2.add(4);
        System.out.println(collectLinkedList(list1, list2));

        System.out.println("Task2");
        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i < 7; i++) {
            arr.add(i);
        }

        System.out.println(arr);
        turnRightArrayList(arr, 3);
        System.out.println(arr);


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

    public static List<Integer> turnRightArrayList(List<Integer> list, int k){
        List<Integer> tmpList = new ArrayList<>(list);
        for (int i = 0; i < tmpList.size(); i++) {
            if (i + k < tmpList.size()){
                list.set(i, tmpList.get(i + k));
            } else {
                list.set(i, tmpList.get(Math.abs(tmpList.size() - i - k)));
            }
        }
        return list;
    }

}
