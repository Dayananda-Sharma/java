package com.xworkz.members.external;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PhoneNumberRunner {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("9877654321l","9797652341l","87653311l","76654431l");
        List<String> stream= list.stream().sorted().filter(num->num.startsWith("9")).collect(Collectors.toList());
        stream.forEach(n-> System.out.println(n));
    }
}
