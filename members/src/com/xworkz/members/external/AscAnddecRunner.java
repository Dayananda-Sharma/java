package com.xworkz.members.external;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AscAnddecRunner {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(9,7,5,4,3,1,2,6);
        List<Integer> stream=list.stream().filter(n->n>0).sorted((a,b)-> b-a).collect(Collectors.toList());

        List<Integer> stream1=list.stream().filter(n->n>0).sorted().collect(Collectors.toList());
        stream.forEach(n-> System.out.println(n));
        System.out.println("------------------------");
        stream1.forEach(n-> System.out.println(n));
    }
}
