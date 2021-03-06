package ejercicio02;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JFrame constructor;
	protected JButton boton01;
	protected JTextField escribir02, escribir01;
	
	public Ventana() {
		
		constructor = new JFrame();
		constructor.setLayout(null);
		
		constructor.setTitle("Ejemplo02");
		constructor.setSize(400, 200);
		constructor.setDefaultCloseOperation(3);
		constructor.setLocationRelativeTo(null);
		
		//Hueco izquierda
		escribir01 = new JTextField();
		escribir01.setBounds(25, 30, 150, 50);
		constructor.add(escribir01);
		
		//Hueco derecha
		escribir02 = new JTextField();
		escribir02.setBounds(225, 30, 150, 50);
		constructor.add(escribir02);
		
		//Botón
		boton01 = new JButton("Sumar");
		boton01.setBounds(137, 100, 125, 60);
		boton01.addActionListener(this);
		constructor.add(boton01);
		
		constructor.setVisible(true);
	} 
	
	//********************TRIGGERS****************
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton01) {
			try {
				constructor.setTitle("Resultado: " + (Integer.parseInt(escribir02.getText()) + Integer.parseInt(escribir01.getText()))); 
			} catch (Exception eh) {
				constructor.setTitle("Ha ocurrido un error");
			}
		}
	}

	//*********************MAIN*******************
	public static void main(String[] args) {
		@SuppressWarnings ("unused")
		Ventana ventana1 = new Ventana();
	}
}
