package com.xworkz.dto.external;

import com.xworkz.dto.internal.Phonedto;

public class PhoneRunner {
    public static void main(String[] args) {
        Phonedto phonedto=new Phonedto();

        phonedto.setFirstLetter('s');
        char letter=phonedto.getFirstLetter();
        System.out.println(letter);

        phonedto.setPhoneId(111);
        int id=phonedto.getPhoneId();
        System.out.println(id);

        phonedto.setPhoneName("vivo");
        String name=phonedto.getPhoneName();
        System.out.println(name);
    }
}
