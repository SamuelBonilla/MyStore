/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;
/**
 *
 * @author kevin
 */
public class Product {
    
    private int id;
    private String name;
    private float price;
    private int amount;
    private String brand;
    private User user;
    private Sub_Category sub_category;
    private String been;
    private String date;
    private ArrayList<String> images;

    public Product(int id, String name, float price, int amount, String brand, User user, Sub_Category sub_category, String been, String date, ArrayList<String> images) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.brand = brand;
        this.user = user;
        this.sub_category = sub_category;
        this.been = been;
        this.date = date;
        this.images = images;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getUser() {
        return user.id;
    }

    public void setUser(User user) {
        this.user.id = user.id;
    }

    public int getSub_category() {
        return sub_category.id;
    }

    public void setSub_category(Sub_Category sub_category) {
        this.sub_category.id = sub_category.id;
    }

    public String getBeen() {
        return been;
    }

    public void setBeen(String been) {
        this.been = been;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }
    
    
}
