package com.xworkz.company.internal;

import com.xworkz.company.events.*;

public class Company {
    public long displayCompany(long works){
        if (works>100){
            try {
                throw new TotalWorksException();

            }catch (TotalWorksException totalWorksException){
                totalWorksException.printStackTrace();
                System.out.println("Every one is present");
            }
        }else {
            System.out.println("everyone is not present");
        }
        return works;
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
                throw new CompanyNameException();

            }catch (CompanyNameException nameException){
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
                throw new CompanyAddressException();

            }catch (CompanyAddressException addressException){
                addressException.printStackTrace();
                System.out.println("Student address is correct");
            }
        }else {
            System.out.println("student address is fake");
        }
        return Address;
    }
}
