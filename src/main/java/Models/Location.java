package Models;

/**
 *
 * @author kevin
 */
public class Location {
    
    private int id;
    private String country;       
    private String city;
    private String address;
    private User user;

    public Location(int id, String country, String city, String address, User user) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.address = address;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getUser() {
        return user.id;
    }

    public void setUser(User user) {
        this.user.id = user.id;
    }
    
    
            
}
