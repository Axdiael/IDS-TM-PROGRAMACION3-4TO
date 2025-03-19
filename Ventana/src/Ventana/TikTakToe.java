package Ventana;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TikTakToe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public boolean turno;
	JButton btnNewButton_6;
	JButton btnNewButton_4;
	JButton btnNewButton_1;
	JButton btnNewButton_5;
	JButton btnNewButton_2;
	JButton btnNewButton_3;
	JButton btnNewButton_7;
	JButton btnNewButton_8;
	JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TikTakToe frame = new TikTakToe();
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
	public TikTakToe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 3, 0, 0));
		
		btnNewButton_6 = new JButton("");
		contentPane.add(btnNewButton_6);
		btnNewButton_6.setFont(new Font("Andale Mono", Font.BOLD, 18));
		
		btnNewButton_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String player = turno ? "X" : "O";
                turno = !turno; 
                btnNewButton_6.setText(player);
                verificar();
            }
        });           
        
		btnNewButton_4 = new JButton("");
		contentPane.add(btnNewButton_4);
		btnNewButton_4.setFont(new Font("Andale Mono", Font.BOLD, 18));
		
		btnNewButton_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String player = turno ? "X" : "O";
                turno = !turno; 
                btnNewButton_4.setText(player);
                verificar();
            }
        });
		btnNewButton_1 = new JButton("");
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Andale Mono", Font.BOLD, 18));
		
		btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String player = turno ? "X" : "O";
                turno = !turno; 
                btnNewButton_1.setText(player);
                verificar();
            }
        });
		
		btnNewButton_2 = new JButton("");
		contentPane.add(btnNewButton_2);
		btnNewButton_2.setFont(new Font("Andale Mono", Font.BOLD, 18));
		
		btnNewButton_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String player = turno ? "X" : "O";
                turno = !turno; 
                btnNewButton_2.setText(player);
                verificar();
            }
        });  
		
		btnNewButton_5 = new JButton("");
		contentPane.add(btnNewButton_5);
		btnNewButton_5.setFont(new Font("Andale Mono", Font.BOLD, 18));
		
		btnNewButton_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String player = turno ? "X" : "O";
                turno = !turno; 
                btnNewButton_5.setText(player);
                verificar();
            }
        });   
		
		btnNewButton_7 = new JButton("");
		contentPane.add(btnNewButton_7);
		btnNewButton_7.setFont(new Font("Andale Mono", Font.BOLD, 18));
		
		btnNewButton_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String player = turno ? "X" : "O";
                turno = !turno; 
                btnNewButton_7.setText(player);
                verificar();
            }
        });  
		
		btnNewButton_8 = new JButton("");
		contentPane.add(btnNewButton_8);
		btnNewButton_8.setFont(new Font("Andale Mono", Font.BOLD, 18));
		
		btnNewButton_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String player = turno ? "X" : "O";
                turno = !turno; 
                btnNewButton_8.setText(player);
                verificar();
            }
        });
		
		btnNewButton = new JButton("");
		contentPane.add(btnNewButton);
		btnNewButton.setFont(new Font("Andale Mono", Font.BOLD, 18));
		
		btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String player = turno ? "X" : "O";
                turno = !turno; 
                btnNewButton.setText(player);
                verificar();
            }
        });
		
		btnNewButton_3 = new JButton("");
		contentPane.add(btnNewButton_3);
		btnNewButton_3.setFont(new Font("Andale Mono", Font.BOLD, 18));
		
		btnNewButton_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String player = turno ? "X" : "O";
                turno = !turno; 
                btnNewButton_3.setText(player);
                verificar();
            }
        });
    	} 
		public void verificar() {
			if (btnNewButton_6.getText().equals(btnNewButton_4.getText()) &&  
		            btnNewButton_4.getText().equals(btnNewButton_1.getText()) &&
		            !btnNewButton_6.getText().equals("")) {
		            System.out.println("ganaste");
		            btnNewButton_6.setEnabled(false);
		            btnNewButton_4.setEnabled(false);
		            btnNewButton_1.setEnabled(false);
		            btnNewButton_5.setEnabled(false);
		            btnNewButton_2.setEnabled(false);
		            btnNewButton_3.setEnabled(false);
		            btnNewButton_7.setEnabled(false);
		            btnNewButton_8.setEnabled(false);
		            btnNewButton.setEnabled(false);
		        }
		        if (btnNewButton_2.getText().equals(btnNewButton_5.getText()) &&  
		            btnNewButton_5.getText().equals(btnNewButton_7.getText()) &&
		            !btnNewButton_2.getText().equals("")) {
		            System.out.println("ganaste");
		            btnNewButton_6.setEnabled(false);
		            btnNewButton_4.setEnabled(false);
		            btnNewButton_1.setEnabled(false);
		            btnNewButton_5.setEnabled(false);
		            btnNewButton_2.setEnabled(false);
		            btnNewButton_3.setEnabled(false);
		            btnNewButton_7.setEnabled(false);
		            btnNewButton_8.setEnabled(false);
		            btnNewButton.setEnabled(false);
		        }
		        if (btnNewButton_8.getText().equals(btnNewButton.getText()) &&  
		            btnNewButton.getText().equals(btnNewButton_3.getText()) &&
		            !btnNewButton_8.getText().equals("")) {
		            System.out.println("ganaste");
		            btnNewButton_6.setEnabled(false);
		            btnNewButton_4.setEnabled(false);
		            btnNewButton_1.setEnabled(false);
		            btnNewButton_5.setEnabled(false);
		            btnNewButton_2.setEnabled(false);
		            btnNewButton_3.setEnabled(false);
		            btnNewButton_7.setEnabled(false);
		            btnNewButton_8.setEnabled(false);
		            btnNewButton.setEnabled(false);
		        }
		        if (btnNewButton_6.getText().equals(btnNewButton_2.getText()) &&  
		            btnNewButton_2.getText().equals(btnNewButton_8.getText()) &&
		            !btnNewButton_6.getText().equals("")) {
		            System.out.println("ganaste");
		            btnNewButton_6.setEnabled(false);
		            btnNewButton_4.setEnabled(false);
		            btnNewButton_1.setEnabled(false);
		            btnNewButton_5.setEnabled(false);
		            btnNewButton_2.setEnabled(false);
		            btnNewButton_3.setEnabled(false);
		            btnNewButton_7.setEnabled(false);
		            btnNewButton_8.setEnabled(false);
		            btnNewButton.setEnabled(false);
		        }
		        if (btnNewButton_4.getText().equals(btnNewButton_5.getText()) &&  
		            btnNewButton_5.getText().equals(btnNewButton.getText()) &&
		            !btnNewButton_4.getText().equals("")) {
		            System.out.println("ganaste");
		            btnNewButton_6.setEnabled(false);
		            btnNewButton_4.setEnabled(false);
		            btnNewButton_1.setEnabled(false);
		            btnNewButton_5.setEnabled(false);
		            btnNewButton_2.setEnabled(false);
		            btnNewButton_3.setEnabled(false);
		            btnNewButton_7.setEnabled(false);
		            btnNewButton_8.setEnabled(false);
		            btnNewButton.setEnabled(false);
		        }
		        if (btnNewButton_1.getText().equals(btnNewButton_7.getText()) &&  
		            btnNewButton_7.getText().equals(btnNewButton_3.getText()) &&
		            !btnNewButton_1.getText().equals("")) {
		            System.out.println("ganaste");
		            btnNewButton_6.setEnabled(false);
		            btnNewButton_4.setEnabled(false);
		            btnNewButton_1.setEnabled(false);
		            btnNewButton_5.setEnabled(false);
		            btnNewButton_2.setEnabled(false);
		            btnNewButton_3.setEnabled(false);
		            btnNewButton_7.setEnabled(false);
		            btnNewButton_8.setEnabled(false);
		            btnNewButton.setEnabled(false);
		        }
		        if (btnNewButton_6.getText().equals(btnNewButton_5.getText()) &&  
		            btnNewButton_5.getText().equals(btnNewButton_3.getText()) &&
		            !btnNewButton_6.getText().equals("")) {
		            System.out.println("ganaste");
		            btnNewButton_6.setEnabled(false);
		            btnNewButton_4.setEnabled(false);
		            btnNewButton_1.setEnabled(false);
		            btnNewButton_5.setEnabled(false);
		            btnNewButton_2.setEnabled(false);
		            btnNewButton_3.setEnabled(false);
		            btnNewButton_7.setEnabled(false);
		            btnNewButton_8.setEnabled(false);
		            btnNewButton.setEnabled(false);
		        }
		        if (btnNewButton_1.getText().equals(btnNewButton_5.getText()) &&  
		            btnNewButton_5.getText().equals(btnNewButton_8.getText()) &&
		            !btnNewButton_1.getText().equals("")) {
		            System.out.println("ganaste");
		            btnNewButton_6.setEnabled(false);
		            btnNewButton_4.setEnabled(false);
		            btnNewButton_1.setEnabled(false);
		            btnNewButton_5.setEnabled(false);
		            btnNewButton_2.setEnabled(false);
		            btnNewButton_3.setEnabled(false);
		            btnNewButton_7.setEnabled(false);
		            btnNewButton_8.setEnabled(false);
		            btnNewButton.setEnabled(false);
		        }
	        
		}

	}
