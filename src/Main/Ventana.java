package Main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;

public class Ventana extends JFrame{
	
	public Ventana(){
		
		//configuracion de ventana
		
		this.setSize(615,555);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(200,200));
		this.setMaximumSize(new Dimension(800,800));
		this.setTitle("Juego del Gato X vs O");
		this.setLocation(200,25);
		this.setResizable(false);
		this.setLayout(null);
		
		// ICONO DE LA VENTANA
		ImageIcon icono = new ImageIcon(getClass().getResource("/Main/Imagenes/logoventana.png"));
		Image img = icono.getImage();
		Image imgEscalada = img.getScaledInstance(64,64,Image.SCALE_SMOOTH);
		this.setIconImage(imgEscalada);
		
		//this.menu();

		//this.router("login");
		
		this.tiktaktoe();
		
		this.setVisible(true);
		
	}	
	
	public void login() {	
		
		// ===== PANEL LOGIN =====
		JPanel contenedor = new JPanel();
		contenedor.setBackground(Color.gray); 
		contenedor.setBounds(0,0,500,500);
		contenedor.setLayout(null);
		this.add(contenedor);


		// ===== TITULO LOGIN =====
		JLabel title_login = new JLabel("BEAR COMPANY");
		title_login.setBounds(140,40,220,30);
		title_login.setForeground(Color.decode("#333333"));
		title_login.setFont(new Font("Serif",Font.ITALIC,30));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);


		// ===== ICONO USUARIO =====
		ImageIcon iconUser = new ImageIcon(getClass().getResource("/Main/Imagenes/user.png"));
		Image imgUser = iconUser.getImage();
		Image imgUserEscalada = imgUser.getScaledInstance(24, 24, Image.SCALE_SMOOTH);
		ImageIcon iconUserEscalado = new ImageIcon(imgUserEscalada);

		JLabel iconoUser = new JLabel(iconUserEscalado);
		iconoUser.setBounds(70,120,24,24);
		contenedor.add(iconoUser);


		// ===== USUARIO =====
		JLabel usuarioLabel = new JLabel("Usuario:");
		usuarioLabel.setBounds(100,95,120,25);
		usuarioLabel.setForeground(Color.decode("#333333"));
		usuarioLabel.setFont(new Font("Arial", Font.ITALIC,16));
		contenedor.add(usuarioLabel);

		JTextField username = new JTextField();
		username.setBounds(100,120,300,30);
		username.setFont(new Font("Arial",Font.BOLD,16));
		username.setBorder(BorderFactory.createLineBorder(Color.decode("#CFCFCF")));
		contenedor.add(username);


		// ===== ICONO PASSWORD =====
		ImageIcon iconPass = new ImageIcon(getClass().getResource("/Main/Imagenes/elcandado.png"));
		Image img = iconPass.getImage();
		Image imgEscalada = img.getScaledInstance(24, 24, Image.SCALE_SMOOTH);
		ImageIcon iconPassEscalado = new ImageIcon(imgEscalada);

		JLabel iconoPass = new JLabel(iconPassEscalado);
		iconoPass.setBounds(70,210,24,24);
		contenedor.add(iconoPass);


		// ===== CONTRASEÑA =====
		JLabel Password = new JLabel("Contraseña:");
		Password.setBounds(100,180,150,25);
		Password.setForeground(Color.decode("#333333"));
		Password.setFont(new Font("Arial", Font.ITALIC,16));
		contenedor.add(Password);

		JPasswordField password = new JPasswordField();
		password.setBounds(100,210,300,30);
		password.setFont(new Font("Arial",Font.BOLD,16));
		password.setBorder(BorderFactory.createLineBorder(Color.decode("#CFCFCF")));
		contenedor.add(password);


		// ===== CHECKBOX =====
		JCheckBox recordar = new JCheckBox("Recordarme");
		recordar.setBounds(100,260,150,25);
		recordar.setBackground(Color.decode("#F5F5F5"));
		recordar.setForeground(Color.decode("#333333"));
		recordar.setFont(new Font("Arial", Font.ITALIC,14));
		contenedor.add(recordar);


		// ===== OLVIDE CONTRASEÑA =====
		JLabel olvidar = new JLabel("¿Olvidaste tu contraseña?");
		olvidar.setBounds(250,260,200,25);
		olvidar.setForeground(Color.black);
		olvidar.setFont(new Font("Arial", Font.BOLD,13));
		contenedor.add(olvidar);


		// ===== BOTON =====
		JButton acceder = new JButton("ACCEDER");
		acceder.setBounds(170,310,160,55);
		acceder.setBackground(Color.decode("#2F2F2F"));
		acceder.setForeground(Color.WHITE);
		acceder.setFont(new Font("Arial",Font.BOLD,16));
		acceder.setFocusPainted(false);
		acceder.setBorder(BorderFactory.createLineBorder(Color.decode("#2F2F2F")));
		contenedor.add(acceder);
		
		acceder.addActionListener(e -> {

		    boolean valido = true;

		    String username_val = username.getText();
		    String password_val = new String(password.getPassword());

		    if(username_val.equals("") || username_val.contains(" ") || username_val.length() < 5) {
		        username.setBorder(BorderFactory.createLineBorder(Color.red,3,true));
		        valido = false;
		    } else {
		        username.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
		    }

		    if(password_val.equals("") || password_val.length() < 5) {
		        password.setBorder(BorderFactory.createLineBorder(Color.red,3,true));
		        valido = false;
		    } else {
		        password.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
		    }

		    if(valido) {
		        JOptionPane.showMessageDialog(null, "Login exitoso", "Exito", JOptionPane.INFORMATION_MESSAGE);
		    } else {
		        JOptionPane.showMessageDialog(null, "Error en el login", "Error", JOptionPane.ERROR_MESSAGE);
		    }

		});
		
		JButton registro = new JButton("No tienes otra cuenta?");
		registro.setLocation(100,380);
		registro.setSize(300,50);
		registro.setFont(new Font("Arial",Font.BOLD,22));
		registro.setBackground(Color.black);
		registro.setForeground(Color.white);
		registro.setOpaque(true);
		contenedor.add(registro);
		
		registro.addActionListener(e->{
			this.router("registro");
		});
		
		JButton recuperar = new JButton("Desea recuperar la cuenta?");
		recuperar.setLocation(50,440);
		recuperar.setSize(400,50);
		recuperar.setFont(new Font("Arial",Font.BOLD,22));
		recuperar.setBackground(Color.black);
		recuperar.setForeground(Color.white);
		recuperar.setOpaque(true);
		contenedor.add(recuperar);
		
		recuperar.addActionListener(e->{
			this.router("recuperar");
		});

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
	
		JLabel pass_label = new JLabel("Contraseña");
		pass_label.setBounds(60,135,380,25);
		pass_label.setHorizontalAlignment(JLabel.CENTER);
		pass_label.setForeground(Color.white);
		pass_label.setOpaque(true);
		pass_label.setBackground(Color.decode("#206685"));
		pass_label.setFont(new Font("Arial",Font.BOLD,22));
		register_container.add(pass_label);

		JPasswordField pass_field = new JPasswordField();
		pass_field.setBounds(60,165,380,35);
		pass_field.setForeground(Color.black);
		register_container.add(pass_field);
		
		JLabel bio_tag = new JLabel("Biografia");
		bio_tag.setBounds(60,200,380,25);
		bio_tag.setBackground(Color.decode("#206685"));
		bio_tag.setHorizontalAlignment(JLabel.CENTER);
		bio_tag.setOpaque(true);
		bio_tag.setFont(new Font("Arial",Font.BOLD,18));
		register_container.add(bio_tag);
		bio_tag.setForeground(Color.white);

		JTextArea bio = new JTextArea();
		bio.setBounds(60,230,380,40);     
		register_container.add(bio);
		bio.setForeground(Color.black);

	
		JLabel pref_label = new JLabel("Preferencias");
		pref_label.setBounds(60,280,380,30);
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
		crearCuenta.setBounds(60,425,180,50);
		crearCuenta.setFont(new Font("Arial",Font.BOLD,16));
		crearCuenta.setBackground(Color.decode("#1B1461"));
		crearCuenta.setForeground(Color.white);
		crearCuenta.setOpaque(true);
		crearCuenta.setForeground(Color.white);
		register_container.add(crearCuenta);
		
		crearCuenta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				boolean valido = true;

				String username_val = user_field.getText();
				String bio_val = bio.getText();

				if(username_val.equals("") || username_val.contains(" ") || username_val.length() < 5) {
					user_field.setBorder(BorderFactory.createLineBorder(Color.red,3,true));
					valido = false;
				}else{
					user_field.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
				}

				if(!bio_val.equals("") && bio_val.length() < 5) {
					bio.setBorder(BorderFactory.createLineBorder(Color.red,3,true));
					valido = false;
				}else{
					bio.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
				}

				if(!sweet_option.isSelected() && !salty_option.isSelected() && !healthy.isSelected()) {
					sweet_option.setForeground(Color.red);
					salty_option.setForeground(Color.red);
					healthy.setForeground(Color.red);
					valido = false;
				}else{
					sweet_option.setForeground(Color.green);
					salty_option.setForeground(Color.green);
					healthy.setForeground(Color.green);
				}

				if(!accept_terms.isSelected()) {
					accept_terms.setForeground(Color.red);
					reject_terms.setForeground(Color.red);
					valido = false;
				}else{
					accept_terms.setForeground(Color.green);
					reject_terms.setForeground(Color.black);
				}

				if(valido) {
					JOptionPane.showMessageDialog(null, "Registro exitoso", "Exito", JOptionPane.INFORMATION_MESSAGE);
				}else{
					JOptionPane.showMessageDialog(null, "Error en el formulario", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
				String pass_val = new String(pass_field.getPassword());

				if(pass_val.equals("") || pass_val.length() < 5) {
				    pass_field.setBorder(BorderFactory.createLineBorder(Color.red,3,true));
				    valido = false;
				} else {
				    pass_field.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
				}
			}
		});
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.setBounds(260,425,180,50);
		cancelar.setFont(new Font("Arial",Font.BOLD,16));
		cancelar.setBackground(Color.decode("#851111")); 
		cancelar.setForeground(Color.white);
		cancelar.setOpaque(true);
		register_container.add(cancelar);

		cancelar.addActionListener(e -> {
		    this.router("login");
		});
		
		register_container.repaint();
		
	}
	
	public void recuperar() {

	    JPanel contenedor = new JPanel();
	    contenedor.setBackground(Color.decode("#CFCF46")); 
	    contenedor.setBounds(0,0,500,500);
	    contenedor.setLayout(null);
	    this.add(contenedor);

	    JLabel titulo = new JLabel("RECUPERAR CONTRASEÑA");
	    titulo.setBounds(50,50,400,40);
	    titulo.setFont(new Font("Arial",Font.BOLD,24));
	    titulo.setHorizontalAlignment(JLabel.CENTER);
	    contenedor.add(titulo);

	    JLabel correoLabel = new JLabel("Correo:");
	    correoLabel.setBounds(100,150,300,25);
	    contenedor.add(correoLabel);

	    JTextField correo = new JTextField();
	    correo.setBounds(100,180,300,30);
	    contenedor.add(correo);

	    JButton recuperar = new JButton("Recuperar");
	    recuperar.setBounds(100,250,300,40);
	    contenedor.add(recuperar);

	    JButton volver = new JButton("Volver");
	    volver.setBounds(100,320,300,40);
	    volver.setBackground(Color.black);	  
	    volver.setForeground(Color.white);	
	    contenedor.add(volver);

	    volver.addActionListener(e -> this.router("login"));

	    contenedor.repaint();
	    contenedor.revalidate();
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
	
	public void calculadoraLayout() {
		
		//panel principal
		JPanel panel_calculadora = new JPanel();
	    panel_calculadora.setBounds(0,0,500,500);
	    panel_calculadora.setBackground(Color.decode("#63A8C7"));
	    panel_calculadora.setLayout(new BorderLayout());
	    this.add(panel_calculadora);

	    JLabel pantalla = new JLabel("100.00");
	    pantalla.setFont(new Font("Arial", Font.BOLD, 30));
	    pantalla.setHorizontalAlignment(JLabel.RIGHT);
	    pantalla.setOpaque(true);
	    pantalla.setBackground(Color.white);
	    pantalla.setForeground(Color.black);
	    pantalla.setPreferredSize(new Dimension(500,60));

	    panel_calculadora.add(pantalla, BorderLayout.NORTH);

	    JPanel teclado = new JPanel();
	    teclado.setLayout(new BorderLayout());
	    panel_calculadora.add(teclado, BorderLayout.CENTER);

	    JPanel flow_panel = new JPanel();
	    //flow_panel.setBackground(Color.red);
	    flow_panel.setLayout(new FlowLayout(FlowLayout.LEFT,40,10));
	    flow_panel.setBackground(Color.decode("#07133D"));

	    Dimension tamaño = new Dimension(80,20);

	    JButton mc = new JButton("MC");
	    mc.setPreferredSize(tamaño);
	    flow_panel.add(mc);

	    JButton mp = new JButton("M+");
	    mp.setPreferredSize(tamaño);
	    flow_panel.add(mp);
	    
	    JButton div = new JButton("(");
	    div.setPreferredSize(tamaño);
	    flow_panel.add(div);

	    JButton mult = new JButton(")");
	    mult.setPreferredSize(tamaño);
	    flow_panel.add(mult);

	    teclado.add(flow_panel, BorderLayout.NORTH);

	    JPanel grid_panel = new JPanel();
	    grid_panel.setLayout(new GridLayout(4,3,10,10));
	    grid_panel.setBackground(Color.decode("#314691"));
	    grid_panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

	    grid_panel.add(new JButton("7"));
	    grid_panel.add(new JButton("8"));
	    grid_panel.add(new JButton("9"));

	    grid_panel.add(new JButton("4"));
	    grid_panel.add(new JButton("5"));
	    grid_panel.add(new JButton("6"));

	    grid_panel.add(new JButton("1"));
	    grid_panel.add(new JButton("2"));
	    grid_panel.add(new JButton("3"));

	    grid_panel.add(new JButton("."));
	    grid_panel.add(new JButton("0"));
	    grid_panel.add(new JButton("="));

	    teclado.add(grid_panel, BorderLayout.CENTER);

	    JPanel operadores = new JPanel();
	    operadores.setLayout(new GridLayout(4,1,10,10));
	    operadores.setBackground(Color.decode("#627AD1"));
	    operadores.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
	    
	    operadores.add(new JButton("+"));
	    operadores.add(new JButton("-"));
	    operadores.add(new JButton("/"));
	    operadores.add(new JButton("*"));

	    teclado.add(operadores, BorderLayout.EAST);

		panel_calculadora.repaint();
	}
	
	public void calculadoraInteres() {
	    
	    JPanel panel_interes = new JPanel();
	    panel_interes.setBounds(0,0,500,600);
	    panel_interes.setBackground(Color.WHITE);
	    panel_interes.setLayout(new BorderLayout(20,20));
	    panel_interes.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
	    this.add(panel_interes);
	    
	    JLabel titulo = new JLabel("Calculando el interes");
	    titulo.setFont(new Font("Arial", Font.BOLD, 28));
	    titulo.setHorizontalAlignment(JLabel.LEFT);
	    panel_interes.add(titulo, BorderLayout.NORTH);
	    
	    JPanel centro = new JPanel();
	    centro.setLayout(new BorderLayout(10,10));
	    centro.setBackground(Color.white);
	    
	    JPanel grid_panel = new JPanel();
	    GridLayout mi_layout = new GridLayout(3,2,20,20);
	    grid_panel.setLayout(mi_layout);
	    grid_panel.setBackground(Color.decode("#314691"));
	    grid_panel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

	    grid_panel.add(new JLabel("Capital"));
	    grid_panel.add(new JTextField(10));
	    
	    grid_panel.add(new JLabel("Tiempo"));
	    grid_panel.add(new JTextField(10));
	    
	    grid_panel.add(new JLabel("Tasa de interes"));
	    grid_panel.add(new JTextField(10));
	    
	    JPanel panel_botones = new JPanel();
	    panel_botones.setLayout(new FlowLayout(FlowLayout.CENTER,20,10));
	    panel_botones.setBackground(Color.white);

	    JButton calcular = new JButton("Calcular");
	    JButton cancelar = new JButton("Cancelar");

	    calcular.setPreferredSize(new Dimension(200,30));
	    cancelar.setPreferredSize(new Dimension(200,30));

	    panel_botones.add(calcular);
	    panel_botones.add(cancelar);
	    
	    
	    centro.add(grid_panel, BorderLayout.CENTER);
	    centro.add(panel_botones, BorderLayout.SOUTH);    
	    panel_interes.add(centro, BorderLayout.CENTER);
	    
	    JPanel sur = new JPanel();
	    sur.setLayout(new GridLayout(2,2,20,20));
	    sur.setBackground(Color.decode("#314691"));
	    sur.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
	    
	    sur.add(new JLabel("Interes"));
	    sur.add(new JTextField(10));
	    
	    sur.add(new JLabel("Monto"));
	    sur.add(new JTextField(10));
	    
	    panel_interes.add(sur,BorderLayout.SOUTH);
	    
	    panel_interes.repaint();
	}
	
	public void pintar() {

        JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                Graphics2D g2d= (Graphics2D) g;
                
                g2d.drawLine(0,0,100,100);
                
                g2d.setColor(Color.red);
                
                g2d.setStroke(new BasicStroke(3));
                
                g2d.drawLine(200,200,500,200);
                
                g2d.drawRect(250, 250, 100, 100);
                
                g2d.setColor(Color.green);
                
                g2d.drawOval(400,100,90,90);
                
                g2d.setStroke(new BasicStroke(6));
                
                g2d.drawArc(250, 100, 100, 100,0,270);
                
                g2d.drawPolygon(new int [] {200,100,300},new int [] {100,300,500},3);
                
                g2d.setColor(Color.orange);
                
                g2d.fillRect(100,100,100,100);
                
                g2d.fillOval(400,200,100,100);
                
                g2d.fillArc(300, 100, 100, 100,0,90);
                
                g2d.fillPolygon(new int [] {400,300,300},new int [] {200,300,500},3);
                
               try {
                // Ejemplo para cargar una imagen
                BufferedImage image = ImageIO.read(new File("src/Main/Imagenes/logoventana.png"));
                g2d.drawImage(image, 500, 9, null);
               }
               catch(IOException e) {
            	   e.printStackTrace();
               }
            }
        };
        
        pane.setSize(1200,700);
        pane.setLocation(0,0);
        this.add(pane);
	}
	
	public void dibujar() {
		
		JPanel panel = new JPanel() {
			
		 	@Override
	        protected void paintComponent(Graphics g) {
		 		super.paintComponent(g);
		 		
		 		Graphics2D g2d = (Graphics2D) g;
		 		
		 		// cielo
		 	    g2d.setColor(Color.decode("#107EAD"));
		 	    g2d.fillRect(0,0,800,300);
	
		 	    // cesped
		 	    g2d.setColor(Color.decode("#1D6E12"));
		 	    g2d.fillRect(0,300,800,200);
	
		 	    // sol
		 	    g2d.setColor(Color.decode("#E8BF00"));
		 	    g2d.fillOval(650,50,80,80);
	
		 	    // nubes
		 	    g2d.setColor(Color.WHITE);
		 	    
		 	    g2d.fillOval(100,70,60,40);
		 	    g2d.fillOval(130,60,60,50);
		 	    g2d.fillOval(160,70,60,40);
	
		 	    g2d.fillOval(300,80,60,40);
		 	    g2d.fillOval(330,70,60,50);
		 	    g2d.fillOval(360,80,60,40);
	
		 	    // pared
		 	    g2d.setColor(Color.decode("#D6D60D"));
		 	    g2d.fillRect(320,260,160,120);
	
		 	    // pared lado
		 	    g2d.setColor(Color.decode("#D1B621"));
		 	    int xCasa[] = {480,520,520,480};
		 	    int yCasa[] = {260,240,360,380};
		 	    g2d.fillPolygon(xCasa,yCasa,4);
	
		 	    // techo frente
		 	    g2d.setColor(Color.decode("#D60D0D"));
		 	    int xTecho[] = {300,400,500};
		 	    int yTecho[] = {260,200,260};
		 	    g.fillPolygon(xTecho,yTecho,3);
	
		 	    // techo lado
		 	    g2d.setColor(Color.decode("#8F2222"));
		 	    int xTecho2[] = {500,540,400};
		 	    int yTecho2[] = {260,240,200};
		 	    g2d.fillPolygon(xTecho2,yTecho2,3);
	
		 	    // chimenea
		 	    g2d.setColor(Color.decode("#3B3535"));
		 	    g2d.fillRect(450,210,25,50);
	
		 	    // puerta
		 	    g2d.setColor(Color.decode("#3D2217"));
		 	    g2d.fillRect(380,310,40,70);
	
		 	    // perilla
		 	    g2d.setColor(Color.BLACK);
		 	    g2d.fillOval(410,345,6,6);
	
		 	    // marco de la ventana
		 	    g2d.setColor(Color.decode("#3D2217"));
		 	    g2d.fillRect(325,285,50,50);

		 	    // vidrio
		 	    g2d.setColor(Color.WHITE);
		 	    g2d.fillRect(330,290,40,40);

		 	    // divisiones de la ventana
		 	    g2d.setColor(Color.decode("#3D2217"));
		 	    g2d.fillRect(348,290,4,40); 
		 	    g2d.fillRect(330,308,40,4); 
	
		 	    // tronco
		 	    g2d.setColor(Color.decode("#5A3A1B"));
		 	    g2d.fillRect(670,300,30,90);

		 	    // hojas
		 	    g2d.setColor(Color.decode("#245C1B"));
		 	    g2d.fillOval(610,230,100,80);
		 	    g2d.fillOval(650,220,100,90);
		 	    g2d.fillOval(630,190,110,90);
		 	    g2d.fillOval(670,240,90,80);
		 	    		 	    
		 	    // cerca
		 	    g2d.setColor(Color.decode("#9C4535"));
		 	    g2d.fillRect(0,380,800,15);
		 	    g2d.fillRect(0,410,800,15);
		 	   
		 	    // postes del cerco
		 	    g2d.setColor(Color.decode("#CA7363"));
		 	   
		 	    g2d.fillRect(40,370,15,70);
		 	    g2d.fillRect(120,370,15,70);
		 	    g2d.fillRect(200,370,15,70);
		 	    g2d.fillRect(280,370,15,70);
		 	    g2d.fillRect(360,370,15,70);
		 	    g2d.fillRect(440,370,15,70);
		 	    g2d.fillRect(520,370,15,70);
		 	    g2d.fillRect(600,370,15,70);
		 	    g2d.fillRect(680,370,15,70);
		 	    g2d.fillRect(760,370,15,70);
		         
		 	}
			
		};
		
		panel.setSize(800,500);
        panel.setLocation(0,0);
        this.add(panel);
        
	}
	
	public void router(String target) {

	    this.getContentPane().removeAll();

	    if(target.equals("login")) {
	        this.login();
	    }

	    if(target.equals("registro")) {
	        this.registro();
	    }

	    if(target.equals("recuperar")) {
	        this.recuperar();
	    }

	    if(target.equals("alta")) {
	        this.alta();
	    }

	    if(target.equals("baja")) {
	        this.baja();
	    }

	    if(target.equals("consultar")) {
	        this.consultar();
	    }

	    if(target.equals("crear")) {
	        this.crear();
	    }

	    if(target.equals("entrar")) {
	        this.entrar();
	    }

	    if(target.equals("olvide")) {
	        this.olvide();
	    }

	    this.setVisible(true);
	    this.repaint();
	    this.revalidate();
	}
	
	public void menu() {
		
		// Menu
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
		
		JMenu cuenta = new JMenu("Cuenta");

		JMenuItem irLogin = new JMenuItem("Login");
		JMenuItem irRegistro = new JMenuItem("Registro");
		JMenuItem recuperar = new JMenuItem("Recuperar cuenta");
		
		JMenu usuarios = new JMenu("Usuarios");

		JMenuItem alta = new JMenuItem("Alta");
		JMenuItem baja = new JMenuItem("Baja");
		JMenuItem consultar = new JMenuItem("Consultar");
		
		JMenu ayuda = new JMenu("Ayuda");

		JMenuItem crear = new JMenuItem("¿Como crear un usuario?");
		JMenuItem entrar = new JMenuItem("¿Como acceder al sistema?");
		JMenuItem olvide = new JMenuItem("¿Que pasa si olvide mi contraseña?");

		cuenta.add(irLogin);
		cuenta.add(irRegistro);
		cuenta.add(recuperar);
		
		usuarios.add(alta);
		usuarios.add(baja);
		usuarios.add(consultar);
		
		ayuda.add(crear);
		ayuda.add(entrar);
		ayuda.add(olvide);

		barra.add(cuenta);
		barra.add(usuarios);
		barra.add(ayuda);
		
		irLogin.addActionListener(e -> {
		    this.router("login");
		});
		
		irRegistro.addActionListener(e -> {
		    this.router("registro");
		});
		
		recuperar.addActionListener(e -> {
		    this.router("recuperar");
		});
		
		alta.addActionListener(e -> {
		    this.router("alta");
		});

		baja.addActionListener(e -> {
		    this.router("baja");
		});
		
		consultar.addActionListener(e -> {
		    this.router("consultar");
		});
		
		crear.addActionListener(e -> {
		    this.router("crear");
		});

		entrar.addActionListener(e -> {
		    this.router("entrar");
		});
		
		olvide.addActionListener(e -> {
		    this.router("olvide");
		});	
			
		JMenu submenu = new JMenu ("Otros");
		archivo.addSeparator();
		
		JMenuItem menuItem = new JMenuItem("Item de submenu");
		submenu.add(menuItem);
		
		menuItem = new JMenuItem("Otro item");
		submenu.add(menuItem);
		archivo.add(submenu);
		
		this.setJMenuBar(barra);
	}
	
	public void alta() {

	    JPanel contenedor = new JPanel();
	    contenedor.setBackground(Color.decode("#3CAB7E")); 
	    contenedor.setBounds(0,0,500,500);
	    contenedor.setLayout(null);
	    this.add(contenedor);

	    JLabel titulo = new JLabel("ALTA DE USUARIO");
	    titulo.setBounds(50,20,400,30);
	    titulo.setFont(new Font("Arial",Font.BOLD,26));
	    titulo.setHorizontalAlignment(JLabel.CENTER);
	    contenedor.add(titulo);

	    JLabel nombreLabel = new JLabel("Nombre:");
	    nombreLabel.setBounds(100,80,300,25);
	    contenedor.add(nombreLabel);

	    JTextField nombre = new JTextField();
	    nombre.setBounds(100,110,300,30);
	    contenedor.add(nombre);

	    JLabel correoLabel = new JLabel("Correo:");
	    correoLabel.setBounds(100,150,300,25);
	    contenedor.add(correoLabel);

	    JTextField correo = new JTextField();
	    correo.setBounds(100,180,300,30);
	    contenedor.add(correo);

	    JButton guardar = new JButton("Guardar");
	    guardar.setBounds(100,230,300,40);
	    contenedor.add(guardar);

	    JButton volver = new JButton("Volver");
	    volver.setBounds(100,290,300,40);
	    volver.setBackground(Color.black);	  
	    volver.setForeground(Color.white);	
	    contenedor.add(volver);

	    volver.addActionListener(e -> this.router("login"));

	    contenedor.repaint();
	    contenedor.revalidate();
	}
	
	public void baja() {

	    JPanel contenedor = new JPanel();
	    contenedor.setBackground(Color.decode("#DB5539")); 
	    contenedor.setBounds(0,0,500,500);
	    contenedor.setLayout(null);
	    this.add(contenedor);

	    JLabel titulo = new JLabel("BAJA DE USUARIO");
	    titulo.setBounds(50,20,400,30);
	    titulo.setFont(new Font("Arial",Font.BOLD,26));
	    titulo.setHorizontalAlignment(JLabel.CENTER);
	    contenedor.add(titulo);

	    JLabel seleccionar = new JLabel("Selecciona usuario:");
	    seleccionar.setBounds(100,80,300,25);
	    contenedor.add(seleccionar);

	    String[] usuarios = {"Diego121@gmail.com", "Ana341@gmail.com", "Luis163@gmail.com"};
	    JComboBox lista = new JComboBox(usuarios);
	    lista.setBounds(100,110,300,30);
	    contenedor.add(lista);

	    JButton eliminar = new JButton("Eliminar");
	    eliminar.setBounds(100,170,300,40);
	    contenedor.add(eliminar);

	    JButton volver = new JButton("Volver");
	    volver.setBounds(100,230,300,40);
	    volver.setBackground(Color.black);	  
	    volver.setForeground(Color.white);	
	    contenedor.add(volver);

	    volver.addActionListener(e -> this.router("login"));

	    contenedor.repaint();
	    contenedor.revalidate();
	}
	
	public void consultar() {

	    JPanel contenedor = new JPanel();
	    contenedor.setBackground(Color.decode("#478A29")); 
	    contenedor.setBounds(0,0,500,500);
	    contenedor.setLayout(null);
	    this.add(contenedor);

	    JLabel titulo = new JLabel("CONSULTAR USUARIOS");
	    titulo.setBounds(50,20,400,30);
	    titulo.setFont(new Font("Arial",Font.BOLD,24));
	    titulo.setHorizontalAlignment(JLabel.CENTER);
	    contenedor.add(titulo);

	    String[] columnas = {"Usuario", "Correo"};
	    String[][] datos = {
	        {"Diego123", "diego1@gmail.com"},
	        {"Ana456", "ana232@gmail.com"}
	    };

	    JTable tabla = new JTable(datos, columnas);
	    JScrollPane scroll = new JScrollPane(tabla);
	    scroll.setBounds(50,80,400,200);
	    contenedor.add(scroll);

	    JButton volver = new JButton("Volver");
	    volver.setBounds(100,320,300,40);
	    volver.setBackground(Color.black);	  
	    volver.setForeground(Color.white);	
	    contenedor.add(volver);

	    volver.addActionListener(e -> this.router("login"));

	    contenedor.repaint();
	    contenedor.revalidate();
	}
	
	public void crear() {

	    JPanel contenedor = new JPanel();
	    contenedor.setBackground(Color.decode("#1B6A82")); 
	    contenedor.setBounds(0,0,500,500);
	    contenedor.setLayout(null);
	    this.add(contenedor);

	    JLabel titulo = new JLabel("¿COMO CREAR UN USUARIO?");
	    titulo.setBounds(20,30,460,30);
	    titulo.setFont(new Font("Arial",Font.BOLD,22));
	    titulo.setHorizontalAlignment(JLabel.CENTER);
	    contenedor.add(titulo);

	    JTextArea texto = new JTextArea();
	    texto.setBounds(50,100,400,150);
	    texto.setText(
	        "Para crear un usuario:\n" +
	        "1. Ve al menu 'Cuenta' y selecciona 'Registro'.\n" +
	        "2. Ingresa un nombre de usuario valido.\n" +
	        "3. Escribe una contraseña segura.\n" +
	        "4. Completa los campos adicionales.\n" +
	        "5. Presiona el boton 'Crear cuenta'."
	    );
	    texto.setEditable(false);
	    contenedor.add(texto);

	    JButton volver = new JButton("Volver");
	    volver.setBounds(100,300,300,40);
	    volver.setBackground(Color.black);	  
	    volver.setForeground(Color.white);	
	    contenedor.add(volver);

	    volver.addActionListener(e -> this.router("login"));

	    contenedor.repaint();
	    contenedor.revalidate();
	}
	
	public void entrar() {

	    JPanel contenedor = new JPanel();
	    contenedor.setBackground(Color.decode("#CF382D")); 
	    contenedor.setBounds(0,0,500,500);
	    contenedor.setLayout(null);
	    this.add(contenedor);

	    JLabel titulo = new JLabel("¿COMO ACCEDER AL SISTEMA?");
	    titulo.setBounds(20,30,460,30);
	    titulo.setFont(new Font("Arial",Font.BOLD,22));
	    titulo.setHorizontalAlignment(JLabel.CENTER);
	    contenedor.add(titulo);

	    JTextArea texto = new JTextArea();
	    texto.setBounds(50,100,400,150);
	    texto.setText(
	        "Para acceder al sistema:\n" +
	        "1. Ve a la opcion 'Login'.\n" +
	        "2. Ingresa tu usuario.\n" +
	        "3. Ingresa tu contraseña.\n" +
	        "4. Presiona el boton 'Acceder'.\n" +
	        "Si los datos son correctos, podras entrar al sistema.\n"
	    );
	    texto.setEditable(false);
	    contenedor.add(texto);

	    JButton volver = new JButton("Volver");
	    volver.setBounds(100,300,300,40);
	    volver.setBackground(Color.black);	  
	    volver.setForeground(Color.white);	
	    contenedor.add(volver);

	    volver.addActionListener(e -> this.router("login"));

	    contenedor.repaint();
	    contenedor.revalidate();
	}
	
	public void olvide() {

	    JPanel contenedor = new JPanel();
	    contenedor.setBackground(Color.decode("#80389C")); 
	    contenedor.setBounds(0,0,500,500);
	    contenedor.setLayout(null);
	    this.add(contenedor);

	    JLabel titulo = new JLabel("¿OLVIDASTE TU CONTRASEÑA?");
	    titulo.setBounds(20,30,460,30);
	    titulo.setFont(new Font("Arial",Font.BOLD,22));
	    titulo.setHorizontalAlignment(JLabel.CENTER);
	    contenedor.add(titulo);

	    JTextArea texto = new JTextArea();
	    texto.setBounds(50,100,400,150);
	    texto.setText(
	        "Si olvidaste tu contraseña:\n" +
	        "1. Ve a 'Recuperar cuenta'.\n" +
	        "2. Ingresa tu correo electronico.\n" +
	        "3. Sigue las instrucciones.\n" +
	        "Recibiras indicaciones para restablecer tu contraseña.\n"
	    );
	    texto.setEditable(false);
	    contenedor.add(texto);

	    JButton volver = new JButton("Volver");
	    volver.setBounds(100,300,300,40);
	    volver.setBackground(Color.black);	  
	    volver.setForeground(Color.white);	
	    contenedor.add(volver);

	    volver.addActionListener(e -> this.router("login"));

	    contenedor.repaint();
	    contenedor.revalidate();
	}
	
	public void marioBros() {

	    JPanel panel = new JPanel() {
	        @Override
	        protected void paintComponent(Graphics g) {
	            super.paintComponent(g);

	            Graphics2D g2d = (Graphics2D) g;
	            
	            // cielo
	            g2d.setColor(Color.decode("#7ec0ee"));
	            g2d.fillRect(0, 0, 800, 500);

	            // tuberia
	            g2d.setColor(Color.decode("#00b300"));
	            g2d.fillRect(500,320,80,80);
	            g2d.setColor(Color.BLACK);
	            g2d.drawRect(500,320,80,80);

	            g2d.setColor(Color.decode("#009900"));
	            g2d.fillRect(480,300,120,30);
	            g2d.setColor(Color.BLACK);
	            g2d.drawRect(480,300,120,30);

	            // bloque rosa
	            g2d.setColor(Color.decode("#ff9966"));
	            g2d.fillRect(250,250,80,80);

	            g2d.setColor(Color.BLACK);
	            g2d.drawRect(250,250,80,80);

	            // tornillos
	            g2d.fillRect(255,255,5,5);
	            g2d.fillRect(320,255,5,5);
	            g2d.fillRect(255,320,5,5);
	            g2d.fillRect(320,320,5,5);
	            
	            // bloque azul
	            g2d.setColor(Color.decode("#66a3ff"));
	            g2d.fillRect(330,200,80,130);

	            g2d.setColor(Color.BLACK);
	            g2d.drawRect(330,200,80,130);

	            // tornillos
	            g2d.fillRect(335,205,5,5);
	            g2d.fillRect(400,205,5,5);
	            g2d.fillRect(335,320,5,5);
	            g2d.fillRect(400,320,5,5);

	            // bloques pequeños
	            g2d.setColor(Color.decode("#ff9966"));
	            g2d.fillRect(100,200,40,40);
	            g2d.fillRect(650,200,40,40);
	            g2d.fillRect(200,100,40,40);
	            g2d.fillRect(240,100,40,40);

	            g2d.setColor(Color.BLACK);
	            g2d.drawRect(100,200,40,40);
	            g2d.drawRect(650,200,40,40);
	            g2d.drawRect(200,100,40,40);
	            g2d.drawRect(240,100,40,40);

	            // bloque premio
	            g2d.setColor(Color.decode("#ffcc00"));
	            g2d.fillRect(280,100,40,40);

	            g2d.setColor(Color.BLACK);
	            g2d.drawRect(280,100,40,40);
	            g2d.drawString("?", 295,125);

	            // bloque verde
	            g2d.setColor(Color.decode("#009900"));
	            g2d.fillRect(650,300,120,100);
	            g2d.setColor(Color.BLACK);
	            g2d.drawRect(650,300,120,100);

	            // arbusto
	            g2d.setColor(Color.decode("#006600"));
	            g2d.fillOval(50,330,80,50);
	            g2d.fillOval(80,320,80,60);
	            g2d.fillOval(65,360,80,50);

	            // nube
	            g2d.setColor(Color.WHITE);
	            g2d.fillOval(100,50,50,30);
	            g2d.fillOval(130,40,60,40);
	            g2d.fillOval(170,50,50,30);
	            
	            // nube2
	            g2d.setColor(Color.WHITE);
	            g2d.fillOval(350,50,50,30);
	            g2d.fillOval(380,40,60,40);
	            g2d.fillOval(420,50,50,30);
	            
	            // nube3
	            g2d.setColor(Color.WHITE);
	            g2d.fillOval(600,50,50,30);
	            g2d.fillOval(630,40,60,40);
	            g2d.fillOval(670,50,50,30);
	            
	            // suelo
		        g2d.setColor(Color.decode("#8B4513"));
		        g2d.fillRect(0, 400, 800, 100);

		        // lineas
		        g2d.setColor(Color.BLACK);
		        g2d.drawLine(40,400,40,500);
		        g2d.drawLine(80,400,80,500);
		        g2d.drawLine(120,400,120,500);
		        g2d.drawLine(160,400,160,500);
		        g2d.drawLine(200,400,200,500);
		        g2d.drawLine(240,400,240,500);
		        g2d.drawLine(280,400,280,500);
		        g2d.drawLine(320,400,320,500);
		        g2d.drawLine(360,400,360,500);
		        g2d.drawLine(400,400,400,500);
		        g2d.drawLine(440,400,440,500);
		        g2d.drawLine(480,400,480,500);
		        g2d.drawLine(520,400,520,500);
		        g2d.drawLine(560,400,560,500);
		        g2d.drawLine(600,400,600,500);
		        g2d.drawLine(640,400,640,500);
		        g2d.drawLine(680,400,680,500);
		        g2d.drawLine(720,400,720,500);
		        g2d.drawLine(760,400,760,500);
	
		        g2d.drawLine(0, 440, 800, 440);
	            
	            // borde suelo
	            g2d.setColor(Color.BLACK);
	            g2d.drawRect(0,400,800,80);

	        }
	    };

	    panel.setSize(800,500);
	    panel.setLocation(0,0);
	    this.add(panel);
	}
	
	public void examen2() {

	    setTitle("Factura en Java");
	    setSize(500, 600);
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setLayout(new BorderLayout());

	    getContentPane().setBackground(Color.decode("#EAF4FF"));

	    JLabel titulo = new JLabel("Factura en Java - ArrayList y POO");
	    titulo.setOpaque(true);
	    titulo.setBackground(Color.decode("#64B5F6"));
	    titulo.setForeground(Color.WHITE);
	    titulo.setFont(new Font("Arial", Font.BOLD, 18));
	    titulo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	    add(titulo, BorderLayout.NORTH);

	    JPanel centro = new JPanel(new BorderLayout());
	    centro.setBackground(Color.decode("#EAF4FF"));

	    JPanel cliente = new JPanel(new GridLayout(2, 4, 5, 5));
	    cliente.setBorder(BorderFactory.createTitledBorder("Datos del cliente"));
	    cliente.setBackground(Color.decode("#EAF4FF"));

	    cliente.add(new JLabel("Documento:")).setFont(new Font("Arial", Font.PLAIN, 13));
	    cliente.add(new JTextField());

	    cliente.add(new JLabel("Nombres:")).setFont(new Font("Arial", Font.PLAIN, 13));
	    cliente.add(new JTextField());

	    cliente.add(new JLabel("Direccion:")).setFont(new Font("Arial", Font.PLAIN, 13));
	    cliente.add(new JTextField());

	    cliente.add(new JLabel("Telefono:")).setFont(new Font("Arial", Font.PLAIN, 13));
	    cliente.add(new JTextField());

	    JPanel factura = new JPanel(new GridLayout(1, 4, 5, 5));
	    factura.setBorder(BorderFactory.createTitledBorder("Datos de factura"));
	    factura.setBackground(Color.decode("#EAF4FF"));

	    factura.add(new JLabel("No. Factura:")).setFont(new Font("Arial", Font.PLAIN, 13));
	    factura.add(new JLabel("1"));

	    factura.add(new JLabel("Fecha:")).setFont(new Font("Arial", Font.PLAIN, 13));
	    factura.add(new JLabel("2021/05/21"));

	    JPanel botones = new JPanel(new FlowLayout(FlowLayout.CENTER));
	    botones.setBackground(Color.decode("#EAF4FF"));

	    JButton ver = new JButton("Ver listado");
	    JButton añadir = new JButton("Añadir");
	    JButton eliminar = new JButton("Eliminar");

	    ver.setPreferredSize(new Dimension(145, 35));
	    añadir.setPreferredSize(new Dimension(145, 35));
	    eliminar.setPreferredSize(new Dimension(145, 35));

	    ver.setBackground(Color.decode("#64B5F6"));
	    añadir.setBackground(Color.decode("#64B5F6"));
	    eliminar.setBackground(Color.decode("#64B5F6"));

	    ver.setForeground(Color.WHITE);
	    añadir.setForeground(Color.WHITE);
	    eliminar.setForeground(Color.WHITE);

	    ver.setFont(new Font("Arial", Font.BOLD, 13));
	    añadir.setFont(new Font("Arial", Font.BOLD, 13));
	    eliminar.setFont(new Font("Arial", Font.BOLD, 13));

	    botones.add(ver);
	    botones.add(añadir);
	    botones.add(eliminar);

	    String[] columnas = {"Producto", "Cantidad", "Valor", "SubTotal"};

	    String[][] datos = {
	            {"Agua", "2", "500.00", "1000.00"},
	            {"Cereal", "5", "1000.00", "5000.00"},
	            {"Leche", "2", "300.00", "600.00"}
	    };

	    JTable tabla = new JTable(datos, columnas);
	    tabla.setFont(new Font("Arial", Font.PLAIN, 13));
	    tabla.setRowHeight(22);
	    tabla.setBackground(Color.WHITE);
	    tabla.setSelectionBackground(Color.decode("#BBDEFB"));

	    JScrollPane scroll = new JScrollPane(tabla);
	    scroll.setBorder(BorderFactory.createTitledBorder("Productos"));
	    scroll.setPreferredSize(new Dimension(450, 200));

	    JPanel totales = new JPanel(new GridLayout(4, 2, 5, 5));
	    totales.setBorder(BorderFactory.createTitledBorder("Totales"));
	    totales.setBackground(Color.decode("#EAF4FF"));

	    totales.add(new JLabel("Subtotal:")).setFont(new Font("Arial", Font.PLAIN, 13));
	    totales.add(new JLabel("6600.00"));

	    totales.add(new JLabel("% Descuento:")).setFont(new Font("Arial", Font.PLAIN, 13));
	    totales.add(new JTextField("5.00"));

	    totales.add(new JLabel("IVA 19%:")).setFont(new Font("Arial", Font.PLAIN, 13));
	    totales.add(new JLabel("1254.00"));

	    totales.add(new JLabel("Total:")).setFont(new Font("Arial", Font.PLAIN, 13));
	    totales.add(new JLabel("7524.00"));

	    JPanel arriba = new JPanel(new GridLayout(3, 1, 10, 10));
	    arriba.setBackground(Color.decode("#EAF4FF"));
	    arriba.add(cliente);
	    arriba.add(factura);
	    arriba.add(botones);

	    JPanel panelPrincipal = new JPanel(new BorderLayout(10, 10));
	    panelPrincipal.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	    panelPrincipal.setBackground(Color.decode("#EAF4FF"));

	    panelPrincipal.add(arriba, BorderLayout.NORTH);
	    panelPrincipal.add(scroll, BorderLayout.CENTER);
	    panelPrincipal.add(totales, BorderLayout.SOUTH);

	    centro.add(panelPrincipal, BorderLayout.CENTER);

	    add(centro, BorderLayout.CENTER);

	    JPanel acciones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	    acciones.setBackground(Color.decode("#64B5F6"));

	    JButton finalizar = new JButton("Finalizar factura");
	    JButton limpiar = new JButton("Limpiar");

	    finalizar.setBackground(Color.decode("#143D63"));
	    finalizar.setForeground(Color.WHITE);
	    finalizar.setFont(new Font("Arial", Font.BOLD, 13));

	    limpiar.setBackground(Color.decode("#143D63"));
	    limpiar.setForeground(Color.WHITE);
	    limpiar.setFont(new Font("Arial", Font.BOLD, 13));

	    acciones.add(finalizar);
	    acciones.add(limpiar);

	    add(acciones, BorderLayout.SOUTH);
	    
	}
	
	public void tiktaktoe() {

		JPanel panel = new JPanel();
	    panel.setBounds(0, 70, 600, 450); 
	    panel.setLayout(new GridLayout(3, 3, 5, 5));
	    panel.setBackground(Color.decode("#B541D1"));
	    this.add(panel);

	    Font fuente = new Font("Arial", Font.BOLD, 100);

	    Border borde = BorderFactory.createLineBorder(Color.WHITE, 4);

	    for (int i = 0; i < 3; i++) {
	        for (int j = 0; j < 3; j++) {

	            BotonGato boton = new BotonGato(i, j);
	            boton.setFont(fuente);
	            boton.setBackground(Color.BLACK);
	            boton.setForeground(Color.WHITE);
	            boton.setBorder(borde);
	            boton.setFocusPainted(false);

	            boton.addActionListener(e -> jugar(boton));

	            tablero[i][j] = boton;
	            panel.add(boton);
	        }
	    }

	    this.setLayout(null);

	    marcadorX = new JLabel("Jugador X: 0");
	    marcadorX.setBounds(200, 20, 150, 30);
	    marcadorX.setFont(new Font("Arial", Font.BOLD, 18));
	    marcadorX.setForeground(Color.BLACK);
	    this.add(marcadorX);

	    marcadorO = new JLabel("Jugador O: 0");
	    marcadorO.setBounds(400, 20, 150, 30);
	    marcadorO.setFont(new Font("Arial", Font.BOLD, 18));
	    marcadorO.setForeground(Color.BLACK);
	    this.add(marcadorO);

	    JButton reiniciar = new JButton("Reiniciar");
	    reiniciar.setBounds(20, 20, 150, 40);
	    reiniciar.setBackground(Color.BLACK);
	    reiniciar.setForeground(Color.WHITE);
	    reiniciar.setFocusPainted(false);

	    reiniciar.addActionListener(e -> reiniciarJuego());

	    this.add(reiniciar);

	    this.repaint();
	}
	
	public void jugar(BotonGato boton) {

	    if (!boton.valor.equals("")) {
	    	return;
	    }

	    boton.setText(turno);
	    boton.valor = turno;

	    if (turno.equals("X")) {
	        boton.setForeground(Color.CYAN);
	    } 
	    else {
	        boton.setForeground(Color.RED);
	    }

	    if (verificarGanador()) {
	        JOptionPane.showMessageDialog(null, "Gano " + turno);

	        if (turno.equals("X")) {
	            puntosX++;
	            marcadorX.setText("Jugador X: " + puntosX);
	        } 
	        else {
	            puntosO++;
	            marcadorO.setText("Jugador O: " + puntosO);
	        }

	        reiniciarTablero();
	        return;
	    }

	    if (empate()) {
	        JOptionPane.showMessageDialog(null, "Empate");
	        reiniciarTablero();
	        return;
	    }

	    turno = turno.equals("X") ? "O" : "X";
	}
	
	public boolean verificarGanador() {

	    // Filas y columnas
	    for (int i = 0; i < 3; i++) {
	        if (!tablero[i][0].valor.equals("") &&
	            tablero[i][0].valor.equals(tablero[i][1].valor) &&
	            tablero[i][1].valor.equals(tablero[i][2].valor)) {
	            return true;
	        }

	        if (!tablero[0][i].valor.equals("") &&
	            tablero[0][i].valor.equals(tablero[1][i].valor) &&
	            tablero[1][i].valor.equals(tablero[2][i].valor)) {
	            return true;
	        }
	    }

	    // Diagonales
	    if (!tablero[0][0].valor.equals("") &&
	        tablero[0][0].valor.equals(tablero[1][1].valor) &&
	        tablero[1][1].valor.equals(tablero[2][2].valor)) {
	        return true;
	    }

	    if (!tablero[0][2].valor.equals("") &&
	        tablero[0][2].valor.equals(tablero[1][1].valor) &&
	        tablero[1][1].valor.equals(tablero[2][0].valor)) {
	        return true;
	    }

	    return false;
	}
	
	public boolean empate() {
	    for (int i = 0; i < 3; i++) {
	        for (int j = 0; j < 3; j++) {
	            if (tablero[i][j].valor.equals("")) {
	                return false;
	            }
	        }
	    }
	    return true;
	}
	
	public void reiniciarTablero() {
	    for (int i = 0; i < 3; i++) {
	        for (int j = 0; j < 3; j++) {
	            tablero[i][j].setText("");
	            tablero[i][j].valor = "";
	        }
	    }
	    turno = "X";
	}

	public void reiniciarJuego() {
	    reiniciarTablero();
	    puntosX = 0;
	    puntosO = 0;
	    marcadorX.setText("Jugador X: 0");
	    marcadorO.setText("Jugador O: 0");
	}
	
	BotonGato[][] tablero = new BotonGato[3][3];
	String turno = "X";

	int puntosX = 0;
	int puntosO = 0;

	JLabel marcadorX, marcadorO;
	
}
