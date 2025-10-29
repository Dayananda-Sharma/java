package com.xworkz.crackers.external;

import com.xworkz.crackers.bridge.Chakri;
import com.xworkz.crackers.bridge.Chakrilmp;
import com.xworkz.crackers.bridge.Crackers;
import com.xworkz.crackers.bridge.CrackersImpi;
import com.xworkz.crackers.internal.*;

public class CrackersRunner {
    public static void main(String[] args) {
        Crackers crackers= new CrackersImpi();
        CrakersInfo crakersInfo =new CrakersInfo(100,"Flower pots");
        crackers.crackesName(crakersInfo);
        System.out.println("product price="+crakersInfo.price);
        System.out.println("product name="+crakersInfo.name);

        CrackersBig crackersBig =new CrackersBig(200,"Shots");
        crackers.crackresbig(crackersBig);
        System.out.println("product price="+crackersBig.list);
        System.out.println("product name="+crackersBig.bigCrackers);

        CrackersMedium crackersMedium =new CrackersMedium(300,"Pataki");
        crackers.crackersmedium(crackersMedium);
        System.out.println("product price="+crackersMedium.list);
        System.out.println("product name="+crackersMedium.Crackers);

        CrackerSmall crackerSmall =new CrackerSmall(10,"sparks");
        crackers.crackressmall(crackerSmall);
        System.out.println("product price="+crackerSmall.total);
        System.out.println("product name="+crackerSmall.smallCrackers);

        CrackersDetalies crackersDetalies=new CrackersDetalies(5,"suryakala");
        crackers.crackersdetalies(crackersDetalies);
        System.out.println("product price="+crackersDetalies.totalList);
        System.out.println("product name="+crackersDetalies.noOfCrackers);

        Chakri chakri =new Chakrilmp();
        CrackersBig crackersBig1 =new CrackersBig(11,"BigOne");
        System.out.println("product price="+crakersInfo.price);
        System.out.println("product name="+crakersInfo.name);

        CrackersBig crackersBi =new CrackersBig(200,"Shots");
        crackers.crackresbig(crackersBi);
        System.out.println("product price="+crackersBig.list);
        System.out.println("product name="+crackersBig.bigCrackers);

        CrackersMedium crackersMediu =new CrackersMedium(300,"Pataki");
        crackers.crackersmedium(crackersMedium);
        System.out.println("product price="+crackersMedium.list);
        System.out.println("product name="+crackersMedium.Crackers);

        CrackerSmall crackerSmal =new CrackerSmall(10,"sparks");
        crackers.crackressmall(crackerSmall);
        System.out.println("product price="+crackerSmall.total);
        System.out.println("product name="+crackerSmall.smallCrackers);

        CrackersDetalies crackersDetalie=new CrackersDetalies(5,"suryakala");
        crackers.crackersdetalies(crackersDetalies);
        System.out.println("product price="+crackersDetalies.totalList);
        System.out.println("product name="+crackersDetalies.noOfCrackers);
    }
}
