package com.xworkz.invalid.external;

import com.xworkz.invalid.event.Invalid;
import com.xworkz.invalid.internal.Age;

public class InvalidRunner{
    public static void main(String[] args) throws Invalid {
        Age age =new Age();
        age.CheckAge(14);

    }
}
