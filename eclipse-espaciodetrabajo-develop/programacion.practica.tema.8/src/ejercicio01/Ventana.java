package ejercicio01;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JFrame constructor;
	protected JButton boton01;
	protected JTextField escribir01;
	
	public Ventana() {
		
		constructor = new JFrame();
		constructor.setLayout(null);
		
		constructor.setTitle("Ejemplo01");
		constructor.setSize(400, 200);
		constructor.setDefaultCloseOperation(3);
		constructor.setLocationRelativeTo(null);
		
		//Texto izquierda
		JLabel texto01 = new JLabel("Usuario: ");
		texto01.setBounds(50, 30, 100, 20);
		constructor.add(texto01);
		
		//Hueco derecha
		escribir01 = new JTextField();
		escribir01.setBounds(200, 30, 100, 20);
		constructor.add(escribir01);
		
		//Botón
		boton01 = new JButton("Aceptar");
		boton01.setBounds(50, 150, 100, 40);
		boton01.addActionListener(this);
		constructor.add(boton01);
		
		constructor.setVisible(true);
	} 
	
	//********************TRIGGERS****************
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton01) {
			constructor.setTitle("Bienvenido a Java " + escribir01.getText()); 
		}
	}

	//*********************MAIN*******************
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ventana ventana1 = new Ventana();
	}
}
