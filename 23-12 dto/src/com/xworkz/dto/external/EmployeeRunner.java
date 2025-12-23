package com.xworkz.dto.external;

import com.xworkz.dto.internal.Employee;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee=new Employee();
     employee.setEmployeeName("babu");
     String employe=employee.getEmployeeName();
        System.out.println(employe);

        employee.setPhoneNumber(98876666);
        long number=employee.getPhoneNumber();
        System.out.println(number);

        employee.setFirstLetter('d');
        char letter=employee.getFirstLetter();
        System.out.println(letter);

        employee.setSalary(20000.0);
        double salary=employee.getSalary();
        System.out.println(salary);

        employee.setLocation("sira");
        String area=employee.getLocation();
        System.out.println(area);

        employee.setId(11);
        int id=employee.getId();
        System.out.println(id);
    }
}
