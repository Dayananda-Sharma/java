package com.xworkz.shop.internal;

public class ShopWholSeller {
    String name;
    double price;
    int quantity;
    public  ShopWholSeller(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        System.out.println("ShopsWholSeller " + name + "price list " + price + "quantity type " + quantity);
    }

}
