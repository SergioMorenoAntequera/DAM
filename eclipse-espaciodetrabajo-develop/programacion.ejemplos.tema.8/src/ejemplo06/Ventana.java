package ejemplo06;
import javax.swing.JFrame;

public class Ventana extends JFrame{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		JFrame ventana = new JFrame();
		
		ventana.setLayout(null);
		ventana.setTitle("Ejemplo06");
		ventana.setSize(400, 800);
		ventana.setDefaultCloseOperation(3);
		ventana.setLocationRelativeTo(null);
		
		ventana.add(new Panel01_Arriba());
		ventana.add(new Panel02_Medio());
		ventana.add(new Panel03_Abajo());
		
		ventana.setVisible(true);
	}
}