package com.xworkz.comparator.dto;

public class PGDto {
    private String pgName;
    private String location;
    private int rent;

    public PGDto(String pgName, String location, int rent) {
        this.pgName = pgName;
        this.location = location;
        this.rent = rent;
    }

    public String getPgName() {
        return pgName;
    }

    public void setPgName(String pgName) {
        this.pgName = pgName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    @Override
    public String toString() {
        return "PGDto{" +
                "pgName='" + pgName + '\'' +
                ", location='" + location + '\'' +
                ", rent=" + rent +
                '}';
    }
}
