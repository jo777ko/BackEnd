package de.telran.geork.homeworks.hw10.level1.task4_5_level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Author author1 = new Author("Gotouge", "Koyoharu", 1989);
        Author author2 = new Author("Reki", "Kawahara", 1974);
        Author author3 = new Author("Nakaba", "Suzuki", 1977);
        Author author4 = new Author("Leo", "Tolstoy", 1828);
        Author author5 = new Author("Herbert", "Schildt", 1951);

        Publishing publishing1 = new Publishing("Viz Media", 1986);
        Publishing publishing2 = new Publishing("ASCII Media Works", 2008);
        Publishing publishing3 = new Publishing("Kodansha", 1910);
        Publishing publishing4 = new Publishing("The Russian Messenger", 2008);
        Publishing publishing5 = new Publishing("McGraw Hill", 1888);

        Book book1 = new Book(author1, 2019, "Demon Slayer", publishing1);
        Book book2 = new Book(author2, 2012, "SAO", publishing2);
        Book book3 = new Book(author3, 2012, "The seven deadly sins", publishing3);
        Book book4 = new Book(author4, 1865, "War and peace", publishing4);
        Book book5 = new Book(author5, 2021, "Java: The Complete Reference 12th edition", publishing5);

        List<Book> shelf = new ArrayList<>();
        shelf.add(book1);
        shelf.add(book2);
        shelf.add(book3);
        shelf.add(book4);
        shelf.add(book5);
        System.out.println(shelf);
        System.out.println(sortingBook(shelf));


    }

    public static List sortingBook(List<Book> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("сортировать по имени?");
        String sortName = scanner.next();
        if (sortName.contains("да")) {
            System.out.println("в каком порядке возрастание или убывание?");
            String sortToHigh = scanner.next();
            if (sortToHigh.contains("возрастание")) {
                list.sort(new CompBookName());
            } else if (sortToHigh.contains("убывание")) {
                list.sort(new CompBookName());
                Collections.reverse(list);
            }
            System.out.println("сортировать по году публикации?");
            String sortYearPublish = scanner.next();
            if (sortYearPublish.contains("да")) {
                list.sort(new CompareBookPublishedYear());
            }
            System.out.println("сортировать по автору?");
            String sortAuthor = scanner.next();
            if (sortAuthor.contains("да")) {
                System.out.println("в каком порядке возрастание или убывание?");
                String sortAuthorToHigh = scanner.next();
                if (sortAuthorToHigh.contains("возрастание")) {
                    list.sort(new CompBookAuthor());
                } else if (sortAuthorToHigh.contains("убывание")) {
                    list.sort(new CompBookAuthor());
                    Collections.reverse(list);
                }
            }
            System.out.println("сортировать по издательству?");
            String sortPublisher = scanner.next();
            if (sortPublisher.contains("да")) {
                list.sort(new CompBookPublisher());
            }
        }
        return list;
    }
}




