package com.xworkz.list.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class EmployeeNamesRunner {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Raj");
        list.add("Govinda");
        list.add("kiccha");
        list.add("ravi");
        list.add("manju");
        list.add("kiran");

        ListIterator<String> listIterator= list.listIterator();

        while (listIterator.hasNext()){
            Object object = listIterator.next();
            String name=(String)object;
            if (name =="kiccha"){
                listIterator.add("Prasad");
            }
            if (name =="manju") {
                listIterator.add("manu");
            }
            System.out.println(name);
        }
        System.out.println(list);
    }
    }

