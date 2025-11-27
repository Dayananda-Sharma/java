package com.xworkz.list.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MobileNameRunner {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Vivo");
        list.add("Iphone");
        list.add("oppo");
        list.add("galaxy");
        list.add("Sam");
        list.add("moto");

        ListIterator<String> listIterator= list.listIterator();

        while (listIterator.hasNext()){
            Object object = listIterator.next();
            String name=(String)object;
            if (name =="oppo"){
                listIterator.add("ipad");
            }
            if (name =="moto") {
                listIterator.add("redmi");
            }
            System.out.println(name);
        }
        System.out.println(list);
    }
}
