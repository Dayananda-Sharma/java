package com.xworkz.collection2.external;

import java.util.Set;
import java.util.TreeSet;

public class BusRunner {
    public static void main(String[] args) {
        Set<String> set=new TreeSet<>();
        set.add("rakhi");
        set.add("raju");
        set.add("charles");
        set.add("harsha");
        set.add("harsha");
        for (String name:set){
            System.out.println(name);
        }
        set.clear();

        System.out.println(set.size());
        set.add("prasad");
        set.add("kiran");
        set.add("meghu");
        System.out.println(set.toString());
        set.forEach(n-> System.out.println(n));
    }
}
