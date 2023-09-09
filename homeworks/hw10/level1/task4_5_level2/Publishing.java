package de.telran.geork.homeworks.hw10.level1.task4_5_level2;

public class Publishing {
    private String name;
    private int foundation;

    public Publishing(String name, int foundation) {
        this.name = name;
        this.foundation = foundation;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Publishing{" +
                "name='" + name + '\'' +
                ", foundation=" + foundation +
                '}';
    }
}
