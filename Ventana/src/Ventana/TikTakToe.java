package Ventana;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
	private JPanel panel;
	private JLabel Ganador_x;
	private JLabel Ganador_o;
	private int puntosX=0;
	private int puntosO=0;

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
		setBounds(100, 100, 601, 679);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(174, 94, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(174, 94, 255));
		panel.setBounds(0, 45, 587, 548);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 3, 8, 8));
		
		btnNewButton_6 = new JButton("");
		panel.add(btnNewButton_6);
		btnNewButton_6.setFont(new Font("Andale Mono", Font.BOLD, 18));
		
		btnNewButton_4 = new JButton("");
		panel.add(btnNewButton_4);
		btnNewButton_4.setFont(new Font("Andale Mono", Font.BOLD, 18));
		
		btnNewButton_1 = new JButton("");
		panel.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Andale Mono", Font.BOLD, 18));
		
		btnNewButton_8 = new JButton("");
		panel.add(btnNewButton_8);
		btnNewButton_8.setFont(new Font("Andale Mono", Font.BOLD, 18));


		Ganador_x = new JLabel("X= ");
		Ganador_x.setFont(new Font("Tahoma", Font.BOLD, 25));
		Ganador_x.setBounds(10, 10, 106, 25);
		contentPane.add(Ganador_x);
		
		Ganador_o = new JLabel("O= ");
		Ganador_o.setFont(new Font("Tahoma", Font.BOLD, 25));
		Ganador_o.setBounds(445, 10, 67, 25);
		contentPane.add(Ganador_o);
		
		
		
		btnNewButton_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String player ="X";
                if(turno) {
                	turno=false;
                	player=("X");
                	btnNewButton_8.setIcon(new ImageIcon("X.jpg"));
                	btnNewButton_8.setDisabledIcon(new ImageIcon("X.jpg"));
                }else {
                	turno=true;
                	player=("O");
                	btnNewButton_8.setIcon(new ImageIcon("O.jpg"));
                	btnNewButton_8.setDisabledIcon(new ImageIcon("O.jpg"));
                }
                btnNewButton_8.setText(player);
                btnNewButton_8.setEnabled(false);
                
                verificar();
            }
        });
		
		btnNewButton_2 = new JButton("");
		panel.add(btnNewButton_2);
		btnNewButton_2.setFont(new Font("Andale Mono", Font.BOLD, 18));
		
		btnNewButton_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String player ="X";
                if(turno) {
                	turno=false;
                	player=("X");
                	btnNewButton_2.setIcon(new ImageIcon("X.jpg"));
                	btnNewButton_2.setDisabledIcon(new ImageIcon("X.jpg"));
                }else {
                	turno=true;
                	player=("O");
                	btnNewButton_2.setIcon(new ImageIcon("O.jpg"));
                	btnNewButton_2.setDisabledIcon(new ImageIcon("O.jpg"));
                }
                btnNewButton_2.setText(player);
                btnNewButton_2.setEnabled(false);
                verificar();
            }
        });  
		
		btnNewButton = new JButton("");
		panel.add(btnNewButton);
		btnNewButton.setFont(new Font("Andale Mono", Font.BOLD, 18));
		
		btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String player ="X";
                if(turno) {
                	turno=false;
                	player=("X");
                	btnNewButton.setIcon(new ImageIcon("X.jpg"));
                	btnNewButton.setDisabledIcon(new ImageIcon("X.jpg"));
                }else {
                	turno=true;
                	player=("O");
                	btnNewButton.setIcon(new ImageIcon("O.jpg"));
                	btnNewButton.setDisabledIcon(new ImageIcon("O.jpg"));
                }
                btnNewButton.setText(player);
                btnNewButton.setEnabled(false);
                verificar();
            }
        });
		
		btnNewButton_3 = new JButton("");
		panel.add(btnNewButton_3);
		btnNewButton_3.setFont(new Font("Andale Mono", Font.BOLD, 18));
		
		btnNewButton_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String player ="X";
                if(turno) {
                	turno=false;
                	player=("X");
                	btnNewButton_3.setIcon(new ImageIcon("X.jpg"));
                	btnNewButton_3.setDisabledIcon(new ImageIcon("X.jpg"));
                }else {
                	turno=true;
                	player=("O");
                	btnNewButton_3.setIcon(new ImageIcon("O.jpg"));
                	btnNewButton_3.setDisabledIcon(new ImageIcon("O.jpg"));
                }
                btnNewButton_3.setText(player);
                btnNewButton_3.setEnabled(false);
                verificar();
            }
        });
		
		btnNewButton_7 = new JButton("");
		panel.add(btnNewButton_7);
		btnNewButton_7.setFont(new Font("Andale Mono", Font.BOLD, 18));
		
		btnNewButton_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String player ="X";
                if(turno) {
                	turno=false;
                	player=("X");
                	btnNewButton_7.setIcon(new ImageIcon("X.jpg"));
                	btnNewButton_7.setDisabledIcon(new ImageIcon("X.jpg"));
                }else {
                	turno=true;
                	player=("O");
                	btnNewButton_7.setIcon(new ImageIcon("O.jpg"));
                	btnNewButton_7.setDisabledIcon(new ImageIcon("O.jpg"));
                }
                btnNewButton_7.setText(player);
                btnNewButton_7.setEnabled(false);
                verificar();
            }
        });  
		
		btnNewButton_5 = new JButton("");
		panel.add(btnNewButton_5);
		btnNewButton_5.setFont(new Font("Andale Mono", Font.BOLD, 18));
		
		JButton btnNewButton_9 = new JButton("Reiniciar");
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_9.setBackground(new Color(128, 0, 255));
		btnNewButton_9.setBounds(0, 591, 587, 66);
		contentPane.add(btnNewButton_9);
		
		btnNewButton_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reiniciarTablero();
            }
        });
		
		
		
		btnNewButton_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String player ="X";
                if(turno) {
                	turno=false;
                	player=("X");
                	btnNewButton_5.setIcon(new ImageIcon("X.jpg"));
                	btnNewButton_5.setDisabledIcon(new ImageIcon("X.jpg"));
                }else {
                	turno=true;
                	player=("O");
                	btnNewButton_5.setIcon(new ImageIcon("O.jpg"));
                	btnNewButton_5.setDisabledIcon(new ImageIcon("O.jpg"));
                }
                btnNewButton_5.setText(player);
                btnNewButton_5.setEnabled(false);
                verificar();
            
            }
        });   
		
		btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String player ="X";
                if(turno) {
                	turno=false;
                	player=("X");
                	btnNewButton_1.setIcon(new ImageIcon("X.jpg"));
                	btnNewButton_1.setDisabledIcon(new ImageIcon("X.jpg"));
                }else {
                	turno=true;
                	player=("O");
                	btnNewButton_1.setIcon(new ImageIcon("O.jpg"));
                	btnNewButton_1.setDisabledIcon(new ImageIcon("O.jpg"));
                }
                btnNewButton_1.setText(player);
                btnNewButton_1.setEnabled(false);
                verificar();
            }
            
        });
		
		btnNewButton_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String player ="X";
                if(turno) {
                	turno=false;
                	player=("X");
                	btnNewButton_4.setIcon(new ImageIcon("X.jpg"));
                	btnNewButton_4.setDisabledIcon(new ImageIcon("X.jpg"));
                	
                }else {
                	turno=true;
                	player=("O");
                	btnNewButton_4.setIcon(new ImageIcon("O.jpg"));
                	btnNewButton_4.setDisabledIcon(new ImageIcon("O.jpg"));
                }
                btnNewButton_4.setText(player);
                btnNewButton_4.setEnabled(false);
                verificar();
            }
        });
		
		btnNewButton_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String player ="X";
                if(turno) {
                	turno=false;
                	player=("X");
                	btnNewButton_6.setIcon(new ImageIcon("X.jpg"));
                	btnNewButton_6.setDisabledIcon(new ImageIcon("X.jpg"));
                }else {
                	turno=true;
                	player=("O");
                	btnNewButton_6.setIcon(new ImageIcon("O.jpg"));
                	btnNewButton_6.setDisabledIcon(new ImageIcon("O.jpg"));
                }
                btnNewButton_6.setText(player);
                btnNewButton_6.setEnabled(false);
                verificar();
            }
        });           
    	} 
		public void verificar() {
			String ganar="";
			
			if (btnNewButton_6.getText().equals(btnNewButton_4.getText()) && 
			        btnNewButton_4.getText().equals(btnNewButton_1.getText()) &&
			        !btnNewButton_6.getText().equals("")) {
			        
					ganar = btnNewButton_6.getText();
					marcador(ganar);
				
					JOptionPane.showMessageDialog(this, "Ganador: " + ganar, "Fin de la partida", JOptionPane.INFORMATION_MESSAGE);
					
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
			  
			    else if (btnNewButton_8.getText().equals(btnNewButton_2.getText()) && 
			             btnNewButton_2.getText().equals(btnNewButton.getText()) &&
			             !btnNewButton_8.getText().equals("")) {
			    	
			    	ganar = btnNewButton_8.getText();
					marcador(ganar);
			    	
					JOptionPane.showMessageDialog(this, "Ganador: " + ganar, "Fin de la partida", JOptionPane.INFORMATION_MESSAGE);
			        
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
			    
			    else if (btnNewButton_3.getText().equals(btnNewButton_7.getText()) && 
			             btnNewButton_7.getText().equals(btnNewButton_5.getText()) &&
			             !btnNewButton_3.getText().equals("")) {
			        
			    	ganar = btnNewButton_3.getText();
					marcador(ganar);
			    	
					JOptionPane.showMessageDialog(this, "Ganador: " + ganar, "Fin de la partida", JOptionPane.INFORMATION_MESSAGE);
			    	
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
			    else if (btnNewButton_6.getText().equals(btnNewButton_8.getText()) && 
			             btnNewButton_8.getText().equals(btnNewButton_3.getText()) &&
			             !btnNewButton_6.getText().equals("")) {
			        
			    	ganar = btnNewButton_6.getText();
					marcador(ganar);
			    	
					JOptionPane.showMessageDialog(this, "Ganador: " + ganar, "Fin de la partida", JOptionPane.INFORMATION_MESSAGE);
			      
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
			    else if (btnNewButton_4.getText().equals(btnNewButton_2.getText()) && 
			             btnNewButton_2.getText().equals(btnNewButton_7.getText()) &&
			             !btnNewButton_4.getText().equals("")) {
			        
			    	ganar = btnNewButton_4.getText();
					marcador(ganar);
			    	
					JOptionPane.showMessageDialog(this, "Ganador: " + ganar, "Fin de la partida", JOptionPane.INFORMATION_MESSAGE);
			    	
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
			   
			    else if (btnNewButton_1.getText().equals(btnNewButton.getText()) && 
			             btnNewButton.getText().equals(btnNewButton_5.getText()) &&
			             !btnNewButton_1.getText().equals("")) {
			        
			    	ganar = btnNewButton_1.getText();
					marcador(ganar);
			    	
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
			    else if (btnNewButton_6.getText().equals(btnNewButton_2.getText()) && 
			             btnNewButton_2.getText().equals(btnNewButton_5.getText()) &&
			             !btnNewButton_6.getText().equals("")) {
			        
			    	ganar = btnNewButton_6.getText();
					marcador(ganar);
			    	
					JOptionPane.showMessageDialog(this, "Ganador: " + ganar, "Fin de la partida", JOptionPane.INFORMATION_MESSAGE);
			    	
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
			    else if (btnNewButton_1.getText().equals(btnNewButton_2.getText()) && 
			             btnNewButton_2.getText().equals(btnNewButton_3.getText()) &&
			             !btnNewButton_1.getText().equals("")) {
			       
			    	ganar = btnNewButton_1.getText();
					marcador(ganar);
			    	
					JOptionPane.showMessageDialog(this, "Ganador: " + ganar, "Fin de la partida", JOptionPane.INFORMATION_MESSAGE);
			    	
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
			    
			    else if (!btnNewButton_6.getText().equals("") &&
			             !btnNewButton_4.getText().equals("") &&
			             !btnNewButton_1.getText().equals("") &&
			             !btnNewButton_8.getText().equals("") &&
			             !btnNewButton_2.getText().equals("") &&
			             !btnNewButton.getText().equals("") &&
			             !btnNewButton_3.getText().equals("") &&
			             !btnNewButton_7.getText().equals("") &&
			             !btnNewButton_5.getText().equals("")) {
			    	JOptionPane.showMessageDialog(this, "Ya no hay movimientos", "Fin de la partida", JOptionPane.INFORMATION_MESSAGE);
		}
	}
		
		private void reiniciarTablero() {
	        btnNewButton_6.setText(""); 
	        btnNewButton_6.setEnabled(true);
	        btnNewButton_6.setIcon(null);
	        
	        btnNewButton_4.setText(""); 
	        btnNewButton_4.setEnabled(true);
	        btnNewButton_4.setIcon(null);
	        
	        btnNewButton_1.setText(""); 
	        btnNewButton_1.setEnabled(true);
	        btnNewButton_1.setIcon(null);
	        
	        btnNewButton_8.setText(""); 
	        btnNewButton_8.setEnabled(true);
	        btnNewButton_8.setIcon(null);
	        
	        btnNewButton_2.setText(""); 
	        btnNewButton_2.setEnabled(true);
	        btnNewButton_2.setIcon(null);
	        
	        btnNewButton.setText(""); 
	        btnNewButton.setEnabled(true);
	        btnNewButton.setIcon(null);
	    
	        btnNewButton_3.setText(""); 
	        btnNewButton_3.setEnabled(true);
	        btnNewButton_3.setIcon(null);
	        
	        btnNewButton_7.setText(""); 
	        btnNewButton_7.setEnabled(true);
	        btnNewButton_7.setIcon(null);
	        
	        btnNewButton_5.setText(""); 
	        btnNewButton_5.setEnabled(true);
	        btnNewButton_5.setIcon(null);
	        
	        turno = true; 
	    }
		
		private void marcador(String punto) {
			if (punto.equals("X")) {
				puntosX++;
				Ganador_x.setText(" X= "+ puntosX);
			} else if (punto.equals("O")) {
				puntosO++;
				Ganador_o.setText("O= "+ puntosO);
			}
		}
		
}
