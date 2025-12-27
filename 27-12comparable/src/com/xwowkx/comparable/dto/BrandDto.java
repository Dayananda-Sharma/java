package com.xwowkx.comparable.dto;

public class BrandDto implements Comparable<BrandDto>{
               private String name;
               private int price;
               private double gst;

    public BrandDto(String name, int price, double gst) {
        this.name = name;
        this.price = price;
        this.gst = gst;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public int compareTo(BrandDto o) {
        return 0;
    }

    @Override
    public String toString() {
        return "BrandDto{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", gst=" + gst +
                '}';
    }
}
