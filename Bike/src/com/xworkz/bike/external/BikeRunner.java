package com.xworkz.bike.external;

import com.xworkz.bike.internal.Bike;
import com.xworkz.bike.internal.BikeDetalies;
import com.xworkz.bike.internal.Engine;

public class BikeRunner {
    public static void main(String[] args) {
        Engine engine = new Engine("Motual");
        Bike bike =new BikeDetalies(102,"MT",200000,engine);
        bike.displayBike();
    }
}
