
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;


@SuppressWarnings("serial")
public class DrawCircles extends JPanel {
	int posX;
	int posY;
	
	int red;
	int green;
	int blue;
	
	int size;
	
	boolean leftClick = false;
	
	public DrawCircles() {
		super();
		
		
		
	}
		
	public void getInfo(int x, int y, boolean isLeft, int redNum, int greenNum, int blueNum, int circleSize) {
		posX = x;
		posY = y;
		leftClick = isLeft;
		red = redNum;
		green = greenNum;
		blue = blueNum;
		size = circleSize;
		
		
	}
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		
		
		Graphics2D g2d = (Graphics2D) g;
		
	
		
		
		if (leftClick) {
			g2d.setColor(new Color(red, green, blue));
			g2d.fillOval(posX-(size/2), posY-(size/2), size, size);
			
		}
		else {
			g2d.setColor(new Color(red,green,blue));
			g2d.fillOval(posX-(size/2), posY-(size/2), size, size);
			
		}
		
	
	}
	
}
