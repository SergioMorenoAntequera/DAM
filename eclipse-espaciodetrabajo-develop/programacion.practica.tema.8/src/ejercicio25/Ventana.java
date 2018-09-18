package ejercicio25;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JFrame constructor;
	private JComboBox<String> moneda;
	private static JTextField cantidad;
	private JButton dolares, euros, yens, libras; 
	private JLabel resultado;
	private double cambio;
	
	
	public Ventana() {
		
		constructor = new JFrame();
		constructor.setLayout(null);
		
		constructor.setTitle("Ejercicio25");
		constructor.setSize(300, 420);
		constructor.setDefaultCloseOperation(3);
		constructor.setLocationRelativeTo(null);
		
		//Titulo
		JLabel tMonedaOrigen = new JLabel("MONEDA ORIGEN");
		tMonedaOrigen.setBounds(90, 20, 150, 30);
		constructor.add(tMonedaOrigen);
		
		//Menu desplegable
		moneda = new JComboBox<String>();
		moneda.setBounds(100, 70, 100,  30);
		moneda.addItem("Euros");
		moneda.addItem("Dolares");
		moneda.addItem("Yens");
		moneda.addItem("Libras");
		constructor.add(moneda);
		
		//Cantidad
		cantidad = new JTextField("Cantidad");
		cantidad.setBounds(100, 120, 100, 30);
		constructor.add(cantidad);
		
		//Convertir A...
		JLabel tConvertir = new JLabel("Convertir a: ");
		tConvertir.setBounds(100, 180, 100, 30);
		constructor.add(tConvertir);
		
		
		//Botones	
		euros = new JButton("Euros");
		euros.setBounds(40, 220, 100, 50);
		euros.addActionListener(this);
		constructor.add(euros);
		
		dolares = new JButton("Dolares");
		dolares.setBounds(160, 220, 100, 50);
		dolares.addActionListener(this);
		constructor.add(dolares);
		
		yens = new JButton("Yens");
		yens.setBounds(40, 290, 100, 50);
		yens.addActionListener(this);
		constructor.add(yens);
		
		libras = new JButton("Libras");
		libras.setBounds(160, 290, 100, 50);
		libras.addActionListener(this);
		constructor.add(libras);
		
		//Equivale a
		resultado = new JLabel("Equivale a: ");
		resultado.setBounds(100, 350, 100, 30);
		constructor.add(resultado);
		
		constructor.setVisible(true);
	}
	
	@Override
		public void actionPerformed(ActionEvent e) {
			cambio = Integer.parseInt(cantidad.getText());
			System.out.println(cambio);
			if(e.getSource() == euros) {
				switch (moneda.getSelectedIndex()) {
				case 0:{ cambio /= 1; } break;						//Euros
				case 1: { cambio /= 1.18; } break;			//Dolares
				case 2: { cambio /= 131.15; } break;		//Yens
				case 3: { cambio /= 0.877; } break;			//Libras
				}
			}
			
			if(e.getSource() == dolares) {
				switch (moneda.getSelectedIndex()) {
				case 0:{ cambio /= 0.84; } break;
				case 1: { cambio /= 1; } break;
				case 2: { cambio /= 110.95; } break;
				case 3: { cambio /= 0.74; } break;
				}
			}
			
			if(e.getSource() == yens) {
				switch (moneda.getSelectedIndex()) {
				case 0:{ cambio /= 0.00762; } break;
				case 1: { cambio /= 0.00901; } break;
				case 2: { cambio /= 1; } break;
				case 3: { cambio /= 0.00669; } break;
				}
			}
			
			if(e.getSource() == libras) {
				switch (moneda.getSelectedIndex()) {
				case 0:{ cambio /= 1.13; } break;
				case 1: { cambio /= 1.34; } break;
				case 2: { cambio /= 149.47; } break;
				case 3: { cambio /= 1; } break;
				}
			}
			System.out.println(cambio);
		}
	
	public static void main(String[] args) {
			@SuppressWarnings("unused")
			Ventana ventana01 = new Ventana();
	}
}
