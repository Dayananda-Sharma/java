package com.xwork.overriding.internal;

public class Worker extends Employee{
    public void displayEmployee(int id){
        System.out.println("child class called...");
        System.out.println("about employee");
        System.out.println(id);

    }
    public void displayEmployee(int id,String employeeName){
        System.out.println("child class called...");
        System.out.println("about employee");
        System.out.println(id);
        System.out.println(employeeName);
    }
    public void displayEmployee(int id,String employeeName,long phoneNumber){
        System.out.println("child class called...");
        System.out.println("about employee");
        System.out.println(id);
        System.out.println(employeeName);
        System.out.println(phoneNumber);
    }
    public void displayEmployee(int id,String employeeName,long phoneNumber,char firstword){
        System.out.println("child class called...");
        System.out.println("about employee");
        System.out.println(id);
        System.out.println(firstword);
        System.out.println(employeeName);
        System.out.println(phoneNumber);
    }
    public void displayEmployee(int id,String employeeName,long phoneNumber,char firstword,boolean goodEmployee,float dateofbirth){
        System.out.println("child class called...");
        System.out.println("about employee");
        System.out.println(id);
        System.out.println(firstword);
        System.out.println(employeeName);
        System.out.println(phoneNumber);
        System.out.println(goodEmployee);
    }
}

