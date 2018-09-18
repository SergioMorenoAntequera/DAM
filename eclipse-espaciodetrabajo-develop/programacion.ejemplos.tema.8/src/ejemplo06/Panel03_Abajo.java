package ejemplo06;
import java.awt.*;

import javax.swing.JPanel;

public class Panel03_Abajo extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public Panel03_Abajo() { 
		setLayout(new FlowLayout());
		
		setBounds(new Rectangle(0, 600, 400, 200));
		setBackground(Color.BLACK);
		
	}
}
