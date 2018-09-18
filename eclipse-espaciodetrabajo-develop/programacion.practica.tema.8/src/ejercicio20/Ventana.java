package ejercicio20;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private static JFrame constructor;
	protected JLabel titulo, tamanio, ingredientes, precioPizza, precioIngred, precioFinal;
	private JRadioButton pequenia, mediana, grande;
	private ButtonGroup grupo;
	private JComboBox<String> ingrediente1,ingrediente2, ingrediente3;
	private JButton confirmar;
	
	public Ventana() {
		
		constructor = new JFrame();
		constructor.setLayout(null);
		
		constructor.setTitle("Ejercicio20");
		constructor.setSize(400, 350);
		constructor.setDefaultCloseOperation(3);
		constructor.setLocationRelativeTo(null);
		
		//Todos los textos(JLabel)
			//Titulo
		titulo = new JLabel("PIZZERIA");
		titulo.setBounds(125, 10, 75, 10);
		constructor.add(titulo);
			//Temanio pizzas
		tamanio = new JLabel("Seleccione un tamanio: ");
		tamanio.setBounds(20, 40, 150, 10);
		constructor.add(tamanio);
		
		//Tamanio de la pizza
		grupo = new ButtonGroup();
			//Peque�a
		pequenia = new JRadioButton("Peque�a");
		pequenia.setBounds(20, 70, 75, 10);
		constructor.add(pequenia);
			//Mediana
		mediana = new JRadioButton("Mediana");
		mediana.setBounds(100, 70, 75, 10);
		constructor.add(mediana);
			//Grande
		grande = new JRadioButton("Grande");
		grande.setBounds(180, 70, 75, 10);
		constructor.add(grande);
		grupo.add(pequenia); grupo.add(mediana); grupo.add(grande);
			//Precios
		precioPizza = new JLabel("           5�                     10�                     15�");
		precioPizza.setBounds(20, 80, 300, 20);
		constructor.add(precioPizza);
		
		//Ingredientes
		ingredientes = new JLabel("Seleccione sus ingredientes: ");
		ingredientes.setBounds(20, 100, 200, 10);
		constructor.add(ingredientes);
			//ingrediente1
		ingrediente1 = new JComboBox<String>();
		ingrediente1.setBounds(20, 120, 100, 20);
		ingrediente1.addItem("Jamon York");
		ingrediente1.addItem("Bacon");
		ingrediente1.addItem("Pimientos");
		ingrediente1.addItem("Atun");
		constructor.add(ingrediente1);
			//ingrediente2
		ingrediente2 = new JComboBox<String>();
		ingrediente2.setBounds(130, 120, 100, 20);
		ingrediente2.addItem("Jamon York");
		ingrediente2.addItem("Bacon");
		ingrediente2.addItem("Pimientos");
		ingrediente2.addItem("Atun");
		constructor.add(ingrediente2);
			//ingrediente3
		ingrediente3 = new JComboBox<String>();
		ingrediente3.setBounds(240, 120, 100, 20);
		ingrediente3.addItem("Jamon York");
		ingrediente3.addItem("Bacon");
		ingrediente3.addItem("Pimientos");
		ingrediente3.addItem("Atun");
		constructor.add(ingrediente3);
			//precio ingredientes
		precioIngred = new JLabel("Jamon york 1� || Bacon 1,5� || Pimientos 0,5� || Atun 2�");
		precioIngred.setBounds(20, 150, 400, 30);
		constructor.add(precioIngred);
		
		//Confirmar
		confirmar = new JButton("Calcular precio");
		confirmar.setBounds(110, 200, 160, 40);
		confirmar.addActionListener(this);
		constructor.add(confirmar);
		
		//Precio final
		precioFinal = new JLabel();
		precioFinal.setBounds(110, 250, 160, 40);
		constructor.add(precioFinal);
		
		constructor.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == confirmar) {
			double total = 0;
			if (pequenia.isSelected()) {
				total += 5;
			}
			if (mediana.isSelected()) {
				total += 10;
			}
			if (grande.isSelected()) {
				total += 15;
			}
			//Primer ingrediente
			if(ingrediente1.getSelectedIndex() == 0) {
				total += 1; 
			}
			if(ingrediente2.getSelectedIndex() == 0) {
				total += 1; 
			}
			if(ingrediente3.getSelectedIndex() == 0) {
				total += 1; 
			}
			//Segundo ingrediente
			if(ingrediente1.getSelectedIndex() == 1) {
				total += 1.5; 
			}
			if(ingrediente2.getSelectedIndex() == 1) {
				total += 1.5; 
			}
			if(ingrediente3.getSelectedIndex() == 1) {
				total += 1.5; 
			}
			//Tercer ingrediente
			if(ingrediente1.getSelectedIndex() == 2) {
				total += 0.5; 
			}
			if(ingrediente2.getSelectedIndex() == 2) {
				total += 0.5; 
			}
			if(ingrediente3.getSelectedIndex() == 2) {
				total += 0.5; 
			}
			//Cuarto ingrediente
			if(ingrediente1.getSelectedIndex() == 3) {
				total += 2; 
			}
			if(ingrediente2.getSelectedIndex() == 3) {
				total += 2; 
			}
			if(ingrediente2.getSelectedIndex() == 3) {
				total += 2; 
			}
			precioFinal.setText("PRECIO FINAL: " + total + " euros");
		}
	}

	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ventana ventana = new Ventana();
	}
	
}
