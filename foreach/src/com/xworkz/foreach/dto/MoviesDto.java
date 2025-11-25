package com.xworkz.foreach.dto;

import java.util.Objects;

public class MoviesDto {
    private String name;
    private int price;
    private long total;
    private double gst;
    private float releaseDate;
    private String area;
    private char certificate;
    private boolean itsGoodmovie;
    private long areaPin;
    private double ticketPrice;

    public MoviesDto(String name, int price, long total, double gst, float releaseDate, String area, char certificate, boolean itsGoodmovie, long areaPin, double ticketPrice) {
        this.name = name;
        this.price = price;
        this.total = total;
        this.gst = gst;
        this.releaseDate = releaseDate;
        this.area = area;
        this.certificate = certificate;
        this.itsGoodmovie = itsGoodmovie;
        this.areaPin = areaPin;
        this.ticketPrice = ticketPrice;
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

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public double getGst() {
        return gst;
    }

    public void setGst(double gst) {
        this.gst = gst;
    }

    public float getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(float releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public char getCertificate() {
        return certificate;
    }

    public void setCertificate(char certificate) {
        this.certificate = certificate;
    }

    public boolean isItsGoodmovie() {
        return itsGoodmovie;
    }

    public void setItsGoodmovie(boolean itsGoodmovie) {
        this.itsGoodmovie = itsGoodmovie;
    }

    public long getAreaPin() {
        return areaPin;
    }

    public void setAreaPin(long areaPin) {
        this.areaPin = areaPin;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MoviesDto moviesDto)) return false;
        return price == moviesDto.price && total == moviesDto.total && Double.compare(gst, moviesDto.gst) == 0 && Float.compare(releaseDate, moviesDto.releaseDate) == 0 && certificate == moviesDto.certificate && itsGoodmovie == moviesDto.itsGoodmovie && areaPin == moviesDto.areaPin && Double.compare(ticketPrice, moviesDto.ticketPrice) == 0 && Objects.equals(name, moviesDto.name) && Objects.equals(area, moviesDto.area);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, total, gst, releaseDate, area, certificate, itsGoodmovie, areaPin, ticketPrice);
    }

    @Override
    public String toString() {
        return "MoviesDto{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", total=" + total +
                ", gst=" + gst +
                ", releaseDate=" + releaseDate +
                ", area='" + area + '\'' +
                ", certificate=" + certificate +
                ", itsGoodmovie=" + itsGoodmovie +
                ", areaPin=" + areaPin +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}
