package ejercicio06;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JFrame constructor;
	protected JLabel resultado;
	protected JButton boton01, boton02;
	protected JTextField escribir02, escribir01;
	
	public Ventana() {
		
		constructor = new JFrame();
		constructor.setLayout(null);
		
		constructor.setTitle("Ejemplo06");
		constructor.setSize(400, 250);
		constructor.setDefaultCloseOperation(3);
		constructor.setLocationRelativeTo(null);
		
		//Texto con el resultado
		resultado = new JLabel("Resultado: ");
		resultado.setBounds(137, 160, 200, 60);
		constructor.add(resultado);
		
		//Hueco izquierda
		escribir01 = new JTextField();
		escribir01.setBounds(25, 30, 150, 50);
		constructor.add(escribir01);
		
		//Hueco derecha
		escribir02 = new JTextField();
		escribir02.setBounds(225, 30, 150, 50);
		constructor.add(escribir02);
		
		//Botón izquierda
		boton01 = new JButton("Sumar");
		boton01.setBounds(25, 100, 150, 50);
		boton01.addActionListener(this);
		constructor.add(boton01);
		
		//Botón derecha
		boton02 = new JButton("Restar");
		boton02.setBounds(225, 100, 150, 50);
		boton02.addActionListener(this);
		constructor.add(boton02);
		
		constructor.setVisible(true);
	} 
	
	//********************TRIGGERS****************
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton01) {
			try {
				resultado.setText("Resultado: " + (Integer.parseInt(escribir02.getText()) + Integer.parseInt(escribir01.getText()))); 
			} catch (Exception eh) {
				resultado.setText("Ha ocurrido un error");
			}
		}
		
		if(e.getSource() == boton02) {
			try {
				resultado.setText("Resultado: " + (Integer.parseInt(escribir02.getText()) - Integer.parseInt(escribir01.getText()))); 
			} catch (Exception eh) {
				resultado.setText("Ha ocurrido un error");
			}
		}
		
	}

	//*********************MAIN*******************
	public static void main(String[] args) {
		@SuppressWarnings ("unused")
		Ventana ventana1 = new Ventana();
	}
}
