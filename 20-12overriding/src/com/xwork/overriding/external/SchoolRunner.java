package com.xwork.overriding.external;

import com.xwork.overriding.internal.College;
import com.xwork.overriding.internal.School;

public class SchoolRunner {
    public static void main(String[] args) {
        School school=new College();
        school.displayStudent();
        school.displayStudent2();
        school.displayStudent3();
        school.displayStudent4();
        school.displayStudent5();
    }
}
