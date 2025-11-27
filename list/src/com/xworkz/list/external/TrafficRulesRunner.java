package com.xworkz.list.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TrafficRulesRunner {
    public static void main(String[] args) {
        List<Boolean> list=new ArrayList<>();
        list.add(true);
        list.add(true);
        list.add(true);
        list.add(true);
        list.add(true);
        list.add(false);
        list.add(true);
        ListIterator<Boolean> listIterator=list.listIterator();
        while (listIterator.hasNext()){
            Object object = listIterator.next();
            Boolean good=(Boolean) object;
            if (good==true){
                listIterator.add(false);
            }
            if (good==true){
                listIterator.add(false);

            }
            System.out.println(good);

        }
        System.out.println(list);
    }
}
