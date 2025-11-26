package com.xworkz.foreach.external;

import com.xworkz.foreach.dto.Vehicledto;

import java.util.ArrayList;
import java.util.List;

public class VehicleRunner {
    public static void main(String[] args) {
        List<Vehicledto> list=new ArrayList<>();
        Vehicledto vehicledto=new Vehicledto("Thar",11,10000000,'T',12000.0,true,12,30000.0,"Banglore");
        Vehicledto vehicledto1  = new Vehicledto("Thar", 11, 10000000, 'T', 12000.0, true, 12, 30000.0, "Bangalore");
        Vehicledto vehicledto2  = new Vehicledto("Scorpio", 22, 1800000, 'S', 15000.0, false, 10, 25000.0, "Mumbai");
        Vehicledto vehicledto3  = new Vehicledto("Fortuner", 33, 3500000, 'F', 20000.0, true, 14, 40000.0, "Delhi");
        Vehicledto vehicledto4  = new Vehicledto("Innova", 44, 2800000, 'I', 17000.0, true, 11, 27000.0, "Hyderabad");
        Vehicledto vehicledto5  = new Vehicledto("Safari", 55, 2200000, 'S', 16000.0, false, 13, 32000.0, "Chennai");
        Vehicledto vehicledto6  = new Vehicledto("Creta", 66, 1500000, 'C', 13000.0, true, 9, 21000.0, "Pune");
        Vehicledto vehicledto7  = new Vehicledto("Harrier", 77, 2600000, 'H', 18000.0, true, 15, 35000.0, "Kolkata");
        Vehicledto vehicledto8  = new Vehicledto("Seltos", 88, 1700000, 'S', 12500.0, false, 10, 23000.0, "Jaipur");
        Vehicledto vehicledto9  = new Vehicledto("XUV700", 99, 2500000, 'X', 19000.0, true, 16, 37000.0, "Surat");
        Vehicledto vehicledto10 = new Vehicledto("Bolero", 101, 1200000, 'B', 9000.0, false, 8, 18000.0, "Indore");

        Vehicledto vehicledto11 = new Vehicledto("Ertiga", 111, 1300000, 'E', 11000.0, true, 9, 20000.0, "Nagpur");
        Vehicledto vehicledto12 = new Vehicledto("Alto", 121, 500000, 'A', 5000.0, true, 7, 15000.0, "Mysore");
        Vehicledto vehicledto13 = new Vehicledto("Swift", 131, 800000, 'S', 8000.0, false, 8, 17000.0, "Hubli");
        Vehicledto vehicledto14 = new Vehicledto("Baleno", 141, 900000, 'B', 8500.0, true, 9, 17500.0, "Vijayawada");
        Vehicledto vehicledto15 = new Vehicledto("i20", 151, 1100000, 'I', 10000.0, true, 10, 22000.0, "Coimbatore");
        Vehicledto vehicledto16 = new Vehicledto("Kwid", 161, 450000, 'K', 4000.0, false, 6, 13000.0, "Madurai");
        Vehicledto vehicledto17 = new Vehicledto("Magnite", 171, 700000, 'M', 7500.0, true, 8, 16500.0, "Thane");
        Vehicledto vehicledto18 = new Vehicledto("Triber", 181, 650000, 'T', 6000.0, true, 7, 15500.0, "Nashik");
        Vehicledto vehicledto19 = new Vehicledto("Venue", 191, 1200000, 'V', 11500.0, false, 9, 21000.0, "Bhopal");
        Vehicledto vehicledto20 = new Vehicledto("Sonet", 201, 1300000, 'S', 11800.0, true, 10, 22500.0, "Patna");

        Vehicledto vehicledto21 = new Vehicledto("Glanza", 211, 900000, 'G', 8200.0, true, 8, 17500.0, "Ranchi");
        Vehicledto vehicledto22 = new Vehicledto("Urban Cruiser", 221, 1500000, 'U', 14000.0, false, 11, 26000.0, "Kochi");
        Vehicledto vehicledto23 = new Vehicledto("Vitara Brezza", 231, 1000000, 'V', 9500.0, true, 9, 19000.0, "Lucknow");
        Vehicledto vehicledto24 = new Vehicledto("Ciaz", 241, 1100000, 'C', 9800.0, true, 10, 20000.0, "Kanpur");
        Vehicledto vehicledto25 = new Vehicledto("Verna", 251, 1300000, 'V', 12500.0, false, 11, 25000.0, "Amritsar");
        Vehicledto vehicledto26 = new Vehicledto("City", 261, 1500000, 'C', 15000.0, true, 12, 30000.0, "Trivandrum");
        Vehicledto vehicledto27 = new Vehicledto("Jazz", 271, 900000, 'J', 8500.0, true, 8, 18000.0, "Mangalore");
        Vehicledto vehicledto28 = new Vehicledto("WRV", 281, 1100000, 'W', 11500.0, false, 9, 21000.0, "Guwahati");
        Vehicledto vehicledto29 = new Vehicledto("Kicks", 291, 1400000, 'K', 13500.0, true, 10, 26000.0, "Vadodara");
        Vehicledto vehicledto30 = new Vehicledto("Hector", 301, 1700000, 'H', 16000.0, true, 13, 32000.0, "Raipur");

        list.add(vehicledto);
        list.add(vehicledto1);
        list.add(vehicledto2);
        list.add(vehicledto3);
        list.add(vehicledto4);
        list.add(vehicledto5);
        list.add(vehicledto6);
        list.add(vehicledto7);
        list.add(vehicledto8);
        list.add(vehicledto9);
        list.add(vehicledto10);

        list.add(vehicledto11);
        list.add(vehicledto12);
        list.add(vehicledto13);
        list.add(vehicledto14);
        list.add(vehicledto15);
        list.add(vehicledto16);
        list.add(vehicledto17);
        list.add(vehicledto18);
        list.add(vehicledto19);
        list.add(vehicledto20);

        list.add(vehicledto21);
        list.add(vehicledto22);
        list.add(vehicledto23);
        list.add(vehicledto24);
        list.add(vehicledto25);
        list.add(vehicledto26);
        list.add(vehicledto27);
        list.add(vehicledto28);
        list.add(vehicledto29);
        list.add(vehicledto30);

        for (Vehicledto name: list){
            System.out.println(name);
        }
        list.forEach(n-> System.out.println(n));
    }
}
