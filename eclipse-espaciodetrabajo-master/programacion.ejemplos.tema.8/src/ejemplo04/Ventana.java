package ejemplo04;
import javax.swing.JFrame;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args){
		
		JFrame ventana = new JFrame();
		
		ventana.setTitle("Ejemplo04");
		ventana.setVisible(true);
		ventana.setSize(300, 500);
		ventana.setDefaultCloseOperation(3);
		ventana.setLocationRelativeTo(null);
		ventana.add(new Panel01_CheckBoxes());
	}

}
