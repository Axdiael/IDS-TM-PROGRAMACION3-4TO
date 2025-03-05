package Ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import java.awt.ScrollPane;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.AbstractListModel;

public class WindowB {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_3;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowB window = new WindowB();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	

	/**
	 * Create the application.
	 */
	public WindowB() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 616, 451);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Registro de usuarios");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		panel.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 255, 255));
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Datos Generales");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 15));
		panel_2.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JPanel panel_6 = new JPanel();
		panel_6.setForeground(new Color(128, 255, 255));
		panel_6.setBackground(new Color(128, 255, 255));
		panel_2.add(panel_6, BorderLayout.CENTER);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nombres:");
		lblNewLabel_2.setBounds(33, 30, 45, 13);
		panel_6.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido Paterno:");
		lblNewLabel_3.setBounds(33, 53, 87, 13);
		panel_6.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Apellido Materno:");
		lblNewLabel_4.setBounds(33, 76, 87, 13);
		panel_6.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Fecha de Nacimiento:");
		lblNewLabel_5.setBounds(33, 99, 105, 15);
		panel_6.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Sexo:");
		lblNewLabel_6.setBounds(33, 121, 45, 15);
		panel_6.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Nacionalidad:");
		lblNewLabel_7.setBounds(33, 149, 62, 15);
		panel_6.add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 9));
		textField.setBounds(130, 53, 117, 15);
		panel_6.add(textField);
		textField.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setText("11/08/2005");
		textField_3.setBounds(140, 99, 62, 13);
		panel_6.add(textField_3);
		textField_3.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBackground(new Color(128, 255, 255));
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBounds(68, 118, 71, 21);
		panel_6.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Femenino");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBackground(new Color(128, 255, 255));
		rdbtnNewRadioButton_1.setBounds(150, 118, 71, 21);
		panel_6.add(rdbtnNewRadioButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 9));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Perú", "México", "Argentina"}));
		comboBox.setBounds(105, 145, 87, 22);
		panel_6.add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		textField_1.setColumns(10);
		textField_1.setBounds(130, 27, 117, 15);
		panel_6.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		textField_2.setColumns(10);
		textField_2.setBounds(130, 76, 117, 15);
		panel_6.add(textField_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(128, 128, 255));
		panel_1.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_8 = new JLabel("Perfil de Usuario");
		lblNewLabel_8.setBackground(new Color(128, 128, 255));
		lblNewLabel_8.setFont(new Font("Arial", Font.BOLD, 15));
		panel_3.add(lblNewLabel_8, BorderLayout.NORTH);
		
		JPanel panel_7 = new JPanel();
		panel_7.setForeground(new Color(128, 128, 255));
		panel_7.setBackground(new Color(128, 128, 255));
		panel_3.add(panel_7, BorderLayout.CENTER);
		panel_7.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar foto de perfil");
		chckbxNewCheckBox.setBackground(new Color(128, 128, 255));
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox.setBounds(90, 106, 137, 21);
		panel_7.add(chckbxNewCheckBox);
		
		JCheckBox chckbxMostrarFechaDe = new JCheckBox("Mostrar fecha de nacimiento");
		chckbxMostrarFechaDe.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxMostrarFechaDe.setBackground(new Color(128, 128, 255));
		chckbxMostrarFechaDe.setBounds(77, 129, 172, 21);
		panel_7.add(chckbxMostrarFechaDe);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\axdie\\Downloads\\Perfil1 (1).png"));
		lblNewLabel_12.setBounds(105, 10, 107, 95);
		panel_7.add(lblNewLabel_12);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 128, 255));
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_9 = new JLabel("Datos Opcionales");
		lblNewLabel_9.setFont(new Font("Arial", Font.BOLD, 15));
		panel_4.add(lblNewLabel_9, BorderLayout.NORTH);
		
		JPanel panel_8 = new JPanel();
		panel_8.setForeground(new Color(128, 128, 255));
		panel_8.setBackground(new Color(0, 128, 255));
		panel_4.add(panel_8, BorderLayout.CENTER);
		panel_8.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Descripción");
		lblNewLabel_10.setBounds(25, 25, 58, 13);
		panel_8.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Preferencias");
		lblNewLabel_11.setBounds(157, 25, 72, 13);
		panel_8.add(lblNewLabel_11);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 60, 96, 89);
		panel_8.add(scrollPane);
		
		JTextPane txtpnHolaAmigosDe = new JTextPane();
		txtpnHolaAmigosDe.setText("Hola amigos de youtube gracias por compartir mis videos                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       .");
		scrollPane.setViewportView(txtpnHolaAmigosDe);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(157, 60, 96, 89);
		panel_8.add(scrollPane_1);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Cantar", "Escuchar Musica", "Leer", "Deportes", "Otros", "otros", "otros", "otros", "otros"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setToolTipText("");
		scrollPane_1.setViewportView(list);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 64, 128));
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton = new JButton("Nuevo");
		btnNewButton.setIcon(null);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(121, 35, 85, 21);
		panel_5.add(btnNewButton);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBackground(new Color(255, 255, 255));
		btnGuardar.setBounds(121, 76, 85, 21);
		panel_5.add(btnGuardar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBackground(new Color(255, 255, 255));
		btnSalir.setBounds(121, 121, 85, 21);
		panel_5.add(btnSalir);
	}

	
}
