package com.example.saurabhomer.bornbhukkad.Model;

/**
 * Created by saurabh omer on 29-Mar-18.
 */

public class Order {

    private String ID;
    private String ProductName;
    private String Quality;
    private String Price;
    private String Discount;
    public  Order()
    {


    }

    public Order(String ID, String productName, String quality, String price, String discount) {
        this.ID = ID;
        ProductName = productName;
        Quality = quality;
        Price = price;
        Discount = discount;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        ID = ID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getQuality() {
        return Quality;
    }

    public void setQuality(String quality) {
        Quality = quality;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDiscount() {
        return Discount;
    }

    public void setDiscount(String discount) {
        Discount = discount;
    }
}
