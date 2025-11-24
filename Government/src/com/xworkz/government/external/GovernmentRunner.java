package com.xworkz.government.external;

import java.util.ArrayList;
import java.util.Collection;

public class GovernmentRunner {
    public static void main(String[] args) {
        Collection<Boolean> collection = new ArrayList<>();
        collection.add(true);
        collection.add(false);
        System.out.println(collection.toString());
        System.out.println(collection.size());
        collection.clear();
        System.out.println(collection.size());

        collection.add(false);
        System.out.println(collection.size());
    }
}
