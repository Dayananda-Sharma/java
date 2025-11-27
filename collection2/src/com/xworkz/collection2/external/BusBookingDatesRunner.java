package com.xworkz.collection2.external;

import java.util.Set;
import java.util.TreeSet;

public class BusBookingDatesRunner {
    public static void main(String[] args) {
        Set<Float>set=new TreeSet<>();
        set.add(11f);
        set.add(12f);
        set.add(13f);
        set.add(14f);
        set.add(15f);
        for (Float date:set){
            System.out.println(date);
        }
        set.clear();
        System.out.println(set.size());
        set.add(16f);
        set.add(17f);
        set.add(18f);
        set.add(19f);
        set.forEach(n-> System.out.println(n));
        System.out.println(set.toString());
    }
}
