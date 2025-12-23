package com.xworkz.dto.external;

import com.xworkz.dto.internal.Branddto;

public class BrandRunner {
    public static void main(String[] args) {
        Branddto branddto=new Branddto();

        branddto.setId(11);
        int id=branddto.getId();
        System.out.println(id);

        branddto.setName("puma");
        String name=branddto.getName();
        System.out.println(name);

        branddto.setPrice(1000000);
        double price=branddto.getPrice();
        System.out.println(price);
    }
}
