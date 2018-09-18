package ejemplo05;
import java.awt.*;

import javax.swing.JPanel;

public class Panel01_Arriba extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public Panel01_Arriba() { 
		setLayout(new FlowLayout());
		
		setBounds(new Rectangle(0, 0, 600, 150));
		setBackground(Color.WHITE);
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//Ractangulo
		g.setColor(Color.BLACK);
		g.drawRect(25, 25, 100, 100);
		
		//Círculo
		g.drawOval(175, 25, 100, 100);
				
		//Cruz
		g.drawLine(325, 25, 425, 125);
		g.drawLine(425, 25, 325, 125);
				
		//Triangulo
		int[] puntosX = new int[3];
		puntosX[0] = 525;
		puntosX[1] = 475;
		puntosX[2] = 575;
		int[] puntosY = new int[3];
		puntosY[0] = 25;
		puntosY[1] = 125;
		puntosY[2] = 125;
		g.drawPolygon(puntosX, puntosY, 3);
	
	}
}
