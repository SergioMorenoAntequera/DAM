package Ejemplo07;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//**************VENTANA 1***************
public class Ventana extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	static protected JFrame ventana1;
	private JButton boton1, boton2;
	protected static JTextArea escribir1, escribir2, escribir3;
	static protected String var1, var2, var3;
	
	public Ventana() {
		
		ventana1 = new JFrame();
		ventana1.setLayout(null);
		
		ventana1.setTitle("Ejemplo07");
		ventana1.setSize(300, 400);
		ventana1.setDefaultCloseOperation(3);
		ventana1.setLocationRelativeTo(null);
		
		//Textos de la izquierda 
		JLabel texto1 = new JLabel("Texto1");
		texto1.setBounds(50, 50, 75, 20);
		ventana1.add(texto1);
		JLabel texto2 = new JLabel("Texto2");
		texto2.setBounds(50, 120, 70, 20);
		ventana1.add(texto2);
		JLabel texto3 = new JLabel("Texto3");
		texto3.setBounds(50, 190, 70, 20);
		ventana1.add(texto3);

		//Espacios de texto de la derecha
		escribir1 = new JTextArea("");
		escribir1.setBounds(175, 50, 75, 20);
		escribir1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		ventana1.add(escribir1);
		escribir2 = new JTextArea("");
		escribir2.setBounds(175, 120, 75, 20);
		escribir2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		ventana1.add(escribir2);
		escribir3 = new JTextArea("");
		escribir3.setBounds(175, 190, 75, 20);
		escribir3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		ventana1.add(escribir3);
		
		//Botones de abajo
		boton1 = new JButton("Saluda");
		boton1.setBounds(40, 310, 85, 30);
		boton1.addActionListener(this);
		ventana1.add(boton1);
		
		boton2 = new JButton("Configura");
		boton2.setBounds(145, 310, 105, 30);
		boton2.addActionListener(this);
		ventana1.add(boton2);
		
		
		ventana1.setVisible(true);
	}

	@Override 
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton1) {
			System.out.println("Pues hola");
		}
		if(e.getSource() == boton2) {
			@SuppressWarnings("unused")
			Ventana2 ventana2 = new Ventana2();
		}
		
	}

	//**************MAIN***************
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ventana ventana1 = new Ventana();
	}
}

//**************VENTANA 2***************
class Ventana2 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JFrame ventana2;
	private JButton boton1;
	protected JTextField escribir1, escribir2, escribir3;
	

	public Ventana2() {
		
		ventana2 = new JFrame();
		ventana2.setLayout(null);
		
		ventana2.setTitle("Ejemplo07");
		ventana2.setSize(500, 200);
		ventana2.setDefaultCloseOperation(1);
		ventana2.setLocationRelativeTo(null);
		
		//Textos de la izquierda 
		JLabel texto1 = new JLabel("Texto1");
		texto1.setBounds(50, 50, 75, 20);
		ventana2.add(texto1);
		JLabel texto2 = new JLabel("Texto2");
		texto2.setBounds(50, 85, 75, 20);
		ventana2.add(texto2);
		JLabel texto3 = new JLabel("Texto3");
		texto3.setBounds(50, 120, 70, 20);
		ventana2.add(texto3);

		//Espacios de texto del centro
		escribir1 = new JTextField(Ventana.var1);
		escribir1.setBounds(175, 50, 75, 20);
		ventana2.add(escribir1);
		escribir2 = new JTextField(Ventana.var2);
		escribir2.setBounds(175, 85, 75, 20);
		ventana2.add(escribir2);
		escribir3 = new JTextField(Ventana.var3);
		escribir3.setBounds(175, 120, 75, 20);
		ventana2.add(escribir3);
		
		
		//Botones derecha
		boton1 = new JButton("Aceptar");
		boton1.setBounds(340, 80, 95, 30);
		boton1.addActionListener(this);
		ventana2.add(boton1);
		
		ventana2.setVisible(true);  
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton1) {
			Ventana.var1 = escribir1.getText();
			Ventana.var2 = escribir2.getText();
			Ventana.var3 = escribir3.getText();
			Ventana.escribir1.setText(Ventana.var1);
			Ventana.escribir2.setText(Ventana.var1);
			Ventana.escribir3.setText(Ventana.var1);
			ventana2.dispose();
		}
	}

}

