package com.xworkz.comparator.dto;

public class PVRDto {
    private String movieName;
    private int price;
    public double gst;

    public PVRDto(String movieName, int price, double gst) {
        this.movieName = movieName;
        this.price = price;
        this.gst = gst;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
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
    public String toString() {
        return "PVRDto{" +
                "movieName='" + movieName + '\'' +
                ", price=" + price +
                ", gst=" + gst +
                '}';
    }
}
