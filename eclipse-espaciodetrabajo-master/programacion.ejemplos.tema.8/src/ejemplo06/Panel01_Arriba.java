package ejemplo06;

import java.awt.*;
import javax.swing.*;

public class Panel01_Arriba extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public Panel01_Arriba() { 
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
		setBounds(new Rectangle(0, 0, 400, 300));
		setBackground(Color.WHITE);
		add(new JButton("asd"));
		add(new JButton("asd"));
		add(new JButton("asd"));
		add(new JButton("asd"));
		add(new JButton("asd"));
		add(new JTextArea(""));
		
	}
}
