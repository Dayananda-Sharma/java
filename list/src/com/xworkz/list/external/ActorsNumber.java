package com.xworkz.list.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ActorsNumber {
    public static void main(String[] args) {
        List<Long> list=new ArrayList<>();
        list.add(2227665555l);
        list.add(2778818817l);
        list.add(2222875222l);
        list.add(2277252778l);
        list.add(22772221l);
        list.add(337377383l);
        list.add(3387222222l);
        ListIterator<Long> listIterator=list.listIterator();
        while (listIterator.hasNext()){
            Object object = listIterator.next();
            Long num=(Long)object;
            if (num==2227665555l){
                listIterator.add(988766666l);
            }
            if (num==3387222222l){
                listIterator.add(998727777l);

            }
            System.out.println(num);

        }
        System.out.println(list);
    }
}
