package com.xwowkx.comparable.dto;

public class EmployeeDto implements Comparable<EmployeeDto>{
    private int id;
    private String name;
    private long number;
    private String companyName;

    public EmployeeDto(int id, String name, long number, String companyName) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.companyName = companyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    @Override
    public String toString() {
        return "EmployeeDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    @Override
    public int compareTo(EmployeeDto o) {
        return 0;
    }
}
