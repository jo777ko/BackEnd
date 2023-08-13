package de.telran.geork.homeworks.hw3.level2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Product product = new Product("abc");
        Product product1 = new Product("def");
        Product product2 = new Product("klm");

        Scanner scanner = new Scanner(System.in);
        InMemoryDatabase data = new InMemoryDatabase();
        data.save(new Product("test"));
        data.save(new Product("test2"));
        data.save(new Product("test3"));
        data.save(new Product("test4"));
        System.out.println(data.findByTitle("test2"));
        System.out.println(data.findByTitle("test22"));

    }
}
