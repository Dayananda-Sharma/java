package com.xworkz.list.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TvchannelsRunner {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("colorTv");
        list.add("ZeeTv");
        list.add("StarPlus");
        list.add("sony");
        list.add("Mtv");
        list.add("Cartoon");

        ListIterator<String> listIterator= list.listIterator();

        while (listIterator.hasNext()){
            Object object = listIterator.next();
            String name=(String)object;
            if (name =="colorTv"){
                listIterator.add("CNN");
            }
            if (name =="Cartoon") {
                listIterator.add("Tv9");
            }
            System.out.println(name);
        }
        System.out.println(list);

    }
}
