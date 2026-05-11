package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controllers.UsersController;
import controllers.authControllers;
import models.AuthModel;

public class authView {

    public void loginView(authControllers controller) {

        JFrame ventana = new JFrame();

        ventana.setSize(500, 500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setLayout(null);
        ventana.setTitle("Login");

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 500, 500);
        panel.setBackground(Color.decode("#63A8C7"));
        panel.setLayout(null);
        ventana.add(panel);

        JLabel title = new JLabel("LOGIN");
        title.setBounds(100, 30, 300, 50);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setForeground(Color.WHITE);
        panel.add(title);

        JLabel email_label = new JLabel("Correo");
        email_label.setBounds(60, 100, 380, 25);
        email_label.setForeground(Color.WHITE);
        email_label.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(email_label);

        JTextField email_field = new JTextField();
        email_field.setBounds(60, 130, 380, 40);
        email_field.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(email_field);

        JLabel pass_label = new JLabel("Contraseña");
        pass_label.setBounds(60, 190, 380, 25);
        pass_label.setForeground(Color.WHITE);
        pass_label.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(pass_label);

        JPasswordField pass_field = new JPasswordField();
        pass_field.setBounds(60, 220, 380, 40);
        pass_field.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(pass_field);

        JButton login = new JButton("ACCEDER");
        login.setBounds(140, 300, 220, 50);
        login.setFont(new Font("Arial", Font.BOLD, 18));
        login.setBackground(Color.decode("#1B1461"));
        login.setForeground(Color.WHITE);
        panel.add(login);

        login.addActionListener(e -> {

            String email_val = email_field.getText();
            String pass_val = new String(pass_field.getPassword());

            boolean valido = true;

            if(email_val.equals("")) {
                email_field.setBorder(BorderFactory.createLineBorder(Color.RED,3));
                valido = false;
            } 
            
            else {
            	email_field.setBorder(BorderFactory.createLineBorder(Color.GREEN,3));
            }

            if(pass_val.equals("")) {
                pass_field.setBorder(BorderFactory.createLineBorder(Color.RED,3));
                valido = false;
            } 
            else {
                pass_field.setBorder(BorderFactory.createLineBorder(Color.GREEN,3));
            }

            if(valido) {
                AuthModel model = new AuthModel();

                boolean acceso = model.login(email_val, pass_val);

                if(acceso) {
                    JOptionPane.showMessageDialog(null,"Bienvenido");
                    ventana.dispose();
                    new UsersController().showUsers();
                } 
                else {
                	JOptionPane.showMessageDialog(null,"Correo o contraseña incorrectos");
                }
            }
        });

        JButton register = new JButton("Crear cuenta");
        register.setBounds(140, 380, 220, 50);
        register.setFont(new Font("Arial", Font.BOLD, 18));
        register.setBackground(Color.decode("#206685"));
        register.setForeground(Color.WHITE);
        panel.add(register);

        register.addActionListener(e -> {

            ventana.dispose();

            controller.showRegister();
        });

        ventana.setVisible(true);
    }

    public void registerView(authControllers controller) {

        JFrame ventana = new JFrame();
        ventana.setSize(500, 700);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setLayout(null);
        ventana.setTitle("Registro");

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 500, 700);
        panel.setBackground(Color.decode("#63A8C7"));
        panel.setLayout(null);
        ventana.add(panel);

        JLabel title = new JLabel("REGISTRO");
        title.setBounds(100, 20, 300, 50);
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setForeground(Color.WHITE);
        panel.add(title);

        JLabel name_label = new JLabel("Nombre");
        name_label.setBounds(60, 90, 380, 25);
        name_label.setForeground(Color.WHITE);
        name_label.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(name_label);

        JTextField name_field = new JTextField();
        name_field.setBounds(60, 120, 380, 40);
        panel.add(name_field);

        JLabel lastname_label = new JLabel("Apellido");
        lastname_label.setBounds(60, 180, 380, 25);
        lastname_label.setForeground(Color.WHITE);
        lastname_label.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(lastname_label);

        JTextField lastname_field = new JTextField();
        lastname_field.setBounds(60, 210, 380, 40);
        panel.add(lastname_field);

        JLabel email_label = new JLabel("Correo");
        email_label.setBounds(60, 270, 380, 25);
        email_label.setForeground(Color.WHITE);
        email_label.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(email_label);
        
        JTextField email_field = new JTextField();
        email_field.setBounds(60, 300, 380, 40);
        panel.add(email_field);
        
        JLabel phone_label = new JLabel("Telefono");
        phone_label.setBounds(60, 360, 380, 25);
        phone_label.setForeground(Color.WHITE);
        phone_label.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(phone_label);

        JTextField phone_field = new JTextField();
        phone_field.setBounds(60, 390, 380, 40);
        panel.add(phone_field);

        JLabel pass_label = new JLabel("Contraseña");
        pass_label.setBounds(60, 450, 380, 25);
        pass_label.setForeground(Color.WHITE);
        pass_label.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(pass_label);

        JPasswordField pass_field = new JPasswordField();
        pass_field.setBounds(60, 480, 380, 40);
        panel.add(pass_field);

        JButton register = new JButton("REGISTRAR");
        register.setBounds(60, 570, 180, 50);
        register.setFont(new Font("Arial", Font.BOLD, 18));
        register.setBackground(Color.decode("#1B1461"));
        register.setForeground(Color.WHITE);

        panel.add(register);

        register.addActionListener(e -> {

            String name_val = name_field.getText();

            String lastname_val =
                    lastname_field.getText();

            String email_val =
                    email_field.getText();

            String phone_val =
                    phone_field.getText();

            String pass_val =
                    new String(pass_field.getPassword());

            AuthModel model = new AuthModel();

            boolean registrado = model.register(name_val,lastname_val,email_val,phone_val,pass_val);

            if(registrado) {
            	JOptionPane.showMessageDialog(null,"Registro exitoso");
                ventana.dispose();
                controller.showLogin();
            } 
            else {
                JOptionPane.showMessageDialog(null,"El correo ya existe");
            }
        });

        JButton cancel = new JButton("CANCELAR");
        cancel.setBounds(260, 570, 180, 50);
        cancel.setFont(new Font("Arial", Font.BOLD, 18));
        cancel.setBackground(Color.decode("#851111"));
        cancel.setForeground(Color.WHITE);

        panel.add(cancel);

        cancel.addActionListener(e -> {
            ventana.dispose();
            controller.showLogin();
        });

        ventana.setVisible(true);
    }
}