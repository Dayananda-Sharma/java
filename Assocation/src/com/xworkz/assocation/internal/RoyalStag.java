package com.xworkz.assocation.internal;

public class RoyalStag {
    public String drinkName;
    public int price;
    Icecube icecube;
    Water water;
    Soda soda;

    public RoyalStag(String drinkName,int price,Icecube icecube,Water water,Soda soda){
        this.drinkName=drinkName;
        this.price=price;
        this.icecube=icecube;
        this.water=water;
        this.soda=soda;
    }

    public void displayRoyalStag(){
        System.out.println("drink ="+drinkName);
        System.out.println("cost="+price);
        System.out.println("noOficecube:"+icecube.noOfCubes);
        System.out.println("water price:"+water.cost);
        System.out.println("Soda name:"+soda.sodaName);
    }

}
