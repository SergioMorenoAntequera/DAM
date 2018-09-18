package ejercicio07;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JFrame constructor;
	protected JButton boton01, boton02, boton03, boton04;
	protected JTextField escribir02, escribir01;
	protected JLabel resultado;
	
	public Ventana() {
		
		constructor = new JFrame();
		constructor.setLayout(null);
		
		constructor.setTitle("Ejemplo07");
		constructor.setSize(400, 300);
		constructor.setDefaultCloseOperation(3);
		constructor.setLocationRelativeTo(null);
		
		//Texto con el resultado
		resultado = new JLabel("Aquí el resultado");
		resultado.setBounds(137, 230, 200, 60);
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
		
		//Botón izq abajo
		boton03 = new JButton("Multiplicar");
		boton03.setBounds(25, 170, 150, 50);
		boton03.addActionListener(this);
		constructor.add(boton03);
				
		//Botón der abajo
		boton04 = new JButton("Dividir");
		boton04.setBounds(225, 170, 150, 50);
		boton04.addActionListener(this);
		constructor.add(boton04);
		
		constructor.setVisible(true);
	} 
	
	//********************TRIGGERS****************
	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			int num1 = Integer.parseInt(escribir01.getText());
			int num2 = Integer.parseInt(escribir02.getText());
			if(e.getSource() == boton01) {
				resultado.setText("Resultado: " + (num1 + num2)); 
			}
			if(e.getSource() == boton02) {
				resultado.setText("Resultado: " + (num1 - num2)); 
			}
			if(e.getSource() == boton03) {
				resultado.setText("Resultado: " + (num1 * num2)); 
			}
			if(e.getSource() == boton04) {
				resultado.setText("Resultado: " + (num1 / num2 + " // Resto: " + num1 % num2)); 
			}
			constructor.setTitle("Ejemplo07");
		} catch (ArithmeticException ae) {
			constructor.setTitle("No puedes dividir entre 0");
		} catch (Exception eh) {
			constructor.setTitle("Ha ocurrido un error");
		}
	}

	//*********************MAIN*******************
	public static void main(String[] args) {
		@SuppressWarnings ("unused")
		Ventana ventana1 = new Ventana();
	}
}
