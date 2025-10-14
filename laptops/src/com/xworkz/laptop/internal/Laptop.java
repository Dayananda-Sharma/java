package com.xworkz.laptop.internal;

public abstract class Laptop {
    public  int laptopPrice;
    public  String loptopName;
    public IntelCore intelCore;

    public Laptop(int laptopPrice,String loptopName,IntelCore intelCore){
        this.laptopPrice=laptopPrice;
        this.loptopName=loptopName;
        this.intelCore=intelCore;

    }
    public void displayLaptop(){
        System.out.println(laptopPrice);
        System.out.println(loptopName);
        System.out.println(intelCore.core);
    }
}
