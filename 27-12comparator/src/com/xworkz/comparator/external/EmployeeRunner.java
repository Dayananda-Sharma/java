package com.xworkz.comparator.external;

import com.xworkz.comparator.dto.EmployeeDto;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRunner {
    public static void main(String[] args) {
        EmployeeDto employeeDto=new EmployeeDto("Guru",101,"sira");
        EmployeeDto employeeDto1=new EmployeeDto("Guru",101,"sira");
        EmployeeDto employeeDto2=new EmployeeDto("Guru",101,"sira");

        List<EmployeeDto>list=new ArrayList<>();
        list.add(employeeDto);
        list.add(employeeDto1);
        list.add(employeeDto2);
        list.forEach(n-> System.out.println(n));
    }
}
