package com.xworkz.movies.external;

import java.util.ArrayList;
import java.util.Collection;

public class MoviesRunner {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        collection.add("ega");
        collection.add("rajasab");
        collection.add("kingdom");
        collection.add("Max");
        collection.add("Devil");
        System.out.println(collection.toString());
        System.out.println(collection.size());
        collection.clear();
        System.out.println(collection.size());

        collection.add("mark");
        System.out.println(collection.size());
    }
}
