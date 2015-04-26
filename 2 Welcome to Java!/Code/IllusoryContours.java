/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;
import acm.graphics.*;

import java.awt.*;

public class IllusoryContours extends GraphicsProgram {
	/* The default width and height of the window. These constants will tell Java to
	 * create a window whose size is *approximately* given by these dimensions. You should
	 * not directly use these constants in your program; instead, use getWidth() and
	 * getHeight(), which return the *exact* width and height of the window.
	 */
	
	public static final int APPLICATION_WIDTH = 300;
	public static final int APPLICATION_HEIGHT = 300;
	
	/* Gives the size of each circle. */
	private static final double CIRCLE_SIZE = 70;
	/*Gives the sweep measurement in degrees*/
	 private static final double CIRCLE_SWEEP= 270;
	/*BLACK*/
	 private static final Color FILLCOLOR= Color.BLACK;
	 
	public void run() {
		createCircles();
	}
	private void createCircles() {
	
		createCircle(0.0, 0.0, 0.0);
		createCircle(APPLICATION_WIDTH - CIRCLE_SIZE, APPLICATION_HEIGHT - CIRCLE_SIZE, 180);
		createCircle(0, APPLICATION_HEIGHT - CIRCLE_SIZE , 90);
		createCircle(APPLICATION_WIDTH- CIRCLE_SIZE, 0, 270);	
	}
	
	private void createCircle(double xCoordinate, double yCoordinate, double circleStart) {
		GArc circle = new GArc( xCoordinate, yCoordinate, CIRCLE_SIZE, CIRCLE_SIZE, circleStart, CIRCLE_SWEEP);
		circle.setFilled(true);
		circle.setColor(FILLCOLOR);
		add(circle);
	}
	
	
}


// use angle from star example to define 1/4 of the circle as a constant,
// leave that part unshaded, and then make a formula to make all the circle against the wall,

