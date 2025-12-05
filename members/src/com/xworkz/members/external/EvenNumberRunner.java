package com.xworkz.members.external;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class EvenNumberRunner {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(8,3,2,9,6,12);
        List<Integer> stream=list.stream().filter(n->n%2==0).sorted().collect(Collectors.toList());
        stream.forEach(n-> System.out.println(n));
    }
}
