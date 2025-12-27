package com.xwowkx.comparable.dto;

public class StudentDto implements Comparable<StudentDto>{
    private int id;
    private String name;
    private long number;
    public String location;

    public StudentDto(int id, String name, long number, String location) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.location = location;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public int compareTo(StudentDto o) {
        return 0;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", location='" + location + '\'' +
                '}';
    }
}
