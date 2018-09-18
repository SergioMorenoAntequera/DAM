package ejemplo05;
import javax.swing.JFrame;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args){
		
		JFrame ventana = new JFrame();
		
		ventana.setLayout(null);
		ventana.setTitle("Ejemplo05");
		ventana.setVisible(true);
		ventana.setSize(600, 300);
		ventana.setDefaultCloseOperation(3);
		ventana.setLocationRelativeTo(null);
		//ventana.setResizable(false);
		
		ventana.add(new Panel01_Arriba());
		ventana.add(new Panel02_Abajo());
		
	}
}
