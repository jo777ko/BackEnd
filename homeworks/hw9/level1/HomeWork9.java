package de.telran.geork.homeworks.hw9.level1;

import java.util.*;

public class HomeWork9 {

    public static void main(String[] args) {

        System.out.println("Task 2");
        TreeSet<Integer> set = new TreeSet<>();
        fillTreeSet(set, 100);
        System.out.println(set.floor(56));
        System.out.println(set.ceiling(70));
        System.out.println(set.lower(40));
        System.out.println(set.higher(10));
        System.out.println(set.subSet(10, 30));
        System.out.println(set.subSet(30, true, 40, true));
        System.out.println(set.subSet(40, false, 50, true));
        System.out.println(set.headSet(40));
        System.out.println(set);

        System.out.println("Task 3");
        HashSet<Windows> windows = new HashSet<>();
        windows.add(new Windows(10, 11, 12, "transparent"));
        windows.add(new Windows(10, 11, 12, "transparent"));
        windows.add(new Windows(12, 16, 14, "toned"));
        windows.add(new Windows(12, 16, 14, "transparent"));
        windows.add(new Windows(13, 17, 15, "transparent"));
        windows.add(new Windows(11, 10, 16, "toned"));
        windows.add(new Windows(11, 10, 16, "toned"));
        windows.add(new Windows(10, 15, 13, "transparent"));
        windows.add(new Windows(10, 15, 13, "toned"));
        System.out.println(windows);
        System.out.println(windows.size());

        System.out.println("Task 4");
        Set<Integer> set4 = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        fillArrayList(list, 100);
        for (int i = 0; i < list.size(); i++) {
            set4.add(list.get(i));
        }
        System.out.println(list);
        System.out.println(set4);

        System.out.println("Task 5");
        Set<Integer> set5 = new HashSet<>();
        List<Integer> list5 = new ArrayList<>();
        fillArrayList(list5, 1000);
        for (int i = 0; i < list5.size(); i++) {
            set5.add(list5.get(i));
        }
        System.out.println(set5.size());

        System.out.println("Task 6");
        int diff = list5.size() - set5.size();
        System.out.println(diff);

    }

    public static Set<Integer> fillTreeSet(Set set, int i){
        Random random = new Random();
        for (int j = 0; j < i; j++) {
            set.add(random.nextInt(i));
        }
        return set;
    }

    public static List<Integer> fillArrayList(List list, int i){
        Random random = new Random();
        for (int j = 0; j < i; j++) {
            list.add(random.nextInt(1, 100));
        }
        return list;
    }


}
