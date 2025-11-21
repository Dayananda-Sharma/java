package com.xworkz.invalid.internal;

import com.xworkz.invalid.event.Invalid;

public class Age {
    public void CheckAge(int age) throws Invalid{
        if(age <18){
            throw  new Invalid("age is valid for voteing");
        }
        else {
            System.out.println("age is valid for votening");
        }
    }
}
