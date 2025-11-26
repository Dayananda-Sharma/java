package com.xworkz.foreach.dto;

import java.util.Objects;

public class ShopDto {
    private String shopName;
    private int iteam;
    private double productGst;
    private long areaPin;
    private String address;
    private int price;
    private double gst;
    private long shopNumber;
    private float date;
    private boolean itsGood;

    public ShopDto(String shopName, int iteam, double productGst, long areaPin, String address, int price, double gst, long shopNumber, float date, boolean itsGood) {
        this.shopName = shopName;
        this.iteam = iteam;
        this.productGst = productGst;
        this.areaPin = areaPin;
        this.address = address;
        this.price = price;
        this.gst = gst;
        this.shopNumber = shopNumber;
        this.date = date;
        this.itsGood = itsGood;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
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

    public long getShopNumber() {
        return shopNumber;
    }

    public void setShopNumber(long shopNumber) {
        this.shopNumber = shopNumber;
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
        if (!(o instanceof ShopDto shopDto)) return false;
        return iteam == shopDto.iteam && Double.compare(productGst, shopDto.productGst) == 0 && areaPin == shopDto.areaPin && price == shopDto.price && Double.compare(gst, shopDto.gst) == 0 && shopNumber == shopDto.shopNumber && Float.compare(date, shopDto.date) == 0 && itsGood == shopDto.itsGood && Objects.equals(shopName, shopDto.shopName) && Objects.equals(address, shopDto.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopName, iteam, productGst, areaPin, address, price, gst, shopNumber, date, itsGood);
    }

    @Override
    public String toString() {
        return "ShopDto{" +
                "shopName='" + shopName + '\'' +
                ", iteam=" + iteam +
                ", productGst=" + productGst +
                ", areaPin=" + areaPin +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", gst=" + gst +
                ", shopNumber=" + shopNumber +
                ", date=" + date +
                ", itsGood=" + itsGood +
                '}';
    }
}
