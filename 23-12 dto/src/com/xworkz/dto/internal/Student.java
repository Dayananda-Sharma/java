package com.xworkz.dto.internal;

import java.util.Objects;

public class Student {
    private int id;
    private String studentName;
    private long phoneNumber;
    private String location;
    private char firstLetter;
    private double fee;

    public Student(int id, String studentName, long phoneNumber, String location, char firstLetter, double fee) {
        this.id = id;
        this.studentName = studentName;
        this.phoneNumber = phoneNumber;
        this.location = location;
        this.firstLetter = firstLetter;
        this.fee = fee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public char getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(char firstLetter) {
        this.firstLetter = firstLetter;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id == student.id && phoneNumber == student.phoneNumber && firstLetter == student.firstLetter && Double.compare(fee, student.fee) == 0 && Objects.equals(studentName, student.studentName) && Objects.equals(location, student.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, studentName, phoneNumber, location, firstLetter, fee);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", location='" + location + '\'' +
                ", firstLetter=" + firstLetter +
                ", fee=" + fee +
                '}';
    }
}
