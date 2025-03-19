package Ventana;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Set;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
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
		this.setLayout(new BorderLayout(20, 0));
		//que pasa cuando cierro mi aplicación
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Sobre que elemento colocare el item
		this.setLocationRelativeTo(null);
		
		this.setBackground(Color.GREEN);
		
		ImageIcon icono = new ImageIcon("mario3.png"); 
		this.setIconImage(icono.getImage());
		
        /*ImageIcon fondoImagen = new ImageIcon("fondo.jpg");
        JLabel fondo = new JLabel(fondoImagen);
        fondo.setBounds(0, 0, 1000, 700);
        this.setContentPane(fondo);*/
        
        
		
        //panel principal
        /*JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(false);
		
		panel.setBounds(0, 0, 500, 700);
		this.add(panel);
      
		//TITULO ACCEDER 
		
		JLabel etiqueta1 = new JLabel ("inicio de sesión");
		
		etiqueta1.setSize(200, 50);
		etiqueta1.setLocation(155, 50);
		//etiqueta1.setBackground(Color.gray);
		etiqueta1.setOpaque(false);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(texto);
		this.add(etiqueta1);
		
		// Icono Usuario
		ImageIcon iconoUsuario = new ImageIcon("user.png");
		//JLabel usuarioIcon = new JLabel(iconoUsuario);
		JLabel usuarioIcon = new JLabel(new ImageIcon(iconoUsuario.getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
		usuarioIcon.setBounds(50, 140, 30, 30);
		panel.add(usuarioIcon);

		
		// Etiqueta para Usuario
		
		JLabel usuarioLabel = new JLabel("USUARIO:");
        usuarioLabel.setBounds(50, 100, 150, 30);
        usuarioLabel.setFont(texto2);
        usuarioLabel.setForeground(Color.WHITE);
        panel.add(usuarioLabel);
        
        //Campo de texto
        
        JTextField usuarioField = new JTextField();
        usuarioField.setBounds(100, 140, 150, 30);
        usuarioField.setFont(texto2);
        usuarioField.setBackground(Color.WHITE);
        //usuarioField.setVisible(true);
        //usuarioField.setOpaque(true);
        //usuarioField.setHorizontalAlignment(JLabel.CENTER);
        panel.add(usuarioField);
        
        // Icono contraseña
        ImageIcon iconoPassword1 = new ImageIcon("password.png");
        //JLabel passwordIcon = new JLabel(iconoPassword1);
        JLabel passwordIcon = new JLabel(new ImageIcon(iconoPassword1.getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
        passwordIcon.setBounds(50, 230, 30, 30);
        panel.add(passwordIcon);
        
        //CONTRASEÑA
        
        JLabel contraseñaLabel = new JLabel("Contraseña:");
        contraseñaLabel.setBounds(50, 190, 150, 30);
        contraseñaLabel.setForeground(Color.WHITE);
        contraseñaLabel.setFont(texto2);
        //contraseñaLabel.setVisible(true);
        //contraseñaLabel.setOpaque(true);
        panel.add(contraseñaLabel);
        
        JPasswordField contraseñaField = new JPasswordField(); 
        contraseñaField.setBounds(100, 230, 150, 30);
        contraseñaField.setForeground(Color.BLACK);
        //contraseñaField.setVisible(true);
        //contraseñaField.setOpaque(true);
        contraseñaField.setHorizontalAlignment(JLabel.CENTER);
        contraseñaField.setFont(texto2);
        panel.add(contraseñaField);
        
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
        
        
      //Barra de menus
        JMenuBar barra = new JMenuBar();
        
        JMenu menu1= new JMenu("Archivo");
        JMenu menu2= new JMenu("Ayuda");
        
        barra.add(menu1);
        barra.add(menu2);
        
        //Menu 1
        JMenuItem abrir = new JMenuItem("Abrir");
        JMenuItem nuevo = new JMenuItem("Nuevo");
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem mas = new JMenuItem("cerrar ");
        
        //Menu 2
        JMenuItem opciones = new JMenuItem("Opciones");
        JMenuItem acercaD = new JMenuItem("Acerca de:");
        JMenuItem Manual = new JMenuItem("Manual de usuario");
        JMenuItem cerrar = new JMenuItem("cerrar ");
        
        
        menu1.add(abrir);
        menu1.add(nuevo);
        menu1.add(guardar);
        menu1.add(mas);
        menu1.add(cerrar);
        
        menu2.add(opciones);
        menu2.add(acercaD);
        menu2.add(Manual);
        menu2.add(cerrar);
        
        this.setJMenuBar(barra);
        
        this.repaint();
        this.revalidate();
        
        
        //Acceder
        
        JButton accederButton = new JButton("Acceder");
        accederButton.setBounds(150, 350, 200, 50);
        accederButton.setFont(texto2);
        accederButton.setBackground(Color.WHITE);
        accederButton.setForeground(Color.black);
        this.add(accederButton);
        
        /*accederButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if (usuarioField.getText().equals("")) {
					
					usuarioField.setBorder(BorderFactory.createLineBorder(Color.red,3));
					
				}else {
					
					usuarioField.setBorder(BorderFactory.createLineBorder(Color.green,3));
				}
				
				 if (String.valueOf(contraseñaField.getPassword()).equals("")) {
			            contraseñaField.setBorder(BorderFactory.createLineBorder(Color.red, 3));
			        } else {
			            contraseñaField.setBorder(BorderFactory.createLineBorder(Color.green, 3));
			        }
			}
		});
        */
        
        
        /*accederButton.addActionListener(new ActionListener() {
        	
            @Override
            public void actionPerformed(ActionEvent e) {
                String correoIngresado = usuarioField.getText();
                String contraseñaIngresada = new String(contraseñaField.getPassword());

                if (correoIngresado.equals("axtr_23@alu.uabcs.mx") && contraseñaIngresada.equals("7777")) {
                    JOptionPane.showMessageDialog(null, "Bienvenido.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Error: Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
                   
                }
                
                if (usuarioField.getText().equals("axtr_23@alu.uabcs.mx")) {
					
                	usuarioField.setBorder(BorderFactory.createLineBorder(Color.green,3));
					
					
				}else {
					
					usuarioField.setBorder(BorderFactory.createLineBorder(Color.red,3));
					
				}
				
				 if (!String.valueOf(contraseñaField.getPassword()).equals("7777")) {
			            contraseñaField.setBorder(BorderFactory.createLineBorder(Color.red, 3));
			        } else {
			            contraseñaField.setBorder(BorderFactory.createLineBorder(Color.green, 3));
			        }
                
            }
        });
        
       /* accederButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                
            }
        });
        
        this.add(panel);
        
        //registro
        
        JPanel panelRegistro = new JPanel();
        panelRegistro.setBounds(500, 0, 500, 700);
        panelRegistro.setBackground(Color.decode("#00BFFF"));
        panelRegistro.setLayout(null);
        this.add(panelRegistro);
        

        JLabel tituloRegistro = new JLabel("REGISTRO", SwingConstants.CENTER);
        tituloRegistro.setBounds(500, 20, 500, 40);
        tituloRegistro.setFont(texto);
        tituloRegistro.setForeground(Color.BLACK);
        panelRegistro.add(tituloRegistro);

        JLabel registroUsuarioLabel = new JLabel("NOMBRE DE USUARIO:");
        registroUsuarioLabel.setBounds(500, 80, 250, 30);
        registroUsuarioLabel.setFont(texto2);
        panelRegistro.add(registroUsuarioLabel);

        JTextField registroUsuarioField = new JTextField();
        registroUsuarioField.setBounds(500, 120, 400, 30);
        registroUsuarioField.setFont(texto2);
        panelRegistro.add(registroUsuarioField);

        JLabel bioLabel = new JLabel("BIO:");
        bioLabel.setBounds(500, 170, 200, 30);
        bioLabel.setFont(texto2);
        panelRegistro.add(bioLabel);

        JTextField bioField = new JTextField();
        bioField.setBounds(500, 210, 400, 30);
        bioField.setFont(texto2);
        panelRegistro.add(bioField);

        JLabel preferenciasLabel = new JLabel("PREFERENCIAS:");
        preferenciasLabel.setBounds(500, 260, 200, 30);
        preferenciasLabel.setFont(texto2);
        panelRegistro.add(preferenciasLabel);

        JCheckBox dulceCheck = new JCheckBox("Dulces");
        dulceCheck.setBounds(500, 300, 100, 30);
        dulceCheck.setFont(texto3);
        dulceCheck.setBackground(Color.decode("#00BFFF"));
        panelRegistro.add(dulceCheck);

        JCheckBox saladoCheck = new JCheckBox("Salado");
        saladoCheck.setBounds(600, 300, 100, 30);
        saladoCheck.setFont(texto3);
        saladoCheck.setBackground(Color.decode("#00BFFF"));
        panelRegistro.add(saladoCheck);

        JCheckBox saludableCheck = new JCheckBox("Saludable");
        saludableCheck.setBounds(700, 300, 100, 30);
        saludableCheck.setFont(texto3);
        saludableCheck.setBackground(Color.decode("#00BFFF"));
        panelRegistro.add(saludableCheck);

        JLabel terminosLabel = new JLabel("TÉRMINOS:");
        terminosLabel.setBounds(500, 330, 200, 30);
        terminosLabel.setFont(texto2);
        panelRegistro.add(terminosLabel);

        JRadioButton aceptarTerminos = new JRadioButton("Acepto los términos");
        aceptarTerminos.setBounds(500, 370, 200, 30);
        aceptarTerminos.setFont(texto3);
        aceptarTerminos.setBackground(Color.decode("#00BFFF"));
        panelRegistro.add(aceptarTerminos);

        JRadioButton noAceptarTerminos = new JRadioButton("No acepto los términos");
        noAceptarTerminos.setBounds(700, 370, 200, 30);
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
        colonias.setBounds(600, 420, 200, 30);
        panelRegistro.add(colonias);
        
        JButton crearCuentaButton = new JButton("Crear cuenta");
        crearCuentaButton.setBounds(600, 460, 200, 50);
        crearCuentaButton.setFont(texto2);
        crearCuentaButton.setBackground(Color.WHITE);
        crearCuentaButton.setForeground(Color.BLACK);
        panelRegistro.add(crearCuentaButton);
        
        crearCuentaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (registroUsuarioField.getText().equals("")) {
                    registroUsuarioField.setBorder(BorderFactory.createLineBorder(Color.red, 3));
                } else {
                    registroUsuarioField.setBorder(BorderFactory.createLineBorder(Color.green, 3));
                }

                if (bioField.getText().equals("")) {
                    bioField.setBorder(BorderFactory.createLineBorder(Color.red, 3));
                } else {
                    bioField.setBorder(BorderFactory.createLineBorder(Color.green, 3));
                }
                
                if ( dulceCheck.isSelected()) {
                	dulceCheck.setBorder(BorderFactory.createLineBorder(Color.red, 5));
                	System.out.println("Dulce seleccioando");
                } else {
                	dulceCheck.setBorder(BorderFactory.createLineBorder(Color.green, 5));
                	
                	System.out.println("x");
                }
                
                if ( saladoCheck.isSelected()) {
                	saladoCheck.setBorder(BorderFactory.createLineBorder(Color.red, 5));
                	System.out.println("salado seleccionado");
                } else {
                	saladoCheck.setBorder(BorderFactory.createLineBorder(Color.green, 5));
                	
                	System.out.println("x");
                }
                
                if ( saludableCheck.isSelected()) {
                	saludableCheck.setBorder(BorderFactory.createLineBorder(Color.red, 5));
                	System.out.println("saludable seleccionado");
                } else {
                	saludableCheck.setBorder(BorderFactory.createLineBorder(Color.green, 5));
                	
                	System.out.println("x");
                }
                
                if ( aceptarTerminos.isSelected()) {
                	aceptarTerminos.setBorder(BorderFactory.createLineBorder(Color.red, 5));
                	System.out.println("Aceptado");
                } else {
                	aceptarTerminos.setBorder(BorderFactory.createLineBorder(Color.green, 5));
                	
                	System.out.println("debes seleccionar Aceptar");
                }
                
                
                
            }
        });
        
        JButton regresarButton = new JButton("Volver al Login");
        regresarButton.setBounds(400, 300, 200, 50);
        panelRegistro.add(regresarButton);

       
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelRegistro.setVisible(false);
                panel.setVisible(true);
            }
        });
        
        
        
        this.add(panelRegistro);
        
        
       
        this.setVisible(true);
        
        
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
        
        JPanel panelBotones = new JPanel( new GridLayout(5, 4) );
        panelBotones.setBounds(10, 70, 380, 400);
        panelBotones.setLayout(new GridLayout(5, 4, 5, 5));
        panelBotones.setBackground(Color.decode("#333333"));
        panelCalculadora.add(panelBotones);
        
        String[] botones = {
                "(", ")", "%", "AC",
                "7", "8", "9", "/",
                "4", "5", "6", "x",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
            };
        //For para agregar los botones
        for (int i = 0; i <= 19; i++) {
            panelBotones.add(new JButton(botones[i]));
        }
        
        panelCalculadora.add(panelBotones, BorderLayout.CENTER);*/
        
        //String[] botones = {"CE", "", "%", "/", "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", ".", "=", "+"};
        //for para los botones y lo escrito en ellos
        /*for (String textoBoton : botones) {
            JButton boton = new JButton(textoBoton);
            boton.setFont(new Font("Arial", Font.BOLD, 20));
            boton.setForeground(Color.WHITE);
            boton.setBackground(textoBoton.matches("[0-9]") ? Color.DARK_GRAY : Color.GRAY);
            panelBotones.add(boton);
    
        }
        
        setTitle("Calculadora de Interés");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        
        JLabel etiqueta5 = new JLabel ("Interes");
		
		etiqueta5.setSize(200, 50);
		//etiqueta1.setBackground(Color.gray);
		etiqueta5.setOpaque(false);
		etiqueta5.setHorizontalAlignment(JLabel.CENTER);
		etiqueta5.setFont(texto);
		etiqueta5.setForeground(Color.RED);
        add(etiqueta5, BorderLayout.NORTH);
		
        JPanel panelSuperior = new JPanel(new GridLayout(4, 2, 20, 20));
        panelSuperior.setBackground(Color.GRAY);

        JLabel capital= new JLabel("Capital:");
        capital.setHorizontalAlignment(SwingConstants.RIGHT);
        JTextField capitalInput= new JTextField("1500");

        JLabel tiempo = new JLabel("Tiempo:");
        tiempo.setHorizontalAlignment(SwingConstants.RIGHT);
        JTextField tiempoInput = new JTextField("2");

        JLabel tasa= new JLabel("Tasa interés:");
        tasa.setHorizontalAlignment(SwingConstants.RIGHT);
        JTextField tasaInput = new JTextField("0.1");
        
        panelSuperior.add(capital);
        panelSuperior.add(capitalInput);
        panelSuperior.add(tiempo);
        panelSuperior.add(tiempoInput);
        panelSuperior.add(tasa);
        panelSuperior.add(tasaInput);

        JPanel botonesPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 5));
        JButton calcularButton = new JButton("Calcular");
        calcularButton.setFont(texto3);
        JButton cancelarButton = new JButton("Cancelar");
        cancelarButton.setFont(texto3);
        botonesPanel.add(calcularButton);
        botonesPanel.add(cancelarButton);
        panelSuperior.add(new JLabel()); 
        panelSuperior.add(botonesPanel);

        add(panelSuperior, BorderLayout.CENTER);
        
        panelSuperior.setVisible(true);

        // Panel inferior 
        JPanel panelInferior = new JPanel(new GridLayout(2, 2, 10, 10));
        panelInferior.setBackground(Color.PINK);

        JLabel interes = new JLabel("Interés:");
        interes.setHorizontalAlignment(SwingConstants.RIGHT);
        JTextField interesInput= new JTextField("315.0000000000002");

        JLabel amount = new JLabel("Monto:");
        amount.setHorizontalAlignment(SwingConstants.RIGHT);
        JTextField amountInput= new JTextField("1815.0000000000002");
        
        panelInferior.add(interes);
        panelInferior.add(interesInput);
        
        panelInferior.add(amount);
        panelInferior.add(amountInput);
        
        add(panelInferior, BorderLayout.SOUTH);
        panelInferior.setVisible(true);*/
        
        //this.revalidate();
        //this.repaint();
        
        
        //this.setVisible(true);
        
        
	/*}
	
	/*@Override
	public void paint (Graphics g) {
    	super.paint(g);
    	
    	Graphics2D g2=(Graphics2D) g;
    	
    	g2.drawRect(80, 80, 400, 400);
    	g2.fillRect(200, 200, 200, 200);
    	g2.clearRect(220, 220, 50, 50);
    	
    	g2.setColor(Color.red);
    	g2.fillRoundRect (400, 80, 200, 200, 30, 30);
    	
    	g2.setColor(Color.green);
    	g2.setStroke(new BasicStroke(10));
    	g2.drawLine(100,100,900,500);
    	
    	g2.setColor(new Color(229, 114, 126));
    	g2.drawOval(400, 400, 90, 90);
    	g2.fillOval(400, 450, 75, 150);
    	
    	g2.setColor(new Color(207,147,240));
    	
    	g2.drawArc(600, 200, 200, 200, 1, -180);
    	g2.fillArc(600, 200, 200, 200, 1, 180);
    	
    	g2.setColor(new Color(51,167,241));
    	
    	g2.setFont(texto);
    	
    	g2.drawString("Hola Cola", 350, 200);
    	
    	BufferedImage image;
    	try {
    		image = ImageIO.read(new File("capibara.png"));
    		
    		g2.drawImage(image, 800, 250,100, 100, Color.gray, null);
    	
    	}catch(IOException e) {
    		e.printStackTrace();
    	}
    	
    	int[] xs = {100,100,400};
    	int []ys= {100,200,400};
    	
    	g2.drawPolygon(xs,ys,3);*/
    	
    	
    	//casa
    	
    	//fondo
       /* g.setColor(new Color(135, 206, 250));
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.YELLOW);
        g.fillOval(800, 40, 180, 180);
        
        g.setColor(new Color(139, 69, 19));
        g.fillRect(0, getHeight() - 50, getWidth(), 50);
        g.setColor(new Color(107, 142, 35));
        g.fillRect(0, getHeight() - 80, getWidth(), 30);

        // la cerca
        g.setColor(new Color(218, 165, 32));
        for (int i = 10; i < getWidth(); i += 40) {
            g.fillRect(i, getHeight() - 170, 30, 100);
            g.fillRect(i + 5, getHeight() - 190, 20, 20);
        }

        // Pared dela casa 
        int casaY = getHeight() - 270;
        g.setColor(new Color(169, 169, 169));
        g.fillRect(150, casaY, 300, 200);
        
        //para los bloquyes
        g.setColor(Color.DARK_GRAY);
        for (int y = casaY; y < casaY + 200; y += 40) {
            g.drawLine(150, y, 450, y);
        }
        for (int x = 150; x <= 450; x += 50) {
            g.drawLine(x, casaY, x, casaY + 200);
        }


        // Techo
        g.setColor(new Color(178, 34, 34));
        g.fillPolygon(new int[]{140, 300, 460}, new int[]{casaY, casaY - 130, casaY}, 3);

        // Chimenea
        g.setColor(new Color(105, 105, 105));
        g.fillRect(350, casaY - 120, 40, 70);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(340, casaY - 130, 60, 20);

        // Puerta
        g.setColor(new Color(139, 69, 19));
        g.fillRect(200, casaY + 70, 70, 130);
        g.setColor(Color.WHITE);
        g.fillOval(260, casaY + 135, 8, 8);

        // Ventana
        g.setColor(new Color(178, 34, 34));
        g.fillRect(320, casaY + 10, 80, 80);
        g.setColor(new Color(135, 206, 250));
        g.fillRect(325, casaY + 15, 30, 30);
        g.fillRect(365, casaY + 15, 30, 30);
        g.fillRect(325, casaY + 55, 30, 30);
        g.fillRect(365, casaY + 55, 30, 30);
        
        
        BufferedImage image;
    	try {
    		image = ImageIO.read(new File("chivas.jpg"));
    		
    		g2.drawImage(image, 800, 250,200, 200, Color.gray, null);
    	
    	}catch(IOException e) {
    		e.printStackTrace();
    	}*/
    	
    	//Mundo dde mario
    	 //Fondo
    	/*g.setColor(new Color(135, 206, 250));
        g.fillRect(0, 0, getWidth(), getHeight());
        
        //Imagenes de fondo
        
        BufferedImage image;
    	try {
    		image = ImageIO.read(new File("nubes.png"));
    		
    		g2.drawImage(image, 40, 100,150, 100, null, null);
    		g2.drawImage(image, 220, 100,150, 100, null, null);
    		g2.drawImage(image, 400, 100,150, 100, null, null);
    		g2.drawImage(image, 580, 100,150, 100, null, null);
    		g2.drawImage(image, 760, 100,150, 100, null, null);
    		
    		image = ImageIO.read(new File("flor.png"));
    		g2.drawImage(image, 440, 280,150, 100, null, null);
    		
    		image = ImageIO.read(new File("mario.png"));
    		g2.drawImage(image, 25, 320,90, 90, null, null);
    	
    	}catch(IOException e) {
    		e.printStackTrace();
    	}
    	
    	

        //Suelo
        g.setColor(Color.decode("#D2691E"));
        g.fillRect(0, getHeight() - 50, getWidth(), 50);
        g.setColor(Color.decode("#F4A460"));
        g.fillRect(0, getHeight() - 80, getWidth(), 30);
        
        
        //cuadros de fonfo
        int cuadroY = getHeight() - 260;
        //cuadro1
        
        g.setColor(Color.black); 
        g.fillRect(250, cuadroY - 60, 170, 240);
        
        g.setColor(Color.decode("#71c2ff")); 
        g.fillRect(250, cuadroY - 80, 150, 260);
        
        g.setColor(Color.BLACK);
        g.drawRect(250, cuadroY - 80, 150, 260);
        
        g.fillOval(255, cuadroY - 69, 16, 16);
        g.fillOval(381, cuadroY - 69, 16, 16);
        g.fillOval(381, cuadroY + 161, 16, 16);
        
        g.setColor(Color.GRAY);
        g.fillOval(255, cuadroY - 70, 15, 15);
        g.fillOval(380, cuadroY - 70, 15, 15);
        g.fillOval(380, cuadroY + 160, 15, 15);
        
       /* g.setColor(Color.BLACK);
        g.drawLine(255, cuadroY - 70, 265, cuadroY - 60);
        g.drawLine(380, cuadroY - 70, 390, cuadroY - 60);
        g.drawLine(380, cuadroY + 160, 390, cuadroY + 170);
       
        
        
        //cuadro 2
        
        g.setColor(Color.black);
        g.fillRect(150, cuadroY+40, 180, 140);
	
        g.setColor(Color.decode("#ffc4b4"));
        g.fillRect(150, cuadroY+20, 160, 160);
        
        g.setColor(Color.BLACK);
        g.drawRect(150, cuadroY+20, 160, 160);
        
        g.setColor(Color.black);
        g.fillOval(154, cuadroY + 31, 16, 16);  
        g.fillOval(291, cuadroY + 31, 16, 16);
        g.fillOval(154, cuadroY + 161, 16, 16);
        g.fillOval(291, cuadroY + 161, 16, 16);
        
        g.setColor(Color.GRAY);
        g.fillOval(153, cuadroY + 30, 15, 15);  
        g.fillOval(290, cuadroY + 30, 15, 15);
        g.fillOval(153, cuadroY + 160, 15, 15);
        g.fillOval(290, cuadroY + 160, 15, 15);
        
        //cuadro3
        g.setColor(Color.decode("#00dd5b")); 
        g.fillRect(600, cuadroY + 20, 160, 160);
        
        g.setColor(Color.black);
        
        g.fillOval(606, cuadroY + 31, 16, 16);
        g.fillOval(741, cuadroY + 31, 16, 16);
        g.fillOval(606, cuadroY + 161, 16, 16);
        g.fillOval(741, cuadroY + 161, 16, 16);
        
        g.setColor(Color.GRAY);
        g.drawRect(600, cuadroY + 20, 160, 160);
        
        g.fillOval(605, cuadroY + 30, 15, 15);
        g.fillOval(740, cuadroY + 30, 15, 15);
        g.fillOval(605, cuadroY + 160, 15, 15);
        g.fillOval(740, cuadroY + 160, 15, 15);
        
        //Cuadros flotanets 
        int cuadroFlotante1Y = getHeight() - 350;
        g.setColor(Color.BLACK);
        g.fillRect(50, cuadroFlotante1Y, 43, 43);
        
        g.setColor(Color.decode("#FF8A4E"));
        g.fillRect(50, cuadroFlotante1Y, 40, 40);
        
        g.setColor(Color.BLACK);
        g.drawRect(50, cuadroFlotante1Y, 40, 40);
        
        g.fillOval(53, cuadroFlotante1Y + 2, 4, 4);
        g.fillOval(83, cuadroFlotante1Y + 2, 4, 4);
        g.fillOval(53, cuadroFlotante1Y + 32, 4, 4);
        g.fillOval(83, cuadroFlotante1Y + 32, 4, 4);
        
        int cuadroFlotante2Y = getHeight() - 440;
        
        g.setColor(Color.BLACK);
        g.fillRect(200, cuadroFlotante2Y, 83, 43);
        
        g.setColor(Color.decode("#FF8A4E"));
        g.fillRect(200, cuadroFlotante2Y, 40, 40);
        g.fillRect(240, cuadroFlotante2Y, 40, 40);
        
        g.setColor(Color.BLACK);
        g.drawRect(200, cuadroFlotante2Y, 40, 40);
        g.drawRect(240, cuadroFlotante2Y, 40, 40);
        
        g.fillOval(203, cuadroFlotante2Y + 2, 4, 4);
        g.fillOval(233, cuadroFlotante2Y + 2, 4, 4);
        g.fillOval(203, cuadroFlotante2Y + 32, 4, 4);
        g.fillOval(233, cuadroFlotante2Y + 32, 4, 4);
        
        g.fillOval(243, cuadroFlotante2Y + 2, 4, 4);
        g.fillOval(273, cuadroFlotante2Y + 2, 4, 4);
        g.fillOval(243, cuadroFlotante2Y + 32, 4, 4);
        g.fillOval(273, cuadroFlotante2Y + 32, 4, 4);
        
        int cuadroFlotante3Y = getHeight() - 380;
        
        g.setColor(Color.BLACK);
        g.fillRect(650, cuadroFlotante3Y, 43, 43);
        
        g.setColor(Color.decode("#FF8A4E"));
        g.fillRect(650, cuadroFlotante3Y, 40, 40);
        
        g.setColor(Color.BLACK);
        g.drawRect(650, cuadroFlotante3Y, 40, 40);
        
        g.fillOval(653, cuadroFlotante3Y + 2, 4, 4);
        g.fillOval(683, cuadroFlotante3Y + 2, 4, 4);
        g.fillOval(653, cuadroFlotante3Y + 32, 4, 4);
        g.fillOval(683, cuadroFlotante3Y + 32, 4, 4);
        
        //tubo
        g.setColor(Color.decode("#008000"));
        g.fillRect(465, getHeight() - 200, 95, 120);
        g.fillRect(462, getHeight() - 240, 100, 60);
        
        g.setColor(Color.BLACK);
        g.drawRect(450, getHeight() - 180, 110, 100);
        g.drawRect(447, getHeight() - 240, 115, 60);
    	
    	//mario 2
    	//fondo
    	
    	g.setColor(new Color(6,101,192,255));
        g.fillRect(0, 0, getWidth(), getHeight());
        
        //nubes traseras
        
        g.setColor(new Color(178,211,214,255));
        g.fillRoundRect(85, 420, 155, 35, 60, 60);
        g.setColor(new Color(236,243,254,255));
        g.fillRoundRect(85, 420, 150, 30, 60, 60);
        
        g.setColor(new Color(178,211,214,255));
        g.fillRoundRect(85, 150, 155, 35, 60, 60);
        g.setColor(new Color(236,243,254,255));
        g.fillRoundRect(85, 150, 150, 30, 60, 60);
        
        g.setColor(new Color(178,211,214,255));
        g.fillRoundRect(175, 190, 155, 35, 60, 60);
        g.setColor(new Color(236,243,254,255));
        g.fillRoundRect(175, 190, 150, 30, 60, 60);
        
        g.setColor(new Color(178,211,214,255));
        g.fillRoundRect(355, 160, 155, 35, 60, 60);
        g.setColor(new Color(236,243,254,255));
        g.fillRoundRect(355, 160, 150, 30, 60, 60);
        
        g.setColor(new Color(178,211,214,255));
        g.fillRoundRect(230, 455, 155, 35, 60, 60);
        g.setColor(new Color(236,243,254,255));
        g.fillRoundRect(230, 455, 150, 30, 60, 60);
        
        g.setColor(new Color(178,211,214,255));
        g.fillRoundRect(230, 400, 155, 35, 60, 60);
        g.setColor(new Color(236,243,254,255));
        g.fillRoundRect(230, 400, 150, 30, 60, 60);
        
        g.setColor(new Color(178,211,214,255));
        g.fillRoundRect(470, 220, 155, 35, 60, 60);
        g.setColor(new Color(236,243,254,255));
        g.fillRoundRect(470, 220, 150, 30, 60, 60);
        
        
        g.setColor(new Color(178,211,214,255));
        g.fillRoundRect(540, 180, 155, 35, 60, 60);
        g.setColor(new Color(236,243,254,255));
        g.fillRoundRect(540, 180, 150, 30, 60, 60);
        
    	 
        //montañas fondo
        //1
        g.setColor(new Color(149, 193, 199, 255));
        g.fillRoundRect(17,250,120,500, 120, 120);
        g.setColor(new Color(180, 238, 247));
        g.fillRoundRect(15,250,105,500, 120, 120);
        
        //2
        g.setColor(new Color(149, 193, 199, 255));
        g.fillRoundRect(302,250,120,500, 120, 120);
        g.setColor(new Color(180, 238, 247));
        g.fillRoundRect(300,250,105,500, 120, 120);
        
        //3
        g.setColor(new Color(149, 193, 199, 255));
        g.fillRoundRect(424,150,120,500, 120, 120);
        g.setColor(new Color(180, 238, 247));
        g.fillRoundRect(422,150,105,500, 120, 120);
        
        //nubes en medio
        g.setColor(new Color(178,211,214,255));
        g.fillRoundRect(170, 330, 155, 35, 60, 60);
        g.setColor(new Color(236,243,254,255));
        g.fillRoundRect(170, 330, 150, 30, 60, 60);
        
        g.setColor(new Color(178,211,214,255));
        g.fillRoundRect(370, 330, 155, 35, 60, 60);
        g.setColor(new Color(236,243,254,255));
        g.fillRoundRect(370, 330, 150, 30, 60, 60);
        
        g.setColor(new Color(178,211,214,255));
        g.fillRoundRect(-10, 300, 155, 35, 60, 60);
        g.setColor(new Color(236,243,254,255));
        g.fillRoundRect(-10, 300, 150, 30, 60, 60);
        
        //montañas de frente
        //1
        g.setColor(new Color(18,81,117,255));
        g.fillRoundRect(-124,398,220,500, 180, 180);
        g.setColor(new Color(118,178,215,255));
        g.fillRoundRect(-120,400,200,500, 180, 180);
        
        //2
        g.setColor(new Color(18,81,117,255));
        g.fillRoundRect(296,398,190,500, 180, 180);
        g.setColor(new Color(118,178,215,255));
        g.fillRoundRect(300,400,170,500, 180, 180);
        
        //3
        
        g.setColor(new Color(18,81,117,255));
        g.fillRoundRect(482,268,190,500, 180, 180);
        g.setColor(new Color(118,178,215,255));
        g.fillRoundRect(486,270,170,500, 180, 180);
        
        //suelo
        g.setColor(new Color(207,158,95,255));
        g.fillRect(0, getHeight() - 70, getWidth(), 70);
        
        g.setColor(new Color(24,178,42,255));
        g.fillRect(0, getHeight() - 80, getWidth(), 10);
        g.setColor(Color.BLACK);
        g.drawRect(0, getHeight() - 80, getWidth(), 10);
        
        //tubo
        
        g.setColor(Color.black);
        g.fillRect(330, getHeight() - 190, 	115, 110);
        g.fillRect(322, getHeight() - 230, 132, 40);
        
        g.setColor(Color.decode("#6E6BB7"));
        g.fillRect(330, getHeight() - 185, 	110, 105);
        g.fillRect(325, getHeight() - 230, 125, 40);
        
        g2.setStroke(new BasicStroke(3));
        g.setColor(Color.BLACK);
        g.drawRect(330, getHeight() - 190, 115, 110);
        g.drawRect(322, getHeight() - 230, 132, 40);
        
        g2.setStroke(new BasicStroke(10)); 
        g.setColor(new Color(215, 225, 251)); 
        
        g.drawLine(375, getHeight() - 180, 375, getHeight() - 88);

        g.drawLine(365, getHeight() - 225, 365, getHeight() - 197);
        
       
        int desplazamientoX = 270;
        int alturaReducida = 50; 

        g.setColor(Color.black);
        g.fillRect(330 + desplazamientoX, getHeight() - 190 + alturaReducida, 115, 110 - alturaReducida);
        g.fillRect(322 + desplazamientoX, getHeight() - 230 + alturaReducida, 132, 40);

        g.setColor(Color.decode("#6E6BB7"));
        g.fillRect(330 + desplazamientoX, getHeight() - 185 + alturaReducida, 110, 105 - alturaReducida);
        g.fillRect(325 + desplazamientoX, getHeight() - 230 + alturaReducida, 125, 40);

        g2.setStroke(new BasicStroke(3));
        g.setColor(Color.BLACK);
        g.drawRect(330 + desplazamientoX, getHeight() - 190 + alturaReducida, 115, 110 - alturaReducida);
        g.drawRect(322 + desplazamientoX, getHeight() - 230 + alturaReducida, 132, 40);

        g2.setStroke(new BasicStroke(10)); 
        g.setColor(new Color(215, 225, 251)); 

        g.drawLine(375 + desplazamientoX, getHeight() - 180 + alturaReducida, 375 + desplazamientoX, getHeight() - 88 );
        g.drawLine(365 + desplazamientoX, getHeight() - 225 + alturaReducida, 365 + desplazamientoX, getHeight() - 197 + alturaReducida);
        
        //Circulos
        
        //1
        
        g.setColor(new Color(242,242,255,255));
        g.fillOval(35, 270, 15, 25);
        g.fillOval(70, 335, 15, 25);
        
        //2
        g.setColor(new Color(242,242,255,255));
        g.fillOval(375, 290, 15, 25);
        g.fillOval(320, 315, 15, 25);
        g.fillOval(340, 290, 15, 25);
        
        //3
        g.setColor(new Color(242,242,255,255));
        g.fillOval(475, 190, 15, 25);
        g.fillOval(445, 230, 15, 25);
        g.fillOval(440, 190, 15, 25);
        
        //4
        g.setColor(new Color(242,242,255,255));
        g.fillOval(575, 290, 15, 25);
        g.fillOval(540, 290, 15, 25);
        
        //piedras
        
        g.setColor(new Color(115,112,113,255));
        g.fillRoundRect(521,478,43,44, 15, 35);
        g.setColor(new Color(198,197,204,255));
        g.fillRoundRect(520,478,40,38, 15, 35);
        
        g.setColor(new Color(115,112,113,255));
        g.fillRoundRect(521,434,43,44, 15, 35);
        g.setColor(new Color(198,197,204,255));
        g.fillRoundRect(520,434,40,38, 15, 35);
        
        g.setColor(new Color(115,112,113,255));
        g.fillRoundRect(521,390,43,44, 15, 35);
        g.setColor(new Color(198,197,204,255));
        g.fillRoundRect(520,390,40,38, 15, 35);
        
        g.setColor(new Color(115,112,113,255));
        g.fillRoundRect(521,346,43,44, 15, 35);
        g.setColor(new Color(198,197,204,255));
        g.fillRoundRect(520,346,40,38, 15, 35);
        
        g2.setStroke(new BasicStroke(2));
        g.setColor(Color.black);
        g.drawRoundRect(521,346,43,44, 15, 35);
        g.drawRoundRect(521,478,43,44, 15, 35);
        g.drawRoundRect(521,434,43,44, 15, 35);
        g.drawRoundRect(521,390,43,44, 15, 35);
        g.drawRoundRect(521,346,43,44, 15, 35);
        
        //derecha
        
        g.setColor(new Color(115,112,113,255));
        g.fillRoundRect(791,478,43,44, 15, 35);
        g.setColor(new Color(198,197,204,255));
        g.fillRoundRect(790,478,40,38, 15, 35);
        
        g.setColor(new Color(115,112,113,255));
        g.fillRoundRect(791,434,43,44, 15, 35);
        g.setColor(new Color(198,197,204,255));
        g.fillRoundRect(790,434,40,38, 15, 35);
        
        g.setColor(new Color(115,112,113,255));
        g.fillRoundRect(791,390,43,44, 15, 35);
        g.setColor(new Color(198,197,204,255));
        g.fillRoundRect(790,390,40,38, 15, 35);
        
        g.setColor(new Color(115,112,113,255));
        g.fillRoundRect(791,346,43,44, 15, 35);
        g.setColor(new Color(198,197,204,255));
        g.fillRoundRect(790,346,40,38, 15, 35);
        
        g2.setStroke(new BasicStroke(2));
        g.setColor(Color.black);
        g.drawRoundRect(791,478,43,44, 15, 35);
        g.drawRoundRect(791,434,43,44, 15, 35);
        g.drawRoundRect(791,390,43,44, 15, 35);
        g.drawRoundRect(791,346,43,44, 15, 35);
        
        //amarillos
        
        g.setColor(new Color(221,159,62,255));
        g.fillRoundRect(566,346,43,44, 15, 35);
        g.setColor(new Color(255,213,46,255));
        g.fillRoundRect(565,346,40,38, 15, 35);
        
        g.setColor(new Color(221,159,62,255));
        g.fillRoundRect(611,346,43,44, 15, 35);
        g.setColor(new Color(255,213,46,255));
        g.fillRoundRect(610,346,40,38, 15, 35);
        
        g.setColor(new Color(221,159,62,255));
        g.fillRoundRect(656,346,43,44, 15, 35);
        g.setColor(new Color(255,213,46,255));
        g.fillRoundRect(655,346,40,38, 15, 35);
        
        g.setColor(new Color(221,159,62,255));
        g.fillRoundRect(701,346,43,44, 15, 35);
        g.setColor(new Color(255,213,46,255));
        g.fillRoundRect(700,346,40,38, 15, 35);
        
        g.setColor(new Color(221,159,62,255));
        g.fillRoundRect(746,346,43,44, 15, 35);
        g.setColor(new Color(255,213,46,255));
        g.fillRoundRect(745,346,40,38, 15, 35);
        
        g2.setStroke(new BasicStroke(2));
        g.setColor(Color.black);
        g.drawRoundRect(566,346,43,44, 15, 35);
        g.drawRoundRect(611,346,43,44, 15, 35);
        g.drawRoundRect(656,346,43,44, 15, 35);
        g.drawRoundRect(701,346,43,44, 15, 35);
        g.drawRoundRect(746,346,43,44, 15, 35);
        
        //ojos
        
        g.setColor(Color.black);
        g.fillOval(570, 355, 5, 15);
        
        g.setColor(Color.black);
        g.fillOval(590, 355, 5, 15);
        
        g.setColor(Color.black);
        g.fillOval(620, 355, 5, 15);
        
        g.setColor(Color.black);
        g.fillOval(640, 355, 5, 15);
        
        g.setColor(Color.black);
        g.fillOval(670, 355, 5, 15);
        
        g.setColor(Color.black);
        g.fillOval(690, 355, 5, 15);
        
        g.setColor(Color.black);
        g.fillOval(710, 355, 5, 15);
        
        g.setColor(Color.black);
        g.fillOval(730, 355, 5, 15);
        
        g.setColor(Color.black);
        g.fillOval(760, 355, 5, 15);
        
        g.setColor(Color.black);
        g.fillOval(780, 355, 5, 15);
        
        //Imagenes de fondo
        
        BufferedImage image;
    	try {
    		image = ImageIO.read(new File("flor.png"));
    		g2.drawImage(image, 320, 287,150, 100, null, null);
    		
    		image = ImageIO.read(new File("mario.png"));
    		g2.drawImage(image, 25, 320,90, 90, null, null);
    		
    		image = ImageIO.read(new File("goompa.png"));
    		g2.drawImage(image, 200, 481,40, 40, null, null);
    		g2.drawImage(image, 150, 481,40, 40, null, null);
    		g2.drawImage(image, 250, 481,40, 40, null, null);
    	
    	}catch(IOException e) {
    		e.printStackTrace();
    	}*/
	    
		//Botones emergentes eliminables
		
		JPanel panelBotones = new JPanel();
	    panelBotones.setLayout(null);
	    panelBotones.setOpaque(false);
	    panelBotones.setBounds(0, 0, 1000, 700);
	    panelBotones.setBackground(Color.GREEN);
	    this.add(panelBotones);
	
	    JButton main_Button = new JButton("Click me");
	    main_Button.setBounds(400, 350, 200, 50);
	    main_Button.setFont(texto2); 
	    
	    panelBotones.add(main_Button);
	
	    main_Button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
	    	 Random rand = new Random();
	
	            int anchoMax = 150 + rand.nextInt(150); 
	            int altoMax = 30 + rand.nextInt(50); 
	            int x = rand.nextInt(1000 - anchoMax); 
	            int y = rand.nextInt(700 - altoMax);
	            float r = rand.nextFloat();
	            float g = rand.nextFloat();
	            float b = rand.nextFloat();
	
	            JButton boton = new JButton("Hola");
	            Color randomColor = new Color(r, g, b);
	            boton.setBounds(x, y, anchoMax, altoMax);
	            boton.setFont(texto2);
	            boton.setBackground(new Color(r,g,b));
	            
	            panelBotones.add(boton);
	            panelBotones.revalidate();
	            panelBotones.repaint();
	            
	         
	            boton.addActionListener(new ActionListener() {
	            	@Override
	                public void actionPerformed(ActionEvent e) {
	                	
	                	JOptionPane.showMessageDialog(null, "El color es "+ randomColor, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
	                	
	                	int respuesta = JOptionPane.showConfirmDialog(null, "¿Quieres eliminar el boton?", "WARNING", JOptionPane.YES_NO_OPTION);
	                    
	                	if (respuesta == JOptionPane.YES_OPTION) {
	                        panelBotones.remove(boton);
	                        panelBotones.revalidate();  
	                        panelBotones.repaint();     
	                    }
	                }
	            });
	        }
	    });
		
	        setVisible(true);
		}
		
	}

	
   

