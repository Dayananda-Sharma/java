package com.xworkz.socialmedia.events;

public class OneTimePasswordException extends Exception{
    public OneTimePasswordException() {
        System.err.println("Otp is invaild");
    }
}
