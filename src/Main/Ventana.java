package Main;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;


public class Ventana extends JFrame{
	
	public Ventana(){
		
		//configuracion de ventana
		
		this.setSize(1000,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(200,200));
		this.setMaximumSize(new Dimension(800,800));
		this.setTitle("LOGIN");
		this.setLocation(200,100);
		this.setResizable(false);
		this.setLayout(null);
		
		// ICONO DE LA VENTANA
		ImageIcon icono = new ImageIcon(getClass().getResource("/Main/Imagenes/logoventana.png"));
		Image img = icono.getImage();
		Image imgEscalada = img.getScaledInstance(64,64,Image.SCALE_SMOOTH);
		this.setIconImage(imgEscalada);
		
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
		
		JMenu submenu = new JMenu ("Otros");
		archivo.addSeparator();
		
		JMenuItem menuItem = new JMenuItem("Item de submenu");
		submenu.add(menuItem);
		
		menuItem = new JMenuItem("Otro item");
		submenu.add(menuItem);
		archivo.add(submenu);
		
		this.setJMenuBar(barra);
		
		//this.login();
		this.pintar();
		
		this.setVisible(true);
		
	}	
	
	public void login() {	
		
		// ===== PANEL LOGIN =====
		JPanel contenedor = new JPanel();
		contenedor.setBackground(Color.decode("#F5F5F5")); 
		contenedor.setBounds(500,0,500,500);
		contenedor.setLayout(null);
		this.add(contenedor);


		// ===== IMAGEN DE FONDO =====
		ImageIcon fondoImg = new ImageIcon(getClass().getResource("/Main/Imagenes/oso.jpeg"));
		Image imgFondo = fondoImg.getImage();
		Image imgFondoEscalada = imgFondo.getScaledInstance(500,500,Image.SCALE_SMOOTH);
		ImageIcon fondoEscalado = new ImageIcon(imgFondoEscalada);

		JLabel fondo = new JLabel(fondoEscalado);
		fondo.setBounds(0,0,500,500);
		this.add(fondo);


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
		olvidar.setForeground(Color.decode("#666666"));
		olvidar.setFont(new Font("Arial", Font.BOLD,13));
		contenedor.add(olvidar);


		// ===== BOTON =====
		JButton acceder = new JButton("ACCEDER");
		acceder.setBounds(170,330,160,55);
		acceder.setBackground(Color.decode("#2F2F2F"));
		acceder.setForeground(Color.WHITE);
		acceder.setFont(new Font("Arial",Font.BOLD,16));
		acceder.setFocusPainted(false);
		acceder.setBorder(BorderFactory.createLineBorder(Color.decode("#2F2F2F")));
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
}
