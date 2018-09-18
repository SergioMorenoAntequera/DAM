package ejemplo01;
import javax.swing.JFrame;

public class Ventana extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		
		JFrame ventana = new JFrame();
		
		ventana.setTitle("TITULO");
		ventana.setVisible(true);
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(3);
		ventana.setLocation(100, 100);
		
	}
	
}
	

