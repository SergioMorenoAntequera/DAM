package ejercicio10;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ventana extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private static JFrame constructor;
	private JButton boton1, boton2, boton3, boton4;
	
	public Ventana() {
		
		constructor = new JFrame();
		constructor.setLayout(null);
		
		constructor.setTitle("Ejemplo09");
		constructor.setSize(350, 180);
		constructor.setDefaultCloseOperation(3);
		constructor.setLocationRelativeTo(null);
		
		//Boton arriba izquierda
		boton1 = new JButton("Azul");
		boton1.setBounds(10, 10, 150, 50);
		boton1.addActionListener(this);
		constructor.add(boton1);
		
		//Boton arriba derecha
		boton2 = new JButton("Amarillo");
		boton2.setBounds(170, 10, 150, 50);
		boton2.addActionListener(this);
		constructor.add(boton2);
				
		//Boton abajo izquierda
		boton3 = new JButton("Rojo");
		boton3.setBounds(10, 70, 150, 50);
		boton3.addActionListener(this);
		constructor.add(boton3);
				
		//Boton abajo derecha
		boton4 = new JButton("Verde");
		boton4.setBounds(170, 70, 150, 50);
		boton4.addActionListener(this);
		constructor.add(boton4);
		
		constructor.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton1) {
			constructor.setBackground(Color.BLUE);
		}
		if(e.getSource() == boton2) {
			constructor.setBackground(Color.YELLOW);
		}
		
		if(e.getSource() == boton3) {
			constructor.setBackground(Color.RED);
		} 
		
		if(e.getSource() == boton4) {
			constructor.setBackground(Color.GREEN);
		}
		
	}
	
	public static void main(String[] args) {

		@SuppressWarnings("unused")
		Ventana ventana = new Ventana();
	}

	
	

}
