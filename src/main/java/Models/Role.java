package Models;

/**
 *
 * @author kevin
 */
public class Role {
    
    private int id;
    private String type;
    private User user;
    private String desciption;

    public Role(int id, String type, User user, String desciption) {
        this.id = id;
        this.type = type;
        this.user = user;
        this.desciption = desciption;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getUser() {
        return user.id;
    }

    public void setUser(User user) {
        this.user.id = user.id;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }
    
}
