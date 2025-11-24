package com.xworkz.amount.external;

import java.util.ArrayList;
import java.util.Collection;

public class AmountRunner {
    public static void main(String[] args) {
        Collection<Double> collection =new ArrayList<>();
        collection.add(2000.00);
        collection.add(300000.00);
        collection.add(400000000000.00);
        System.out.println(collection.toString());
       // System.out.println(collection.toString());
        System.out.println(collection.size());
        collection.clear();
        System.out.println(collection.size());

        collection.add(700000000.10);
        System.out.println(collection.size());
    }
}
