package com.xworkz.inheritance.multilevel.external;

import com.xworkz.inheritance.multilevel.internal.Car;
import com.xworkz.inheritance.multilevel.internal.ElectricCar;

public class VehicleRunner {
    public static void main(String[] args) {
        ElectricCar electricCar= new ElectricCar();
        electricCar.displayElectricCar();
        electricCar.displayVehicle();
        Car car=new Car();
        car.displaycar();
        car.displayVehicle();
    }
}
