package Ventana;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

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
	
	//private JButton[] buttons; 
    private int espacio;
	private ArrayList<JButton> buttons = new ArrayList<JButton>();
	


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
		
		btnNewButton_16 = new JButton("Nuevo Tablero");
		btnNewButton_16.setBackground(Color.decode("#ffffc4"));
		btnNewButton_16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_16.setBounds(0, 519, 573, 44);
		contentPane.add(btnNewButton_16);
		
		buttons = new ArrayList<>();
        buttons.add(btnNewButton);
        buttons.add(btnNewButton_1);
        buttons.add(btnNewButton_2);
        buttons.add(btnNewButton_3);
        buttons.add(btnNewButton_4);
        buttons.add(btnNewButton_5);
        buttons.add(btnNewButton_6);
        buttons.add(btnNewButton_7);
        buttons.add(btnNewButton_8);
        buttons.add(btnNewButton_9);
        buttons.add(btnNewButton_10);
        buttons.add(btnNewButton_11);
        buttons.add(btnNewButton_12);
        buttons.add(btnNewButton_13);
        buttons.add(btnNewButton_14);
        buttons.add(btnNewButton_15);
        
		CambiarBotones();
		agregarListeners();
		
	}
	private void CambiarBotones() {
		
		ArrayList<String> numbers = new ArrayList<>();
        for (int i = 1; i <= 15; i++) {
            numbers.add(String.valueOf(i));
        }
        numbers.add(""); 
        
        Collections.shuffle(numbers);
        
        for (int i = 0; i < 16; i++) {
            buttons.get(i).setText(numbers.get(i));
            if (numbers.get(i).equals("")) {
                espacio = i;
            }
        }
    }
	
    
    private void agregarListeners() {
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarEspacios(0, espacio)) {
                    String temp = btnNewButton.getText();
                    btnNewButton.setText("");
                    buttons.get(espacio).setText(temp);
                    espacio = 0;
                }
            }
        });
        
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarEspacios(1, espacio)) {
                    String temp = btnNewButton_1.getText();
                    btnNewButton_1.setText("");
                    buttons.get(espacio).setText(temp);
                    espacio = 1;
                }
            }
        });
        
        btnNewButton_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarEspacios(2, espacio)) {
                    String temp = btnNewButton_2.getText();
                    btnNewButton_2.setText("");
                    buttons.get(espacio).setText(temp);
                    espacio = 2;
                }
            }
        });
        
        btnNewButton_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarEspacios(3, espacio)) {
                    String temp = btnNewButton_3.getText();
                    btnNewButton_3.setText("");
                    buttons.get(espacio).setText(temp);
                    espacio = 3;
                }
            }
        });
        
        btnNewButton_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarEspacios(4, espacio)) {
                    String temp = btnNewButton_4.getText();
                    btnNewButton_4.setText("");
                    buttons.get(espacio).setText(temp);
                    espacio = 4;
                }
            }
        });
        
        btnNewButton_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarEspacios(5, espacio)) {
                    String temp = btnNewButton_5.getText();
                    btnNewButton_5.setText("");
                    buttons.get(espacio).setText(temp);
                    espacio = 5;
                }
            }
        });
        
        btnNewButton_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarEspacios(6, espacio)) {
                    String temp = btnNewButton_6.getText();
                    btnNewButton_6.setText("");
                    buttons.get(espacio).setText(temp);
                    espacio = 6;
                }
            }
        });
        
        btnNewButton_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarEspacios(7, espacio)) {
                    String temp = btnNewButton_7.getText();
                    btnNewButton_7.setText("");
                    buttons.get(espacio).setText(temp);
                    espacio = 7;
                }
            }
        });
        
        btnNewButton_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarEspacios(8, espacio)) {
                    String temp = btnNewButton_8.getText();
                    btnNewButton_8.setText("");
                    buttons.get(espacio).setText(temp);
                    espacio = 8;
                }
            }
        });
        
        btnNewButton_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarEspacios(9, espacio)) {
                    String temp = btnNewButton_9.getText();
                    btnNewButton_9.setText("");
                    buttons.get(espacio).setText(temp);
                    espacio = 9;
                }
            }
        });
        
        btnNewButton_10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarEspacios(10, espacio)) {
                    String temp = btnNewButton_10.getText();
                    btnNewButton_10.setText("");
                    buttons.get(espacio).setText(temp);
                    espacio = 10;
                }
            }
        });
        
        btnNewButton_11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarEspacios(11, espacio)) {
                    String temp = btnNewButton_11.getText();
                    btnNewButton_11.setText("");
                    buttons.get(espacio).setText(temp);
                    espacio = 11;
                }
            }
        });
        
        btnNewButton_12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarEspacios(12, espacio)) {
                    String temp = btnNewButton_12.getText();
                    btnNewButton_12.setText("");
                    buttons.get(espacio).setText(temp);
                    espacio = 12;
                }
            }
        });
        
        btnNewButton_13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarEspacios(13, espacio)) {
                    String temp = btnNewButton_13.getText();
                    btnNewButton_13.setText("");
                    buttons.get(espacio).setText(temp);
                    espacio = 13;
                }
            }
        });
        
        btnNewButton_14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarEspacios(14, espacio)) {
                    String temp = btnNewButton_14.getText();
                    btnNewButton_14.setText("");
                    buttons.get(espacio).setText(temp);
                    espacio = 14;
                }
            }
        });
        
        btnNewButton_15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarEspacios(15, espacio)) {
                    String temp = btnNewButton_15.getText();
                    btnNewButton_15.setText("");
                    buttons.get(espacio).setText(temp);
                    espacio = 15;
                }
            }
        });
        
        btnNewButton_16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CambiarBotones(); 
            }
        });
    }
    private boolean validarEspacios(int index1, int index2) {
        int row1 = index1 / 4;
        int col1 = index1 % 4;
        int row2 = index2 / 4;
        int col2 = index2 % 4;
        
        return (Math.abs(row1 - row2) == 1 && col1 == col2) || 
               (Math.abs(col1 - col2) == 1 && row1 == row2);
    }
        
  }
	

