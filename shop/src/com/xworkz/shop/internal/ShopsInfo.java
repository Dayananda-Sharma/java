package com.xworkz.shop.internal;

public class ShopsInfo {
    public String name;
    public String description;
    public int typeShops;
    public ShopsInfo(String name, String description, int typeShops) {
        this.name = name;
        this.description = description;
        this.typeShops = typeShops;
        System.out.println("ShopsInfo constructor:"+ name );
        System.out.println("ShopsInfo constructor:"+ description );
        System.out.println("ShopsInfo constructor:"+ typeShops );

    }
}

