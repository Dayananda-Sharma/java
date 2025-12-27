package com.xwowkx.comparable.dto;

public class Mobiledto implements Comparable<Mobiledto>{
    private String name;
    private int id;
    private double price;

    public Mobiledto(String name, int id, double price) {
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
    public int compareTo(Mobiledto o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Mobiledto{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }
}
