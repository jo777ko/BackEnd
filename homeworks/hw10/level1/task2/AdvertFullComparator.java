package de.telran.geork.homeworks.hw10.level1.task2;

import java.util.Comparator;

public class AdvertFullComparator implements Comparator<Advert> {
    @Override
    public int compare(Advert advert1, Advert advert2) {
        Comparator<Advert> comp = new AdvertPublicationYear()
                .thenComparing(new AdvertTitleComparator())
                .thenComparing(new AdvertAuthorComparator())
                .thenComparing(new AdvertDescription());
        return comp.compare(advert1, advert2);
    }
}
