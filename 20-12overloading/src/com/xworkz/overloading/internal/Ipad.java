package com.xworkz.overloading.internal;

public class Ipad {
    public void displayIpad(int id){
        System.out.println("about the Ipad");
        System.out.println(id);
    }
    public void displayLaptop(int id,String displayIpad){
        System.out.println("about the Ipad");
        System.out.println(id);
        System.out.println(displayIpad);
    }
    public void displayLaptop(int id,String displayIpad,long price){
        System.out.println("about the Ipad");
        System.out.println(id);
        System.out.println(displayIpad);
        System.out.println(price);

    }
    public void displayLaptop(int id,String displayIpad,long price,double gst){
        System.out.println("about the Ipad");
        System.out.println(id);
        System.out.println(displayIpad);
        System.out.println(price);
        System.out.println(gst);
    }
    public void displayLaptop(int id,String displayIpad,long price,double gst,float rateing){
        System.out.println("about the Ipad");
        System.out.println(id);
        System.out.println(displayIpad);
        System.out.println(price);
        System.out.println(gst);
        System.out.println(rateing);
    }
}
