package de.telran.geork.homeworks.hw10.level1.task2;

import java.util.Comparator;

public class AdvertAuthorComparator implements Comparator<Advert> {
    @Override
    public int compare(Advert advert1, Advert advert2) {
        return advert1.getAuthor().compareTo(advert2.getAuthor());
    }
}
