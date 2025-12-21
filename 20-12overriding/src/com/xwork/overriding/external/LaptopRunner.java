package com.xwork.overriding.external;

import com.xwork.overriding.internal.ElectronicDevice;
import com.xwork.overriding.internal.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop electronicDevice=new ElectronicDevice();
        electronicDevice.displayLaptop();
        electronicDevice.displayLaptop2();
        electronicDevice.displayLaptop3();
        electronicDevice.displayLaptop4();
        electronicDevice.displayLaptop5();
    }
}
