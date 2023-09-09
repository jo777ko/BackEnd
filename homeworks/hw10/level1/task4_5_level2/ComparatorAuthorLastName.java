package de.telran.geork.homeworks.hw10.level1.task4_5_level2;

import java.util.Comparator;

public class ComparatorAuthorLastName implements Comparator<Author> {
    @Override
    public int compare(Author author1, Author author2) {
        return author1.getLastname().compareTo(author2.getLastname());
    }
}
