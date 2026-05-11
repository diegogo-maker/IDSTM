package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import models.User;

public class UsersView {

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
}