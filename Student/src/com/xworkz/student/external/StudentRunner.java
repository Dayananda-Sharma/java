package com.xworkz.student.external;

import com.xworkz.student.internal.Student;

public class StudentRunner {
    public static void main(String[] args) {
        Student student=new Student();
        student.displayPhoneNumber(99999999);
        student.displayStudentId(5);
        student.displayStudentFee(11);
        student.displayStudentname("daya");
        student.displayStudentAddress("Hiriyur");
    }
}
