package com.xworkz.list.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PhoneNumberRunner {
    public static void main(String[] args) {
        List<Long> list=new ArrayList<>();
        list.add(9887665555l);
        list.add(9778818817l);
        list.add(987665222l);
        list.add(6677252778l);
        list.add(86772221l);
        list.add(987377383l);
        list.add(9987222222l);
        ListIterator<Long> listIterator=list.listIterator();
        while (listIterator.hasNext()){
            Object object = listIterator.next();
            Long num=(Long)object;
            if (num==9887665555l){
                listIterator.add(988766666l);
            }
            if (num==9987222222l){
                listIterator.add(998727777l);

            }
            System.out.println(num);

        }
        System.out.println(list);
    }
}
