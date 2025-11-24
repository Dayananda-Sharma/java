package com.xworkz.empNumber.external;

import java.util.ArrayList;
import java.util.Collection;

public class EmpolyeeNumber {
    public static void main(String[] args) {
        Collection<Long> collection=new ArrayList<>();
        collection.add(99999999l);
        collection.add(7866866777l);
        System.out.println(collection.toString());
        System.out.println(collection.size());
        collection.clear();
        System.out.println(collection.size());

        collection.add(888888888l);
        System.out.println(collection.size());
    }
}
