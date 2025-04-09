package Ventana;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class keyboard extends JFrame implements KeyListener {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private PaintPanel paintPanel;
    private Player player;
    private java.util.List<Player> obstaculos = new java.util.ArrayList<>();
    private final int movimiento = 5;
    private int x = 300;  
    private int y = 200;  
    private final int tamCuadro = 20;
    private final int AnchoPanel = 586;
    private final int LargoPanel = 413;

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
        
        paintPanel = new PaintPanel();
        paintPanel.setBounds(0, 0, 586, 413);
        contentPane.add(paintPanel);
        
        JButton btnNewButton = new JButton("Reiniciar");
        btnNewButton.setBackground(new Color(255, 255, 255));
        btnNewButton.setBounds(0, 413, 586, 50);
        contentPane.add(btnNewButton);
        
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	x = 300;  
                y = 200;
                player.x = x; 
                player.y = y;
                paintPanel.repaint();
                keyboard.this.requestFocusInWindow();
            }
        });
        
        addKeyListener(this);
        setFocusable(true);
        
        player = new Player(x, y, tamCuadro, tamCuadro, Color.green);
        obstaculos.add(new Player(150, 200, 50, 120, Color.orange));
        obstaculos.add(new Player(400, 100, 40, 200, Color.red));
        requestFocusInWindow();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Tecla: " + e.getKeyCode());
        
        int nx = player.x;
        int ny = player.y;

        if (e.getKeyCode() == KeyEvent.VK_W && player.y - movimiento >= 0) {
            ny -= movimiento;
        }

        if (e.getKeyCode() == KeyEvent.VK_S && player.y + tamCuadro + movimiento <= LargoPanel) {
            ny += movimiento;
        }

        if (e.getKeyCode() == KeyEvent.VK_A && player.x - movimiento >= 0) {
            nx -= movimiento;
        }

        if (e.getKeyCode() == KeyEvent.VK_D && player.x + tamCuadro + movimiento <= AnchoPanel) {
            nx += movimiento;
        }

        
        Player intento = new Player(nx, ny, tamCuadro, tamCuadro, player.c);

        boolean Colision = false;
        for (Player obstaculo : obstaculos) {
            if (intento.colision(obstaculo)) {
            	System.out.println("Colisión en: " + obstaculo.x + ", " + obstaculo.y );
            	Colision = true;
                break;
            }
        }

        if (!Colision) {
            player.x = nx;
            player.y = ny;
            x = nx;
            y = ny;
        }

        paintPanel.repaint();
    
        
    }
        

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
    }
    
}
class Player {
	int x, y, w, h;
	Color c = Color.black;
	
	public Player(int x, int y, int w, int h, Color c) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.c = c;
	}
	public Boolean colision(Player target) {
		
		return this.x < target.x + target.w &&
                 this.x + this.w > target.x &&
                 this.y < target.y + target.h &&
                 this.y + this.h > target.y;
	}
	
}