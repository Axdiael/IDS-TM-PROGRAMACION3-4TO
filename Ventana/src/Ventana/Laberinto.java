package Ventana;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Laberinto extends JFrame implements KeyListener {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    PaintPanel paintPanel;
    private JPanel timerPanel;
    private Image imagenJugador;
    private ImageIcon imagenMeta;
    private ImageIcon imagenIcono;
    private Jugador jugador; 
    private Jugador meta;
    java.util.List<Jugador> obstaculos = new java.util.ArrayList<>();
    Timer tiempo;
    private Timer timer2;
    private JLabel tiempoLabel;
    private int segundos = 0;
    private final int movimiento = 5;
    int x = 10;
    int y = 0;
    private final int tamCuadro = 20;
    final int AnchoPanel = 700;
    final int LargoPanel = 700;
    private int contador = 0;
    private int ultimaTecla = -1;
    private int nivelActual;
    private Clip musicaFondo;
    
    /*
     * Launch the application.
     */
    class PaintPanel extends JPanel {
        public PaintPanel() {
            this.setBackground(Color.decode("#F4F1BB"));
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            
            g2.drawImage(imagenJugador, x, y, tamCuadro+10, tamCuadro+10, this);
            g2.drawImage(imagenMeta.getImage(), meta.x, meta.y, 84, 40, this);

            for (Jugador obs : obstaculos) { 
                g2.setColor(obs.c);
                g2.fillRect(obs.x, obs.y, obs.w, obs.h);
            }
            
            g2.setColor(Color.decode("#F4F1BB"));
            g2.fillRect(meta.x, meta.y, meta.w, meta.h);
         
        }
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Inicio().setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Laberinto(int nivel) {
        this.nivelActual = nivel;
        setTitle("Laberinto - Nivel " + nivel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 700, 770);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        
        imagenJugador = new ImageIcon(getClass().getResource("/Ventana/chavo.png")).getImage();
        imagenMeta = new ImageIcon(getClass().getResource("/Ventana/torta.png"));

        timerPanel = new JPanel();
        timerPanel.setBackground(Color.darkGray);
        timerPanel.setBounds(0, 0, 997, 50);
        timerPanel.setLayout(null);
        contentPane.add(timerPanel);

        tiempoLabel = new JLabel("Tiempo: 0s");
        tiempoLabel.setForeground(new Color(255, 255, 255));
        tiempoLabel.setFont(new Font("Serif", Font.BOLD, 28));
        tiempoLabel.setBounds(265, 10, 179, 35);
        timerPanel.add(tiempoLabel);

        paintPanel = new PaintPanel();
        paintPanel.setBounds(0, 50, 700, 650);
        contentPane.add(paintPanel);

        JButton btnReiniciar = new JButton("Reiniciar");
        btnReiniciar.setBackground(new Color(255, 255, 255));
        btnReiniciar.setBounds(0, 690, 343, 43);
        contentPane.add(btnReiniciar);

        JButton btnVolverInicio = new JButton("Volver al Inicio");
        btnVolverInicio.setBackground(new Color(255, 255, 255));
        btnVolverInicio.setBounds(343, 690, 343, 43);
        contentPane.add(btnVolverInicio);

        btnReiniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reiniciarNivel();
            }
        });

        btnVolverInicio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Inicio().setVisible(true);
                dispose();
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
                    jugador.update(ultimaTecla, Laberinto.this); 
                    
                    ImageIcon iconoVictoria = new ImageIcon(getClass().getResource("/Ventana/ganador.png"));
                    if (jugador.colisionaCon(meta)) {
                        tiempo.stop();
                        timer2.stop();
                        detenerMusica();
                        JOptionPane.showMessageDialog(
                                null, 
                                "El Chavo llego por su torta en " + segundos + " segundos", 
                                "¡Ganaste!", 
                                JOptionPane.INFORMATION_MESSAGE, 
                                iconoVictoria
                            );
                        dispose();
                        new Inicio().setVisible(true);
                    }
                }
            }
        };

        timer2 = new Timer(10, mover);

        jugador = new Jugador(x, y, tamCuadro+10, tamCuadro+10, Color.green, movimiento); 
        
        if(nivelActual == 1) {
            cargarNivel1();
            reproducirMusica("/Ventana/musicaChavo.wav");
        } else {
            cargarNivel2();
            reproducirMusica("/Ventana/musicaChavo.wav");
        }
        
        requestFocusInWindow();
    }

    private void cargarNivel1() {
        x = 10;
        y = 0;
        
        obstaculos.clear();
        obstaculos.add(new Jugador(50, 0, 550, 10, Color.decode("#AB9680"), 0));    
        obstaculos.add(new Jugador(0, 590, 600, 10, Color.decode("#AB9680"), 0));  
        obstaculos.add(new Jugador(0, 0, 10, 600, Color.decode("#AB9680"), 0));   
        obstaculos.add(new Jugador(590, 0, 10, 550, Color.decode("#AB9680"), 0));
        
        obstaculos.add(new Jugador(50, 0, 10, 60, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(150, 0, 10, 60, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(350, 0, 10, 180, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(470, 0, 10, 60, Color.decode("#AB9680"), 0));
        
        obstaculos.add(new Jugador(50, 60, 40, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(90, 60, 10, 120, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(90, 180, 60, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(150, 120, 10, 160, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(150, 120, 100, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(250, 60, 10, 70, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(220, 60, 70, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(290, 180, 70, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(290, 130, 10, 110, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(210, 230,80, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(210, 180,10, 60, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(210, 180,40, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(350, 230, 60, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(400, 60, 10, 170, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(400, 60, 30, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(430, 60, 10, 60, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(430, 120, 120, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(470, 130, 10, 60, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(500, 90, 10, 150, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(540, 60, 60, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(540, 180, 60, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(440, 230, 100, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(540, 230, 10, 60, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(440, 170, 10, 120, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(250, 280, 190, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(250, 280, 10, 90, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(40, 280, 170, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(210, 280, 10, 170, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(50, 230, 60, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(50, 120, 10, 110, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(00, 120, 50, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(0, 320, 170, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(40, 360, 170, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(40, 360, 10, 190, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(40, 500, 70, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(210, 550, 10, 50, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(150, 500, 200, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(250, 470, 10, 30, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(190, 430, 110, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(300, 330, 10, 140, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(210, 395, 30, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(340, 400, 10, 110, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(340, 290, 10, 60, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(300, 340, 40, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(340, 400, 60, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(400, 330, 10, 180, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(440, 290, 10, 160, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(440, 410, 90, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(410, 500, 80, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(500, 370, 60, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(530, 370, 10, 120, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(485, 460, 10, 80, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(270, 540, 280, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(90, 540, 10, 60, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(90, 540, 70, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(90, 400, 10, 60, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(90, 400, 70, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(90, 460, 70, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(150, 460, 10, 80, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(475, 280, 40, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(475, 280, 10, 50, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(475, 330, 125, 10, Color.decode("#AB9680"), 0));
        
        meta = new Jugador(590, 550, 10, 40, Color.red, 0);
        
    }

    private void cargarNivel2() {
        x = 10;
        y = 10;
        
        obstaculos.clear();
        obstaculos.add(new Jugador(50, 0, 600, 10, Color.decode("#AB9680"), 0));    
        obstaculos.add(new Jugador(0, 590, 590, 10, Color.decode("#AB9680"), 0));  
        obstaculos.add(new Jugador(0, 0, 10, 600, Color.decode("#AB9680"), 0));   
        obstaculos.add(new Jugador(640, 0, 10, 550, Color.decode("#AB9680"), 0));
        
        obstaculos.add(new Jugador(0, 55, 90, 10, Color.decode("#AB9680"), 0));  
        obstaculos.add(new Jugador(45, 55, 10, 90, Color.decode("#AB9680"), 0)); 
        
        obstaculos.add(new Jugador(145, 10, 10, 180, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(255, 10, 10, 55, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(210, 55, 45, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(210, 55, 10, 45, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(345, 10, 10, 45, Color.decode("#AB9680"), 0));
        
        obstaculos.add(new Jugador(100, 100, 45, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(100, 100, 10, 90, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(55, 180, 55, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(45, 180, 10, 155, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(55, 280, 100, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(145, 290, 10, 45, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(145, 325, 120, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(255, 190, 10, 135, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(255, 280, 100, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(355, 280, 10, 270, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(55, 550, 45, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(210, 550, 45, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(255, 505, 10, 55, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(255, 505, 55, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(310, 325, 10, 190, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(255, 370, 55, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(255, 370, 10, 110, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(45, 470, 210, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(45, 470, 10, 90, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(320, 550, 45, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(10, 375, 145, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(10, 420, 45, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(90, 330, 10, 145, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(200, 330, 10, 90, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(155, 420, 55, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(100, 510, 100, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(145, 510, 10, 90, Color.decode("#AB9680"), 0));
        
        obstaculos.add(new Jugador(300, 55, 10, 180, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(345, 155, 10, 45, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(345, 155, 105, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(300, 155, 10, 55, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(450, 100, 10, 135, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(450, 235, 150, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(590, 235, 10, 170, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(490, 395, 100, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(405, 365, 10, 235, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(405, 365, 90, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(490, 365, 10, 40, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(360, 320, 180, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(300, 235, 100, 10, Color.decode("#AB9680"), 0));
        //obstaculos.add(new Jugador(400, 190, 10, 90, Color.white, 0));
        obstaculos.add(new Jugador(400, 280, 140, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(540, 280, 10, 80, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(540, 405, 10, 140, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(490, 545, 10, 45, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(490, 450, 10, 45, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(460, 495, 90, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(415, 430, 35, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(600, 470, 45, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(600, 540,45, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(540, 505, 25, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(110, 235, 100, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(210, 145, 10, 135, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(210, 145, 55, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(210, 145, 55, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(255, 110, 10, 45, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(255, 110, 145, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(400, 55, 10, 65, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(400, 55, 100, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(500, 55, 10, 145, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(500, 145, 100, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(545, 55, 10, 100, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(590, 55, 10, 45, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(590, 100, 55, 10, Color.decode("#AB9680"), 0));
        obstaculos.add(new Jugador(590, 155, 10, 45, Color.decode("#AB9680"), 0));
        
        meta = new Jugador(590, 550, 10, 40, Color.red, 0);
        
    }

    private void reiniciarNivel() {
        x = 10;
        y = (nivelActual == 1) ? 0 : 10;
        jugador.x = x; 
        jugador.y = y;
        paintPanel.repaint();
        this.requestFocusInWindow();

        segundos = 0;
        tiempoLabel.setText("Tiempo: 0s");
        tiempo.stop();
        timer2.stop();
        contador = 0;
        ultimaTecla = -1;
        
        reproducirMusica("/Ventana/musicaChavo.wav");
    }
    
    private void reproducirMusica(String rutaArchivo) {
        try {
            
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource("/Ventana/musicaChavo.wav"));
            musicaFondo = AudioSystem.getClip();
            musicaFondo.open(audioInputStream);
            musicaFondo.loop(Clip.LOOP_CONTINUOUSLY); 
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error : " + e.getMessage());
        }
    }
    
    private void detenerMusica() {
        if (musicaFondo != null && musicaFondo.isRunning()) {
            musicaFondo.stop();
            musicaFondo.close();
            System.out.println("Música detenida");
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {
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
    }
}

class Jugador { 
    int x, y, w, h;
    Color c;
    private final int movimiento;
    private final int tamCuadro;

    public Jugador(int x, int y, int w, int h, Color c, int movimiento) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.c = c;
        this.movimiento = movimiento;
        this.tamCuadro = w;
    }

    public void update(int keyCode, Laberinto laberinto) {
        if (!laberinto.tiempo.isRunning()) {
            laberinto.tiempo.start();
        }

        int nx = x;
        int ny = y;

        if (keyCode == KeyEvent.VK_W && y - movimiento >= 0) {
            ny -= movimiento;
        }
        if (keyCode == KeyEvent.VK_S && y + tamCuadro + movimiento <= laberinto.LargoPanel) {
            ny += movimiento;
        }
        if (keyCode == KeyEvent.VK_A && x - movimiento >= 0) {
            nx -= movimiento;
        }
        if (keyCode == KeyEvent.VK_D && x + tamCuadro + movimiento <= laberinto.AnchoPanel) {
            nx += movimiento;
        }

        Jugador intento = new Jugador(nx, ny, tamCuadro, tamCuadro, c, movimiento); 
        boolean colision = false;
        for (Jugador obstaculo : laberinto.obstaculos) { 
            if (intento.colision(obstaculo)) {
                System.out.println("Colisión en: " + obstaculo.x + ", " + obstaculo.y);
                colision = true;
                break;
            }
        }

        if (!colision) {
            x = nx;
            y = ny;
            laberinto.x = nx;
            laberinto.y = ny;
        }

        laberinto.paintPanel.repaint();
    }
    
    

    public boolean colision(Jugador target) { 
        return this.x < target.x + target.w &&
               this.x + this.w > target.x &&
               this.y < target.y + target.h &&
               this.y + this.h > target.y;
    }
    
    public boolean colisionaCon(Jugador otro) {
        return this.x < otro.x + otro.w &&
               this.x + this.w > otro.x &&
               this.y < otro.y + otro.h &&
               this.y + this.h > otro.y;
    }
}

class Inicio extends JFrame {
    public Inicio() {
        setTitle("Selección de Nivel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        
        BackgroundPanel panel = new BackgroundPanel();
        panel.setLayout(null); 
        getContentPane().add(panel);
        
        JButton btnNivel1 = new JButton("Nivel 1");
        btnNivel1.setBounds(50, 220, 80, 30); 
        btnNivel1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Laberinto(1).setVisible(true);
                dispose();
            }
        });
        panel.add(btnNivel1);
        
        JButton btnNivel2 = new JButton("Nivel 2");
        btnNivel2.setBounds(150, 220, 80, 30); 
        btnNivel2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Laberinto(2).setVisible(true);
                dispose();
            }
        });
        panel.add(btnNivel2);
    }
    
    
    class BackgroundPanel extends JPanel {
        private Image backgroundImage;
        
        public BackgroundPanel() {
            
            backgroundImage = new ImageIcon(getClass().getResource("/Ventana/fondoC.png")).getImage();
        }
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            g.drawImage(backgroundImage, 0, -10, getWidth(), getHeight()+10, this);
        }
    }
}
