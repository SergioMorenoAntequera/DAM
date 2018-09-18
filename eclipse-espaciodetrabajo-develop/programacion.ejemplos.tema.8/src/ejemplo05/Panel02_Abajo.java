package ejemplo05;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JPanel;

public class Panel02_Abajo extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public Panel02_Abajo() { 
		setLayout(null);
		
		setBounds(new Rectangle(0, 150, 600, 150));
		setBackground(Color.GREEN);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//Ractangulo
		g.setColor(Color.BLUE);
		g.fillRect(25, 25, 100, 100);
		
		//Círculo
		g.fillOval(175, 25, 100, 100);
				
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
		g.fillPolygon(puntosX, puntosY, 3);
	
	}

}
