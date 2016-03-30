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
public class Sub_Category {

    private Category category;
    
    public Sub_Category(int id, String name, String description, Category category) {
        
        this.id = id;
        this.name =  name;
        this.desciption = desciption;
        this.category = category;
    }
    

    public int getId_Category() {
        return category.id;
    }

    public void setId_Category(Category category) {
        this.category.id = category.id;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
   
   
    
    
}
