package com.xworkz.foreach.external;

import com.xworkz.foreach.dto.PetrolVehicleDto;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PetrolVehicalRunner {
    public static void main(String[] args) {
        List<PetrolVehicleDto> list=new ArrayList<>();
        PetrolVehicleDto petrolVehicleDto=new PetrolVehicleDto("PetrolCar",111,500000,'P',12000,true,1,50000,"india");
        PetrolVehicleDto petrolVehicleDto1  = new PetrolVehicleDto("PetrolCar", 111, 500000, 'P', 12000, true, 1, 50000, "India");
        PetrolVehicleDto petrolVehicleDto2  = new PetrolVehicleDto("SwiftPetrol", 112, 600000, 'P', 13000, true, 2, 52000, "Bangalore");
        PetrolVehicleDto petrolVehicleDto3  = new PetrolVehicleDto("BalenoPetrol", 113, 700000, 'P', 14000, false, 3, 54000, "Mumbai");
        PetrolVehicleDto petrolVehicleDto4  = new PetrolVehicleDto("i20Petrol", 114, 800000, 'P', 11000, true, 1, 51000, "Delhi");
        PetrolVehicleDto petrolVehicleDto5  = new PetrolVehicleDto("AltrozPetrol", 115, 750000, 'P', 12500, true, 2, 53000, "Chennai");

        PetrolVehicleDto petrolVehicleDto6  = new PetrolVehicleDto("KwidPetrol", 116, 450000, 'P', 9000, false, 1, 48000, "Hyderabad");
        PetrolVehicleDto petrolVehicleDto7  = new PetrolVehicleDto("TiagoPetrol", 117, 550000, 'P', 10500, true, 2, 49500, "Pune");
        PetrolVehicleDto petrolVehicleDto8  = new PetrolVehicleDto("CelerioPetrol", 118, 510000, 'P', 9500, true, 1, 47000, "Kolkata");
        PetrolVehicleDto petrolVehicleDto9  = new PetrolVehicleDto("WagonRPetrol", 119, 520000, 'P', 10000, false, 2, 46000, "Nagpur");
        PetrolVehicleDto petrolVehicleDto10 = new PetrolVehicleDto("IgnisPetrol", 120, 580000, 'P', 11500, true, 1, 49000, "Surat");

        PetrolVehicleDto petrolVehicleDto11 = new PetrolVehicleDto("JazzPetrol", 121, 900000, 'P', 15000, true, 3, 60000, "Jaipur");
        PetrolVehicleDto petrolVehicleDto12 = new PetrolVehicleDto("CityPetrol", 122, 1200000, 'P', 17000, false, 4, 65000, "Lucknow");
        PetrolVehicleDto petrolVehicleDto13 = new PetrolVehicleDto("AmazePetrol", 123, 850000, 'P', 13000, true, 2, 58000, "Bhopal");
        PetrolVehicleDto petrolVehicleDto14 = new PetrolVehicleDto("VernaPetrol", 124, 1100000, 'P', 16000, true, 3, 64000, "Indore");
        PetrolVehicleDto petrolVehicleDto15 = new PetrolVehicleDto("RapidPetrol", 125, 900000, 'P', 14500, false, 2, 61000, "Patna");

        PetrolVehicleDto petrolVehicleDto16 = new PetrolVehicleDto("VentoPetrol", 126, 950000, 'P', 15000, true, 3, 63000, "Coimbatore");
        PetrolVehicleDto petrolVehicleDto17 = new PetrolVehicleDto("PoloPetrol", 127, 800000, 'P', 13500, true, 2, 59000, "Mangalore");
        PetrolVehicleDto petrolVehicleDto18 = new PetrolVehicleDto("KigerPetrol", 128, 750000, 'P', 12500, false, 1, 55000, "Vadodara");
        PetrolVehicleDto petrolVehicleDto19 = new PetrolVehicleDto("MagnitePetrol", 129, 780000, 'P', 12800, true, 2, 56000, "Ranchi");
        PetrolVehicleDto petrolVehicleDto20 = new PetrolVehicleDto("SonetPetrol", 130, 900000, 'P', 14500, true, 3, 61000, "Kanpur");

        PetrolVehicleDto petrolVehicleDto21 = new PetrolVehicleDto("CretaPetrol", 131, 1200000, 'P', 17000, false, 4, 67000, "Amritsar");
        PetrolVehicleDto petrolVehicleDto22 = new PetrolVehicleDto("SeltosPetrol", 132, 1100000, 'P', 16000, true, 3, 64000, "Kochi");
        PetrolVehicleDto petrolVehicleDto23 = new PetrolVehicleDto("BrezzaPetrol", 133, 950000, 'P', 14000, true, 2, 60000, "Guwahati");
        PetrolVehicleDto petrolVehicleDto24 = new PetrolVehicleDto("EcosportPetrol", 134, 1000000, 'P', 15000, false, 3, 62000, "Noida");
        PetrolVehicleDto petrolVehicleDto25 = new PetrolVehicleDto("NexonPetrol", 135, 1050000, 'P', 15500, true, 2, 63000, "Thane");

        PetrolVehicleDto petrolVehicleDto26 = new PetrolVehicleDto("HectorPetrol", 136, 1500000, 'P', 18000, true, 4, 70000, "Mysore");
        PetrolVehicleDto petrolVehicleDto27 = new PetrolVehicleDto("CompassPetrol", 137, 2000000, 'P', 20000, true, 5, 75000, "Hubli");
        PetrolVehicleDto petrolVehicleDto28 = new PetrolVehicleDto("HarrierPetrol", 138, 1700000, 'P', 19000, false, 4, 72000, "Nashik");
        PetrolVehicleDto petrolVehicleDto29 = new PetrolVehicleDto("SafariPetrol", 139, 1800000, 'P', 19500, true, 4, 74000, "Guntur");
        PetrolVehicleDto petrolVehicleDto30 = new PetrolVehicleDto("FortunerPetrol", 140, 3000000, 'P', 25000, true, 6, 90000, "Hyderabad");

        list.add(petrolVehicleDto);
        list.add(petrolVehicleDto1);
        list.add(petrolVehicleDto2);
        list.add(petrolVehicleDto3);
        list.add(petrolVehicleDto4);
        list.add(petrolVehicleDto5);
        list.add(petrolVehicleDto6);
        list.add(petrolVehicleDto7);
        list.add(petrolVehicleDto8);
        list.add(petrolVehicleDto9);
        list.add(petrolVehicleDto10);

        list.add(petrolVehicleDto11);
        list.add(petrolVehicleDto12);
        list.add(petrolVehicleDto13);
        list.add(petrolVehicleDto14);
        list.add(petrolVehicleDto15);
        list.add(petrolVehicleDto16);
        list.add(petrolVehicleDto17);
        list.add(petrolVehicleDto18);
        list.add(petrolVehicleDto19);
        list.add(petrolVehicleDto20);

        list.add(petrolVehicleDto21);
        list.add(petrolVehicleDto22);
        list.add(petrolVehicleDto23);
        list.add(petrolVehicleDto24);
        list.add(petrolVehicleDto25);
        list.add(petrolVehicleDto26);
        list.add(petrolVehicleDto27);
        list.add(petrolVehicleDto28);
        list.add(petrolVehicleDto29);
        list.add(petrolVehicleDto30);

        for (PetrolVehicleDto name:list){
            System.out.println(name);
        }
        list.forEach(n-> System.out.println(n));
    }
}
