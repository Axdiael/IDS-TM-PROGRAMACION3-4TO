package Ventana;
import java.awt.Color;
import java.awt.Font;
import java.awt.color.*;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	
	Font texto = new Font("Andale Mono", Font.BOLD, 22);
	Font texto2 = new Font("Andale Mono", Font.BOLD, 18);
	Font texto3 = new Font("Andale Mono", Font.BOLD, 14);
	
	public Ventana(String title) {
		//Pone el titulo
		this.setTitle(title);
		//hace visible la ventana
		//this.setVisible(true);
		this.setSize(500, 500);
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
        
        this.repaint();
        this.validate();
        this.setVisible(true);
	}
	
}
