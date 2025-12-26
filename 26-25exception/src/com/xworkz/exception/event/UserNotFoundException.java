package com.xworkz.exception.event;

public class UserNotFoundException extends Exception{
    public UserNotFoundException(){
        System.out.println("User not found");
    }
}
