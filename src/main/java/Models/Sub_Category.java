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
public class Sub_Category extends Category{

    private Category category;
    
    public Sub_Category(int id, String name, String description, int id_Category) {
        super(id_Category, name, description);
        this.id_Category = id_Category;
    }

    public int getId_Category() {
        return category.id;
    }

    public void setId_Category(Category category) {
        this.category.id = category.id;
    }
    
   
   
    
    
}
