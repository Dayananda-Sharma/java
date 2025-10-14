package com.xworkz.bike.internal;

public class Engine {
    public  String engineOil;

    public Engine(String engineOil){
        this.engineOil=engineOil;
    }
     public void displayEngine(){
        System.out.println(engineOil);
    }
}
