package model;

public class User {

    private int user_id;
    private String full_name;
    private String email;
    private String password;
    private String phone;
    private String society_name;
    private String society_token;
    private String address;
    private String role;

    public User() {
    }

    public User(int user_id, String full_name, String email, String password, String phone,
                String society_name, String society_token, String address, String role) {
        this.user_id = user_id;
        this.full_name = full_name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.society_name = society_name;
        this.society_token = society_token;
        this.address = address;
        this.role = role;
    }

    public int getUserId() {
        return user_id;
    }

    public void setUserId(int user_id) {
        this.user_id = user_id;
    }

    public String getFullName() {
        return full_name;
    }

    public void setFullName(String full_name) {
        this.full_name = full_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSocietyName() {
        return society_name;
    }

    public void setSocietyName(String society_name) {
        this.society_name = society_name;
    }

    public String getSocietyToken() {
        return society_token;
    }

    public void setSocietyToken(String society_token) {
        this.society_token = society_token;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}