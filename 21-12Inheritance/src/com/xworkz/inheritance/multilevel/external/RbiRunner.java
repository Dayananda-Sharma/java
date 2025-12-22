package com.xworkz.inheritance.multilevel.external;

import com.xworkz.inheritance.multilevel.internal.Hdfc;
import com.xworkz.inheritance.multilevel.internal.Sbi;

public class RbiRunner {
    public static void main(String[] args) {
        Sbi sbi=new Sbi();
        sbi.displaySbi();
        sbi.displayRbi();
        Hdfc hdfc=new Hdfc();
        hdfc.displayHdfc();
        hdfc.displayRbi();
    }
}
