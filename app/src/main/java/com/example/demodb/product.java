package com.example.demodb;

public class product {
    private String image;
    private String title, shortdesc;
    private double price, rating;

    public product() {

    }

    public product(String image, String title, String shortDesc, double price, double rating) {
        this.image = image;
        this.title = title;
        this.shortdesc = shortDesc;
        this.price = price;
        this.rating = rating;
    }

    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getShortDesc() {
        return shortdesc;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }
}