package com.xworkz.comparator.external;

import com.xworkz.comparator.dto.PVRDto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PVRRunner {
    public static void main(String[] args) {
        PVRDto pvrDto=new PVRDto("Mark",300,20.0);
        PVRDto pvrDto1=new PVRDto("Mark",300,20.0);
        PVRDto pvrDto2=new PVRDto("Mark",300,20.0);

        List<PVRDto>list=new ArrayList<>();
        list.add(pvrDto);
        list.add(pvrDto1);
        list.add(pvrDto2);

        Comparator<PVRDto>comparator=(a,b)->b.getPrice()-a.getPrice();
        list.sort(comparator);
        list.forEach(n-> System.out.println(n));
    }
}
