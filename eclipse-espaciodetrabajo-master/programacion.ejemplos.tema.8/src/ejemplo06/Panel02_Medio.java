package ejemplo06;
import java.awt.*;

import javax.swing.JPanel;

public class Panel02_Medio extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public Panel02_Medio() { 
		setLayout(new FlowLayout());
		
		setBounds(new Rectangle(0, 300, 400, 300));
		setBackground(Color.YELLOW);
		
	}
}
