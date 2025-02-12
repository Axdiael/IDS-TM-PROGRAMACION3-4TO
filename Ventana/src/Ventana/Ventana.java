package Ventana;
import java.awt.Color;
import java.awt.color.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana extends JFrame{

	JFrame Ventana = new JFrame();
	
	public Ventana(String title) {
		//Pone el titulo
		this.setTitle("Acceso");
		//hace visible la ventana
		this.setVisible(true);
		this.setSize(500, 500);
		//Sirve para ajustar el tamaño de la ventana
		this.setResizable(false);
		//Elimina el formato predeterminado de la ventana (ayuda a que funcionen las otras modificaciones)
		this.setLayout(null);
		//que pasa cuando cierro mi aplicación
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Sobre que elemento colocare el item
		this.setLocationRelativeTo(null);
		
		JLabel etiqueta1 = new JLabel ("Bienvenido");
		
		etiqueta1.setSize(100, 100);
		etiqueta1.setLocation(10, 50);
		etiqueta1.setBackground(Color.orange);
		
		this.add(etiqueta1);
	}
}
