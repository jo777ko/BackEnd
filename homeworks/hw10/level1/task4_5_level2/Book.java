package de.telran.geork.homeworks.hw10.level1.task4_5_level2;

public class Book {
    private String author;
    private int publishedYear;
    private String name;
    private String published;

    public Book(Author author, int publishedYear, String name, Publishing published) {
        this.author = author.getLastname();
        this.publishedYear = publishedYear;
        this.name = name;
        this.published = published.getName();
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public String getName() {
        return name;
    }

    public String getPublished() {
        return published;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", publishedYear=" + publishedYear +
                ", name='" + name + '\'' +
                ", published='" + published + '\'' +
                '}';
    }


}
