package com.xworkz.car.internal;

public class Engine{
    public int noOfstrock;
    public String type;

    public Engine(int noOfstrock,String type){
        this.noOfstrock=noOfstrock;
        this.type=type;
    }

    public void displayEngine(){
        System.out.println("enginePrice="+noOfstrock);
        System.out.println("enginName="+type);
    }
}
