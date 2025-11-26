package com.xworkz.foreach.external;

import com.xworkz.foreach.dto.LaptopDto;
import com.xworkz.foreach.dto.MobileDto;

import java.util.ArrayList;
import java.util.List;

public class MobileRunner {
    public static void main(String[] args) {
        List<MobileDto> list=new ArrayList<>();
        MobileDto mobileDto=new MobileDto("Vivo",42,9000,10000000,'M',true,12,"V23",998887766);
        MobileDto mobileDto1  = new MobileDto("Vivo",42,9000,10000000,'M',true,12,"V23",998887766);
        MobileDto mobileDto2  = new MobileDto("Samsung",43,8500,9000000,'S',true,11,"S21",998887767);
        MobileDto mobileDto3  = new MobileDto("Oppo",44,8000,8500000,'O',false,10,"F19",998887768);
        MobileDto mobileDto4  = new MobileDto("Realme",45,7800,7500000,'R',true,12,"Realme 8",998887769);
        MobileDto mobileDto5  = new MobileDto("OnePlus",46,12000,15000000,'O',true,13,"Nord 2",998887770);

        MobileDto mobileDto6  = new MobileDto("Apple",47,15000,30000000,'A',true,14,"iPhone 13",998887771);
        MobileDto mobileDto7  = new MobileDto("Xiaomi",48,7000,6500000,'X',false,9,"Mi 11",998887772);
        MobileDto mobileDto8  = new MobileDto("Poco",49,7500,7000000,'P',true,10,"Poco X3",998887773);
        MobileDto mobileDto9  = new MobileDto("Infinix",50,6000,5500000,'I',true,8,"Hot 10",998887774);
        MobileDto mobileDto10 = new MobileDto("Tecno",51,5800,5000000,'T',false,7,"Spark 8",998887775);

        MobileDto mobileDto11 = new MobileDto("Nokia",52,5000,4000000,'N',true,8,"G20",998887776);
        MobileDto mobileDto12 = new MobileDto("Honor",53,8200,7700000,'H',true,11,"Honor 9X",998887777);
        MobileDto mobileDto13 = new MobileDto("Motorola",54,8300,7600000,'M',false,10,"Moto G60",998887778);
        MobileDto mobileDto14 = new MobileDto("Sony",55,14000,20000000,'S',true,12,"Xperia 5",998887779);
        MobileDto mobileDto15 = new MobileDto("LG",56,9000,9500000,'L',true,11,"Wing",998887780);

        MobileDto mobileDto16 = new MobileDto("ZTE",57,6200,4800000,'Z',false,8,"Axon 20",998887781);
        MobileDto mobileDto17 = new MobileDto("Asus",58,13000,18000000,'A',true,12,"ROG Phone 5",998887782);
        MobileDto mobileDto18 = new MobileDto("Google",59,14000,22000000,'G',true,14,"Pixel 6",998887783);
        MobileDto mobileDto19 = new MobileDto("Micromax",60,4500,3000000,'M',false,6,"IN 1",998887784);
        MobileDto mobileDto20 = new MobileDto("Lava",61,4800,3200000,'L',true,7,"Z6",998887785);

        MobileDto mobileDto21 = new MobileDto("HTC",62,9000,10000000,'H',true,11,"Desire 20",998887786);
        MobileDto mobileDto22 = new MobileDto("BlackBerry",63,10000,11000000,'B',true,10,"Key2",998887787);
        MobileDto mobileDto23 = new MobileDto("Panasonic",64,5500,4200000,'P',false,6,"Eluga",998887788);
        MobileDto mobileDto24 = new MobileDto("Alcatel",65,5000,3800000,'A',true,7,"1S",998887789);
        MobileDto mobileDto25 = new MobileDto("Philips",66,5300,3900000,'P',false,6,"X598",998887790);

        MobileDto mobileDto26 = new MobileDto("Huawei",67,11000,16000000,'H',true,12,"Nova 9",998887791);
        MobileDto mobileDto27 = new MobileDto("Lenovo",68,6200,4100000,'L',false,7,"K10",998887792);
        MobileDto mobileDto28 = new MobileDto("Gionee",69,4800,3000000,'G',true,6,"F9 Plus",998887793);
        MobileDto mobileDto29 = new MobileDto("Meizu",70,8900,9000000,'M',true,11,"M16",998887794);
        MobileDto mobileDto30 = new MobileDto("Coolpad",71,5200,3500000,'C',false,6,"Cool 5",998887795);

        list.add(mobileDto);
        list.add(mobileDto1);
        list.add(mobileDto2);
        list.add(mobileDto3);
        list.add(mobileDto4);
        list.add(mobileDto5);
        list.add(mobileDto6);
        list.add(mobileDto7);
        list.add(mobileDto8);
        list.add(mobileDto9);
        list.add(mobileDto10);

        list.add(mobileDto11);
        list.add(mobileDto12);
        list.add(mobileDto13);
        list.add(mobileDto14);
        list.add(mobileDto15);
        list.add(mobileDto16);
        list.add(mobileDto17);
        list.add(mobileDto18);
        list.add(mobileDto19);
        list.add(mobileDto20);

        list.add(mobileDto21);
        list.add(mobileDto22);
        list.add(mobileDto23);
        list.add(mobileDto24);
        list.add(mobileDto25);
        list.add(mobileDto26);
        list.add(mobileDto27);
        list.add(mobileDto28);
        list.add(mobileDto29);
        list.add(mobileDto30);

        for (MobileDto num:list){
            System.out.println(num);
        }
        list.forEach(n-> System.out.println(n));
    }
}
