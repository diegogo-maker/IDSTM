package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controllers.UsersController;
import controllers.authControllers;
import models.User;

public class UsersView {

	public UsersView() {
		
	}
	
	public void tableUsers(ArrayList<User> data_users) {

		JFrame ventana = new JFrame();

		ventana.setSize(900, 535);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setMinimumSize(new Dimension(200, 200));
		ventana.setMaximumSize(new Dimension(1000, 800));
		ventana.setTitle("Usuarios");
		ventana.setResizable(false);
		ventana.setLayout(null);

		JPanel users = new JPanel();
		users.setBounds(0, 0, 900, 535);
		users.setBackground(Color.decode("#63A8C7"));
		users.setLayout(null);
		ventana.add(users);

		JLabel users_title = new JLabel("USUARIOS");
		users_title.setBounds(350, 30, 200, 40);
		users_title.setOpaque(true);
		users_title.setFont(new Font("Arial", Font.BOLD, 22));
		users_title.setHorizontalAlignment(JLabel.CENTER);
		users_title.setBackground(Color.WHITE);
		users_title.setForeground(Color.BLUE);
		users.add(users_title);

		JButton export = new JButton("EXPORTAR");
		export.setBounds(30, 100, 120, 40);
		users.add(export);

		JButton add = new JButton("AÑADIR");
		add.setBounds(160, 100, 120, 40);
		users.add(add);
		
		add.addActionListener(e ->{
			ventana.dispose();
			addUsersFrom();
		});

		Object[] table_head = {
				"ID",
				"NOMBRE",
				"APELLIDO",
				"CORREO",
				"TELÉFONO"
		};

		DefaultTableModel model = new DefaultTableModel(table_head, 0);

		for (User user : data_users) {

			Object[] row = {
				user.getId(),
				user.getName(),
				user.getLastname(),
				user.getEmail(),
				user.getPhone()
			};
			
			model.addRow(row);
		}

		JTable users_table = new JTable(model);

		JScrollPane scrollpane = new JScrollPane(users_table);
		scrollpane.setBounds(30, 170, 820, 250);

		users.add(scrollpane);

		ventana.setVisible(true);
	}
	
	public void addUsersFrom() {

	    JFrame ventana = new JFrame();

	    UsersController controller = new UsersController();

	    ventana.setSize(900, 535);
	    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ventana.setLocationRelativeTo(null);
	    ventana.setMinimumSize(new Dimension(200, 200));
	    ventana.setMaximumSize(new Dimension(1000, 800));
	    ventana.setTitle("Usuarios");
	    ventana.setResizable(false);
	    ventana.setLayout(null);

	    JPanel users = new JPanel();
	    users.setBounds(0, 0, 900, 535);
	    users.setBackground(Color.decode("#63A8C7"));
	    users.setLayout(null);
	    ventana.add(users);

	    JLabel users_title = new JLabel("USUARIOS");
	    users_title.setBounds(350, 30, 200, 40);
	    users_title.setOpaque(true);
	    users_title.setFont(new Font("Arial", Font.BOLD, 22));
	    users_title.setHorizontalAlignment(JLabel.CENTER);
	    users_title.setBackground(Color.WHITE);
	    users_title.setForeground(Color.BLUE);
	    users.add(users_title);

	    JButton regresar = new JButton("REGRESAR");
	    regresar.setBounds(30, 100, 120, 40);
	    users.add(regresar);

	    regresar.addActionListener(e -> {

	        ventana.dispose();
	       
	        controller.showUsers();
	    });

	    JButton add = new JButton("AÑADIR");
	    add.setBounds(160, 100, 120, 40);
	    add.setFocusPainted(false);
	    users.add(add);

	    add.addActionListener(e -> {

	        JFrame form = new JFrame();

	        form.setSize(450, 560);
	        form.setLocationRelativeTo(null);
	        form.setLayout(null);
	        form.setResizable(false);
	        form.setTitle("Agregar Usuario");

	        JPanel panel = new JPanel();
	        panel.setBounds(0, 0, 450, 560);
	        panel.setLayout(null);
	        panel.setBackground(Color.WHITE);
	        form.add(panel);

	        JLabel title = new JLabel("NUEVO USUARIO");
	        title.setBounds(110, 20, 220, 40);
	        title.setFont(new Font("Arial", Font.BOLD, 22));
	        title.setHorizontalAlignment(JLabel.CENTER);
	        panel.add(title);

	        JLabel emailLabel = new JLabel("EMAIL");
	        emailLabel.setBounds(50, 90, 100, 25);
	        panel.add(emailLabel);

	        JTextField email = new JTextField();
	        email.setBounds(50, 115, 330, 35);
	        panel.add(email);

	        JLabel passwordLabel = new JLabel("PASSWORD");
	        passwordLabel.setBounds(50, 160, 100, 25);
	        panel.add(passwordLabel);

	        JPasswordField password = new JPasswordField();
	        password.setBounds(50, 185, 330, 35);
	        panel.add(password);

	        JLabel nameLabel = new JLabel("Apellido");
	        nameLabel.setBounds(50, 230, 100, 25);
	        panel.add(nameLabel);

	        JTextField name = new JTextField();
	        name.setBounds(50, 255, 330, 35);
	        panel.add(name);

	        JLabel lastnameLabel = new JLabel("Nombre");
	        lastnameLabel.setBounds(50, 300, 100, 25);
	        panel.add(lastnameLabel);

	        JTextField lastname = new JTextField();
	        lastname.setBounds(50, 325, 330, 35);
	        panel.add(lastname);

	        JLabel phoneLabel = new JLabel("TELEFONO");
	        phoneLabel.setBounds(50, 370, 100, 25);
	        panel.add(phoneLabel);

	        JTextField phone = new JTextField();
	        phone.setBounds(50, 395, 330, 35);
	        panel.add(phone);

	        JButton guardar = new JButton("GUARDAR");
	        guardar.setBounds(70, 460, 130, 40);
	        guardar.setBackground(Color.decode("#4CAF50"));
	        guardar.setForeground(Color.WHITE);

	        JButton cancelar = new JButton("CANCELAR");
	        cancelar.setBounds(220, 460, 130, 40);
	        cancelar.setBackground(Color.RED);
	        cancelar.setForeground(Color.WHITE);

	        cancelar.addActionListener(c -> {
	            form.dispose();
	        });

	        guardar.addActionListener(a -> {

	            String e_mail = email.getText();
	            String pass = String.valueOf(password.getPassword());
	            String nombre = name.getText();
	            String apellido = lastname.getText();
	            String telefono = phone.getText();

	            if (
	                e_mail.isEmpty() ||
	                pass.isEmpty() ||
	                nombre.isEmpty() ||
	                apellido.isEmpty() ||
	                telefono.isEmpty()
	            ) {

	                JOptionPane.showMessageDialog(null,"Completa todos los campos");
	                return;
	            }

	            boolean result = controller.addUser(
	                e_mail,
	                pass,
	                nombre,
	                apellido,
	                telefono
	            );

	            if (result) {

	                JOptionPane.showMessageDialog(null,"Usuario agregado correctamente");
	                form.dispose();
	                ventana.dispose();
	                controller.showUsers();

	            } 
	            else {

	                JOptionPane.showMessageDialog(null,"Error al agregar usuario");
	            }
	        });

	        panel.add(guardar);
	        panel.add(cancelar);
	        form.setVisible(true);

	    });

	    ventana.setVisible(true);
	}
}