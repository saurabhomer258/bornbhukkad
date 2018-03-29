package com.example.saurabhomer.bornbhukkad.Model;

import java.util.List;

/**
 * Created by saurabh omer on 29-Mar-18.
 */

public class Request
{
    private String phone;
    private String name;
    private String address;
    private String Total;
    private List<Order> foods; // liist of food's order

    public Request() {

    }

    public Request(String phone, String name, String address, String total, List<Order> foods) {
        this.phone = phone;
        this.name = name;
        this.address = address;
        Total = total;
        this.foods = foods;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String total) {
        Total = total;
    }

    public List<Order> getFoods() {
        return foods;
    }

    public void setFoods(List<Order> foods) {
        this.foods = foods;
    }
}
