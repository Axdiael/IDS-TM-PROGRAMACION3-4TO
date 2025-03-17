package Ventana;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
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
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class Login extends JFrame {
    Font texto = new Font("Andale Mono", Font.BOLD, 22);
    Font texto2 = new Font("Andale Mono", Font.BOLD, 18);
    Font texto3 = new Font("Andale Mono", Font.BOLD, 14);
    
    JPanel panelLogin = new JPanel();
    JPanel panelRegistro = new JPanel();
    JPanel panelRecuperacion = new JPanel();
    JPanel panelUsuariosAlta = new JPanel();
    JPanel panelUsuariosBaja = new JPanel();
    JPanel panelUsuariosConsultar = new JPanel();
    JPanel panelAyudaCrear = new JPanel();
    JPanel panelAyudaAcceder = new JPanel();
    JPanel panelAyudaOlvide = new JPanel();
    
    JTextField usuarioField;
    JPasswordField contraseñaField;

    public Login(String title) {
        super(title);
        this.setSize(420, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        
        iniciarPanels();
        setupMenuBar();
        
        this.add(panelLogin); 
        this.setVisible(true);
    }

    private void iniciarPanels() {
        iniciarLoginPanel();
        iniciarRegistroPanel();
        iniciarRecuperacionPanel();
        iniciarUsuariosAltaPanel();
        iniciarUsuariosBajaPanel();
        iniciarUsuariosConsultarPanel();
        iniciarAyudaCrearPanel();
        iniciarAyudaAccederPanel();
        iniciarlizeAyudaOlvidePanel();
    }

    private void setupMenuBar() {
        JMenuBar barra = new JMenuBar();
        
        JMenu menuCuenta = new JMenu("Cuenta");
        JMenuItem opLogin = new JMenuItem("Login");
        JMenuItem opRegistro = new JMenuItem("Registro");
        JMenuItem opRecuperacion = new JMenuItem("Recuperación de cuenta");
        
        opLogin.addActionListener(e -> manager("Login"));
        opRegistro.addActionListener(e -> manager("Registro"));
        opRecuperacion.addActionListener(e -> manager("Recuperacion"));
        
        menuCuenta.add(opLogin);
        menuCuenta.add(opRegistro);
        menuCuenta.add(opRecuperacion);
        
        JMenu menuUsuarios = new JMenu("Usuarios");
        JMenuItem opAlta = new JMenuItem("Alta");
        JMenuItem opBaja = new JMenuItem("Baja");
        JMenuItem opConsultar = new JMenuItem("Consultar");
        
        opAlta.addActionListener(e -> manager("UsuariosAlta"));
        opBaja.addActionListener(e -> manager("UsuariosBaja"));
        opConsultar.addActionListener(e -> manager("UsuariosConsultar"));
        
        menuUsuarios.add(opAlta);
        menuUsuarios.add(opBaja);
        menuUsuarios.add(opConsultar);
        
        JMenu menuAyuda = new JMenu("Ayuda");
        JMenuItem opCrearUsuario = new JMenuItem("¿Cómo crear un usuario?");
        JMenuItem opAccederSistema = new JMenuItem("¿Cómo acceder al sistema?");
        JMenuItem opOlvideContraseña = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
        
        opCrearUsuario.addActionListener(e -> manager("AyudaCrear"));
        opAccederSistema.addActionListener(e -> manager("AyudaAcceder"));
        opOlvideContraseña.addActionListener(e -> manager("AyudaOlvide"));
        
        menuAyuda.add(opCrearUsuario);
        menuAyuda.add(opAccederSistema);
        menuAyuda.add(opOlvideContraseña);
        
        barra.add(menuCuenta);
        barra.add(menuUsuarios);
        barra.add(menuAyuda);
        
        this.setJMenuBar(barra);
    }

    private JPanel iniciarLoginPanel() {
        panelLogin.setLayout(null);
        panelLogin.setOpaque(false);
        panelLogin.setBounds(0, 0, 420, 600);

        JLabel etiqueta1 = new JLabel("Inicio de sesión", SwingConstants.CENTER);
        etiqueta1.setBounds(0, 50, 420, 50);
        etiqueta1.setFont(texto);
        panelLogin.add(etiqueta1);

        ImageIcon iconoUsuario = new ImageIcon("user.png");
        JLabel usuarioIcon = new JLabel(new ImageIcon(iconoUsuario.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
        usuarioIcon.setBounds(50, 140, 30, 30);
        panelLogin.add(usuarioIcon);

        JLabel usuarioLabel = new JLabel("USUARIO:");
        usuarioLabel.setBounds(50, 110, 150, 30);
        usuarioLabel.setFont(texto2);
        usuarioLabel.setForeground(Color.BLACK);
        panelLogin.add(usuarioLabel);

        usuarioField = new JTextField();
        usuarioField.setBounds(100, 140, 250, 30);
        usuarioField.setFont(texto2);
        panelLogin.add(usuarioField);

        ImageIcon iconoPassword = new ImageIcon("password.png");
        JLabel passwordIcon = new JLabel(new ImageIcon(iconoPassword.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
        passwordIcon.setBounds(50, 210, 30, 30);
        panelLogin.add(passwordIcon);

        JLabel contraseñaLabel = new JLabel("Contraseña:");
        contraseñaLabel.setBounds(50, 180, 150, 30);
        contraseñaLabel.setForeground(Color.BLACK);
        contraseñaLabel.setFont(texto2);
        panelLogin.add(contraseñaLabel);

        contraseñaField = new JPasswordField();
        contraseñaField.setBounds(100, 210, 250, 30);
        contraseñaField.setFont(texto2);
        panelLogin.add(contraseñaField);

        JButton accederButton = new JButton("Acceder");
        accederButton.setBounds(135, 300, 150, 50);
        accederButton.setFont(texto2);
        accederButton.setBackground(Color.WHITE);
        accederButton.setForeground(Color.BLACK);
        panelLogin.add(accederButton);

        accederButton.addActionListener(e -> {
            String correoIngresado = usuarioField.getText();
            String contraseñaIngresada = new String(contraseñaField.getPassword());

            if (correoIngresado.equals("axtr_23@alu.uabcs.mx") && contraseñaIngresada.equals("7777")) {
                JOptionPane.showMessageDialog(null, "Bienvenido.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                manager("Registro");
            } else {
                JOptionPane.showMessageDialog(null, "Error: Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            usuarioField.setBorder(BorderFactory.createLineBorder(
                correoIngresado.equals("axtr_23@alu.uabcs.mx") ? Color.green : Color.red, 3));
            contraseñaField.setBorder(BorderFactory.createLineBorder(
                contraseñaIngresada.equals("7777") ? Color.green : Color.red, 3));
        });

        return panelLogin;
    }

    private JPanel iniciarRegistroPanel() {
        panelRegistro.setBounds(0, 10, 420, 600);
        panelRegistro.setBackground(Color.decode("#00BFFF"));
        panelRegistro.setLayout(null);

        JLabel tituloRegistro = new JLabel("REGISTRO", SwingConstants.CENTER);
        tituloRegistro.setBounds(0, 20, 420, 40); 
        tituloRegistro.setFont(texto);
        tituloRegistro.setForeground(Color.BLACK);
        panelRegistro.add(tituloRegistro);

        JLabel registroUsuarioLabel = new JLabel("NOMBRE DE USUARIO:");
        registroUsuarioLabel.setBounds(50, 80, 250, 30); 
        registroUsuarioLabel.setFont(texto2);
        panelRegistro.add(registroUsuarioLabel);

        JTextField registroUsuarioField = new JTextField();
        registroUsuarioField.setBounds(50, 120, 320, 30); 
        registroUsuarioField.setFont(texto2);
        panelRegistro.add(registroUsuarioField);

        JLabel bioLabel = new JLabel("BIO:");
        bioLabel.setBounds(50, 170, 200, 30); 
        bioLabel.setFont(texto2);
        panelRegistro.add(bioLabel);

        JTextField bioField = new JTextField();
        bioField.setBounds(50, 210, 320, 30); 
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
        saladoCheck.setBounds(160, 300, 100, 30); 
        saladoCheck.setFont(texto3);
        saladoCheck.setBackground(Color.decode("#00BFFF"));
        panelRegistro.add(saladoCheck);

        JCheckBox saludableCheck = new JCheckBox("Saludable");
        saludableCheck.setBounds(270, 300, 100, 30); 
        saludableCheck.setFont(texto3);
        saludableCheck.setBackground(Color.decode("#00BFFF"));
        panelRegistro.add(saludableCheck);

        JLabel terminosLabel = new JLabel("TÉRMINOS:");
        terminosLabel.setBounds(50, 350, 200, 30); 
        terminosLabel.setFont(texto2);
        panelRegistro.add(terminosLabel);

        JRadioButton aceptarTerminos = new JRadioButton("Acepto los términos");
        aceptarTerminos.setBounds(50, 390, 200, 30); // Adjusted
        aceptarTerminos.setFont(texto3);
        aceptarTerminos.setBackground(Color.decode("#00BFFF"));
        panelRegistro.add(aceptarTerminos);

        JRadioButton noAceptarTerminos = new JRadioButton("No acepto los términos");
        noAceptarTerminos.setBounds(250, 390, 200, 30); 
        noAceptarTerminos.setFont(texto3);
        noAceptarTerminos.setBackground(Color.decode("#00BFFF"));
        panelRegistro.add(noAceptarTerminos);

        ButtonGroup terminosGroup = new ButtonGroup();
        terminosGroup.add(aceptarTerminos);
        terminosGroup.add(noAceptarTerminos);

        String[] coloniasDataset = { "Centro", "Villas del Encanto", "Pedregal", "Camino Real", "Fuerza Aérea" };
        JComboBox<String> colonias = new JComboBox<>(coloniasDataset);
        colonias.setBounds(50, 440, 200, 30); 
        panelRegistro.add(colonias);

        JButton crearCuentaButton = new JButton("Crear cuenta");
        crearCuentaButton.setBounds(50, 490, 150, 50);  
        crearCuentaButton.setFont(texto2);
        crearCuentaButton.setBackground(Color.WHITE);
        panelRegistro.add(crearCuentaButton);

        JButton regresarButton = new JButton("Regresar");
        regresarButton.setBounds(220, 490, 150, 50); 
        regresarButton.setFont(texto2);
        regresarButton.setBackground(Color.WHITE);
        panelRegistro.add(regresarButton);

        crearCuentaButton.addActionListener(e -> {
            registroUsuarioField.setBorder(BorderFactory.createLineBorder(
                registroUsuarioField.getText().equals("") ? Color.red : Color.green, 3));
        });

        regresarButton.addActionListener(e -> manager("Login"));

        return panelRegistro;
    }

    private JPanel iniciarRecuperacionPanel() {
        panelRecuperacion.setBounds(0, 0, 420, 600);
        panelRecuperacion.setBackground(Color.decode("#FFD700"));
        panelRecuperacion.setLayout(null);

        JLabel title = new JLabel("RECUPERACIÓN DE CUENTA", SwingConstants.CENTER);
        title.setBounds(0, 50, 420, 40);
        title.setFont(texto);
        panelRecuperacion.add(title);

        JLabel emailLabel = new JLabel("Correo:");
        emailLabel.setBounds(50, 150, 100, 30);
        emailLabel.setFont(texto2);
        panelRecuperacion.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(150, 150, 200, 30);
        emailField.setFont(texto2);
        panelRecuperacion.add(emailField);

        JButton recoverButton = new JButton("Recuperar");
        recoverButton.setBounds(135, 250, 150, 40);
        recoverButton.setFont(texto2);
        recoverButton.setBackground(Color.WHITE);
        panelRecuperacion.add(recoverButton);

        return panelRecuperacion;
    }

    private JPanel iniciarUsuariosAltaPanel() {
        panelUsuariosAlta.setBounds(0, 0, 420, 600);
        panelUsuariosAlta.setBackground(Color.decode("#98FB98"));
        panelUsuariosAlta.setLayout(null);

        JLabel title = new JLabel("ALTA DE USUARIOS", SwingConstants.CENTER);
        title.setBounds(0, 10, 420, 40);
        title.setFont(texto);
        panelUsuariosAlta.add(title);
        
        JLabel buscarLabel = new JLabel("Alta:");
        buscarLabel.setBounds(50, 80, 120, 30);
        buscarLabel.setFont(texto3);
        panelUsuariosAlta.add(buscarLabel);

        JTextField buscarField = new JTextField();
        buscarField.setBounds(90, 80, 150, 30);
        panelUsuariosAlta.add(buscarField);

        JButton buscarButton = new JButton("Buscar");
        buscarButton.setBounds(250, 80, 90, 30);
        buscarButton.setFont(texto3);
        panelUsuariosAlta.add(buscarButton);
        
        JButton añadirButton = new JButton("Añadir");
        añadirButton.setBounds(240, 120, 110, 30);
        añadirButton.setFont(texto3);
        panelUsuariosAlta.add(añadirButton);

        String[] columnNames = {"Nombre", "Apellido", "Accion", "Año de nacimiento", "Morbilidad"};
        Object[][] data = {
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false}
        };
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50, 200, 320, 400); 
        panelUsuariosAlta.add(scrollPane);


        return panelUsuariosAlta;
    }

    private JPanel iniciarUsuariosBajaPanel() {
        panelUsuariosBaja.setBounds(0, 0, 420, 600);
        panelUsuariosBaja.setBackground(Color.decode("#FFA07A"));
        panelUsuariosBaja.setLayout(null);

        JLabel title = new JLabel("BAJA DE USUARIOS", SwingConstants.CENTER);
        title.setBounds(0, 10, 420, 40);
        title.setFont(texto);
        panelUsuariosBaja.add(title);
        
        JLabel buscarLabel = new JLabel("Baja:");
        buscarLabel.setBounds(50, 80, 120, 30);
        buscarLabel.setFont(texto3);
        panelUsuariosBaja.add(buscarLabel);

        JTextField buscarField = new JTextField();
        buscarField.setBounds(90, 80, 150, 30);
        panelUsuariosBaja.add(buscarField);

        JButton buscarButton = new JButton("Buscar");
        buscarButton.setBounds(250, 80, 90, 30);
        buscarButton.setFont(texto3);
        panelUsuariosBaja.add(buscarButton);
        
        JButton eliminarButton = new JButton("Eliminar");
        eliminarButton.setBounds(240, 120, 110, 30);
        eliminarButton.setFont(texto3);
        panelUsuariosBaja.add(eliminarButton);

        String[] columnNames = {"Nombre", "Apellido", "Accion", "Año de nacimiento", "Morbilidad"};
        Object[][] data = {
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false}
        };
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50, 200, 320, 400); 
        panelUsuariosBaja.add(scrollPane);
        
        return panelUsuariosBaja;
    }

    private JPanel iniciarUsuariosConsultarPanel() {
        panelUsuariosConsultar.setBounds(0, 0, 420, 600);
        panelUsuariosConsultar.setBackground(Color.decode("#87CEEB"));
        panelUsuariosConsultar.setLayout(null);

        JLabel title = new JLabel("CONSULTAR USUARIOS", SwingConstants.CENTER);
        title.setBounds(0, 10, 420, 40);
        title.setFont(texto);
        panelUsuariosConsultar.add(title);

        JLabel consultarLabel = new JLabel("Consultar:");
        consultarLabel.setBounds(50, 80, 120, 30);
        consultarLabel.setFont(texto2);
        panelUsuariosConsultar.add(consultarLabel);
        
        JTextField buscarField = new JTextField();
        buscarField.setBounds(150, 80, 150, 30);
        panelUsuariosConsultar.add(buscarField);

        JButton buscarButton = new JButton("Buscar");
        buscarButton.setBounds(310, 80, 90, 30);
        buscarButton.setFont(texto3);
        panelUsuariosConsultar.add(buscarButton);
        
        String[] columnNames = {"Nombre", "Apellido", "Accion", "Año de nacimiento", "Morbilidad"};
        Object[][] data = {
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false},
            {"Lionel", "Messi", "futbol", "1987", false}
        };
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(50, 200, 320, 400); 
        panelUsuariosConsultar.add(scrollPane);
        
        return panelUsuariosConsultar;
    }

    private JPanel iniciarAyudaCrearPanel() {
        panelAyudaCrear.setBounds(0, 0, 420, 600);
        panelAyudaCrear.setBackground(Color.decode("#DDA0DD"));
        panelAyudaCrear.setLayout(null);

        JLabel title = new JLabel("¿CÓMO CREAR UN USUARIO?", SwingConstants.CENTER);
        title.setBounds(0, 50, 420, 40);
        title.setFont(texto);
        panelAyudaCrear.add(title);

        JLabel info = new JLabel("<html>1. Ve a Registro<br>2. Ingresa tus datos<br>3. Haz clic en Crear cuenta</html>");
        info.setBounds(50, 150, 320, 100);
        info.setFont(texto2);
        panelAyudaCrear.add(info);

        return panelAyudaCrear;
    }

    private JPanel iniciarAyudaAccederPanel() {
        panelAyudaAcceder.setBounds(0, 0, 420, 600);
        panelAyudaAcceder.setBackground(Color.decode("#F0E68C"));
        panelAyudaAcceder.setLayout(null);

        JLabel title = new JLabel("¿CÓMO ACCEDER AL SISTEMA?", SwingConstants.CENTER);
        title.setBounds(0, 50, 420, 40);
        title.setFont(texto);
        panelAyudaAcceder.add(title);

        JLabel info = new JLabel("<html>1. Ve a Login<br>2. Ingresa usuario y contraseña<br>3. Haz clic en Acceder</html>");
        info.setBounds(50, 150, 320, 100);
        info.setFont(texto2);
        panelAyudaAcceder.add(info);

        return panelAyudaAcceder;
    }

    private JPanel iniciarlizeAyudaOlvidePanel() {
        panelAyudaOlvide.setBounds(0, 0, 420, 600);
        panelAyudaOlvide.setBackground(Color.decode("#FFB6C1"));
        panelAyudaOlvide.setLayout(null);

        JLabel title = new JLabel("¿QUÉ PASA SI OLVIDÉ MI CONTRASEÑA?", SwingConstants.CENTER);
        title.setBounds(0, 50, 420, 40);
        title.setFont(texto);
        panelAyudaOlvide.add(title);

        JLabel info = new JLabel("<html>1. Ve a Recuperación de cuenta<br>2. Ingresa tu correo<br>3. Sigue las instrucciones</html>");
        info.setBounds(50, 150, 320, 100);
        info.setFont(texto2);
        panelAyudaOlvide.add(info);

        return panelAyudaOlvide;
    }

    public void manager(String target) {
        this.getContentPane().removeAll();
        switch (target) {
            case "Login": 
                this.add(panelLogin); 
                break;
            case "Registro": 
                this.add(panelRegistro); 
                break;
            case "Recuperacion": 
                this.add(panelRecuperacion); 
                break;
            case "UsuariosAlta": 
                this.add(panelUsuariosAlta); 
                break;
            case "UsuariosBaja": 
                this.add(panelUsuariosBaja); 
                break;
            case "UsuariosConsultar": 
                this.add(panelUsuariosConsultar); 
                break;
            case "AyudaCrear": 
                this.add(panelAyudaCrear); 
                break;
            case "AyudaAcceder": 
                this.add(panelAyudaAcceder); 
                break;
            case "AyudaOlvide": 
                this.add(panelAyudaOlvide); 
                break;
            default:
                this.add(panelLogin); 
                break;
        }
        this.repaint();
        this.revalidate();
    }
    
    

    public static void main(String[] args) {
        Login login = new Login("Sistema de Usuarios");
        login.setVisible(true); 
    }
}