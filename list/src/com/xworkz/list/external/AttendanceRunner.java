package com.xworkz.list.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class AttendanceRunner {
    public static void main(String[] args) {
        List<Float> list=new ArrayList<>();
        list.add(111.0f);
        list.add(222.0f);
        list.add(321.0f);
        list.add(411.0f);
        list.add(500.0f);
        list.add(600.0f);
        list.add(711.0f);
        ListIterator<Float> listIterator=list.listIterator();
        while (listIterator.hasNext()){
            Object object = listIterator.next();
            Float amount=(Float)object;
            if (amount==111.0f){
                listIterator.add(800.0f);
            }
            if (amount==222.0f){
                listIterator.add(900.0f);

            }
            System.out.println(amount);

        }
        System.out.println(list);
    }
}
