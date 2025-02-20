package Ventana;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Tabla extends JFrame {
    // Fuentes personalizadas
    Font texto = new Font("Andale Mono", Font.BOLD, 22);
    Font texto2 = new Font("Andale Mono", Font.BOLD, 18);

    // Constructor de la clase
    public Tabla(String title) {
        // Configuración de la ventana
        this.setTitle(title);
        this.setSize(1000, 800);
        this.setResizable(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.decode("#5A5A5A"));

        // Título de la tabla
        JLabel titulo = new JLabel("Lista de Usuarios", SwingConstants.CENTER);
        titulo.setBounds(0, 20, 600, 40);
        titulo.setFont(texto);
        titulo.setForeground(Color.WHITE);
        this.add(titulo);
        
                // Botones "Exportar" y "Añadir"
                JButton btnExportar = new JButton("Exportar");
                btnExportar.setBounds(600, 90, 120, 40);
                btnExportar.setFont(texto2);
                btnExportar.setBackground(Color.WHITE);
                btnExportar.setForeground(Color.BLACK);
                this.add(btnExportar);

                JButton btnAñadir = new JButton("Añadir");
                btnAñadir.setBounds(600, 150, 120, 40);
                btnAñadir.setFont(texto2);
                btnAñadir.setBackground(Color.WHITE);
                btnAñadir.setForeground(Color.BLACK);
                this.add(btnAñadir);
        
        

        // Modelo de la tabla
        String[] columnas = {"Numero de control", "Nombre", "Apellidos", "Semestre", "Promedios", "Acciones"};
        Object[][] datos = {
            {"1", "katy", "smith", "6to", "98", "Acciones"},
            {"1", "katy", "smith", "6to", "98", "Acciones"},
            {"1", "katy", "smith", "6to", "98", "Acciones"},
            {"1", "katy", "smith", "6to", "98", "Acciones"},
            {"1", "katy", "smith", "6to", "98", "Acciones"},
            {"1", "katy", "smith", "6to", "98", "Acciones"},
            {"1", "katy", "smith", "6to", "98", "Acciones"},
            {"1", "katy", "smith", "6to", "98", "Acciones"},
            {"1", "katy", "smith", "6to", "98", "Acciones"},
            {"1", "katy", "smith", "6to", "98", "Acciones"},
            {"1", "katy", "smith", "6to", "98", "Acciones"},
            {"1", "katy", "smith", "6to", "98", "Acciones"},
            {"1", "katy", "smith", "6to", "98", "Acciones"}
            
        };

        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        JTable tabla = new JTable(modelo);
        tabla.setFont(texto2);
        tabla.setRowHeight(30);
        tabla.getTableHeader().setFont(texto2);
        tabla.getTableHeader().setBackground(Color.decode("#333333"));
        tabla.getTableHeader().setForeground(Color.WHITE);
        tabla.setBackground(Color.WHITE);
        tabla.setForeground(Color.BLACK);

        // Scroll para la tabla
        JScrollPane scrollTabla = new JScrollPane(tabla);
        scrollTabla.setBounds(50, 80, 500, 250);
        this.add(scrollTabla);

        // Hacer visible la ventana
        this.setVisible(true);
    }
}
