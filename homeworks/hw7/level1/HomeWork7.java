package de.telran.geork.homeworks.hw7.level1;

import java.util.*;

public class HomeWork7 {
    public static void main(String[] args) {
        List<Integer> list = createList(10000000);

        System.out.print("For: ");
        long beforeFor = System.currentTimeMillis();
        int tempValFor = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            tempValFor += list.get(i);
        }
        System.out.println(tempValFor);
        long afterFor = System.currentTimeMillis();
        System.out.println("Time :" + (afterFor - beforeFor));

        System.out.print("ForEach: ");
        long beforeForEach = System.currentTimeMillis();
        int tempValForEach = 0;
        for (Integer num : list
        ) {
            tempValForEach += num;
        }
        System.out.println(tempValForEach);
        long afterForEach = System.currentTimeMillis();
        System.out.println("Time :" + (afterForEach - beforeForEach));

        System.out.print("Iterator: ");
        long beforeIterator = System.currentTimeMillis();
        Iterator<Integer> it = list.iterator();
        int tempValIterator = 0;
        while (it.hasNext()){
            tempValIterator += it.next();
        }
        System.out.println(tempValIterator);
        long afterIterator = System.currentTimeMillis();
        System.out.println("Time :" + (afterIterator - beforeIterator));

        System.out.print("ListIterator: ");
        long beforeListIterator = System.currentTimeMillis();
        ListIterator<Integer> itList = list.listIterator();
        int tempValListIterator = 0;
        while (itList.hasNext()){
            tempValListIterator += itList.next();
        }
        System.out.println(tempValListIterator);
        long afterListIterator = System.currentTimeMillis();
        System.out.println("Time :" + (afterListIterator - beforeListIterator));


        int[] array = createArray(10);
        System.out.println(Arrays.toString(array));

        System.out.println("Task 2");
        ArrayIterator arrayIterator = new ArrayIterator(array);
        arrayIterator.forEachRemaining(System.out::println);

        System.out.println("Task 3");
        ArrayReverseIterator arrayReverseIterator = new ArrayReverseIterator(array);
        arrayReverseIterator.forEachRemaining(System.out::println);

        System.out.println("Task 4");
        Folder folder = new Folder("Car", "Geo");
        folder.addFile("txt", "Audi");
        folder.addFile("txt", "BMW");
        folder.addFile("txt", "Ford");
        folder.addFile("txt", "Opel");

        for (File file : folder) {
            System.out.println(file);
        }

    }

    public static List createList(int quantity) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>(quantity);
        for (int i = 0; i < quantity; i++) {
            list.add(random.nextInt(100));
        }
        return list;
    }

    public static int[] createArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        return arr;
    }


}
