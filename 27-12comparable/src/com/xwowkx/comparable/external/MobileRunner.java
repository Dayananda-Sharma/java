package com.xwowkx.comparable.external;

import com.xwowkx.comparable.dto.Mobiledto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MobileRunner {
    public static void main(String[] args) {
        Mobiledto mobiledto=new Mobiledto("vivo",11,30000.0);
        Mobiledto mobiledto1=new Mobiledto("vivo",11,30000.0);
        Mobiledto mobiledto2=new Mobiledto("vivo",11,30000.0);

        List<Mobiledto>list=new ArrayList<>();
        list.add(mobiledto1);
        list.add(mobiledto2);
        list.add(mobiledto);

        Collections.sort(list);
        list.forEach(n-> System.out.println(n));
    }
}
