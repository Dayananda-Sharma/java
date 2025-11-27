package com.xworkz.list.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class AmountRunner {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1000);
        list.add(2000);
        list.add(3000);
        list.add(4000);
        list.add(5000);
        list.add(6000);
        list.add(7000);
        ListIterator<Integer> listIterator=list.listIterator();
        while (listIterator.hasNext()){
            Object object = listIterator.next();
            Integer amount=(Integer)object;
            if (amount==5000){
               listIterator.add(9000);
            }
            if (amount==6000){
                listIterator.add(1000);

            }
            System.out.println(amount);

        }
        System.out.println(list);
    }
}
