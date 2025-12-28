package com.xworkz.comparator.external;

import com.xworkz.comparator.dto.MobileDto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MobileRunner {
    public static void main(String[] args) {
        MobileDto mobileDto=new MobileDto("Vivo",40000.0,11);
        MobileDto mobileDto1=new MobileDto("oppo",40000.0,12);
        MobileDto mobileDto2=new MobileDto("1+",40000.0,13);
        List<MobileDto> list=new ArrayList<>();
        list.add(mobileDto);
        list.add(mobileDto1);
        list.add(mobileDto2);
        Comparator<MobileDto>comparator=(a,b)->a.getId()-b.getId();
        list.sort(comparator);
        list.forEach(n-> System.out.println(n));

    }
}
