package com.shopping.model;

public class Shop {
    private String tag;
    private String gender;
    private String item;
    private float price;
    private String brand_id;
    private String brand_name;

    public String getId() {
        return brand_id;
    }

    public void setId(String brand_id) {
        this.brand_id = brand_id;
    }

    public String getName() {
        return brand_name;
    }

    public void setName(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

