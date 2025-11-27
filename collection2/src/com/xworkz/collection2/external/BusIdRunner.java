package com.xworkz.collection2.external;

import java.util.Set;
import java.util.TreeSet;

public class BusIdRunner {
    public static void main(String[] args) {
        Set<Integer> set=new TreeSet<>();
        set.add(101);
        set.add(102);
        set.add(103);
        set.add(104);
        set.add(105);
        for (Integer id:set){
            System.out.println(id);
        }
        set.clear();
        System.out.println(set.size());
        set.add(106);
        set.add(107);
        set.add(108);
        set.add(109);
        set.forEach(n-> System.out.println(n));
        System.out.println(set.toString());
    }
}
