package models;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class User {

    private int id;
    private String name;
    private String email;
    private String password;
    private String lastname;
    private String phone;

    public User() {

    }

    public User(int id, String name, String email,
                String password, String lastname,
                String phone) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.lastname = lastname;
        this.phone = phone;
    }

    public ArrayList<User> get() {

        ArrayList<User> users = new ArrayList<>();

        String query = "SELECT * FROM users";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://sql.freedb.tech:3308/freedb_fnoFrnnL",
                    "u_JUPIx1",
                    "27dmhVh6vCHx"
            );

            PreparedStatement ps =
                    conn.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                User tmp = new User();

                tmp.setId(rs.getInt("id"));
                tmp.setName(rs.getString("name"));
                tmp.setLastname(rs.getString("lastname"));
                tmp.setEmail(rs.getString("email"));
                tmp.setPhone(rs.getString("phone"));
                tmp.setPassword(rs.getString("password"));

                users.add(tmp);
            }

            rs.close();
            ps.close();
            conn.close();

        } catch(Exception e) {

            e.printStackTrace();
        }

        return users;
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public boolean make(
    	    String email,
    	    String password,
    	    String name,
    	    String lastname,
    	    String phone
    	)  {

        String query = "INSERT INTO users (email, password, name, lastname, phone) VALUES (?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
        	
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	
            conn = DriverManager.getConnection(
                "jdbc:mysql://sql.freedb.tech:3308/freedb_fnoFrnnL",
                "u_JUPIx1",
                "27dmhVh6vCHx"
            );

            stmt = conn.prepareStatement(query);

            stmt.setString(1, email);
            stmt.setString(2, password);
            stmt.setString(3, name);
            stmt.setString(4, lastname);
            stmt.setString(5, phone);

            int rows = stmt.executeUpdate();

            return rows > 0;

        } catch (Exception e) {

            e.printStackTrace();
            return false;

        } finally {

            try {

                if(stmt != null) stmt.close();
                if(conn != null) conn.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}