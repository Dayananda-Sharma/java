package com.xworkz.school.events;

public class SchoolFeeException extends Exception{
    public SchoolFeeException(){
        System.err.println("incomplete fee");
    }
}
