package de.telran.geork.homeworks.hw10.level1.task4_5_level2;

import java.util.Comparator;

public class ComparatorFull implements Comparator<Author> {
    @Override
    public int compare(Author author1, Author author2) {
        Comparator<Author> comparator = new ComparatorAuthorBirthYear()
                .thenComparing(new ComparatorAuthorLastName());
        return comparator.compare(author1, author2);
    }
}
