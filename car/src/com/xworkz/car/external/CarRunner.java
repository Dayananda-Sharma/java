package com.xworkz.car.external;

import com.xworkz.car.internal.Car;
import com.xworkz.car.internal.CarInfo;
import com.xworkz.car.internal.Engine;

public class CarRunner {
    public static void main(String[] args) {
        Engine engine=new Engine(4,"petrol");
        Car car =new CarInfo("yellodi", 102, 500099,engine);
        car.displayCar();
    }
}
