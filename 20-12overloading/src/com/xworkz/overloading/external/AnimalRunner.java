package com.xworkz.overloading.external;

import com.xworkz.overloading.internal.Animal;

public class AnimalRunner {

    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.displayAnimal(15,"lion",'L',true,12);
    }
}
