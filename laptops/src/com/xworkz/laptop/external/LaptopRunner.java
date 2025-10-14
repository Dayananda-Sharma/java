package com.xworkz.laptop.external;

import com.xworkz.laptop.internal.IntelCore;
import com.xworkz.laptop.internal.Laptop;
import com.xworkz.laptop.internal.LaptopDetalies;
import com.xworkz.laptop.internal.LaptopInfo;

public class LaptopRunner {
    public static void main(String[] args) {
        IntelCore  intelCore =new IntelCore(5);
        Laptop laptop =new LaptopInfo(100000,"HP",intelCore);
        laptop.displayLaptop();
    }
}
