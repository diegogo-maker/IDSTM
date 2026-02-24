package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class Ventana extends JFrame{
	
	public Ventana(){
		
		//configuracion de ventana
		this.setVisible(true);
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(200,200));
		this.setMaximumSize(new Dimension(800,800));
		this.setTitle("LOGIN");
		this.setLocation(200,200);
		this.setLayout(null);
		this.setResizable(false);
		
		//panel contenedor
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.black);
		contenedor.setSize(500,500);
		contenedor.setLocation(50,50);
		contenedor.setLayout(null);
		this.add(contenedor);
		
		//titulo
		JLabel title_login = new JLabel();
		title_login.setText("BIENVENIDO");
		title_login.setSize(200,30);
		title_login.setLocation(150,40); 
		title_login.setOpaque(true);
		title_login.setBackground(Color.PINK);
		title_login.setForeground(Color.BLACK);
		title_login.setFont(new Font("Times new roman",Font.BOLD,22));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);
		
		//etiqueta usuario
		JLabel usuarioLabel = new JLabel("Usuario:");
		usuarioLabel.setBounds(100, 95, 120, 25);
		usuarioLabel.setForeground(Color.PINK);
		usuarioLabel.setFont(new Font("Arial", Font.BOLD, 16));
		contenedor.add(usuarioLabel);
		
		//usuario
		JTextField username = new JTextField();
		username.setSize(300,30);
		username.setLocation(100,120); 
		username.setFont(new Font("Arial",Font.BOLD,22));
		contenedor.add(username);
		
		//etiqueta contraseña
        JLabel Password = new JLabel("Contraseña:");
        Password.setBounds(100, 180, 120, 25);
        Password.setForeground(Color.PINK);
        Password.setFont(new Font("Arial", Font.BOLD, 16));
        contenedor.add(Password);
        
        //contraseña
        JPasswordField password = new JPasswordField();
        password.setBounds(100, 210, 300, 30); 
        contenedor.add(password);
        
        // CheckBox Recordarme
        JCheckBox recordar = new JCheckBox("Recordarme");
        recordar.setBounds(100, 260, 150, 25); 
        recordar.setBackground(Color.BLACK);
        recordar.setForeground(Color.PINK);
        contenedor.add(recordar);

		//boton acceder
		JButton acceder = new JButton ();
		acceder.setText("Acceder");
		acceder.setLocation(190,330); 
		acceder.setSize(120,50);
		acceder.setBackground(Color.black);
        acceder.setForeground(Color.PINK);
		acceder.setFont(new Font("Comic sans ms",Font.BOLD,22));
		contenedor.add(acceder);
		
		contenedor.repaint();
		contenedor.revalidate();
		
	}	

}
