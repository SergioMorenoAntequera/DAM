package ejemplo03;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


//Clase principal, extiende de JFrame para poner el marco
public class BotonesRadio extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		JFrame ventana = new JFrame();
		
		ventana.setTitle("TITULO");
		ventana.setVisible(true);
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(3);
		ventana.setLocation(100, 100);
		ventana.add(new Botones());
	}
}
	
//Clase 2 pero no interna que Extiende de JPanel para poder
//No es public ya que necesitaria su propia clase
class Botones extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	//Construcor del Panel(Botones) que inicializa y coloca los botones
	public Botones() {
		setLayout(null);
		ButtonGroup gbr;
		JRadioButton br1, br2, br3;
		gbr = new ButtonGroup();

		br1 = new JRadioButton("Avion", true);
		br2 = new JRadioButton("Coche");
		br3 = new JRadioButton("Barco");
		br1.setBounds(0, 0, 100, 30);
		br2.setBounds(0, 50, 100, 30);
		br3.setBounds(0, 100, 100, 30);
		add(br1);
		add(br2);
		add(br3);
		gbr.add(br1);
		gbr.add(br2);
		gbr.add(br3);
	}
}



