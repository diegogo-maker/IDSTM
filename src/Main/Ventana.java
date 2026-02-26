package Main;

import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame{
	
	public Ventana(){
		
		//configuracion de ventana
		this.setVisible(true);
		this.setSize(1050,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(200,200));
		this.setMaximumSize(new Dimension(800,800));
		this.setTitle("LOGIN");
		this.setLocation(200,200);
		this.setResizable(false);
		this.setLayout(null);
		this.login();
		this.registro();		
		
	}	
	
	public void login() {
		
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
        
        // checkBox recordarme
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
	
	public void registro() {

		
		//contenedor para el registro
		JPanel register_container = new JPanel();
		register_container.setSize(500,500);
		register_container.setLocation(500,0);
		register_container.setOpaque(true);
		register_container.setBackground(Color.decode("#63A8C7"));
		register_container.setLayout(null);
		this.add(register_container);
		
		
		JLabel titulo = new JLabel("REGISTRO");
		titulo.setBounds(60,20,380,40);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font("Arial",Font.BOLD,26));
		titulo.setForeground(Color.WHITE);
		titulo.setOpaque(true);
		titulo.setBackground(Color.decode("#1B1461"));
		register_container.add(titulo);

	
		JLabel user_label = new JLabel("Nombre de usuario");
		user_label.setBounds(60,65,380,25);
		user_label.setHorizontalAlignment(JLabel.CENTER);
		user_label.setForeground(Color.white);
		user_label.setOpaque(true);
		user_label.setBackground(Color.decode("#206685"));
		user_label.setFont(new Font("Arial",Font.BOLD,22));
		register_container.add(user_label);

		JTextField user_field = new JTextField();
		user_field.setBounds(60,95,380,35);
		register_container.add(user_field);
		user_field.setForeground(Color.black);

		
		JLabel bio_tag = new JLabel("Biografia");
		bio_tag.setBounds(60,140,380,35);
		bio_tag.setBackground(Color.decode("#206685"));
		bio_tag.setHorizontalAlignment(JLabel.CENTER);
		bio_tag.setOpaque(true);
		bio_tag.setFont(new Font("Arial",Font.BOLD,18));
		register_container.add(bio_tag);
		bio_tag.setForeground(Color.white);

		JTextArea bio = new JTextArea();
		bio.setBounds(60,180,380,80);
		register_container.add(bio);
		bio.setForeground(Color.black);

	
		JLabel pref_label = new JLabel("Preferencias");
		pref_label.setBounds(60,270,380,30);
		pref_label.setHorizontalAlignment(JLabel.CENTER);
		pref_label.setFont(new Font("Arial",Font.BOLD,18));
		pref_label.setForeground(Color.white);
		pref_label.setBackground(Color.decode("#206685"));
		pref_label.setOpaque(true);
		register_container.add(pref_label);

	
		JCheckBox sweet_option = new JCheckBox("Dulce");
		sweet_option.setBounds(60,310,120,25);
		register_container.add(sweet_option);
		sweet_option.setBackground(Color.decode("#63A8C7"));
		sweet_option.setForeground(Color.black);

		JCheckBox salty_option = new JCheckBox("Salado");
		salty_option.setBounds(190,310,120,25);
		register_container.add(salty_option);
		salty_option.setBackground(Color.decode("#63A8C7"));
		salty_option.setForeground(Color.black);

		JCheckBox healthy = new JCheckBox("Saludable");
		healthy.setBounds(320,310,120,25);
		register_container.add(healthy);
		healthy.setBackground(Color.decode("#63A8C7"));
		healthy.setForeground(Color.black);


		JRadioButton accept_terms = new JRadioButton("Acepto terminos");
		accept_terms.setBounds(60,385,170,30);
		register_container.add(accept_terms);
		accept_terms.setBackground(Color.decode("#63A8C7"));
		accept_terms.setForeground(Color.black);

		JRadioButton reject_terms = new JRadioButton("Rechazo terminos");
		reject_terms.setBounds(270,385,170,30);
		register_container.add(reject_terms);
		reject_terms.setBackground(Color.decode("#63A8C7"));
		reject_terms.setForeground(Color.black);

		ButtonGroup terms = new ButtonGroup();
		terms.add(accept_terms);
		terms.add(reject_terms);

	
		String[] colonias = {"Camino real","Progreso","Miramar"};
		JComboBox list = new JComboBox(colonias);
		list.setBounds(60,345,380,35);
		register_container.add(list);
		list.setForeground(Color.black);


		JButton crearCuenta = new JButton("Crear cuenta");
		crearCuenta.setBounds(60,425,380,50);
		crearCuenta.setFont(new Font("Comic sans ms",Font.BOLD,24));
		register_container.add(crearCuenta);
		crearCuenta.setForeground(Color.black);
		
		register_container.repaint();
		
	}
	
	public void users() {
		
	}

}
