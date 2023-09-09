package de.telran.geork.homeworks.hw10.level1.task4_5_level2;

public class Author {
    private String firstname;
    private String lastname;
    private int birthYear;

    public Author(String firstname, String lastname, int birthYear) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthYear = birthYear;
    }

    public Author(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Author(String lastname) {
        this.lastname = lastname;
    }

    public Author() {
    }

    public String getLastname() {
        return lastname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
