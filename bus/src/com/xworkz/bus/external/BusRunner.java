package com.xworkz.bus.external;

import com.xworkz.bus.bridge.Bus;
import com.xworkz.bus.bridge.BusDemo;
import com.xworkz.bus.bridge.BusImpl;
import com.xworkz.bus.internal.*;

public class BusRunner {
    public static void main(String[] args) {
        Bus bus =new BusImpl();
        BusInfo busInfo=new BusInfo(200,"bangalore");
        bus.displayBusInfo(busInfo);
        System.out.println("number="+busInfo.number);
        System.out.println("name="+busInfo.rootName);

        BusDetiles busDetiles=new BusDetiles(300,'A');
        bus.displaydetiles(busDetiles);
        System.out.println("vale="+busDetiles.value);
        System.out.println("qulity="+busDetiles.grade);

        BusNames busNames=new BusNames("ashmedha",1000);
        bus.displayNames(busNames);
        System.out.println("names="+busNames.name);
        System.out.println("ammount="+busNames.price);

        Busnum busnum=new Busnum(5.5f,true);
        bus.displayNum(busnum);
        System.out.println("range="+busnum.range);
        System.out.println("qulity="+busnum.isGood);

        BusStands busStands=new BusStands("chithradurga",5.9);
        bus.displayStands(busStands);
        System.out.println("names="+busStands.distence);
        System.out.println("distences="+busStands.name);

        BusInfo busInfo1=new BusInfo(200,"mysore");
        bus.displayBusInfo(busInfo1);
        System.out.println("num="+busInfo1.number);
        System.out.println("name"+busInfo1.rootName);

        BusNames busNames1=new BusNames("ksrtc",10);
        bus.displayNames(busNames1);
        System.out.println("names="+busNames1.name);
        System.out.println("price="+busNames1.price);

        BusDetiles busDetiles1=new BusDetiles(30,'A');
        bus.displaydetiles(busDetiles1);
        System.out.println("num="+busDetiles1.value);
        System.out.println("qulity="+busDetiles1.grade);

        Busnum busnum1=new Busnum(5.9f,true);
        bus.displayNum(busnum1);
        System.out.println("review="+busnum1.range);
        System.out.println("qulity="+busnum1.isGood);

        BusStands busStands1=new BusStands("bmtc",6.9);
        bus.displayStands(busStands1);
        System.out.println("names="+busStands1.distence);
        System.out.println("value="+busStands1.name);

        BusInfo busInfo2=new BusInfo(300,"thumukur");
        bus.displayBusInfo(busInfo2);
        System.out.println("num="+busInfo2.number);
        System.out.println("name"+busInfo2.rootName);

        BusNames busNames2=new BusNames("prvite",30);
        bus.displayNames(busNames2);
        System.out.println("names="+busNames2.name);
        System.out.println("price="+busNames2.price);

        BusDetiles busDetiles2=new BusDetiles(30,'A');
        bus.displaydetiles(busDetiles2);
        System.out.println("num="+busDetiles2.value);
        System.out.println("qulity="+busDetiles2.grade);

        Busnum busnum2=new Busnum(5.9f,true);
        bus.displayNum(busnum2);
        System.out.println("review="+busnum2.range);
        System.out.println("qulity="+busnum2.isGood);

        BusStands busStands2=new BusStands("bmtc",6.9);
        bus.displayStands(busStands2);
        System.out.println("names="+busStands2.distence);
        System.out.println("value="+busStands2.name);


        BusInfo busInfo3=new BusInfo(377,"chikmangaluru");
        bus.displayBusInfo(busInfo3);
        System.out.println("num="+busInfo3.number);
        System.out.println("name"+busInfo3.rootName);

        BusNames busNames3=new BusNames("prvite",60);
        bus.displayNames(busNames3);
        System.out.println("names="+busNames3.name);
        System.out.println("price="+busNames3.price);

        BusDetiles busDetiles3=new BusDetiles(30,'B');
        bus.displaydetiles(busDetiles3);
        System.out.println("num="+busDetiles3.value);
        System.out.println("qulity="+busDetiles3.grade);

        Busnum busnum3=new Busnum(5.9f,false);
        bus.displayNum(busnum3);
        System.out.println("review="+busnum3.range);
        System.out.println("qulity="+busnum3.isGood);

        BusStands busStands3=new BusStands("bmtc",6.9);
        bus.displayStands(busStands3);
        System.out.println("names="+busStands3.distence);
        System.out.println("value="+busStands3.name);



    }
}


