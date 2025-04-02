package Ventana;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.JRadioButton;

public class Paint extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private int gruesoSlider=1;
	private Color color= Color.BLACK;
	
	private PaintPanel Panel_1;
	private ArrayList<figura> figuras = new ArrayList<>();
    private ArrayList<linea> puntos = new ArrayList<>();
    private List<List<linea>> listaDePuntos = new ArrayList<>();
    private boolean isBrushSelected = false;
    private int tool= 0; 
    private Point primerPunto;
    private boolean segundoClick;
    
    class linea {
        Point point;
        Color color;
        float strokeWidth;

        linea(Point point, Color color, float strokeWidth) {
            this.point = point;
            this.color = color;
            this.strokeWidth = strokeWidth;
        }
    }
    class figura {
        public int x, y, w, h;
        public Color color;
        public int tipo;
        public float strokeWidth;
        
        public figura( int x, int y, int w, int h, Color color, int tipo, float strokeWidth) {
        	this.x=x;
        	this.y=y;
        	this.w=w;
        	this.h=h;
        	this.color= color;
        	this.tipo=tipo;
        	this.strokeWidth=strokeWidth;
        
        }
    }

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
	
	class PaintPanel extends JPanel {
		public PaintPanel() {
            this.setBackground(Color.WHITE);
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;

            if (puntos.size() > 1) {
                for (int i = 1; i < puntos.size(); i++) {
                    g2.setColor(puntos.get(i).color);
                    g2.setStroke(new BasicStroke(puntos.get(i).strokeWidth));
                    Point p1 = puntos.get(i - 1).point;
                    Point p2 = puntos.get(i).point;
                    g2.drawLine(p1.x, p1.y, p2.x, p2.y);
                }
            }
            
            for (List<linea> trazo : listaDePuntos) {
                if (trazo.size() > 1) {
                    for (int i = 1; i < trazo.size(); i++) {
                        g2.setColor(trazo.get(i).color);
                        g2.setStroke(new BasicStroke(trazo.get(i).strokeWidth));
                        Point p1 = trazo.get(i - 1).point;
                        Point p2 = trazo.get(i).point;
                        g2.drawLine(p1.x, p1.y, p2.x, p2.y);
                    }
                }
            }
            
            for (figura f : figuras) {
                g2.setColor(f.color);
                g2.setStroke(new BasicStroke(f.strokeWidth));
                if (f.tipo == 1) {
                    g2.drawRect(f.x, f.y, f.w, f.h);
                } else if (f.tipo == 2) {
                    g2.drawOval(f.x, f.y, f.w, f.h);
                }else if (f.tipo==3) {
                	int[] xPoints = {f.x + f.w / 2, f.x, f.x + f.w};
                    int[] yPoints = {f.y, f.y + f.h, f.y + f.h};
                    g2.drawPolygon(xPoints, yPoints, 3);
                }else if (f.tipo == 4) {
                    
                    g2.drawLine(f.x, f.y, f.x + f.w, f.y + f.h);
                }
            }
        }
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
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tool= 1;
                
                isBrushSelected = false;
		        segundoClick = false; 
		        primerPunto = null;
            }
        });
		btnNewButton.setBounds(25, 48, 131, 23);
		panel.add(btnNewButton);
		
		JButton btnCircle = new JButton("Circle      ");
		btnCircle.setIcon(new ImageIcon("C:\\Users\\axdie\\git\\IDS-TM-PROGRAMACION3-4TO\\Ventana\\src\\Ventana\\circulo (1).png"));
		btnCircle.setForeground(Color.BLACK);
		btnCircle.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCircle.setBackground(Color.WHITE);
		btnCircle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tool=2;
                
                isBrushSelected = false;
		        segundoClick = false; 
		        primerPunto = null;
            }
        });
		btnCircle.setBounds(25, 80, 131, 23);
		panel.add(btnCircle);
		
		JButton btnTriangle = new JButton("Triangle");
		btnTriangle.setIcon(new ImageIcon("C:\\Users\\axdie\\git\\IDS-TM-PROGRAMACION3-4TO\\Ventana\\src\\Ventana\\Triangulo (2).png"));
		btnTriangle.setForeground(Color.BLACK);
		btnTriangle.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTriangle.setBackground(Color.WHITE);
		btnTriangle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tool=3;
                
                isBrushSelected = false;
		        segundoClick = false; 
		        primerPunto = null;
            }
        });
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
		btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                isBrushSelected = true;
            }
        });
		btnNewButton_2.setBounds(25, 212, 131, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Eraser   ");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\axdie\\git\\IDS-TM-PROGRAMACION3-4TO\\Ventana\\src\\Ventana\\Borrador (1).png"));
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setBounds(25, 245, 131, 23);
		panel.add(btnNewButton_3);
		
		JButton btnLine = new JButton(" Line    ");
		btnLine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tool=4;
				
				isBrushSelected = false;
		        segundoClick = false; 
		        primerPunto = null;
			}
		});
		btnLine.setIcon(new ImageIcon("C:\\Users\\axdie\\git\\IDS-TM-PROGRAMACION3-4TO\\Ventana\\src\\Ventana\\linea (1).png"));
		btnLine.setForeground(Color.BLACK);
		btnLine.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLine.setBackground(Color.WHITE);
		btnLine.setBounds(25, 146, 121, 23);
		panel.add(btnLine);
		
		JButton btnNewButton_4 = new JButton("Clean");
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listaDePuntos.clear();
                puntos.clear();
                figuras.clear();
                primerPunto=null;
                segundoClick=false;
                Panel_1.repaint();
            }
        });
		btnNewButton_4.setBounds(25, 452, 121, 21);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Save");
		btnNewButton_5.setBackground(new Color(255, 255, 255));
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setBounds(25, 484, 121, 21);
		panel.add(btnNewButton_5);
		
		JLabel lblColors = new JLabel("Colors");
		lblColors.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblColors.setBounds(25, 356, 87, 23);
		panel.add(lblColors);
		
		JSlider grueso = new JSlider();
		grueso.setValue(1);
		grueso.setMaximum(10);
		grueso.setBounds(25, 336, 131, 20);
		grueso.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                gruesoSlider = grueso.getValue();
            }
        });
		panel.add(grueso);
		
		
		JLabel lblNewLabel_1 = new JLabel("Thickness");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(59, 311, 65, 21);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton_6 = new JButton();
		btnNewButton_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                color = Color.WHITE;
            }
        });
		btnNewButton_6.setBackground(new Color(255, 255, 255));
		btnNewButton_6.setBounds(25, 389, 21, 21);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_6_1 = new JButton("");
		btnNewButton_6_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                color = Color.BLACK;
            }
        });
		btnNewButton_6_1.setBackground(new Color(0, 0, 0));
		btnNewButton_6_1.setBounds(59, 389, 21, 21);
		panel.add(btnNewButton_6_1);
		
		JButton btnNewButton_6_2 = new JButton("");
		btnNewButton_6_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                color = Color.RED;
            }
        });
		btnNewButton_6_2.setBackground(new Color(255, 0, 0));
		btnNewButton_6_2.setBounds(91, 389, 21, 21);
		panel.add(btnNewButton_6_2);
		
		JButton btnNewButton_6_3 = new JButton("");
		btnNewButton_6_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                color = new Color(128, 255, 128);
                isBrushSelected = true;
            }
        });
		btnNewButton_6_3.setBackground(new Color(128, 255, 128));
		btnNewButton_6_3.setBounds(122, 389, 21, 21);
		panel.add(btnNewButton_6_3);
		
		JButton btnNewButton_6_4 = new JButton("");
		btnNewButton_6_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                color = new Color(128, 255, 255);
                isBrushSelected = true;
            }
        });
		btnNewButton_6_4.setBackground(new Color(128, 255, 255));
		btnNewButton_6_4.setBounds(25, 421, 21, 21);
		
		panel.add(btnNewButton_6_4);
		
		JButton btnNewButton_6_5 = new JButton("");
		btnNewButton_6_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                color = new Color(192, 192, 192);
            }
        });
		btnNewButton_6_5.setBackground(new Color(192, 192, 192));
		btnNewButton_6_5.setBounds(60, 421, 21, 21);
		panel.add(btnNewButton_6_5);
		
		JButton btnNewButton_6_6 = new JButton("");
		btnNewButton_6_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                color = new Color(255, 255, 128);
            }
        });
		btnNewButton_6_6.setBackground(new Color(255, 255, 128));
		btnNewButton_6_6.setBounds(91, 421, 21, 21);
		panel.add(btnNewButton_6_6);
		
		JButton btnNewButton_6_7 = new JButton("");
		btnNewButton_6_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                color = new Color(255, 128, 255);
            }
        });
		btnNewButton_6_7.setBackground(new Color(255, 128, 255));
		btnNewButton_6_7.setBounds(122, 421, 21, 21);
		panel.add(btnNewButton_6_7);
		
		Panel_1 = new PaintPanel();
        Panel_1.setBounds(238, 39, 660, 536);
        Panel_1.addMouseListener(new MouseListener() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (isBrushSelected) {
                    puntos.clear();
                    puntos.add(new linea(e.getPoint(), color, gruesoSlider));
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (isBrushSelected && !puntos.isEmpty()) {
                    ArrayList<linea> trazo = new ArrayList<>(puntos);
                    listaDePuntos.add(trazo);
                    puntos.clear();
                    Panel_1.repaint();
                }
            }

            @Override
            public void mouseClicked(MouseEvent e) {
            	
                if (tool == 1) { 
                	figuras.add(new figura(e.getX()-40, e.getY()-40, 80, 80, color, 1, gruesoSlider));
                } else if (tool == 2) { 
                	figuras.add(new figura(e.getX()-40, e.getY()-40, 80, 80, color, 2, gruesoSlider));
                }else if (tool==3) {
                	figuras.add(new figura(e.getX()-40, e.getY()-40, 80, 80, color, 3,gruesoSlider));
                }else if (tool == 4) {
                    if (!segundoClick) {
                       
                        primerPunto = e.getPoint();
                        segundoClick = true;
                    } else {
                        
                        int dx = e.getX() - primerPunto.x;
                        int dy = e.getY() - primerPunto.y;
                        figuras.add(new figura(primerPunto.x, primerPunto.y, dx, dy, color, 4,gruesoSlider));
                        segundoClick = false;
                        primerPunto = null;
                        
                    }
                
                }
                Panel_1.repaint();
            }
            
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        });

        Panel_1.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if (isBrushSelected) {
                    puntos.add(new linea(e.getPoint(), color, gruesoSlider));
                    Panel_1.repaint();
                }
            }

            @Override
            public void mouseMoved(MouseEvent e) {}
        });
        contentPane.add(Panel_1);
    }
	

}
