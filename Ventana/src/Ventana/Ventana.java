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
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
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
		this.setSize(1000, 800);
		//Sirve para ajustar el tamaño de la ventana
		this.setResizable(true);
		//Elimina el formato predeterminado de la ventana (ayuda a que funcionen las otras modificaciones)
		this.setLayout(new BorderLayout(10, 10));
		//que pasa cuando cierro mi aplicación
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Sobre que elemento colocare el item
		this.setLocationRelativeTo(null);
		
		this.setBackground(Color.white);
		
		ImageIcon icono = new ImageIcon("logo.png"); 
		this.setIconImage(icono.getImage());
		
        /*ImageIcon fondoImagen = new ImageIcon("fondo.jpg");
        JLabel fondo = new JLabel(fondoImagen);
        fondo.setBounds(0, 0, 1000, 700);
        this.setContentPane(fondo);
        
        
        //panel principal
        JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(false);
		panel.setBounds(0, 0, 1000, 700);
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
        
        
        JPanel panelRegistro = new JPanel();
        panelRegistro.setBounds(500, 0, 500, 500);
        panelRegistro.setBackground(Color.decode("#00BFFF"));
        panelRegistro.setLayout(null);
        this.add(panelRegistro);/*

        /*JLabel tituloRegistro = new JLabel("REGISTRO", SwingConstants.CENTER);
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
        panelRegistro.add(crearCuentaButton);*/
        
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
        
        
        this.setVisible(true);
        
        
	}
	
	@Override
	public void paint (Graphics g) {
    	super.paint(g);
    	
    	Graphics2D g2=(Graphics2D) g;
    	
    	/*g2.drawRect(80, 80, 400, 400);
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
        g.setColor(new Color(135, 206, 250));
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
    	}
    }

    
}
