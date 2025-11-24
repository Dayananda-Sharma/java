package com.xworkz.actors.external;

import java.util.ArrayList;
import java.util.Collection;

public class ActorsRunner {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        collection.add("vijay");
        collection.add("sudeep");
        collection.add("");
        System.out.println(collection.toString());
        System.out.println(collection.size());
        collection.clear();
        System.out.println(collection.size());

        collection.add("kiccha");
        System.out.println(collection.size());
    }
}
