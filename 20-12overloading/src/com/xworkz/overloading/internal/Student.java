package com.xworkz.overloading.internal;

public class Student {
    public void displayStudent(int fee){
        System.out.println("about student");
        System.out.println(fee);

    }
    public void displayStudent(int fee,String studentName){
        System.out.println("about student");
        System.out.println(fee);
        System.out.println(studentName);
    }
    public void displayStudent(int fee,String studentName,long phoneNumber){
        System.out.println("about student");
        System.out.println(fee);
        System.out.println(studentName);
        System.out.println(phoneNumber);
    }
    public void displayStudent(int fee,String studentName,long phoneNumber,char studentfirstword){
        System.out.println("about student");
        System.out.println(fee);
        System.out.println(studentfirstword);
        System.out.println(studentName);
        System.out.println(phoneNumber);
    }
    public void displayStudent(int fee,String studentName,long phoneNumber,char studentfirstword,boolean goodStudent,float dateofbirth){
        System.out.println("about student");
        System.out.println(fee);
        System.out.println(studentfirstword);
        System.out.println(studentName);
        System.out.println(phoneNumber);
        System.out.println(goodStudent);
    }
}
