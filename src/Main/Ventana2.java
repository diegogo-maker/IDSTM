package Main;

import java.awt.*;
import javax.swing.*;

public class Ventana2 {

    private JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Ventana2 window = new Ventana2();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Ventana2() {
        initialize();
    }

    private void initialize() {

        frame = new JFrame("Registro de usuario");
        frame.setBounds(100, 100, 800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new GridLayout(2,2,10,10)); 

        // panel 1
        JPanel panelDatos = new JPanel();
        panelDatos.setBackground(new Color(109, 135, 239));
        panelDatos.setBorder(BorderFactory.createTitledBorder("Datos generales"));
        panelDatos.setLayout(new GridLayout(6,2,5,5));

        JLabel label = new JLabel("Nombre:");
        panelDatos.add(label);
        panelDatos.add(new JTextField());

        panelDatos.add(new JLabel("Primer apellido:"));
        panelDatos.add(new JTextField());

        panelDatos.add(new JLabel("Segundo apellido:"));
        panelDatos.add(new JTextField());

        panelDatos.add(new JLabel("Fecha de nacimiento:"));
        panelDatos.add(new JTextField());

        panelDatos.add(new JLabel("Genero:"));
        JPanel sexoPanel = new JPanel(new FlowLayout());
        JRadioButton masc = new JRadioButton("Masculino");
        JRadioButton fem = new JRadioButton("Femenino");
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(masc);
        grupo.add(fem);
        sexoPanel.add(masc);
        sexoPanel.add(fem);
        panelDatos.add(sexoPanel);

        panelDatos.add(new JLabel("Pais:"));
        panelDatos.add(new JComboBox<>(new String[]{"Mexico","Estados unidos","Canada"}));

        // panel 2
        JPanel panelPerfil = new JPanel();
        panelPerfil.setBackground(new Color(237, 101, 248));
        panelPerfil.setBorder(BorderFactory.createTitledBorder("Perfil del usuario"));
        panelPerfil.setLayout(new BorderLayout());

        ImageIcon icono = new ImageIcon(getClass().getResource("/Main/Imagenes/identidad.png"));
        Image imagen = icono.getImage();
        Image imagenEscalada = imagen.getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);

        JLabel foto = new JLabel(iconoEscalado);
        foto.setHorizontalAlignment(JLabel.CENTER);

        panelPerfil.add(foto, BorderLayout.CENTER);
        
        JPanel opciones = new JPanel(new GridLayout(2,1));
        opciones.add(new JCheckBox("Mostrar foto"));
        opciones.add(new JCheckBox("Mostrar fecha de nacimiento"));

        panelPerfil.add(opciones, BorderLayout.SOUTH);

        // panel 3
        JPanel panelOpcional = new JPanel();
        panelOpcional.setBackground(new Color(227, 91, 247));
        panelOpcional.setBorder(BorderFactory.createTitledBorder("Datos opcionales"));
        panelOpcional.setLayout(new GridLayout(1,2));

        JTextArea descripcion = new JTextArea("Descripcion:");
        JScrollPane scroll1 = new JScrollPane(descripcion);

        JList<String> lista = new JList<>(new String[]{
                "Cantar","Escuchar musica","Deportes","Ver peliculas"
                ,"Salir a fiestas","Estudiar","Otros"
        });
        
        JScrollPane scroll2 = new JScrollPane(lista);

        panelOpcional.add(scroll1);
        panelOpcional.add(scroll2);

        // panel 4
        JPanel panelBotones = new JPanel();
        panelBotones.setBackground(new Color(109, 135, 239));
        panelBotones.setBorder(BorderFactory.createTitledBorder("Acciones"));
        panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));

        JButton btnNuevo = new JButton("Nuevo");
        JButton btnGuardar = new JButton("Guardar");
        JButton btnSalir = new JButton("Salir");
  
        Dimension tamaño = new Dimension(120, 40);
        btnNuevo.setPreferredSize(tamaño);
        btnGuardar.setPreferredSize(tamaño);
        btnSalir.setPreferredSize(tamaño);

        panelBotones.add(btnNuevo);
        panelBotones.add(btnGuardar);
        panelBotones.add(btnSalir);

        frame.getContentPane().add(panelDatos);
        frame.getContentPane().add(panelPerfil);
        frame.getContentPane().add(panelOpcional);
        frame.getContentPane().add(panelBotones);
    }
}
