package com.xworkz.school.external;

import com.xworkz.school.internal.School;

public class SchoolRunner {
    public static void main(String[] args) {
        School school=new School();
        school.displayTotalStudents(10000);
        school.displaySchoolName("Bapuji");
        school.displaySchoolAdrress("Durga");
        school.displayStudentId(101);
        school.displayTotalStudents(1000);
        school.displayTotalStudentsfee(500001);
    }
}
