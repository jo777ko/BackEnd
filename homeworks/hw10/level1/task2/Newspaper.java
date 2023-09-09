package de.telran.geork.homeworks.hw10.level1.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Newspaper {
    public static void main(String[] args) {
        List<Advert> newspaper = new ArrayList<>();
        newspaper.add(new Advert(13, "Car", "Model", "VW", 2022));
        newspaper.add(new Advert(15, "Phone", "Redmi", "Xiaomi", 2022));
        newspaper.add(new Advert(18, "House", "Buy", "Spain", 2021));
        newspaper.add(new Advert(13, "Travel", "Sea", "USA", 2023));
        newspaper.add(new Advert(13, "Car", "GTR", "Nissan", 2022));
        newspaper.add(new Advert(19, "House", "Sell", "Greece", 2020));
        newspaper.add(new Advert(16, "Travel", "Mountain", "Swiss", 2021));
        newspaper.add(new Advert(13, "Fitness", "Cardio", "Bolt", 2020));
        newspaper.add(new Advert(17, "Phone", "Galaxy", "Samsung", 2023));
        newspaper.add(new Advert(14, "Fitness", "Pull up", "Max", 2023));

        Comparator<Advert> personalSorting = new AdvertFullComparator();
        Collections.sort(newspaper, personalSorting);
        System.out.println(newspaper);

    }
}
