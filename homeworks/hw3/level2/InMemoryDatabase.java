package de.telran.geork.homeworks.hw3.level2;

public class InMemoryDatabase implements ProductDataBase{
    private Product[] items = new Product[5];
    int counter = 0;

    public Product[] getItems() {
        return items;
    }

    public void setItems(Product[] items) {
        this.items = items;
    }


    @Override
    public void save(Product product) {
        items[counter] = product;
        counter++;
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : items){
            if (product != null && product.getTitle().equals(productTitle)){
                return product;
            }
        }
        return null;
    }

}
