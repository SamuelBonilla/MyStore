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

    private int id_Category;
    
    public Sub_Category(int id, String name, String description, int id_Category) {
        super(id, name, description);
        this.id_Category = id_Category;
    }

    public int getId_Category() {
        return id_Category;
    }

    public void setId_Category(int id_Category) {
        this.id_Category = id_Category;
    }
    
    
}
