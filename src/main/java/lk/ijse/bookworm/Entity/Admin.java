package lk.ijse.bookworm.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Admin {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String password;

    @OneToMany(mappedBy = "admin")
    private List<Branch> branches;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

    public Admin(String name, String password, List<Branch> branches) {
        this.name = name;
        this.password = password;
        this.branches = branches;
    }

    public Admin(int id, String name, String password, List<Branch> branches) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.branches = branches;
    }
}
