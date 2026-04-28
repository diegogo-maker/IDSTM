package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class authView {
	
	public void loginView() {	
		
		JFrame ventana = new JFrame();
		
		ventana.setSize(1000,535);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setMinimumSize(new Dimension(200,200));
		ventana.setMaximumSize(new Dimension(800,800));
		ventana.setTitle("Login y registro");
		ventana.setLocation(200,25);
		ventana.setResizable(false);
		ventana.setLayout(null);
		
		// ===== PANEL LOGIN =====
		JPanel contenedor = new JPanel();
		contenedor.setBackground(Color.gray); 
		contenedor.setBounds(0,0,500,500);
		contenedor.setLayout(null);
		ventana.add(contenedor);


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
			//ventana.router("registro");
			ventana.dispose();
			registerView();
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
			//ventana.router("recuperar");
			ventana.dispose();
			//registerView();
		});

		contenedor.repaint();
		contenedor.revalidate();
		
		ventana.setVisible(true);
	}
	
	public void registerView() {
		
		JFrame ventana = new JFrame();
		
		ventana.setSize(1000,535);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setMinimumSize(new Dimension(200,200));
		ventana.setMaximumSize(new Dimension(800,800));
		ventana.setTitle("Juego del Gato X vs O");
		ventana.setLocation(200,25);
		ventana.setResizable(false);
		ventana.setLayout(null);
		
		//contenedor para el registro
		JPanel register_container = new JPanel();
		register_container.setSize(500,500);
		register_container.setLocation(500,0);
		register_container.setOpaque(true);
		register_container.setBackground(Color.decode("#63A8C7"));
		register_container.setLayout(null);
		ventana.add(register_container);
		
		
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
		    //this.router("login");
			ventana.dispose();
			loginView();
		});
		
		register_container.repaint();
		
		ventana.setVisible(true);
	}
}
