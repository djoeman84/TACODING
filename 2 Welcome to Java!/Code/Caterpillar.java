/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;
import acm.graphics.*;

import java.awt.*;

public class Caterpillar extends GraphicsProgram {
	/* TODO: You are probably going to want to define some program constants here that
	 * control the size, number, spacing, and color of the body segments. When you do,
	 * delete this comment and replace it with your constants.
	 * 
	 * Remember to add comments describing what each constant does!
	 */ 
	/* The total number of segments. */	
	private static final int NUM_SEGMENTS = 5;
	
	/* The width and height of each segment of the body. */
	private static final double SEGMENT_SIZE = 40;
	
	/* The horizontal and vertical spacing between the segments. */
	private static final double SEGMENT_SPACING = 10;
	
	/* This designates the internal color of the body segments */
	private static final Color FILL_IN_COLOR= Color.blue;
	
	/* This designates the border color for each body segment */
	private static final Color BORDER_COLOR= Color.DARK_GRAY;


	public void run() {
		drawBody(x, y, numberSegments);
	}
	private void drawBody (double x, double y) {
		bodysegment(x,y, width, height, colorfill, colorborder)
		
	}
	private void bodySegment (x, y, diameter, diameter, Color color, Color colorborder) {
	}
	
}
