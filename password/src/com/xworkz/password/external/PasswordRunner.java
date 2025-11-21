package com.xworkz.password.external;

import com.xworkz.password.dto.PasswordDto;

public class PasswordRunner {
    public static void main(String[] args) {
        PasswordDto passwordDto=new PasswordDto("Daya@123","daya");
        PasswordDto passwordDto1=new PasswordDto("Daya@123","daya");
        System.out.println(passwordDto.toString());
        System.out.println("password is correct===="+passwordDto.equals(passwordDto1));
    }
}
