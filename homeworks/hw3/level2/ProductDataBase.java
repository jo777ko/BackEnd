package de.telran.geork.homeworks.hw3.level2;

public interface ProductDataBase {

    void save(Product product);
    Product findByTitle(String productTitle);
}
