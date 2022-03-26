package com.example.hw3;

public class Games {
    private String name;
    private int image;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Games(String name, int image, double price) {
        this.name = name;
        this.image = image;
        this.price = price;


    }
}
