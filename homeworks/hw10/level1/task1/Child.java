package de.telran.geork.homeworks.hw10.level1.task1;

import java.util.*;

public class Child implements Comparable<Child>{
    private int height;

    public Child(int height) {
        this.height = height;
    }


    @Override
    public int compareTo(Child o) {
        int diff = this.height - o.height;
        return diff;
    }

    @Override
    public String toString() {
        return "Child{" +
                "height=" + height +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("Task 1. Comparable потому что естественная сортировка.");
        List<Child> children = new ArrayList<>();
        children.add(new Child(generateHeight()));
        children.add(new Child(generateHeight()));
        children.add(new Child(generateHeight()));
        children.add(new Child(generateHeight()));
        children.add(new Child(generateHeight()));
        Collections.sort(children);
        System.out.println(children);

    }

    public static int generateHeight(){
        Random random = new Random();
        return random.nextInt(150, 200);
    }

}
