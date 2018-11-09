import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;


public class Circles  {

	static int horizontalGap = 25;
	static int verticalGap = 25;
	JFrame mainFrame = new JFrame();
	DrawCircles circlePanel = new DrawCircles();
	sidePanel sidePan = new sidePanel();
	
	
	public static void main(String[] args)  {
		
	// Creates the objects used	
		JFrame mainFrame = new JFrame("Drawing Circles");
		DrawCircles circlePanel = new DrawCircles();
		sidePanel sidePan = new sidePanel(); 
		
	// sets the size of the objects	
		mainFrame.setSize(1500,700);
		circlePanel.setPreferredSize(new Dimension(500,500));
		sidePan.setPreferredSize(new Dimension(200,700));
		
		
	// sets background color for the objects	
		sidePan.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		sidePan.setBackground(new Color(244, 245, 247));
		
		
		
		
	// action listener for the circlePanel - fires a mouse even when a mouse is clicked	
		circlePanel.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				boolean isLeft = false;
				int size = sidePan.size.getValue();
				
				
				if (e.getButton() == 1) {
					
					int leftRed = (Integer) sidePan.leftNumRed.getValue();
					int leftGreen = (Integer) sidePan.leftNumGreen.getValue();
					int leftBlue = (Integer) sidePan.leftNumBlue.getValue();
					
					isLeft = true;
					circlePanel.getInfo(e.getX(), e.getY(), isLeft, leftRed, leftGreen, leftBlue, size);
				}
				else {
					
					int rightRed = (Integer) sidePan.rightNumRed.getValue();
					int rightGreen = (Integer) sidePan.rightNumGreen.getValue();
					int rightBlue = (Integer) sidePan.rightNumBlue.getValue();
					
					circlePanel.getInfo(e.getX(), e.getY(), isLeft, rightRed, rightGreen, rightBlue, size);
					
				}
				 
				 circlePanel.repaint();
				 
			}
			
			
		
		});
		
		
	// makes the entire thing visible and able to be closed	
		mainFrame.setLayout(new BorderLayout(horizontalGap, verticalGap));
		mainFrame.add(BorderLayout.LINE_START,sidePan);
		mainFrame.add(BorderLayout.CENTER, circlePanel);
		mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		mainFrame.setVisible(true);
		
		
		
		
		
	}


	


	

		
}
