package com.xworkz.list.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MarkSheetRunner {
    public static void main(String[] args) {
        List<Character> list=new ArrayList<>();
        list.add('D');
        list.add('T');
        list.add('G');
        list.add('R');
        list.add('F');
        list.add('H');

        ListIterator<Character> listIterator= list.listIterator();

        while (listIterator.hasNext()){
            Object object = listIterator.next();
            Character name=(Character) object;
            if (name =='D'){
                listIterator.add('N');
            }
            if (name =='R') {
                listIterator.add('m');
            }
            System.out.println(name);
        }
        System.out.println(list);
       }
    }

