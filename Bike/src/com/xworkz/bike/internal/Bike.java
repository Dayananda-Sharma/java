package com.xworkz.bike.internal;

public abstract class Bike {
    public int bikeId;
    public String bikeName;
    public double price;
    public Engine engine;

    public Bike(int bikeId,String bikeName,double price, Engine engine){
        this.bikeId=bikeId;
        this.bikeName=bikeName;
        this.price=price;
        this.engine=engine;

    }
    public void displayBike(){
        System.out.println(bikeId);
        System.out.println(bikeName);
        System.out.println(price);
        System.out.println(engine.engineOil);
    }
}
