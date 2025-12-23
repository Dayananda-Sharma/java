package com.xworkz.dto.external;

import com.xworkz.dto.internal.Laptopdto;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptopdto laptopdto=new Laptopdto();

        laptopdto.setId(11);
        int id=laptopdto.getId();
        System.out.println(id);

        laptopdto.setPrice(2554443.0);
        double price=laptopdto.getPrice();
        System.out.println(price);

        laptopdto.setName("hp");
        String brand=laptopdto.getName();
        System.out.println(brand);
    }
}
