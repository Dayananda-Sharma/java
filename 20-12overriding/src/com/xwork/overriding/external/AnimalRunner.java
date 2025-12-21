package com.xwork.overriding.external;

import com.xwork.overriding.internal.Animal;
import com.xwork.overriding.internal.CubAnimal;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal=new CubAnimal();
        animal.displayAnimal();
        animal.displayAnimal1();
        animal.displayAnimal3();
        animal.displayAnimal2();
        animal.displayAnimal4();
    }

}
