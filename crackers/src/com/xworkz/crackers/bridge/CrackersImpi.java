package com.xworkz.crackers.bridge;

import com.xworkz.crackers.internal.*;

public class CrackersImpi implements Crackers{
    @Override
    public CrakersInfo crackesName(CrakersInfo crakersInfo) {
        if(crakersInfo.price>100){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        return null;
    }

    @Override
    public CrackersBig crackresbig(CrackersBig crackersBig) {
        if(crackersBig.list>100){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        return null;
    }

    @Override
    public CrackerSmall crackressmall(CrackerSmall crackerSmall) {
        if(crackerSmall.total>100){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        return null;
    }

    @Override
    public CrackersMedium crackersmedium(CrackersMedium crackersMedium) {
        if(crackersMedium.list>100){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        return null;
    }

    @Override
    public CrackersDetalies crackersdetalies(CrackersDetalies crackersDetalies) {
        if(crackersDetalies.totalList>100){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        return null;
    }

}
