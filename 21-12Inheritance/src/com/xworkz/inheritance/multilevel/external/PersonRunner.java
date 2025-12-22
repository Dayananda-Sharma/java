package com.xworkz.inheritance.multilevel.external;

import com.xworkz.inheritance.multilevel.internal.Employee;
import com.xworkz.inheritance.multilevel.internal.Manager;

public class PersonRunner {
    public static void main(String[] args) {
        Manager manager=new Manager();
        manager.displayManager();
        manager.displayPerson();
        Employee employee=new Employee();
        employee.displayEmployee();
        employee.displayPerson();
    }
}
