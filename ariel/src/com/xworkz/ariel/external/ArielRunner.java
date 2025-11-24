package com.xworkz.ariel.external;

import java.util.ArrayList;
import java.util.Collection;

public class ArielRunner {
    public static void main(String[] args) {
        Collection<Integer>  collection = new ArrayList<>();
        collection.add(1000);
        collection.add(2000);
        collection.add(3000);
        System.out.println(collection.toString());
        System.out.println(collection.size());
        collection.clear();
        System.out.println(collection.size());
        collection.add(1111);
        System.out.println(collection.size());
    }
}
