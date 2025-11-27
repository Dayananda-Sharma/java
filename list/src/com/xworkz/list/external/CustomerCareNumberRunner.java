package com.xworkz.list.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CustomerCareNumberRunner {
    public static void main(String[] args) {
        List<Long> list=new ArrayList<>();
        list.add(1887665555l);
        list.add(1778818817l);
        list.add(187665222l);
        list.add(1677252778l);
        list.add(116772221l);
        list.add(1187377383l);
        list.add(1187222222l);
        ListIterator<Long> listIterator=list.listIterator();
        while (listIterator.hasNext()){
            Object object = listIterator.next();
            Long num=(Long)object;
            if (num==1887665555l){
                listIterator.add(118766666l);
            }
            if (num==1187222222l){
                listIterator.add(12128727777l);

            }
            System.out.println(num);

        }
        System.out.println(list);
    }
}
