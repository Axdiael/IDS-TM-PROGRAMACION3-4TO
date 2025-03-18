package Ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;

public class Examen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	/**
	 * @wbp.nonvisual location=562,254
	 */
	private final JTextPane textPane = new JTextPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen frame = new Examen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Examen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 510);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 192));
		panel.setBounds(0, 0, 489, 51);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Factura en Java");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 10, 167, 25);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 61, 469, 79);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Datos del cliente");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_2.setBounds(10, 0, 100, 13);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Documento:");
		lblNewLabel_2_1.setBounds(10, 23, 81, 13);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Dirección:");
		lblNewLabel_2_1_1.setBounds(10, 53, 81, 13);
		panel_1.add(lblNewLabel_2_1_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(114, 20, 96, 19);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(114, 50, 96, 19);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Nombres:");
		lblNewLabel_2_1_2.setBounds(240, 23, 55, 13);
		panel_1.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Teléfono: ");
		lblNewLabel_2_1_1_1.setBounds(240, 53, 55, 13);
		panel_1.add(lblNewLabel_2_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(330, 20, 96, 19);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(330, 50, 96, 19);
		panel_1.add(textField_4);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(255, 255, 255));
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_1.setBounds(10, 151, 469, 44);
		contentPane.add(panel_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Datos del cliente");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_2_2.setBounds(10, 0, 100, 13);
		panel_1_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("N#  Factura:");
		lblNewLabel_2_1_3.setBounds(10, 23, 81, 13);
		panel_1_1.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("Fecha:");
		lblNewLabel_2_1_3_1.setBounds(246, 23, 51, 13);
		panel_1_1.add(lblNewLabel_2_1_3_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("1");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_2_2_1.setBounds(101, 23, 100, 13);
		panel_1_1.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("2021/05/21");
		lblNewLabel_2_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_2_2_1_1.setBounds(316, 23, 100, 13);
		panel_1_1.add(lblNewLabel_2_2_1_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(new Color(255, 255, 255));
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_1_1.setBounds(10, 199, 469, 32);
		contentPane.add(panel_1_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\axdie\\Downloads\\Menu (3).png"));
		lblNewLabel_3.setBounds(10, 0, 45, 32);
		panel_1_1_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Ver listado de facturas");
		lblNewLabel_4.setBounds(49, 10, 114, 13);
		panel_1_1_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\axdie\\Downloads\\Añadir (1).png"));
		lblNewLabel_5.setBounds(231, 0, 45, 32);
		panel_1_1_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\axdie\\Downloads\\Eliminar (1).png"));
		lblNewLabel_6.setBounds(353, 0, 45, 32);
		panel_1_1_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Añadir");
		lblNewLabel_7.setBounds(270, 10, 45, 13);
		panel_1_1_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Eliminar");
		lblNewLabel_8.setBounds(398, 10, 45, 13);
		panel_1_1_1.add(lblNewLabel_8);
		
		table = new JTable();
	    String[] columnNames = {"Producto", "Cantidad", "Valor", "Sub total"};
	    Object[][] data = {
	        {"Agua", "2", "500", "1000.0"},
	        {"Cereal", "5", "1000", "5000.0"},
	        {"Leche", "2", "300", "600.0"},
	        {"Huevos", "12", "1800", "5600.0"}
	    };
	    DefaultTableModel model = new DefaultTableModel(data, columnNames);
	    table.setModel(model);

	    JScrollPane scrollPane = new JScrollPane(table);
	    scrollPane.setBounds(10, 241, 469, 111);
	    contentPane.add(scrollPane);
		
		JLabel lblNewLabel_1 = new JLabel("Sub Total: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(10, 362, 68, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("6600.0 ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1_1.setBounds(111, 362, 68, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("% Descuento:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_1_2.setBounds(10, 385, 68, 13);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("IVA 19%:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_1_3.setBounds(10, 408, 68, 13);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Total Factura:");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_1_4.setBounds(10, 431, 68, 13);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("1254.0 ");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1_1_1.setBounds(111, 408, 68, 13);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("7524.0 ");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1_1_2.setBounds(111, 431, 68, 13);
		contentPane.add(lblNewLabel_1_1_2);
		
		textField = new JTextField();
		textField.setBounds(109, 385, 41, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Valor descontado: ");
		chckbxNewCheckBox.setBounds(172, 381, 111, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("330.0 ");
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1_1_3.setBounds(303, 385, 68, 13);
		contentPane.add(lblNewLabel_1_1_3);
		
		JButton btnNewButton = new JButton("Finalizar factura");
		btnNewButton.setBackground(new Color(209, 222, 222));
		btnNewButton.setBounds(189, 431, 107, 21);
		contentPane.add(btnNewButton);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBackground(new Color(209, 222, 222));
		btnLimpiar.setBounds(303, 431, 107, 21);
		contentPane.add(btnLimpiar);
	}
}
