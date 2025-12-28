package com.xworkz.comparator.external;

import com.xworkz.comparator.dto.PGDto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PGRunner {
    public static void main(String[] args) {
        PGDto pgDto=new PGDto("Amruth","banglore",6500);
        PGDto pgDto1=new PGDto("Githa","banglore",6500);
        PGDto pgDto2=new PGDto("basa","banglore",6500);

        List<PGDto>list=new ArrayList<>();
        list.add(pgDto);
        list.add(pgDto1);
        list.add(pgDto2);

        Comparator<PGDto>comparator=(a,b)->b.getRent()- a.getRent();
        list.sort(comparator);

        list.forEach(n-> System.out.println(n));
    }
}
