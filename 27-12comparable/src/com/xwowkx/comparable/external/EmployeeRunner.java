package com.xwowkx.comparable.external;

import com.xwowkx.comparable.dto.EmployeeDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeRunner {
    public static void main(String[] args) {
        EmployeeDto employeeDto= new EmployeeDto(101,"Raju",77466333,"idea");
        EmployeeDto employeeDto1= new EmployeeDto(103,"Raj",77466333,"idea");
        EmployeeDto employeeDto2= new EmployeeDto(104,"RajKumar",77466333,"idea");

        List<EmployeeDto>list=new ArrayList<>();
        list.add(employeeDto1);
        list.add(employeeDto2);
        list.add(employeeDto);

        Collections.sort(list);
        list.forEach(n-> System.out.println(n));



    }
}
