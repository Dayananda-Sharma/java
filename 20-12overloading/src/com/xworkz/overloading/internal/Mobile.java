package com.xworkz.overloading.internal;

public class Mobile {
    public void displayMobile(int id){
        System.out.println("about the laptop");
        System.out.println(id);
    }
    public void displayMobile(int id,String mobileNmae){
        System.out.println("about the mobile");
        System.out.println(id);
        System.out.println(mobileNmae);
    }
    public void displayMobile(int id,String mobileNmae,long price){
        System.out.println("about the mobile");
        System.out.println(id);
        System.out.println(mobileNmae);
        System.out.println(price);

    }
    public void displayMobile(int id,String mobileNmae,long price,double gst){
        System.out.println("about the mobile");
        System.out.println(id);
        System.out.println(mobileNmae);
        System.out.println(price);
        System.out.println(gst);
    }
    public void displayMobile(int id,String mobileNmae,long price,double gst,float rateing){
        System.out.println("about the mobile");
        System.out.println(id);
        System.out.println(mobileNmae);
        System.out.println(price);
        System.out.println(gst);
        System.out.println(rateing);
    }
}
