
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;


import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;


@SuppressWarnings("serial")
public class sidePanel extends JPanel {
	
// Labels for the left mouse click	
	JLabel leftClickHeader 	=	new JLabel("Left Click");
	JLabel leftRed 			= 	new JLabel("Red: ");
	JLabel leftGreen 		= 	new JLabel("Green: ");
	JLabel leftBlue 		= 	new JLabel("Blue: ");
	
// Text Areas for left mouse click	
	JSpinner leftNumRed   	 = new JSpinner(new SpinnerNumberModel(0,0,255,1));
	JSpinner leftNumGreen 	 = new JSpinner(new SpinnerNumberModel(0,0,255,1));
	JSpinner leftNumBlue	 = new JSpinner(new SpinnerNumberModel(255,0,255,1));
	
// Labels for the right mouse click	
	JLabel rightClickHeader 	= 	new JLabel("Right Click");
	JLabel rightRed 			=	new JLabel("Red: ");
	JLabel rightGreen 			= 	new JLabel("Green: ");
	JLabel rightBlue 			= 	new JLabel("Blue: ");
	
// Text areas for right mouse	
	JSpinner rightNumRed  	 = new JSpinner(new SpinnerNumberModel(255,0,255,1));
	JSpinner rightNumGreen  = new JSpinner(new SpinnerNumberModel(0,0,255,1));
	JSpinner rightNumBlue	 = new JSpinner(new SpinnerNumberModel(0,0,255,1));

// Slider for size
							// min-max-start
	JSlider size = new JSlider(0,  200,  100);
	JLabel sizeLabel = new JLabel("Circle Size");

// Invisiable label for formatting
	JLabel invis1 = new JLabel();
	JLabel invis2 = new JLabel();
	
// tie all together with layout manager	
	public sidePanel() {
		
		super(new FlowLayout());
		
	
		
	// Sets preferred size for all components
		Dimension labelSize = new Dimension(100,15);
		Dimension textSize = new Dimension(125,25);
		Dimension headerLabelSize = new Dimension(100,75);
		Dimension sliderSize = new Dimension(150,50);
		Dimension invisible = new Dimension(100,50);
		
		leftClickHeader.setPreferredSize(headerLabelSize);
		leftRed.setPreferredSize(labelSize);
		leftGreen.setPreferredSize(labelSize);
		leftBlue.setPreferredSize(labelSize);
		
		leftNumRed.setPreferredSize(textSize);
		leftNumGreen.setPreferredSize(textSize);
		leftNumBlue.setPreferredSize(textSize);
		
		rightClickHeader.setPreferredSize(headerLabelSize);
		rightRed.setPreferredSize(labelSize);
		rightGreen.setPreferredSize(labelSize);
		rightBlue.setPreferredSize(labelSize);
		
		rightNumRed.setPreferredSize(textSize);
		rightNumGreen.setPreferredSize(textSize);
		rightNumBlue.setPreferredSize(textSize);
		
		size.setPreferredSize(sliderSize);
		sizeLabel.setPreferredSize(labelSize);
		
		invis1.setPreferredSize(invisible);
		invis2.setPreferredSize(invisible);
		
	// Makes the headers stand out more
		leftClickHeader	.setFont(new Font(leftRed.getName(), Font.BOLD, 20));
		rightClickHeader.setFont(new Font(leftRed.getName(), Font.BOLD, 19));
		
		sizeLabel		.setFont(new Font(leftRed.getName(), Font.BOLD, 19));
		
	// makes the spinners uneditabled beside the arrows on the side
			leftNumRed.setEditor(new JSpinner.DefaultEditor(leftNumRed));
			leftNumGreen.setEditor(new JSpinner.DefaultEditor(leftNumGreen));
			leftNumBlue.setEditor(new JSpinner.DefaultEditor(leftNumBlue));
			
			rightNumRed.setEditor(new JSpinner.DefaultEditor(rightNumRed));
			rightNumGreen.setEditor(new JSpinner.DefaultEditor(rightNumGreen));
			rightNumBlue.setEditor(new JSpinner.DefaultEditor(rightNumBlue));
			
	// Makes slider look better
			size.setPaintTicks(true);
			size.setMajorTickSpacing(50);
			size.setMinorTickSpacing(5);
			size.setPaintLabels(true);
			
			
			
		
		
	// Adds all left click components	
		this.add(leftClickHeader);
		this.add(leftRed);
		this.add(leftNumRed);
		this.add(leftGreen);
		this.add(leftNumGreen);
		this.add(leftBlue);
		this.add(leftNumBlue);
		
		this.add(invis1);
	// Adds all right click components
		this.add(rightClickHeader);
		this.add(rightRed);
		this.add(rightNumRed);
		this.add(rightGreen);
		this.add(rightNumGreen);
		this.add(rightBlue);
		this.add(rightNumBlue);
		
		this.add(invis2);
	// adds slider
		this.add(sizeLabel);
		this.add(size);
		
		
		
	}
	
	
}
