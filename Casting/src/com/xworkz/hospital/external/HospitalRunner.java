package com.xworkz.hospital.external;

import com.xworkz.hospital.internal.Hospital;
import com.xworkz.hospital.internal.MultiHospital;

public class HospitalRunner {
    public static void main(String [] args){
     Hospital  hospital =new MultiHospital();
        hospital.displayHospital();

        MultiHospital casting=(MultiHospital)hospital;
        casting.displayMultiHospital();
    }
}
