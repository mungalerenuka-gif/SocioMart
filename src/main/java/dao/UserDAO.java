package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.User;
import util.DBConnection;

public class UserDAO {

    public boolean registerUser(User user) {
        boolean status = false;

        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO users(full_name,email,password,phone,society_name,society_token,address,role) VALUES(?,?,?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, user.getFullName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getPhone());
            ps.setString(5, user.getSocietyName());
            ps.setString(6, user.getSocietyToken());
            ps.setString(7, user.getAddress());
            ps.setString(8, user.getRole());

            int rows = ps.executeUpdate();

            System.out.println("Rows inserted = " + rows);

            if (rows > 0) {
                status = true;
            } else {
                System.out.println("Insert failed");
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
    
    
    
    public User loginUser(String email, String password) {

        User user = null;

        try {
            Connection con = DBConnection.getConnection();

            String query = "select * from users where email=? and password=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                user = new User();
                user.setFullName(rs.getString("Full_name"));   // column name
                user.setEmail(rs.getString("email"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return user;
    }
}