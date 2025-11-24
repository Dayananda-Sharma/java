package com.xworkz.height.external;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

public class HeightRunner {
    public static void main(String[] args) {
        Collection<Float> collection = new ArrayList<>();
        collection.add(5.1f);
        collection.add(6.7f);
        System.out.println(collection.toString());
        System.out.println(collection.size());
        collection.clear();
        System.out.println(collection.size());

       collection.add(7.1f);
        System.out.println(collection.size());

    }
}
