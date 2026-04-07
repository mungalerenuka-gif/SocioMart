package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

            if (rows > 0) {
                status = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }
}