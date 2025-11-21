package com.xworkz.student.events;

public class StudentNameException extends Exception{
    public StudentNameException(){
        System.err.println("this is invalid Student Name");
    }
}
