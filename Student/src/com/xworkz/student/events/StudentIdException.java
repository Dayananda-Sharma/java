package com.xworkz.student.events;

public class StudentIdException extends Exception{
    public StudentIdException(){
        System.err.println("invalid Id");
    }
}
