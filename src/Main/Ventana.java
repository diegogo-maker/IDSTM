package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ventana extends JFrame{
	
	public Ventana(){
		
		this.setVisible(true);
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//ventana.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(200,200));
		this.setMaximumSize(new Dimension(800,800));
		this.setTitle("HOLA");
		//this.setBackground(Color.BLACK);
		this.setLocation(200,200);
		this.setLayout(null);
		
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.black);
		contenedor.setSize(500,500);
		contenedor.setLocation(50,50);
		contenedor.setLayout(null);
		this.add(contenedor);
		
		JLabel title_login = new JLabel();
		title_login.setText("BIENVENIDO");
		title_login.setSize(200,30);
		title_login.setOpaque(true);
		title_login.setLocation(150,10);
		title_login.setBackground(Color.white);
		title_login.setFont(new Font("Arial",Font.BOLD,22));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);
		
		JTextField username = new JTextField();
		username.setSize(300,30);
		username.setLocation(30,150);
		username.setFont(new Font("Arial",Font.BOLD,22));
		contenedor.add(username);
		
		JButton acceder = new JButton ();
		acceder.setText("Acceder");
		acceder.setLocation(200,400);
		acceder.setSize(120,50);
		acceder.setFont(new Font("Arial",Font.BOLD,22));
		contenedor.add(acceder);
		
		contenedor.repaint();
		contenedor.revalidate();
		
	}

}
