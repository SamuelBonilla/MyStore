/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author kevin
 */
public class Order_Buyer {
    
    private int id;
    private Product product;
    private User user;
    private String date;
    private String been;       

    public Order_Buyer(int id, Product product, User user, String date, String been) {
        this.id = id;
        this.product = product;
        this.user = user;
        this.date = date;
        this.been = been;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProduct() {
        return product.id;
    }

    public void setProduct(Product product) {
        this.product.id = product.id;
    }

    public int getUser() {
        return user.id;
    }

    public void setUser(User user) {
        this.user.id = user.id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBeen() {
        return been;
    }

    public void setBeen(String been) {
        this.been = been;
    }
    
    
}
