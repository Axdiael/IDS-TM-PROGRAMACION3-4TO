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
                paintPanel.repaint();
                keyboard.this.requestFocusInWindow();
            }
        });
        
        addKeyListener(this);
        setFocusable(true);
        requestFocusInWindow();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Tecla: " + e.getKeyCode());
        
        int newX = x;
        int newY = y;
        
        switch(e.getKeyCode()) {
        case KeyEvent.VK_W:    
        	newY--;
            break;
        case KeyEvent.VK_S:    
        	newY++;
            break;
        case KeyEvent.VK_A:    
        	newX--;
            break;
        case KeyEvent.VK_D:    
            newX++;
            break;
        }
        if (newX >= 0 && newX <= AnchoPanel - tamCuadro) {
            x = newX;
        }
        if (newY >= 0 && newY <= LargoPanel - tamCuadro) {
            y = newY;
        }
        paintPanel.repaint(); 
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
    }
}