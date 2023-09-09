package de.telran.geork.homeworks.hw10.level1.task4_5_level2;

import java.util.Comparator;

public class CompBookAuthor implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getAuthor().compareTo(book2.getAuthor());
    }
}
