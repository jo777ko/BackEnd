package de.telran.geork.homeworks.hw11;

import java.util.*;

public class Level_1 {
    public static void main(String[] args) {
        System.out.println("Task 1");

        Integer[] arr = {1, 2, 3, 4, 5, 2, 6, 7, 3};
        getPositionAndValueDuplicates(arr);

        System.out.println("Task 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose you amount: ");
        int amount = scanner.nextInt();
        System.out.println(createStackWithNumbers(amount));
        System.out.println(createDequeLinkedWithNumbers(amount));
        System.out.println(createDequeArrayWithNumbers(amount));


    }

    public static void getPositionAndValueDuplicates(Integer[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if (array[i] == array[j]){
                    System.out.println("Duplicate: " + array[j] + " index of duplicate " + j);
                }
            }
        }

    }

    public static String createStackWithNumbers(int num){
        Stack<Integer> stack = new Stack<>();
        long startTimeForPush = System.nanoTime();
        for (int i = 0; i < num; i++) {
            stack.push(i);
        }
        long endTimeForPush = System.nanoTime();
        long stackTimeForPush = endTimeForPush - startTimeForPush;

        long startTimeForPop = System.nanoTime();
        while (!stack.isEmpty()) {
            stack.pop();
        }
        long endTimeForPop = System.nanoTime();
        long stackTimeForPop = endTimeForPop - startTimeForPop;
        return ("Time of Stack for push: " + stackTimeForPush +
                " Time of Stack for pop: " + stackTimeForPop);
    }

    public static String createDequeLinkedWithNumbers(int num){
        Deque<String> deque = new LinkedList<>();
        long startTimeForPush = System.nanoTime();
        for (int i = 0; i < num; i++) {
            deque.push("Element " + i);
        }
        long endTimeForPush = System.nanoTime();
        long dequeTimeForPush = endTimeForPush - startTimeForPush;

        long startTimeForPop = System.nanoTime();
        while (!deque.isEmpty()) {
            deque.pop();

        }
        long endTimeForPop = System.nanoTime();
        long dequeTimeForPop = endTimeForPop - startTimeForPop;
        return ("Time of Deque (LinkedList) for push: " + dequeTimeForPush +
                " Time of Deque (LinkedList) for pop: " + dequeTimeForPop);
    }

    public static String createDequeArrayWithNumbers(int num){
        Deque<Integer> deque = new ArrayDeque<>();
        long startTimeForPush = System.nanoTime();
        for (int i = 0; i < num; i++) {
            deque.push(i);
        }
        long endTimeForPush = System.nanoTime();
        long dequeTimeForPush = endTimeForPush - startTimeForPush;

        long startTimeForPop = System.nanoTime();
        while (!deque.isEmpty()) {
            deque.pop();
        }
        long endTimeForPop = System.nanoTime();
        long dequeTimeForPop = endTimeForPop - startTimeForPop;
        return ("Time of Deque (ArrayDeque) for push: " + dequeTimeForPush +
                " Time of Deque (ArrayDeque) for pop: " + dequeTimeForPop);
    }


}
