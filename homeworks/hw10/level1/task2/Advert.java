package de.telran.geork.homeworks.hw10.level1.task2;

public class Advert {
    private int price;
    private String title;
    private String description;
    private String author;
    private int publicationYear;

    public Advert(int price, String title, String description, String author, int publicationYear) {
        this.price = price;
        this.title = title;
        this.description = description;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Advert{" +
                "price=" + price +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
