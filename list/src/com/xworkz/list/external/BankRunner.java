package com.xworkz.list.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class BankRunner {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(403);
        list.add(5008);
        list.add(6009);
        list.add(70019);
        ListIterator<Integer> listIterator=list.listIterator();
        while (listIterator.hasNext()){
            Object object = listIterator.next();
            Integer amount=(Integer)object;
            if (amount==111){
                listIterator.add(9000);
            }
            if (amount==5008){
                listIterator.add(1000);

            }
            System.out.println(amount);

        }
        System.out.println(list);
    }
}
