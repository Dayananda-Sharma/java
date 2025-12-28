package com.xworkz.comparator.external;

import com.xworkz.comparator.dto.StudentDto;

import java.util.ArrayList;
import java.util.List;

public class StudentRunner {
    public static void main(String[] args) {
        StudentDto studentDto=new StudentDto("raju",101,"Durga");
        StudentDto studentDto1=new StudentDto("raj",102,"Durga");
        StudentDto studentDto2=new StudentDto("raj",103,"Durga");

        List<StudentDto>list=new ArrayList<>();
        list.add(studentDto);
        list.add(studentDto1);
        list.add(studentDto2);
        list.forEach(n-> System.out.println(n));
    }
}
