package com.xworkz.singleletter.external;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class SingleLetter {
    public static void main(String[] args) {
        Collection<Character>collection=new LinkedList<>();
        collection.add('a');
        collection.add('d');

        System.out.println(collection.toString());
        System.out.println(collection.size());
        collection.clear();
        System.out.println(collection.size());

        collection.add('f');
        System.out.println(collection.size());
    }
}
