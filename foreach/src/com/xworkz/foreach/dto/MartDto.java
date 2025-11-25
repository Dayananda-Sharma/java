package com.xworkz.foreach.dto;

import java.util.Objects;

public class MartDto {
    private String martName;
    private int iteam;
    private double productGst;
    private long areaPin;
    private String address;
    private int price;
    private double gst;
    private long martNumber;
    private float date;
    private boolean itsGood;

    public MartDto(String martName, int iteam, double productGst, long areaPin, String address, int price, double gst, long martNumber, float date, boolean itsGood) {
        this.martName = martName;
        this.iteam = iteam;
        this.productGst = productGst;
        this.areaPin = areaPin;
        this.address = address;
        this.price = price;
        this.gst = gst;
        this.martNumber = martNumber;
        this.date = date;
        this.itsGood = itsGood;
    }

    public String getMartName() {
        return martName;
    }

    public void setMartName(String martName) {
        this.martName = martName;
    }

    public int getIteam() {
        return iteam;
    }

    public void setIteam(int iteam) {
        this.iteam = iteam;
    }

    public double getProductGst() {
        return productGst;
    }

    public void setProductGst(double productGst) {
        this.productGst = productGst;
    }

    public long getAreaPin() {
        return areaPin;
    }

    public void setAreaPin(long areaPin) {
        this.areaPin = areaPin;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getGst() {
        return gst;
    }

    public void setGst(double gst) {
        this.gst = gst;
    }

    public long getMartNumber() {
        return martNumber;
    }

    public void setMartNumber(long martNumber) {
        this.martNumber = martNumber;
    }

    public float getDate() {
        return date;
    }

    public void setDate(float date) {
        this.date = date;
    }

    public boolean isItsGood() {
        return itsGood;
    }

    public void setItsGood(boolean itsGood) {
        this.itsGood = itsGood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MartDto mart)) return false;
        return iteam == mart.iteam && Double.compare(productGst, mart.productGst) == 0 && areaPin == mart.areaPin && price == mart.price && Double.compare(gst, mart.gst) == 0 && martNumber == mart.martNumber && Float.compare(date, mart.date) == 0 && itsGood == mart.itsGood && Objects.equals(martName, mart.martName) && Objects.equals(address, mart.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(martName, iteam, productGst, areaPin, address, price, gst, martNumber, date, itsGood);
    }

    @Override
    public String toString() {
        return "Mart{" +
                "martName='" + martName + '\'' +
                ", iteam=" + iteam +
                ", productGst=" + productGst +
                ", areaPin=" + areaPin +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", gst=" + gst +
                ", martNumber=" + martNumber +
                ", date=" + date +
                ", itsGood=" + itsGood +
                '}';
    }
}
