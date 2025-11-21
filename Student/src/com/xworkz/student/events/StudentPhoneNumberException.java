package com.xworkz.student.events;

public class StudentPhoneNumberException extends Exception {
    public StudentPhoneNumberException(){
        System.err.println("invalid Phone Number");
    }
}
