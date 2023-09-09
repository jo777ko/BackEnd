package de.telran.geork.homeworks.hw10.level1.task4_5_level2;

import java.util.Comparator;

public class ComparatorBookFull implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        Comparator<Book> comparator = new CompareBookPublishedYear()
                .thenComparing(new CompBookAuthor())
                .thenComparing(new CompBookName())
                .thenComparing(new CompBookPublisher());
        return comparator.compare(book1, book2);
    }
}
