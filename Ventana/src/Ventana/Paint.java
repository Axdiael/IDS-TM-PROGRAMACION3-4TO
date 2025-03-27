package Ventana;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.JRadioButton;

public class Paint extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paint frame = new Paint();
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
	public Paint() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 939, 650);
		contentPane = new JPanel();
		contentPane.setBackground(Color.decode("#51d1f6"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(36, 39, 178, 536);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Rectangle");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\axdie\\git\\IDS-TM-PROGRAMACION3-4TO\\Ventana\\src\\Ventana\\cuadrado (1).png"));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(25, 48, 131, 23);
		panel.add(btnNewButton);
		
		JButton btnCircle = new JButton("Circle      ");
		btnCircle.setIcon(new ImageIcon("C:\\Users\\axdie\\git\\IDS-TM-PROGRAMACION3-4TO\\Ventana\\src\\Ventana\\circulo (1).png"));
		btnCircle.setForeground(Color.BLACK);
		btnCircle.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCircle.setBackground(Color.WHITE);
		btnCircle.setBounds(25, 80, 131, 23);
		panel.add(btnCircle);
		
		JButton btnTriangle = new JButton("Triangle");
		btnTriangle.setIcon(new ImageIcon("C:\\Users\\axdie\\git\\IDS-TM-PROGRAMACION3-4TO\\Ventana\\src\\Ventana\\Triangulo (2).png"));
		btnTriangle.setForeground(Color.BLACK);
		btnTriangle.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTriangle.setBackground(Color.WHITE);
		btnTriangle.setBounds(25, 113, 121, 23);
		panel.add(btnTriangle);
		
		JLabel lblNewLabel = new JLabel("Shapes");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(25, 10, 87, 23);
		panel.add(lblNewLabel);
		
		JLabel lblOptions = new JLabel("Options");
		lblOptions.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblOptions.setBounds(25, 184, 87, 23);
		panel.add(lblOptions);
		
		JButton btnNewButton_1 = new JButton("Fill Color");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\axdie\\git\\IDS-TM-PROGRAMACION3-4TO\\Ventana\\src\\Ventana\\cuadrado (1).png"));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(25, 278, 131, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Brush      ");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\axdie\\git\\IDS-TM-PROGRAMACION3-4TO\\Ventana\\src\\Ventana\\pincel (1).png"));
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(25, 212, 131, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Eraser   ");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\axdie\\git\\IDS-TM-PROGRAMACION3-4TO\\Ventana\\src\\Ventana\\Borrador (1).png"));
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setBounds(25, 245, 131, 23);
		panel.add(btnNewButton_3);
		
		JButton btnTriangle_1 = new JButton(" Line    ");
		btnTriangle_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTriangle_1.setIcon(new ImageIcon("C:\\Users\\axdie\\git\\IDS-TM-PROGRAMACION3-4TO\\Ventana\\src\\Ventana\\linea (1).png"));
		btnTriangle_1.setForeground(Color.BLACK);
		btnTriangle_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTriangle_1.setBackground(Color.WHITE);
		btnTriangle_1.setBounds(25, 146, 121, 23);
		panel.add(btnTriangle_1);
		
		JButton btnNewButton_4 = new JButton("Clean");
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_4.setBounds(25, 440, 121, 21);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Save");
		btnNewButton_5.setBackground(new Color(255, 255, 255));
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setBounds(25, 471, 121, 21);
		panel.add(btnNewButton_5);
		
		JLabel lblColors = new JLabel("Colors");
		lblColors.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblColors.setBounds(25, 356, 87, 23);
		panel.add(lblColors);
		
		JSlider slider = new JSlider();
		slider.setBounds(25, 333, 131, 13);
		panel.add(slider);
		
		JLabel lblNewLabel_1 = new JLabel("Thickness");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(59, 311, 65, 21);
		panel.add(lblNewLabel_1);
		
		ButtonGroup colorGroup = new ButtonGroup();
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setBounds(24, 385, 21, 21);
		colorGroup.add(rdbtnNewRadioButton);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setBackground(new Color(0, 0, 0));
		rdbtnNewRadioButton_1.setBounds(59, 385, 21, 21);
		colorGroup.add(rdbtnNewRadioButton_1);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_2.setBackground(new Color(192, 192, 192));
		rdbtnNewRadioButton_2.setBounds(91, 385, 21, 21);
		colorGroup.add(rdbtnNewRadioButton_2);
		panel.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_3.setBackground(new Color(128, 255, 255));
		rdbtnNewRadioButton_3.setBounds(125, 385, 21, 21);
		colorGroup.add(rdbtnNewRadioButton_3);
		panel.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_4.setBackground(new Color(255, 0, 0));
		rdbtnNewRadioButton_4.setBounds(25, 408, 21, 21);
		colorGroup.add(rdbtnNewRadioButton_4);
		panel.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_5.setBackground(new Color(128, 255, 128));
		rdbtnNewRadioButton_5.setBounds(59, 408, 21, 21);
		colorGroup.add(rdbtnNewRadioButton_5);
		panel.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_6.setBackground(new Color(255, 255, 128));
		rdbtnNewRadioButton_6.setBounds(91, 408, 21, 21);
		colorGroup.add(rdbtnNewRadioButton_6);
		panel.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_7.setBackground(new Color(128, 0, 255));
		rdbtnNewRadioButton_7.setBounds(125, 408, 21, 21);
		colorGroup.add(rdbtnNewRadioButton_7);
		panel.add(rdbtnNewRadioButton_7);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(238, 39, 660, 536);
		contentPane.add(panel_1);
	}
}
