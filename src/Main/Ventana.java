package Main;

import java.awt.*;
import javax.swing.*;


public class Ventana extends JFrame{
	
	public Ventana(){
		
		//configuracion de ventana
		
		this.setSize(1000,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(200,200));
		this.setMaximumSize(new Dimension(800,800));
		this.setTitle("LOGIN");
		this.setLocation(200,200);
		this.setResizable(false);
		this.setLayout(null);
		
		JMenuBar barra = new JMenuBar();		
		JMenu archivo = new JMenu("Archivo");
		JMenuItem open = new JMenuItem("Abrir");
		JMenuItem close = new JMenuItem("Cerrar");
		JMenuItem newfile = new JMenuItem("Nuevo");
		JMenuItem save = new JMenuItem("Guardar");
		
		archivo.add(open);
		archivo.add(close);
		archivo.add(newfile);
		archivo.add(save);
		barra.add(archivo);
		
		JMenu submenu = new JMenu ("Otros");
		archivo.addSeparator();
		
		JMenuItem menuItem = new JMenuItem("Item de submenu");
		submenu.add(menuItem);
		
		menuItem = new JMenuItem("Otro item");
		submenu.add(menuItem);
		archivo.add(submenu);
		
		this.setJMenuBar(barra);		
		this.setVisible(true);
		this.users();
		
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
		
		JPanel users = new JPanel();
		users.setSize(1000,500);
		users.setLocation(0,0);
		users.setBackground(Color.decode("#63A8C7"));
		users.setLayout(null);
		this.add(users);
		
		JLabel users_title = new JLabel("USUARIOS");
		users_title.setBounds(350,50,130,40);
		users_title.setOpaque(true);
		users_title.setFont(new Font ("Arial",Font.BOLD,22));
		users_title.setHorizontalAlignment(JLabel.CENTER);
		users_title.setBackground(Color.WHITE);
		users_title.setForeground(Color.BLUE);
		users.add(users_title);
		
		JButton export = new JButton ("EXPORTAR");
		export.setBounds(30,120,120,40);
		users.add(export);
		
		JButton add = new JButton ("AÑADIR");
		add.setBounds(160,120,100,40);
		users.add(add);
		
		String [] table_head = {"No. Control","Nombre","Apellidos"
								,"Semestre","Promedio","Acciones"};
		
		String[][] table_contend = {
			    {"2024001", "Juan", "Pérez López", "2°", "8.7", "Editar / Eliminar"},
			    {"2024002", "María", "Gómez Hernández", "4°", "9.1", "Editar / Eliminar"},
			    {"2024003", "Carlos", "Ramírez Torres", "6°", "7.9", "Editar / Eliminar"},
			    {"2024004", "Ana", "Martínez Cruz", "1°", "9.5", "Editar / Eliminar"}
			};
		
		JTable users_table = new JTable(table_contend,table_head);	
		JScrollPane scrollpane = new JScrollPane(users_table);
		
		scrollpane.setSize(800,100);
		scrollpane.setLocation(30,180);
		users.add(scrollpane);
			
		users.repaint();
	}
	
