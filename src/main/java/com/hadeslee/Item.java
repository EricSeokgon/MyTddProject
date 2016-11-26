package com.hadeslee;

/**
 * Created by hadeslee on 2016-11-25.
 */
public class Item {
    private String Name;
    private String Category;
    private int Price;
    private int price;

    public Item(String name, String category, int price) {
        Name = name;
        Category = category;
        Price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
