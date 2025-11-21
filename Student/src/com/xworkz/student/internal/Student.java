package com.xworkz.student.internal;

import com.xworkz.student.events.*;

public class Student {
    public long displayPhoneNumber(long number){
        if (number>10){
            try {
                throw new StudentPhoneNumberException();

            }catch (StudentPhoneNumberException studentPhoneNumberException){
                studentPhoneNumberException.printStackTrace();
                System.out.println("valid phone number");
            }
        }else {
            System.out.println("invalid Phone Number");
        }
        return number;
    }
    public int displayStudentId(int id){
        if (id<50){
            try {
                throw new StudentIdException();

            }catch (StudentIdException studentIdException){
                studentIdException.printStackTrace();
                System.out.println("valid Id number");
            }
        }else {
            System.out.println("invalid id Number");
        }
        return id;
    }
    public long displayStudentFee(long fee){
        if (fee<1000){
            try {
                throw new StudentFeeException();

            }catch (StudentFeeException studentFeeException){
                studentFeeException.printStackTrace();
                System.out.println(" fee paid");
            }
        }else {
            System.out.println("fee is incompleted");
        }
        return fee;
    }
    public String displayStudentname(String student){
        if (student=="daya"){
            try {
                throw new StudentNameException();

            }catch (StudentNameException studentNameException){
                studentNameException.printStackTrace();
                System.out.println("Student name is correct");
            }
        }else {
            System.out.println("student is fake");
        }
        return student;
    }
    public String displayStudentAddress(String Address){
        if (Address=="Hiriyur"){
            try {
                throw new StudentAddress();

            }catch (StudentAddress studentAddress){
                studentAddress.printStackTrace();
                System.out.println("Student address is correct");
            }
        }else {
            System.out.println("student address is fake");
        }
        return Address;
    }

}
