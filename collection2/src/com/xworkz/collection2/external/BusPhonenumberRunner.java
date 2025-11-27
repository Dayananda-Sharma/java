package com.xworkz.collection2.external;

import java.util.Set;
import java.util.TreeSet;

public class BusPhonenumberRunner {
    public static void main(String[] args) {
        Set<Long>set=new TreeSet<>();
        set.add(89877666l);
        set.add(766549998l);
        set.add(873663323l);
        set.add(98890222l);
        set.add(876556111l);
        for (Long num:set){
            System.out.println(num);
        }
        set.clear();
        System.out.println(set.size());
        set.add(878987799l);
        set.add(987728822l);
        set.add(988378839l);
        set.forEach(n-> System.out.println(n));
        System.out.println(set.toString());
    }
}
