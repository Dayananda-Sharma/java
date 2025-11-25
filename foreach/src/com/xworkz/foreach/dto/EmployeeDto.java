package com.xworkz.foreach.dto;

import java.util.Objects;

public class EmployeeDto {
    private String employeeName;
    private int id;
    private long phoneNumber;
    private float joiningDate;
    private char grade;
    private double salary;
    private boolean isPermanent;
    private String address;
    private int departmentId;
    private double tax;

    public EmployeeDto(String employeeName, int id, long phoneNumber, float joiningDate, char grade, double salary, boolean isPermanent, String address, int departmentId, double tax) {
        this.employeeName = employeeName;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.joiningDate = joiningDate;
        this.grade = grade;
        this.salary = salary;
        this.isPermanent = isPermanent;
        this.address = address;
        this.departmentId = departmentId;
        this.tax = tax;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(float joiningDate) {
        this.joiningDate = joiningDate;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isPermanent() {
        return isPermanent;
    }

    public void setPermanent(boolean permanent) {
        isPermanent = permanent;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeDto that)) return false;
        return id == that.id && phoneNumber == that.phoneNumber && Float.compare(joiningDate, that.joiningDate) == 0 && grade == that.grade && Double.compare(salary, that.salary) == 0 && isPermanent == that.isPermanent && departmentId == that.departmentId && Double.compare(tax, that.tax) == 0 && Objects.equals(employeeName, that.employeeName) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeName, id, phoneNumber, joiningDate, grade, salary, isPermanent, address, departmentId, tax);
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "employeeName='" + employeeName + '\'' +
                ", id=" + id +
                ", phoneNumber=" + phoneNumber +
                ", joiningDate=" + joiningDate +
                ", grade=" + grade +
                ", salary=" + salary +
                ", isPermanent=" + isPermanent +
                ", address='" + address + '\'' +
                ", departmentId=" + departmentId +
                ", tax=" + tax +
                '}';
    }
}
