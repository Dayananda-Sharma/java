package com.xworkz.car.internal;

public abstract class Car {
    public String carName;
    public int carId;
    public long carPrice;
    public Engine engine;
    public Car(String carName, int carId,long carPrice,Engine engine){
        this.carName=carName;
        this.carId=carId;
        this.carPrice=carPrice;
        this.engine=engine;
    }
    public void displayCar(){
        System.out.println(carName);
        System.out.println(carId);
        System.out.println(carPrice);
        System.out.println(engine.noOfstrock);
        System.out.println(engine.type);
    }

}
