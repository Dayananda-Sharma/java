package com.xworkz.list.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SocialMediaRunner {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("insta");
        list.add("facebook");
        list.add("whatsapp");
        list.add("Telegram");
        list.add("youtube");
        list.add("Remini");

        ListIterator<String> listIterator= list.listIterator();

        while (listIterator.hasNext()){
            Object object = listIterator.next();
            String name=(String)object;
            if (name =="facebook"){
                listIterator.add("opera");
            }
            if (name =="whatsapp") {
                listIterator.add("facelite");
            }
            System.out.println(name);
        }
        System.out.println(list);
    }
}
