package com.xwowkx.comparable.dto;

public class LoptopDto implements Comparable<LoptopDto>{
    private String name;
    private int id;
    private double price;

    public LoptopDto(String name, int id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(LoptopDto o) {
        return 0;
    }

    @Override
    public String toString() {
        return "LoptopDto{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}
