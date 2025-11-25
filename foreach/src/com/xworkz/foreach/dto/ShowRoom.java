package com.xworkz.foreach.dto;

import java.util.Objects;

public class ShowRoom {
    private String showRoomName;
    private int id;
    private double gst;
    private long price;
    private float date;
    private char rateing;
    private String showRoomAddress;
    private long areaPin;
    private double showRoomGst;
    private long phoneNumber;

    public ShowRoom(String showRoomName, int id, double gst, long price, float date, char rateing, String showRoomAddress, long areaPin, double showRoomGst, long phoneNumber) {
        this.showRoomName = showRoomName;
        this.id = id;
        this.gst = gst;
        this.price = price;
        this.date = date;
        this.rateing = rateing;
        this.showRoomAddress = showRoomAddress;
        this.areaPin = areaPin;
        this.showRoomGst = showRoomGst;
        this.phoneNumber = phoneNumber;
    }

    public String getShowRoomName() {
        return showRoomName;
    }

    public void setShowRoomName(String showRoomName) {
        this.showRoomName = showRoomName;
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

    public float getDate() {
        return date;
    }

    public void setDate(float date) {
        this.date = date;
    }

    public char getRateing() {
        return rateing;
    }

    public void setRateing(char rateing) {
        this.rateing = rateing;
    }

    public String getShowRoomAddress() {
        return showRoomAddress;
    }

    public void setShowRoomAddress(String showRoomAddress) {
        this.showRoomAddress = showRoomAddress;
    }

    public long getAreaPin() {
        return areaPin;
    }

    public void setAreaPin(long areaPin) {
        this.areaPin = areaPin;
    }

    public double getShowRoomGst() {
        return showRoomGst;
    }

    public void setShowRoomGst(double showRoomGst) {
        this.showRoomGst = showRoomGst;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShowRoom showRoom)) return false;
        return id == showRoom.id && Double.compare(gst, showRoom.gst) == 0 && price == showRoom.price && Float.compare(date, showRoom.date) == 0 && rateing == showRoom.rateing && areaPin == showRoom.areaPin && Double.compare(showRoomGst, showRoom.showRoomGst) == 0 && phoneNumber == showRoom.phoneNumber && Objects.equals(showRoomName, showRoom.showRoomName) && Objects.equals(showRoomAddress, showRoom.showRoomAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(showRoomName, id, gst, price, date, rateing, showRoomAddress, areaPin, showRoomGst, phoneNumber);
    }

    @Override
    public String toString() {
        return "ShowRoom{" +
                "showRoomName='" + showRoomName + '\'' +
                ", id=" + id +
                ", gst=" + gst +
                ", price=" + price +
                ", date=" + date +
                ", rateing=" + rateing +
                ", showRoomAddress='" + showRoomAddress + '\'' +
                ", areaPin=" + areaPin +
                ", showRoomGst=" + showRoomGst +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
