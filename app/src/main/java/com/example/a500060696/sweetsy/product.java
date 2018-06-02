package com.example.a500060696.sweetsy;

public class product {

    public int image;
    public String cakename;
    public double rating, price;

    public product(int image, String cakename, double rating, double price) {
        this.image = image;
        this.cakename = cakename;
        this.rating = rating;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public String getCakename() {
        return cakename;
    }

    public double getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }
}

