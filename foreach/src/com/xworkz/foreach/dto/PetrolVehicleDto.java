package com.xworkz.foreach.dto;

import java.util.Objects;

public class PetrolVehicleDto {
    private String vehicleName;
    private int id;
    private long price;
    private char grade;
    private double gst;
    private boolean itsGood;
    private float launchedDate;
    private double totalGst;
    private String showRoomAddress;

    public PetrolVehicleDto(String vehicleName, int id, long price, char grade, double gst, boolean itsGood, float launchedDate, double totalGst, String showRoomAddress) {
        this.vehicleName = vehicleName;
        this.id = id;
        this.price = price;
        this.grade = grade;
        this.gst = gst;
        this.itsGood = itsGood;
        this.launchedDate = launchedDate;
        this.totalGst = totalGst;
        this.showRoomAddress = showRoomAddress;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public double getGst() {
        return gst;
    }

    public void setGst(double gst) {
        this.gst = gst;
    }

    public boolean isItsGood() {
        return itsGood;
    }

    public void setItsGood(boolean itsGood) {
        this.itsGood = itsGood;
    }

    public float getLaunchedDate() {
        return launchedDate;
    }

    public void setLaunchedDate(float launchedDate) {
        this.launchedDate = launchedDate;
    }

    public double getTotalGst() {
        return totalGst;
    }

    public void setTotalGst(double totalGst) {
        this.totalGst = totalGst;
    }

    public String getShowRoomAddress() {
        return showRoomAddress;
    }

    public void setShowRoomAddress(String showRoomAddress) {
        this.showRoomAddress = showRoomAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PetrolVehicleDto that)) return false;
        return id == that.id && price == that.price && grade == that.grade && Double.compare(gst, that.gst) == 0 && itsGood == that.itsGood && Float.compare(launchedDate, that.launchedDate) == 0 && Double.compare(totalGst, that.totalGst) == 0 && Objects.equals(vehicleName, that.vehicleName) && Objects.equals(showRoomAddress, that.showRoomAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleName, id, price, grade, gst, itsGood, launchedDate, totalGst, showRoomAddress);
    }

    @Override
    public String toString() {
        return "PetrolVehicleDto{" +
                "vehicleName='" + vehicleName + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", grade=" + grade +
                ", gst=" + gst +
                ", itsGood=" + itsGood +
                ", launchedDate=" + launchedDate +
                ", totalGst=" + totalGst +
                ", showRoomAddress='" + showRoomAddress + '\'' +
                '}';
    }
}
