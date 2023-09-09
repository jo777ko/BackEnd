package de.telran.geork.homeworks.hw10.level1.task4_5_level2;

import java.util.Comparator;

public class CompBookPublisher implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPublished().compareTo(o2.getPublished());
    }
}
