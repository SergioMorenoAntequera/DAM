package ejemplo04;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class Panel01_CheckBoxes extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public Panel01_CheckBoxes() {
		setLayout(null);
		JCheckBox cb1, cb2, cb3;
		
		cb1 = new JCheckBox("Perro");
		cb2 = new JCheckBox("Gato");
		cb3 = new JCheckBox("Pez");
		cb1.setBounds(100, 0, 100, 30);
		cb2.setBounds(100, 100, 100, 30);
		cb3.setBounds(100, 200, 100, 30);
		add(cb1);
		add(cb2);
		add(cb3);
	}
}
