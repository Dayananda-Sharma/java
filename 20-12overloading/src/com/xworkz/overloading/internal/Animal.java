package com.xworkz.overloading.internal;

public class Animal {
    public void displayAnimal(int age) {
        System.out.println("animal age" + age);

    }

    public void displayAnimal(int age, String name) {
        System.out.println("animal age " + age);
        System.out.println("animal name" + name);

    }

    public void displayAnimal(int age, String name, char firstWord) {
        System.out.println("about animal");
        System.out.println(age);
        System.out.println(name);
        System.out.println(firstWord);

    }

    public void displayAnimal(int age, String name, char firstWord, boolean nationalAnimal) {
        System.out.println("about animal");
        System.out.println(age);
        System.out.println(name);
        System.out.println(firstWord);
        System.out.println(nationalAnimal);
    }

    public void displayAnimal(int age, String name, char firstWord, boolean nationalAnimal, float dateofbirth) {
        System.out.println("about animal");
        System.out.println(age);
        System.out.println(name);
        System.out.println(firstWord);
        System.out.println(nationalAnimal);
        System.out.println(dateofbirth);
    }
}