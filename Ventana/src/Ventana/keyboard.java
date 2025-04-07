package Ventana;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
        
        switch(e.getKeyCode()) {
        case KeyEvent.VK_W:    
            y--;
            break;
        case KeyEvent.VK_S:    
            y++;
            break;
        case KeyEvent.VK_A:    
            x--;
            break;
        case KeyEvent.VK_D:    
            x++;
            break;
        }
        paintPanel.repaint(); 
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
    }
}