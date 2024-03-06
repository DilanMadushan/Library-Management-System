package lk.ijse.bookworm.Entity;
import jakarta.persistence.*;

import java.util.List;


@Entity
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String location;
    private String Address;

    @ManyToOne
    private Admin admin;

    public Branch(int id, String name, String location, String address, Admin admin) {
        this.id = id;
        this.name = name;
        this.location = location;
        Address = address;
        this.admin = admin;
    }

    public Branch() {
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}
