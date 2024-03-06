package lk.ijse.bookworm.Dto;

public class AdminDto {
    private int id;
    private String name;
    private String password;

    public AdminDto() {
    }

    public AdminDto(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public AdminDto(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
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
}
