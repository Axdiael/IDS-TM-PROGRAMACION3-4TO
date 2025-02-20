package Ventana;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.color.*;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;

public class Ventana extends JFrame{
	
	Font texto = new Font("Andale Mono", Font.BOLD, 22);
	Font texto2 = new Font("Andale Mono", Font.BOLD, 18);
	Font texto3 = new Font("Andale Mono", Font.BOLD, 14);
	
	public Ventana(String title) {
		//Pone el titulo
		this.setTitle(title);
		//hace visible la ventana
		//this.setVisible(true);
		this.setSize(1000, 700);
		//Sirve para ajustar el tamaño de la ventana
		this.setResizable(true);
		//Elimina el formato predeterminado de la ventana (ayuda a que funcionen las otras modificaciones)
		this.setLayout(null);
		//que pasa cuando cierro mi aplicación
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Sobre que elemento colocare el item
		this.setLocationRelativeTo(null);
		
		this.getContentPane().setBackground(Color.decode("#5A5A5A"));
		
		//TITULO ACCEDER 
		
		JLabel etiqueta1 = new JLabel ("inicio de sesión");
		
		etiqueta1.setSize(200, 50);
		etiqueta1.setLocation(155, 50);
		etiqueta1.setBackground(Color.gray);
		etiqueta1.setOpaque(true);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(texto);
		this.add(etiqueta1);
		
		// Etiqueta para Usuario
        JLabel usuarioLabel = new JLabel("USUARIO:");
        usuarioLabel.setBounds(50, 100, 150, 30);
        usuarioLabel.setFont(texto2);
        usuarioLabel.setForeground(Color.WHITE);
        this.add(usuarioLabel);
        
        //Campo de texto
        
        JTextField usuarioField = new JTextField();
        usuarioField.setBounds(50, 140, 150, 30);
        usuarioField.setFont(texto2);
        usuarioField.setBackground(Color.WHITE);
        //usuarioField.setVisible(true);
        //usuarioField.setOpaque(true);
        //usuarioField.setHorizontalAlignment(JLabel.CENTER);
        this.add(usuarioField);
        
        //CONTRASEÑA
        
        JLabel contraseñaLabel = new JLabel("Contraseña:");
        contraseñaLabel.setBounds(50, 190, 150, 30);
        contraseñaLabel.setForeground(Color.WHITE);
        contraseñaLabel.setFont(texto2);
        //contraseñaLabel.setVisible(true);
       // contraseñaLabel.setOpaque(true);
        this.add(contraseñaLabel);
        
        JPasswordField contraseñaField = new JPasswordField(); 
        contraseñaField.setBounds(50, 230, 150, 30);
        contraseñaField.setForeground(Color.BLACK);
        /*contraseñaField.setVisible(true);
        contraseñaField.setOpaque(true);
        contraseñaField.setHorizontalAlignment(JLabel.CENTER);*/
        contraseñaField.setFont(texto2);
        this.add(contraseñaField);
        
        //Recordarme
        
        JCheckBox recordarCheck = new JCheckBox("Recordarme");
        recordarCheck.setBounds(50, 280, 150, 30);
        recordarCheck.setForeground(Color.WHITE);
        recordarCheck.setBackground(Color.decode("#5A5A5A"));
        recordarCheck.setFont(texto3);
        this.add(recordarCheck);
        
        //¿Olvidó su contraseña?
        
        JLabel olvidasteLabel = new JLabel("¿Olvidó su contraseña?");
        olvidasteLabel.setBounds(200, 280, 180, 30);
        olvidasteLabel.setFont(texto3);
        olvidasteLabel.setForeground(Color.WHITE);
        this.add(olvidasteLabel);

        //Acceder
        
        JButton accederButton = new JButton("Acceder");
        accederButton.setBounds(150, 350, 200, 50);
        accederButton.setFont(texto2);
        accederButton.setBackground(Color.WHITE);
        accederButton.setForeground(Color.black);
        this.add(accederButton);
        
        
        JPanel panelRegistro = new JPanel();
        panelRegistro.setBounds(500, 0, 500, 500);
        panelRegistro.setBackground(Color.decode("#00BFFF"));
        panelRegistro.setLayout(null);
        this.add(panelRegistro);

        JLabel tituloRegistro = new JLabel("REGISTRO", SwingConstants.CENTER);
        tituloRegistro.setBounds(0, 20, 500, 40);
        tituloRegistro.setFont(texto);
        tituloRegistro.setForeground(Color.BLACK);
        panelRegistro.add(tituloRegistro);

        JLabel registroUsuarioLabel = new JLabel("NOMBRE DE USUARIO:");
        registroUsuarioLabel.setBounds(50, 80, 250, 30);
        registroUsuarioLabel.setFont(texto2);
        panelRegistro.add(registroUsuarioLabel);

        JTextField registroUsuarioField = new JTextField();
        registroUsuarioField.setBounds(50, 120, 400, 30);
        registroUsuarioField.setFont(texto2);
        panelRegistro.add(registroUsuarioField);

        JLabel bioLabel = new JLabel("BIO:");
        bioLabel.setBounds(50, 170, 200, 30);
        bioLabel.setFont(texto2);
        panelRegistro.add(bioLabel);

        JTextField bioField = new JTextField();
        bioField.setBounds(50, 210, 400, 30);
        bioField.setFont(texto2);
        panelRegistro.add(bioField);

        JLabel preferenciasLabel = new JLabel("PREFERENCIAS:");
        preferenciasLabel.setBounds(50, 260, 200, 30);
        preferenciasLabel.setFont(texto2);
        panelRegistro.add(preferenciasLabel);

        JCheckBox dulceCheck = new JCheckBox("Dulces");
        dulceCheck.setBounds(50, 300, 100, 30);
        dulceCheck.setFont(texto3);
        dulceCheck.setBackground(Color.decode("#00BFFF"));
        panelRegistro.add(dulceCheck);

        JCheckBox saladoCheck = new JCheckBox("Salado");
        saladoCheck.setBounds(150, 300, 100, 30);
        saladoCheck.setFont(texto3);
        saladoCheck.setBackground(Color.decode("#00BFFF"));
        panelRegistro.add(saladoCheck);

        JCheckBox saludableCheck = new JCheckBox("Saludable");
        saludableCheck.setBounds(250, 300, 100, 30);
        saludableCheck.setFont(texto3);
        saludableCheck.setBackground(Color.decode("#00BFFF"));
        panelRegistro.add(saludableCheck);

        JLabel terminosLabel = new JLabel("TÉRMINOS:");
        terminosLabel.setBounds(50, 330, 200, 30);
        terminosLabel.setFont(texto2);
        panelRegistro.add(terminosLabel);

        JRadioButton aceptarTerminos = new JRadioButton("Acepto los términos");
        aceptarTerminos.setBounds(50, 370, 200, 30);
        aceptarTerminos.setFont(texto3);
        aceptarTerminos.setBackground(Color.decode("#00BFFF"));
        panelRegistro.add(aceptarTerminos);

        JRadioButton noAceptarTerminos = new JRadioButton("No acepto los términos");
        noAceptarTerminos.setBounds(250, 370, 200, 30);
        noAceptarTerminos.setFont(texto3);
        noAceptarTerminos.setBackground(Color.decode("#00BFFF"));
        panelRegistro.add(noAceptarTerminos);

        ButtonGroup terminosGroup = new ButtonGroup();
        terminosGroup.add(aceptarTerminos);
        terminosGroup.add(noAceptarTerminos);
        //crear barra de opciones desplegables
        String [] colonias_dataset = {"centro" , "Villas del encanto", "Pedregal", "Camino real", "Fuerza aerea"};
        
        String[] coloniasDataset = { "Centro", "Villas del Encanto", "Pedregal", "Camino Real", "Fuerza Aérea" };
        JComboBox<String> colonias = new JComboBox<>(coloniasDataset);
        colonias.setBounds(150, 420, 200, 30);
        panelRegistro.add(colonias);
        
        JButton crearCuentaButton = new JButton("Crear cuenta");
        crearCuentaButton.setBounds(150, 460, 200, 50);
        crearCuentaButton.setFont(texto2);
        crearCuentaButton.setBackground(Color.WHITE);
        crearCuentaButton.setForeground(Color.BLACK);
        panelRegistro.add(crearCuentaButton);
        
        // PANEL DE CALCULADORA
       /* JPanel panelCalculadora = new JPanel();
        panelCalculadora.setBounds(550, 50, 400, 500);
        panelCalculadora.setBackground(Color.decode("#333333"));
        panelCalculadora.setLayout(null);
        this.add(panelCalculadora);
        
        JLabel display = new JLabel("0", SwingConstants.RIGHT);
        display.setBounds(10, 10, 380, 50);
        display.setFont(new Font("Arial", Font.BOLD, 30));
        display.setForeground(Color.WHITE);
        display.setBackground(Color.BLACK);
        display.setOpaque(true);
        panelCalculadora.add(display);
        
        JPanel panelBotones = new JPanel();
        panelBotones.setBounds(10, 70, 380, 400);
        panelBotones.setLayout(new GridLayout(5, 4, 5, 5));
        panelBotones.setBackground(Color.decode("#333333"));
        panelCalculadora.add(panelBotones);
        
        String[] botones = {"CE", "", "%", "/", "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", ".", "=", "+"};
        //for para los botones y lo escrito en ellos
        for (String textoBoton : botones) {
            JButton boton = new JButton(textoBoton);
            boton.setFont(new Font("Arial", Font.BOLD, 20));
            boton.setForeground(Color.WHITE);
            boton.setBackground(textoBoton.matches("[0-9]") ? Color.DARK_GRAY : Color.GRAY);
            panelBotones.add(boton);*/
        
     // Tabla para mostrar datos
        
        
      
	}
	
}
