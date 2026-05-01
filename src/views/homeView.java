package views;

import javax.swing.*;
import controllers.authControllers;
import java.awt.*;

public class homeView {

    public void showHome() {

        JFrame ventana = new JFrame();

        ventana.setSize(500,535);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Home");
        ventana.setLocation(200,25);
        ventana.setResizable(false);
        ventana.setLayout(null);

        JPanel contenedor = new JPanel();
        contenedor.setBounds(0,0,500,535);
        contenedor.setBackground(Color.decode("#FFFFFF"));
        contenedor.setLayout(null);
        ventana.add(contenedor);

        JLabel titulo = new JLabel("BIENVENIDO");
        titulo.setBounds(100,200,300,50);
        titulo.setFont(new Font("Arial", Font.BOLD, 28));
        titulo.setHorizontalAlignment(JLabel.CENTER);
        contenedor.add(titulo);

        JButton regresar = new JButton("Regresar");
        regresar.setBounds(150,260,200,50);
        regresar.setBackground(Color.decode("#2F2F2F"));
        regresar.setForeground(Color.WHITE);
        regresar.setFont(new Font("Arial", Font.BOLD, 16));
        contenedor.add(regresar);

        regresar.addActionListener(e -> {
            ventana.dispose();
            new authControllers().showLogin(); 
        });

        ventana.setVisible(true);
    }
}