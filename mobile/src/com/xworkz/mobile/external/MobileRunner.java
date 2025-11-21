package com.xworkz.mobile.external;

import com.xworkz.mobile.internal.Mobile;

public class MobileRunner {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.displayBattery(2);
        mobile.displayBrand("Vivo");
        mobile.displaylapName("v23");
        mobile.displayPrice(1000000);
        mobile.displayRam(127);
    }
}
