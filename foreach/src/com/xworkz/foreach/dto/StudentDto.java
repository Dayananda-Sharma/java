package com.xworkz.foreach.dto;

import java.util.Objects;

public class StudentDto {
    private String StudentName;
    private int id;
    private long number;
    private float addMissionDate;
    private char grade;
    private double fee;
    private boolean goodStudent;
    private String address;
    private int busId;
    private double gst;

    public StudentDto(String studentName, int id, long number, float addMissionDate, char grade, double fee, boolean goodStudent, String address, int busId, double gst) {
        StudentName = studentName;
        this.id = id;
        this.number = number;
        this.addMissionDate = addMissionDate;
        this.grade = grade;
        this.fee = fee;
        this.goodStudent = goodStudent;
        this.address = address;
        this.busId = busId;
        this.gst = gst;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public float getAddMissionDate() {
        return addMissionDate;
    }

    public void setAddMissionDate(float addMissionDate) {
        this.addMissionDate = addMissionDate;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public boolean isGoodStudent() {
        return goodStudent;
    }

    public void setGoodStudent(boolean goodStudent) {
        this.goodStudent = goodStudent;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBusId() {
        return busId;
    }

    public void setBusId(int busId) {
        this.busId = busId;
    }

    public double getGst() {
        return gst;
    }

    public void setGst(double gst) {
        this.gst = gst;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentDto that)) return false;
        return id == that.id && number == that.number && Float.compare(addMissionDate, that.addMissionDate) == 0 && grade == that.grade && Double.compare(fee, that.fee) == 0 && goodStudent == that.goodStudent && busId == that.busId && Double.compare(gst, that.gst) == 0 && Objects.equals(StudentName, that.StudentName) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(StudentName, id, number, addMissionDate, grade, fee, goodStudent, address, busId, gst);
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "StudentName='" + StudentName + '\'' +
                ", id=" + id +
                ", number=" + number +
                ", addMissionDate=" + addMissionDate +
                ", grade=" + grade +
                ", fee=" + fee +
                ", goodStudent=" + goodStudent +
                ", address='" + address + '\'' +
                ", busId=" + busId +
                ", gst=" + gst +
                '}';
    }
}
