package com.xworkz.shop.internal;

public class ShopsStock {
    int  id;
    String name;
    float price;
    public ShopsStock(int id, String name, float price) {
        this.id = id;
        this.name = name;

        this.price = price;
        System.out.println("id : " + id + " name : " + name + " price : " + price);
    }
}


