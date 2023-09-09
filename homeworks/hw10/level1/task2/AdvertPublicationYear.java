package de.telran.geork.homeworks.hw10.level1.task2;

import java.util.Comparator;

public class AdvertPublicationYear implements Comparator<Advert> {
    @Override
    public int compare(Advert advert1, Advert advert2) {
        return Integer.compare(advert1.getPublicationYear(), advert2.getPublicationYear());
    }
}
