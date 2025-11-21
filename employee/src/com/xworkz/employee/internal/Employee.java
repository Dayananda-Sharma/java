package com.xworkz.employee.internal;

import com.xworkz.employee.events.*;

public class Employee {
    public long displayCompany(long num){
        if (num>10){
            try {
                throw new EmployeePhoneNumberException();

            }catch (EmployeePhoneNumberException phoneNumberException){
                phoneNumberException.printStackTrace();
                System.out.println(" one Phonenumber correct");
            }
        }else {
            System.out.println("another Phonenumber is not correct");
        }
        return num;
    }
    public int displayCompany1(int id){
        if (id>50){
            try {
                throw new EmployeeIdException();

            }catch (EmployeeIdException idException){
                idException.printStackTrace();
                System.out.println("valid Id number");
            }
        }else {
            System.out.println("invalid id Number");
        }
        return id;
    }
    public long displayComoany2(long salary){
        if (salary>50000){
            try {
                throw new EmployeeSalaryException();

            }catch (EmployeeSalaryException salaryException){
                salaryException.printStackTrace();
                System.out.println(" fee paid");
            }
        }else {
            System.out.println("fee is incompleted");
        }
        return salary;
    }
    public String displayComoany3(String company){
        if (company=="Xworkz"){
            try {
                throw new EmployeeNameException();

            }catch (EmployeeNameException nameException){
                nameException.printStackTrace();
                System.out.println("company name is correct");
            }
        }else {
            System.out.println("company is fake");
        }
        return company;
    }
    public String displayComoany4(String Address){
        if (Address=="Hiriyur"){
            try {
                throw new EmployeeAddressException();

            }catch (EmployeeAddressException addressException){
                addressException.printStackTrace();
                System.out.println(" address is correct");
            }
        }else {
            System.out.println(" address is fake");
        }
        return Address;
    }
}
