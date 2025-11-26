package com.xworkz.foreach.dto;

import java.util.Objects;

public class LaptopDto {
    private String brandName;
    private int id;
    private double gst;
    private long price;
    private char rateing;
    private boolean itsGood;
    private float launchedDate;
    private String name;
    private long ccNumber;

    public LaptopDto(String brandName, int id, double gst, long price, char rateing, boolean itsGood, float launchedDate, String name, long ccNumber) {
        this.brandName = brandName;
        this.id = id;
        this.gst = gst;
        this.price = price;
        this.rateing = rateing;
        this.itsGood = itsGood;
        this.launchedDate = launchedDate;
        this.name = name;
        this.ccNumber = ccNumber;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getGst() {
        return gst;
    }

    public void setGst(double gst) {
        this.gst = gst;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public char getRateing() {
        return rateing;
    }

    public void setRateing(char rateing) {
        this.rateing = rateing;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCcNumber() {
        return ccNumber;
    }

    public void setCcNumber(long ccNumber) {
        this.ccNumber = ccNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LaptopDto laptopDto)) return false;
        return id == laptopDto.id && Double.compare(gst, laptopDto.gst) == 0 && price == laptopDto.price && rateing == laptopDto.rateing && itsGood == laptopDto.itsGood && Float.compare(launchedDate, laptopDto.launchedDate) == 0 && ccNumber == laptopDto.ccNumber && Objects.equals(brandName, laptopDto.brandName) && Objects.equals(name, laptopDto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, id, gst, price, rateing, itsGood, launchedDate, name, ccNumber);
    }

    @Override
    public String toString() {
        return "LaptopDto{" +
                "brandName='" + brandName + '\'' +
                ", id=" + id +
                ", gst=" + gst +
                ", price=" + price +
                ", rateing=" + rateing +
                ", itsGood=" + itsGood +
                ", launchedDate=" + launchedDate +
                ", name='" + name + '\'' +
                ", ccNumber=" + ccNumber +
                '}';
    }
}
