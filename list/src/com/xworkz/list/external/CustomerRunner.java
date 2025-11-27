package com.xworkz.list.external;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class CustomerRunner {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Daya");
        list.add("sharath");
        list.add("rudra");
        list.add("babu");
        list.add("raji");
        list.add("kiran");

      ListIterator<String> listIterator= list.listIterator();

      while (listIterator.hasNext()){
          Object object = listIterator.next();
          String name=(String)object;
          if (name =="sharath"){
              listIterator.add("Prasad");
          }
          if (name =="babu") {
              listIterator.add("manu");
          }
          System.out.println(name);
      }
        System.out.println(list);
    }
}
