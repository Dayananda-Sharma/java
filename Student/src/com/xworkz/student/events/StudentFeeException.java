package com.xworkz.student.events;

public class StudentFeeException extends Exception{
    public StudentFeeException(){
        System.err.println("fee is incomplete");
    }
}
