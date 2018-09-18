package ejercicio11;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private static JFrame constructor;
	private JButton boton1, boton2;
	private JLabel texto;
	private int c1 = 0, c2 = 0;
	
	public Ventana() {
		
		constructor = new JFrame();
		constructor.setLayout(null);
		
		constructor.setTitle("Ejemplo09");
		constructor.setSize(350, 500);
		constructor.setDefaultCloseOperation(3);
		constructor.setLocationRelativeTo(null);
		
		//Boton izq
		boton1 = new JButton("Boton01");
		boton1.setBounds(50, 75, 100, 50);
		boton1.addActionListener(this);
		constructor.add(boton1);
		
		//Boton der
		boton2 = new JButton("Boton02");
		boton2.setBounds(200, 75, 100, 50);
		boton2.addActionListener(this);
		constructor.add(boton2);
		
		texto = new JLabel("Boton 1: " + c1 + " veces // Boton 2: " + c2);
		texto.setBounds(100, 50, 350, 20);
		constructor.add(texto);
		
		constructor.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton1) {
			c1++;
			texto.setText("Boton 1: " + c1 + " veces // Boton 2: " + c2);
		}
		if(e.getSource() == boton2) {
			c2++;
			texto.setText("Boton 1: " + c1 + " veces // Boton 2: " + c2);
		}
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ventana ventana = new Ventana();
	}
}
