package ejercicio22;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana02 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JFrame constructor;
	protected JButton aceptar;
	protected int dia, mes, anio;
	protected JLabel aclaracion, barras;
	protected JTextField entradaDia, entradaMes, entradaAnio;
	
	public Ventana02() {
		
		constructor = new JFrame();
		constructor.setLayout(null);
		
		constructor.setTitle("Ejemplo22");
		constructor.setSize(500, 200);
		constructor.setDefaultCloseOperation(3);
		constructor.setLocationRelativeTo(null);
		
		//Decoraciones
		aclaracion = new JLabel("Dia                 Mes                 Anio");
		aclaracion.setBounds(120, 20, 500, 30);
		constructor.add(aclaracion);
		
		barras = new JLabel("/                        /");
		barras.setBounds(173, 55, 500, 20);
		constructor.add(barras);
		
		//Cajas para poner la fecha
		entradaDia = new JTextField();
		entradaDia.setBounds(100, 50, 50, 30);
		constructor.add(entradaDia);
		
		entradaMes = new JTextField();
		entradaMes.setBounds(200, 50, 50, 30);
		constructor.add(entradaMes);
		
		entradaAnio = new JTextField();
		entradaAnio.setBounds(300, 50, 50, 30);
		constructor.add(entradaAnio);
		
		//Boton para aceptar
		aceptar = new JButton("Aceptar");
		aceptar.setBounds(175, 90, 100, 30);
		aceptar.addActionListener(this);
		constructor.add(aceptar);
		
		constructor.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == aceptar) {
			try {
				dia = Integer.parseInt(entradaDia.getText());
				mes = Integer.parseInt(entradaMes.getText());
				anio = Integer.parseInt(entradaAnio.getText());
				if(dia > 31  || dia < 1) {
					throw new Exception();
				}
				if(mes > 12 || mes <  1) {
					throw new Exception();	
				}
				if(dia > 2035  || anio < 1000) {
					throw new Exception();
				}
				Ventana.fechaCorta.setText(dia + "/" + mes + "/" + anio);
				String mesLetras = null;
				switch (mes) {
				case 1: { mesLetras = "Enero"; } break;
				case 2: { mesLetras = "Febrero"; } break;
				case 3: { mesLetras = "Marzo"; } break;
				case 4: { mesLetras = "Abril"; } break;
				case 5: { mesLetras = "Mayo"; } break;
				case 6: { mesLetras = "Junio"; } break;
				case 7: { mesLetras = "Julio"; } break;
				case 8: { mesLetras = "Agosto"; } break;
				case 9: { mesLetras = "Septiembre"; } break;
				case 10: { mesLetras = "Octubre"; } break;
				case 11: { mesLetras = "Noviembre"; } break;
				case 12: { mesLetras = "Diciembre"; } break;
				default: mesLetras = "Mes no valido";
				}
				Ventana.fechaLarga.setText( dia + " de " + mesLetras + " de " + anio);
			} catch (Exception eh) {
				Ventana.constructor.setTitle("Error al introducir datos");
			}
			constructor.setVisible(false);
		}
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ventana02 ventana = new Ventana02();
	}

	

}
