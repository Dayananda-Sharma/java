package com.xworkz.inheritance.external;

import com.xworkz.inheritance.internal.Son;

public class FatherRunner {
    public static void main(String[] args) {
        Son son=new Son();
        son.displaySon();
        son.displayFather();
    }
}
