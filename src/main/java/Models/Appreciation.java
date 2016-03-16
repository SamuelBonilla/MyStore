/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

// Testting c9.io

/**
 *
 * @author kevin
 */
public class Appreciation {
    
    private int id;
    private Product product;
    private User user;
    private int rank;
    private String comment;
    private String date;

    public Appreciation(int id, Product product, User user, int rank, String comment, String date) {
        this.id = id;
        this.product = product;
        this.user = user;
        this.rank = rank;
        this.comment = comment;
        this.date = date;
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

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
    
   

    
}
