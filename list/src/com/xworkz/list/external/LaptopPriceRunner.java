package com.xworkz.list.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LaptopPriceRunner {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10000);
        list.add(20000);
        list.add(30000);
        list.add(40000);
        list.add(50000);
        list.add(60000);
        list.add(70000);
        ListIterator<Integer> listIterator=list.listIterator();
        while (listIterator.hasNext()){
            Object object = listIterator.next();
            Integer amount=(Integer)object;
            if (amount==50000){
                listIterator.add(9000);
            }
            if (amount==60000){
                listIterator.add(1000);

            }
            System.out.println(amount);

        }
        System.out.println(list);
    }
}
