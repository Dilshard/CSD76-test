package com.company;

public class Product {
    private String productName;
    private int price;
    public static String test;

    public Product(String productName, int price){
        this.productName = productName;
        this.price = price;
    }

    public Product(){

    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
