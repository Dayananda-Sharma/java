package com.xworkz.exception.event;

public class ProductNotFoundException extends Exception{
    public ProductNotFoundException(){
        System.out.println("Product not found");
    }
}