	public void calculadora() {
		
		JPanel calculadora = new JPanel();
		calculadora.setSize(500,500);
		calculadora.setLocation(0,0);
		calculadora.setBackground(Color.black);
		calculadora.setLayout(null);
		this.add(calculadora);
		
		JLabel pantalla = new JLabel ("250.00");
		pantalla.setSize(480,70);
		pantalla.setLocation(10,10);
		pantalla.setOpaque(true);
		pantalla.setFont(new Font ("Arial",Font.BOLD,50));
		pantalla.setHorizontalAlignment(JLabel.CENTER);
		pantalla.setBackground(Color.black);
		pantalla.setForeground(Color.white);
		calculadora.add(pantalla);
		
		JButton borrar = new JButton("CE");
		borrar.setSize(110,70);
		borrar.setLocation(10,90);
		borrar.setFont(new Font ("Arial",Font.BOLD,22));
		borrar.setBackground(Color.decode("#2E7694"));
		borrar.setForeground(Color.white);
		calculadora.add(borrar);
		
		JButton historial = new JButton("Historial");
		historial.setSize(350,70);
		historial.setLocation(130,90);
		historial.setFont(new Font ("Arial",Font.BOLD,22));
		historial.setBackground(Color.decode("#2E7694"));
		historial.setForeground(Color.white);
		calculadora.add(historial);
		
		JButton siete = new JButton("7");
		siete.setSize(110,70);
		siete.setLocation(10,170);
		siete.setFont(new Font ("Arial",Font.BOLD,22));
		siete.setBackground(Color.decode("#2B2A2A"));
		siete.setForeground(Color.white);
		calculadora.add(siete);
		
		JButton ocho = new JButton("8");
		ocho.setSize(110,70);
		ocho.setLocation(130,170);
		ocho.setFont(new Font ("Arial",Font.BOLD,22));
		ocho.setBackground(Color.decode("#2B2A2A"));
		ocho.setForeground(Color.white);
		calculadora.add(ocho);
		
		JButton nueve = new JButton("9");
		nueve.setSize(110,70);
		nueve.setLocation(250,170);
		nueve.setFont(new Font ("Arial",Font.BOLD,22));
		nueve.setBackground(Color.decode("#2B2A2A"));
		nueve.setForeground(Color.white);
		calculadora.add(nueve);
		
		JButton div = new JButton("/");
		div.setSize(110,70);
		div.setLocation(370,170);
		div.setFont(new Font ("Arial",Font.BOLD,22));
		div.setBackground(Color.decode("#911447"));
		div.setForeground(Color.white);
		calculadora.add(div);
		
		JButton cuatro = new JButton("4");
		cuatro.setSize(110,70);
		cuatro.setLocation(10,250);
		cuatro.setFont(new Font ("Arial",Font.BOLD,22));
		cuatro.setBackground(Color.decode("#2B2A2A"));
		cuatro.setForeground(Color.white);
		calculadora.add(cuatro);
		
		JButton cinco = new JButton("5");
		cinco.setSize(110,70);
		cinco.setLocation(130,250);
		cinco.setFont(new Font ("Arial",Font.BOLD,22));
		cinco.setBackground(Color.decode("#2B2A2A"));
		cinco.setForeground(Color.white);
		calculadora.add(cinco);
		
		JButton seis = new JButton("6");
		seis.setSize(110,70);
		seis.setLocation(250,250);
		seis.setFont(new Font ("Arial",Font.BOLD,22));
		seis.setBackground(Color.decode("#2B2A2A"));
		seis.setForeground(Color.white);
		calculadora.add(seis);
		
		JButton multi = new JButton("*");
		multi.setSize(110,70);
		multi.setLocation(370,250);
		multi.setFont(new Font ("Arial",Font.BOLD,22));
		multi.setBackground(Color.decode("#911447"));
		multi.setForeground(Color.white);
		calculadora.add(multi);
		
		JButton uno = new JButton("1");
		uno.setSize(110,70);
		uno.setLocation(10,330);
		uno.setFont(new Font ("Arial",Font.BOLD,22));
		uno.setBackground(Color.decode("#2B2A2A"));
		uno.setForeground(Color.white);
		calculadora.add(uno);
		
		JButton dos = new JButton("2");
		dos.setSize(110,70);
		dos.setLocation(130,330);
		dos.setFont(new Font ("Arial",Font.BOLD,22));
		dos.setBackground(Color.decode("#2B2A2A"));
		dos.setForeground(Color.white);
		calculadora.add(dos);
		
		JButton tres = new JButton("3");
		tres.setSize(110,70);
		tres.setLocation(250,330);
		tres.setFont(new Font ("Arial",Font.BOLD,22));
		tres.setBackground(Color.decode("#2B2A2A"));
		tres.setForeground(Color.white);
		calculadora.add(tres);
		
		JButton menos = new JButton("-");
		menos.setSize(110,70);
		menos.setLocation(370,330);
		menos.setFont(new Font ("Arial",Font.BOLD,22));
		menos.setBackground(Color.decode("#911447"));
		menos.setForeground(Color.white);
		calculadora.add(menos);
		
		JButton cero = new JButton("0");
		cero.setSize(110,70);
		cero.setLocation(10,410);
		cero.setFont(new Font ("Arial",Font.BOLD,22));
		cero.setBackground(Color.decode("#2B2A2A"));
		cero.setForeground(Color.white);
		calculadora.add(cero);
		
		JButton punto = new JButton(".");
		punto.setSize(110,70);
		punto.setLocation(130,410);
		punto.setFont(new Font ("Arial",Font.BOLD,22));
		punto.setBackground(Color.decode("#2B2A2A"));
		punto.setForeground(Color.white);
		calculadora.add(punto);
		
		JButton igual = new JButton("=");
		igual.setSize(110,70);
		igual.setLocation(250,410);
		igual.setFont(new Font ("Arial",Font.BOLD,22));
		igual.setBackground(Color.decode("#911447"));
		igual.setForeground(Color.white);
		calculadora.add(igual);
		
		JButton mas = new JButton("+");
		mas.setSize(110,70);
		mas.setLocation(370,410);
		mas.setFont(new Font ("Arial",Font.BOLD,22));
		mas.setBackground(Color.decode("#911447"));
		mas.setForeground(Color.white);
		calculadora.add(mas);
		
		calculadora.repaint();
	}

}
