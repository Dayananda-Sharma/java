package com.xworkz.list.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class BussinessRunner {
    public static void main(String[] args) {
        List<Float> list=new ArrayList<>();
        list.add(1.0f);
        list.add(2.0f);
        list.add(3.0f);
        list.add(4.0f);
        list.add(5.0f);
        list.add(6.0f);
        list.add(7.0f);
        ListIterator<Float> listIterator=list.listIterator();
        while (listIterator.hasNext()){
            Object object = listIterator.next();
            Float amount=(Float)object;
            if (amount==1.0f){
                listIterator.add(8.0f);
            }
            if (amount==2.0f){
                listIterator.add(9.0f);

            }
            System.out.println(amount);

        }
        System.out.println(list);
    }
}
