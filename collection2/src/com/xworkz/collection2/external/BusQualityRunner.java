package com.xworkz.collection2.external;

import java.util.Set;
import java.util.TreeSet;

public class BusQualityRunner {
    public static void main(String[] args) {
        Set<Boolean> set= new TreeSet<>();
        set.add(true);
        set.add(false);
        set.add(true);
        set.add(true);
        set.add(false);
        for (Boolean good:set){
            System.out.println(good);
        }
        set.clear();
        System.out.println(set.size());
        set.add(false);
        set.add(true);
        set.add(false);
        set.forEach(n-> System.out.println(n));
        System.out.println(set.toString());
    }
}
