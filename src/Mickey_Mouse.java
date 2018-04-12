/*
************************************************
Zeke Lorens
Data Structures (Java 2) 
Assignment #1
Graphic: Mickey Mouse
************************************************
*/

// import a file so that I can use graphics
import java.awt.*; 

public class Mickey_Mouse {
	public static void main(String[] args) {
		// use a drawing panel
		DrawingPanel panel1 = new DrawingPanel(220,150);
		// set the background color of the Mickey Mouse graphic
		panel1.setBackground(Color.YELLOW);
		
		// use graphics
		Graphics g = panel1.getGraphics();
		
		// draw left and right ovals
		g.setColor(Color.BLUE);
		g.fillOval(50,25,40,40);	// left oval
		g.fillOval(130,25,40,40);	// right oval
		
		// draw a rectangle shape and set it's color
		g.setColor(Color.RED);
		g.fillRect(70,45,80,80);

		// draw a line between the ovals and set its color
		g.setColor(Color.BLACK);
		g.drawLine(90,25,90,40);
		System.out.println("End of program");
	} // end main
} // end class