package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;

public class Ventana extends JFrame{
	
	public Ventana(){
		
		//configuracion de ventana
		this.setVisible(true);
		this.setSize(1000,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(200,200));
		this.setMaximumSize(new Dimension(800,800));
		this.setTitle("LOGIN");
		this.setLocation(200,200);
		this.setLayout(null);
		this.setResizable(false);
		
		//panel contenedor de login
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.black);
		contenedor.setSize(500,500);
		contenedor.setLocation(0,0);
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
		
		//contenedor para el registro
		JPanel register_container = new JPanel();
		register_container.setSize(500,500);
		register_container.setLocation(500,0);
		register_container.setOpaque(true);
		register_container.setBackground(Color.decode("#9048C2"));
		register_container.setLayout(null);
		this.add(register_container);
		
		JLabel bio_tag = new JLabel ("Biografia");
		bio_tag.setBounds(100,50,275,40);
		bio_tag.setBackground(Color.white);
		bio_tag.setHorizontalAlignment(JLabel.CENTER);
		bio_tag.setOpaque(true);
		bio_tag.setFont(new Font("Arial",Font.BOLD,22));
		register_container.add(bio_tag);
		
		JTextArea bio = new JTextArea ();
		bio.setBounds(100,140,275,100);
		register_container.add(bio);
		
		JCheckBox sweet_option = new JCheckBox("Dulce");
		sweet_option.setBounds(100,160,275,140);
		register_container.add(sweet_option);
		
		JCheckBox salty_option = new JCheckBox("Salado");
		salty_option.setBounds(100,160,100,20);
		register_container.add(salty_option);
		
		JCheckBox healthy = new JCheckBox("Saludable");
		healthy.setBounds(100,160,100,20);
		healthy.setBorderPainted(true);
		healthy.setBorder(BorderFactory.createLineBorder(Color.white));
		//healthy.setOpaque(true);
		register_container.add(healthy);
		
		JRadioButton accept_terms = new JRadioButton ("Acepto las condiciones");
		accept_terms.setBounds(120,400,150,50);
		register_container.add(accept_terms);
		
		JRadioButton reject_terms = new JRadioButton ("Rechazo las condiciones");
		reject_terms.setBounds(290,400,150,50);
		register_container.add(reject_terms);
		
		ButtonGroup terms = new ButtonGroup();
		terms.add(accept_terms);
		terms.add(reject_terms);
		
		String [] colonias= {"camino real","progreso","miramar"};
		
		JComboBox list = new JComboBox(colonias);
		list.setBounds(50,50,200,40);
		register_container.add(list);
		
		register_container.repaint();
		
	}	

}
