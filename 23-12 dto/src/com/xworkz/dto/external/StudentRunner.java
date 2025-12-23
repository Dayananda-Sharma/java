package com.xworkz.dto.external;

import com.xworkz.dto.internal.Student;

public class StudentRunner {
    public static void main(String[] args) {
        Student student=new Student(101,"aju",98876788,"sira",'S',30000.0);
        Student student1=new Student(101,"raju",98876788,"sira",'S',30000.0);
        Student student2=new Student(101,"raju",98876788,"sira",'S',30000.0);
        System.out.println(student1.toString());
        System.out.println(student1.equals(student));
        System.out.println(student1.hashCode());
        System.out.println(student1.hashCode());
        student1.setId(11);
        int id=student1.getId();
        System.out.println(id);
    }
}
