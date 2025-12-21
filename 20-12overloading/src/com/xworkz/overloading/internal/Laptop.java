package com.xworkz.overloading.internal;

public class Laptop {
    public void displayLaptop(int id){
        System.out.println("about the laptop");
        System.out.println(id);
    }
    public void displayLaptop(int id,String laptopName){
        System.out.println("about the laptop");
        System.out.println(id);
        System.out.println(laptopName);
    }
    public void displayLaptop(int id,String laptopName,long price){
        System.out.println("about the laptop");
        System.out.println(id);
        System.out.println(laptopName);
        System.out.println(price);

    }
    public void displayLaptop(int id,String laptopName,long price,double gst){
        System.out.println("about the laptop");
        System.out.println(id);
        System.out.println(laptopName);
        System.out.println(price);
        System.out.println(gst);
    }
    public void displayLaptop(int id,String laptopName,long price,double gst,float rateing){
        System.out.println("about the laptop");
        System.out.println(id);
        System.out.println(laptopName);
        System.out.println(price);
        System.out.println(gst);
        System.out.println(rateing);
    }
}
