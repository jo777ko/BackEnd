package de.telran.geork.homeworks.hw10.level1.task2;

import java.util.Comparator;

public class AdvertDescription implements Comparator<Advert> {
    @Override
    public int compare(Advert advert1, Advert advert2) {
        return advert1.getDescription().compareTo(advert2.getDescription());
    }
}
