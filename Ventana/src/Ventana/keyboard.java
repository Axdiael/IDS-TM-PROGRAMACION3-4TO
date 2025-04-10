package Ventana;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class keyboard extends JFrame implements KeyListener {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    PaintPanel paintPanel;
    private JPanel timerPanel;
    private Player player;
    java.util.List<Player> obstaculos = new java.util.ArrayList<>();
    Timer tiempo;
	private Timer timer2;
    private JLabel tiempoLabel;
    private int segundos = 0;
    private final int movimiento = 5;
    int x = 300;  
    int y = 200;  
    private final int tamCuadro = 20;
    final int AnchoPanel = 586;
    final int LargoPanel = 363;
    private int contador = 0;
    private int ultimaTecla = -1;
    
    /*
     * Launch the application.
     */
    class PaintPanel extends JPanel {
        public PaintPanel() {
            this.setBackground(Color.black);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(Color.green);
            g2.fillRect(x, y, 20, 20);
            

            for (Player obs : obstaculos) {
                g2.setColor(obs.c);
                g2.fillRect(obs.x, obs.y, obs.w, obs.h);
            }
        }
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    keyboard frame = new keyboard();
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
    public keyboard() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 500);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
       
        timerPanel = new JPanel();
        timerPanel.setBackground(Color.darkGray); 
        timerPanel.setBounds(0, 0, 586, 50); 
        timerPanel.setLayout(null);
        contentPane.add(timerPanel);
        
        tiempoLabel = new JLabel("Tiempo: 0s");
        tiempoLabel.setForeground(new Color(255, 255, 255));
        tiempoLabel.setFont(new Font("Serif", Font.BOLD, 28));
        tiempoLabel.setBounds(227, 10, 179, 35);
        timerPanel.add(tiempoLabel);
        
        paintPanel = new PaintPanel();
        paintPanel.setBounds(0, 50, 586, 363); 
        contentPane.add(paintPanel);
        
        JButton btnNewButton = new JButton("Reiniciar");
        btnNewButton.setBackground(new Color(255, 255, 255));
        btnNewButton.setBounds(0, 420, 586, 43);
        contentPane.add(btnNewButton);
        
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	x = 300;  
                y = 200;
                player.x = x; 
                player.y = y;
                paintPanel.repaint();
                keyboard.this.requestFocusInWindow();
                
                segundos = 0;
                tiempoLabel.setText("Tiempo: 0s");
                tiempo.stop();
                timer2.stop();
                contador = 0; 
                ultimaTecla = -1;
                
            }
        });
        
        addKeyListener(this);
        setFocusable(true);
        
        tiempo = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                segundos++;
                tiempoLabel.setText("Tiempo: " + segundos + "s");
            }
        });
        
        ActionListener mover = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	if (ultimaTecla != -1) { 
                    player.update(ultimaTecla, keyboard.this);
                }
            }
        };

        timer2 = new Timer(5, mover);
        
        player = new Player(x, y, tamCuadro, tamCuadro, Color.green, movimiento);
        obstaculos.add(new Player(150, 200, 50, 120, Color.orange, movimiento));
        obstaculos.add(new Player(400, 100, 40, 200, Color.red, movimiento));
        requestFocusInWindow();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void keyPressed(KeyEvent e) {
    	
    	System.out.println("Tecla: " + e.getKeyCode());
    	
    	ultimaTecla = e.getKeyCode();
        if (contador == 0) {
            timer2.start(); 
            contador = 1;
        }
    }
        

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
    	
    	
    }
 }
    

	class Player {
		int x, y, w, h;
		Color c = Color.black;
		private final int movimiento; 
	    private final int tamCuadro;
		
		public Player(int x, int y, int w, int h, Color c,int movimiento) {
			this.x = x;
			this.y = y;
			this.w = w;
			this.h = h;
			this.c = c;
			this.movimiento = movimiento;
	        this.tamCuadro = w;
		}
		
		public void update(int keyCode, keyboard frame) {
	       
			if (!frame.tiempo.isRunning()) {
	            frame.tiempo.start();
	        }

	        int nx = x;
	        int ny = y;

	        if (keyCode == KeyEvent.VK_W && y - movimiento >= 0) {
	            ny -= movimiento;
	        }
	        if (keyCode == KeyEvent.VK_S && y + tamCuadro + movimiento <= frame.LargoPanel) {
	            ny += movimiento;
	        }
	        if (keyCode == KeyEvent.VK_A && x - movimiento >= 0) {
	            nx -= movimiento;
	        }
	        if (keyCode == KeyEvent.VK_D && x + tamCuadro + movimiento <= frame.AnchoPanel) {
	            nx += movimiento;
	        }

	        Player intento = new Player(nx, ny, tamCuadro, tamCuadro, c, movimiento);
	        boolean Colision = false;
	        for (Player obstaculo : frame.obstaculos) {
	            if (intento.colision(obstaculo)) {
	                System.out.println("Colisión en: " + obstaculo.x + ", " + obstaculo.y);
	                Colision = true;
	                break;
	            }
	        }

	        if (!Colision) {
	            x = nx;
	            y = ny;
	            frame.x = nx;
	            frame.y = ny;
	        }

	        frame.paintPanel.repaint();
	    }

	    public Boolean colision(Player target) {
	        return this.x < target.x + target.w &&
	               this.x + this.w > target.x &&
	               this.y < target.y + target.h &&
	               this.y + this.h > target.y;
	    }
	}
