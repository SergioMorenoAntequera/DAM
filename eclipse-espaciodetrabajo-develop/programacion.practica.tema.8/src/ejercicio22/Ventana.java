package ejercicio22;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;

public class Ventana extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	protected static JFrame constructor;
	protected static Ventana ventana1;
	protected JButton boton1;
	protected static JLabel fechaCorta, fechaLarga;
	
	public Ventana() {
		
		constructor = new JFrame();
		constructor.setLayout(null);
		
		constructor.setTitle("Ejemplo22");
		constructor.setSize(400, 300);
		constructor.setDefaultCloseOperation(HIDE_ON_CLOSE);
		constructor.setLocationRelativeTo(null);
		
		//Boton para introducir las fechas
		boton1 = new JButton("Introducir fecha de nacimineto");
		boton1.setBounds(75, 30, 250, 30);
		boton1.addActionListener(this);
		constructor.add(boton1);
		
		Border border = LineBorder.createBlackLineBorder();
		//Texto fecha corta
		fechaCorta = new JLabel();
		fechaCorta.setBounds(150, 100, 100, 25);
		fechaCorta.setBorder(border);
		constructor.add(fechaCorta);
		
		//Texto fecha larga
		fechaLarga = new JLabel();
		fechaLarga.setBounds(75, 200, 250, 25);
		fechaLarga.setBorder(border);
		constructor.add(fechaLarga);
		
		constructor.setVisible(true);
	} 
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton1) {
			@SuppressWarnings("unused")
			Ventana02 ventana02 = new Ventana02();
		}
	}

	public static void main(String[] args) {
		ventana1 = new Ventana();
	}
}
