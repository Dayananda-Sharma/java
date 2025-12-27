package com.xwowkx.comparable.external;

import com.xwowkx.comparable.dto.StudentDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunner {
    public static void main(String[] args) {

        StudentDto studentDto=new StudentDto(101,"dasa",988765522,"Durga");
        StudentDto studentDto1=new StudentDto(101,"dasa",988765522,"Durga");
        StudentDto studentDto2=new StudentDto(101,"dasa",988765522,"Durga");

        List<StudentDto>list=new ArrayList<>();
        list.add(studentDto1);
        list.add(studentDto2);
        list.add(studentDto);

        Collections.sort(list);
        list.forEach(n-> System.out.println(n));
    }
}
