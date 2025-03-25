package Ventana;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



public class RompeCabezasN extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	
	JButton btnNewButton;
	JButton btnNewButton_1;
	JButton btnNewButton_2;
	JButton btnNewButton_3;
	JButton btnNewButton_4;
	JButton btnNewButton_5;
	JButton btnNewButton_6;
	JButton btnNewButton_7;
	JButton btnNewButton_8;
	JButton btnNewButton_9;
	JButton btnNewButton_10;
	JButton btnNewButton_11;
	JButton btnNewButton_12;
	JButton btnNewButton_13;
	JButton btnNewButton_14;
	JButton btnNewButton_15;
	JButton btnNewButton_16;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RompeCabezasN frame = new RompeCabezasN();
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
	public RompeCabezasN() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(Color.decode("#f7f0ba"));
		panel.setBounds(0, 0, 587, 520);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(4, 4, 6, 6));
		
		btnNewButton = new JButton("");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("1");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("2");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("3");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("4");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("5");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("6");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("7");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("8");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("9");
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("10");
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("11");
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnNewButton_11);
		
		btnNewButton_12 = new JButton("12");
		btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("13");
		btnNewButton_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("14");
		btnNewButton_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnNewButton_14);
		
		btnNewButton_15 = new JButton("15");
		btnNewButton_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btnNewButton_15);
		
		btnNewButton_16 = new JButton("Reiniciar");
		btnNewButton_16.setBackground(Color.decode("#ffffc4"));
		btnNewButton_16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_16.setBounds(0, 519, 573, 44);
		contentPane.add(btnNewButton_16);
		
		
		
	}

}
