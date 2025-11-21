package com.xworkz.mobile.internal;

import com.xworkz.mobile.events.*;

public class Mobile {
    public int displayRam(int ram){
        if (ram>125){
            try {
                throw new MobileRamException();
            }catch (MobileRamException ramException){
                ramException.printStackTrace();
                System.out.println("Ram is 125GB");
            }
        }else {
            System.out.println("this is Fake");
        }
        return ram;
    }
    public int displayPrice(int price){
        if (price>100000){
            try {
                throw new MobilePriceException();
            }catch (MobilePriceException priceException){
                priceException.printStackTrace();
                System.out.println(" more than 100000 ");
            }
        }else {
            System.out.println("Less than 100000");
        }
        return price;
    }
    public int displayBattery(int day){
        if (day>1){
            try {
                throw new MobileBatteryLifeException();
            }catch (MobileBatteryLifeException batteryException){
                batteryException.printStackTrace();
                System.out.println(" more than 100000 ");
            }
        }else {
            System.out.println("Less than 100000");
        }
        return day;
    }
    public String displayBrand(String brand){
        if (brand=="vivo"){
            try {
                throw new MobileBrandException();

            }catch (MobileBrandException brandException){
                brandException.printStackTrace();
                System.out.println("good brand");
            }
        }else {
            System.out.println("brand is fake");
        }
        return brand;
    }
    public String displaylapName(String name){
        if (name=="v23"){
            try {
                throw new MobileNameException();

            }catch (MobileNameException nameException){
                nameException.printStackTrace();
                System.out.println("good brand");
            }
        }else {
            System.out.println("brand is fake");
        }
        return name;
    }

}
