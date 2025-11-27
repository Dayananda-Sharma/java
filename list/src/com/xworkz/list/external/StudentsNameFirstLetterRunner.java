package com.xworkz.list.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StudentsNameFirstLetterRunner {
    public static void main(String[] args) {
        List<Character> list=new ArrayList<>();
        list.add('K');
        list.add('T');
        list.add('R');
        list.add('Z');
        list.add('F');
        list.add('H');
        list.add('k');
        list.add('D');
        list.add('G');

        ListIterator<Character> listIterator= list.listIterator();

        while (listIterator.hasNext()){
            Object object = listIterator.next();
            Character name=(Character) object;
            if (name =='k'){
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
