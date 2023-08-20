package de.telran.geork.homeworks.hw6.level1;

import java.util.*;

public class HomeWork6 {
    public static void main(String[] args) {

        System.out.println("Task1");
        getList(10);
        getLinkedList(10);

        System.out.println("Task2");
        //не смог сделать

        System.out.println("Task3");
        getListSum();

        System.out.println("Task4");
        List<Integer> list1 = new ArrayList<>();
        list1.add(6);
        list1.add(4);
        list1.add(7);
        list1.add(5);
        list1.add(2);
        list1.add(1);
        list1.add(8);
        System.out.println(list1);
        sortList(list1);
        System.out.println(list1);

        System.out.println("Task5");
        List<String> list = new ArrayList<>();
        list.add("lol");
        list.add("wow");
        list.add("wow");
        list.add("wow");
        list.add("lol");
        list.add("wow");
        list.add("lol");
        checkRepeatItems(list);
        System.out.println(list);

    }

    public static void getList(int num){
        List list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(i);
        }
        System.out.println(list);
    }

    public static void getLinkedList(int num){
        LinkedList listL = new LinkedList<>();
        for (int i = 0; i < num; i++) {
            listL.add(i);
        }
        System.out.println(listL);
    }

    public static void getListSum(){
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>(5);
        System.out.println("Input 5 numbers: ");
        for (int i = 0; i < list.size(); i++) {
            list.add(scanner.nextInt());
        }
        System.out.println("List: " + list);
        int x = 0;
        for (int i = 0; i < list.size(); i++) {
            x = x + list.get(i);
        }
        double sum = (double) x / list.size();
        System.out.println("среднее арифметическое = " + sum);
    }

    public static void checkRepeatItems(List<String> list){
        for (int i = 0; i < 1; i++) {
            for (int j = 1; j < list.size(); j++) {
                if (list.get(i).equalsIgnoreCase(list.get(j))){
                    list.remove(j);
                }
            }
        }
    }

    public static void sortList(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            int max = list.get(0);
            int maxIndex = 0;
            for (int j = 0; j < list.size()-i; j++){
                if (max < list.get(j)){
                    max = list.get(j);
                    maxIndex = j;
                }
            }
            int tmp = list.get(list.size() - 1 - i);
            list.set((list.size() - 1 -i), max);
            list.set(maxIndex, tmp);

        }
    }

}
