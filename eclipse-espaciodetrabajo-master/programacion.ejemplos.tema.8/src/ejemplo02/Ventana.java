package ejemplo02;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Ventana extends JFrame{

	private static final long serialVersionUID = 1L;
	JFrame ventana = new JFrame();
	Toolkit t = Toolkit.getDefaultToolkit();
	
	public Ventana(String titulo, boolean visibilidad, int ancho, int alto, int terminar) {
		this.ventana.setTitle(titulo);
		this.ventana.setVisible(true);
		this.ventana.setSize(500, 300);
		this.ventana.setDefaultCloseOperation(3);
		this.ventana.setLocation(t.getScreenSize().height/2, t.getScreenSize().width/6);
	}
	
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Ventana ventana = new Ventana("Mi ventana", true, 500, 300, 3);
		
	}
	
}
	

