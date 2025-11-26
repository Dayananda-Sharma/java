package com.xworkz.foreach.external;

import com.xworkz.foreach.dto.LaptopDto;

import java.util.ArrayList;
import java.util.List;

public class LaptopRunner {
    public static void main(String[] args) {
        List<LaptopDto> list=new ArrayList<>();
        LaptopDto laptopDto=new LaptopDto("hp",301,7000,100000,'L',true,31,"Ryzen 5",13255667);
        LaptopDto laptopDto1  = new LaptopDto("HP",301,7000,100000,'L',true,31,"Ryzen 5",13255667);
        LaptopDto laptopDto2  = new LaptopDto("Dell",302,8000,120000,'D',true,32,"i5 11th Gen",13255668);
        LaptopDto laptopDto3  = new LaptopDto("Lenovo",303,7500,90000,'L',false,29,"Ryzen 3",13255669);
        LaptopDto laptopDto4  = new LaptopDto("Acer",304,6800,85000,'A',true,28,"i3 10th Gen",13255670);
        LaptopDto laptopDto5  = new LaptopDto("Asus",305,7200,95000,'A',true,30,"Ryzen 7",13255671);

        LaptopDto laptopDto6  = new LaptopDto("MSI",306,9000,150000,'M',true,32,"i7 12th Gen",13255672);
        LaptopDto laptopDto7  = new LaptopDto("Samsung",307,8200,110000,'S',false,27,"Ryzen 5",13255673);
        LaptopDto laptopDto8  = new LaptopDto("LG",308,7900,100500,'L',true,26,"i5 12th Gen",13255674);
        LaptopDto laptopDto9  = new LaptopDto("Apple",309,10000,200000,'A',true,35,"M1 Chip",13255675);
        LaptopDto laptopDto10 = new LaptopDto("Toshiba",310,6500,70000,'T',false,25,"i3 9th Gen",13255676);

        LaptopDto laptopDto11 = new LaptopDto("Fujitsu",311,7700,92000,'F',true,29,"Ryzen 5",13255677);
        LaptopDto laptopDto12 = new LaptopDto("Vaio",312,8300,105000,'V',true,31,"i5 11th Gen",13255678);
        LaptopDto laptopDto13 = new LaptopDto("Razer",313,12000,250000,'R',true,33,"i9 12th Gen",13255679);
        LaptopDto laptopDto14 = new LaptopDto("Microsoft",314,9500,180000,'M',true,32,"Surface i7",13255680);
        LaptopDto laptopDto15 = new LaptopDto("Huawei",315,8600,130000,'H',false,30,"Ryzen 7",13255681);

        LaptopDto laptopDto16 = new LaptopDto("Xiaomi",316,7800,98000,'X',true,28,"Ryzen 5",13255682);
        LaptopDto laptopDto17 = new LaptopDto("Realme",317,7000,85000,'R',true,27,"i5 10th Gen",13255683);
        LaptopDto laptopDto18 = new LaptopDto("Honor",318,7600,92000,'H',true,29,"Ryzen 3",13255684);
        LaptopDto laptopDto19 = new LaptopDto("Infinix",319,6900,80000,'I',false,25,"i3 11th Gen",13255685);
        LaptopDto laptopDto20 = new LaptopDto("Alienware",320,15000,300000,'A',true,34,"i9 13th Gen",13255686);

        LaptopDto laptopDto21 = new LaptopDto("Gigabyte",321,9900,160000,'G',true,31,"Ryzen 9",13255687);
        LaptopDto laptopDto22 = new LaptopDto("Zebronics",322,6200,60000,'Z',false,24,"i3 10th Gen",13255688);
        LaptopDto laptopDto23 = new LaptopDto("Avita",323,5500,45000,'A',true,23,"i3 9th Gen",13255689);
        LaptopDto laptopDto24 = new LaptopDto("Chuwi",324,5800,50000,'C',true,26,"Ryzen 3",13255690);
        LaptopDto laptopDto25 = new LaptopDto("Tecno",325,6400,62000,'T',false,27,"i5 9th Gen",13255691);

        LaptopDto laptopDto26 = new LaptopDto("Panasonic",326,7000,90000,'P',true,28,"i5 10th Gen",13255692);
        LaptopDto laptopDto27 = new LaptopDto("Sharp",327,6800,86000,'S',false,27,"Ryzen 5",13255693);
        LaptopDto laptopDto28 = new LaptopDto("BenQ",328,7300,98000,'B',true,28,"i7 11th Gen",13255694);
        LaptopDto laptopDto29 = new LaptopDto("Sony",329,8400,120000,'S',true,30,"i7 12th Gen",13255695);
        LaptopDto laptopDto30 = new LaptopDto("DellXPS",330,11000,190000,'D',true,33,"i7 13th Gen",13255696);

        list.add(laptopDto);
        list.add(laptopDto1);
        list.add(laptopDto2);
        list.add(laptopDto3);
        list.add(laptopDto4);
        list.add(laptopDto5);
        list.add(laptopDto6);
        list.add(laptopDto7);
        list.add(laptopDto8);
        list.add(laptopDto9);
        list.add(laptopDto10);

        list.add(laptopDto11);
        list.add(laptopDto12);
        list.add(laptopDto13);
        list.add(laptopDto14);
        list.add(laptopDto15);
        list.add(laptopDto16);
        list.add(laptopDto17);
        list.add(laptopDto18);
        list.add(laptopDto19);
        list.add(laptopDto20);

        list.add(laptopDto21);
        list.add(laptopDto22);
        list.add(laptopDto23);
        list.add(laptopDto24);
        list.add(laptopDto25);
        list.add(laptopDto26);
        list.add(laptopDto27);
        list.add(laptopDto28);
        list.add(laptopDto29);
        list.add(laptopDto30);

        for (LaptopDto name: list){
            System.out.println(name);
        }

        list.forEach(n-> System.out.println(n));
    }
}
