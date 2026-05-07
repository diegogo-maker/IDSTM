package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// email: diego@gmail.com
// contraseña: 12345678

public class AuthModel {

    String URL = "jdbc:mysql://localhost:3308/programacion3";
    String USER = "root";
    String PASSWORD = "";

    private Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } 
        catch (Exception e) {
            System.out.println("Error conexion: " + e.getMessage());
            return null;
        }
    }

    public boolean login(String email, String password) {

        String sql = "SELECT * FROM usuarios WHERE username = ? AND password = ?";

        try {
        	Connection con = conectar();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            return rs.next();

        } catch (Exception e) {
            System.out.println("Error login: " + e.getMessage());
            return false;
        }
    }
    
    public boolean register(String email, String password) {

        String sql = "INSERT INTO usuarios(username,password) VALUES (?,?)";

        try {
            Connection con = conectar();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, email);
            ps.setString(2, password);

            int rowsAffected = ps.executeUpdate();

            return rowsAffected > 0;

        } catch (Exception e) {

            System.out.println("Error register: " + e.getMessage());

            return false;
        }
    }

}