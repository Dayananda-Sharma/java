package com.xworkz.list.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class EmployeeIdRunner {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(101);
        list.add(202);
        list.add(303);
        list.add(404);
        list.add(505);
        list.add(606);
        list.add(707);
        ListIterator<Integer> listIterator=list.listIterator();
        while (listIterator.hasNext()){
            Object object = listIterator.next();
            Integer amount=(Integer)object;
            if (amount==505){
                listIterator.add(909);
            }
            if (amount==606){
                listIterator.add(101);

            }
            System.out.println(amount);

        }
        System.out.println(list);
    }
}
