package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AuthModel {

    String URL = "jdbc:mysql://localhost:3308/programacion3";
    String USER = "root";
    String PASSWORD = "";

    public boolean login(String email, String password) {

        String query = "SELECT * FROM users WHERE email = ? AND password = ?";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);

            PreparedStatement ps = conn.prepareStatement(query);

            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            boolean acceso = rs.next();

            rs.close();
            ps.close();
            conn.close();

            return acceso;
        } 
        
        catch(Exception e) {

            e.printStackTrace();
        }

        return false;
    }

    public boolean register(String name,String lastname,String email,String phone,String password) {

        String verify ="SELECT * FROM users WHERE email = ?";

        String query ="INSERT INTO users(name, lastname, email, phone, password) VALUES(?,?,?,?,?)";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn =DriverManager.getConnection(URL, USER, PASSWORD);

            PreparedStatement check = conn.prepareStatement(verify);

            check.setString(1, email);

            ResultSet rs = check.executeQuery();

            if(rs.next()) {

                return false;
            }

            PreparedStatement ps = conn.prepareStatement(query);

            ps.setString(1, name);
            ps.setString(2, lastname);
            ps.setString(3, email);
            ps.setString(4, phone);
            ps.setString(5, password);

            ps.executeUpdate();

            ps.close();
            check.close();
            rs.close();
            conn.close();

            return true;

        } catch(Exception e) {

            e.printStackTrace();
        }

        return false;
    }
}