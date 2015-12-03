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
	private static final int NUM_SEGMENTS = 600;//10;
	
	/* The width and height of each segment of the body. */
	private static final double SEGMENT_SIZE = 60;//80;
	
	/* The horizontal and vertical spacing between the segments. */
	private static final double SEGMENT_SPACING = 1;//50;
	
	/* This designates the internal color of the body segments */
	private static final Color FILL_IN_COLOR= Color.CYAN;
	
	/* This designates the border color for each body segment */
	private static final Color BORDER_COLOR = Color.green;
	
	/*This designates where the stupid body begins for the x axis*/
	private static final double X_START= 12;
	
	/*This designates where the stupid body begins for the y axis*/
	private static final double Y_START= 48;
	
	/*This makes the Y_offset*/
	private static final double Y_OFFSET= 25;
	
	private static final Color[] BODY_COLORS = {Color.BLUE, Color.PINK, Color.YELLOW, Color.GRAY};
	
	/*This makes the program go*/
	
	public void run() {
		drawCaterpillar(X_START, Y_START, NUM_SEGMENTS);
		//jason chris whole foods <- they need tips
	}
	/*This draws a whole caterpillar, depending on how many segments you give it*/
	
	private void drawCaterpillar (double x, double y, int numberSegments) {
		for (int i = 0; i < numberSegments; i++) {
			
			double xCoord = x + i * SEGMENT_SPACING;
			double yCoord = y + getSegmentYOffset(i);
			double diameter = SEGMENT_SIZE; //getSegmentSize(i);
			Color segmentColor = getSegmentColor(i);
			
			bodySegment(xCoord, yCoord, diameter, segmentColor);
		}
		
	}
	
	
	/*This draws a body circle in the caterpillar*/
	
	private void bodySegment (double x, double y, double diameter, Color segmentColor) {
		GOval segment= new GOval (x, y, diameter, diameter);
		segment.setColor(segmentColor);
		segment.setFilled(true);
		segment.setFillColor(segmentColor);
		add(segment);
				
	}
	
	/**
	 * getSegmentYOffset gets y-offset for segment based on index
	 * @param int index: index into segments of caterpillar body
	 * @return double segmentOffset: y-offset of segment based on index 
	 */
	private double getSegmentYOffset(int index) {
		/* Use sine to make body snake */
		return Math.sin((index / 60.0) * Math.PI) * Y_OFFSET;

		/* Use isEven to make circle low if odd, high if even */
//		if (isEven(index)) {
//			return Y_OFFSET;
//		} else {
//			return 0;
//		}
	}
	
	/**
	 * getSegmentColor
	 * @param index index of segment in caterpillar body
	 * @return Color segmentColor: color to use for segment circle
	 */
	private Color getSegmentColor(int index){ 
		
		/* alternating colors */
		int modSelection = index % BODY_COLORS.length;
		return BODY_COLORS[modSelection];
		
		/* Crazy worm tube */
//		float r = (float)((Math.sin(index / 60.0) + 1) / 2);
//		float g = (float)((Math.sin(index / 40.0) + 1) / 2);
//		float b = (float)((Math.sin(index / 20.0) + 1) / 2);
//		return new Color(r, g, b);
		
		/* manual alternating colors */
//		int modSelection= index%3;
//		if(modSelection==0) {
//			return Color.BLUE;
//		}
//		else if (modSelection==1) {
//			return Color.PINK;
//		}
//		else {
//			return Color.yellow;
//		}
	}
	
	/**
	 * isEven
	 * @param value value to be evaluated
	 * @return boolean: true if value is even
	 */
	private boolean isEven(int value) {
		return (value % 2 == 0);
	}
	
	/**
	 * getSegmentSize
	 * @param index
	 * @return size of segment based on index
	 */
	private double getSegmentSize(int index) {
		return index * 0.07 + SEGMENT_SIZE;
	}
}




//
///* TODO: Replace these file comments with a description of what your program
// * does.
// */
//import acm.program.*;
//import acm.graphics.*;
//
//import java.awt.*;
//
//public class Caterpillar extends GraphicsProgram {
//	/* TODO: You are probably going to want to define some program constants here that
//	 * control the size, number, spacing, and color of the body segments. When you do,
//	 * delete this comment and replace it with your constants.
//	 * 
//	 * Remember to add comments describing what each constant does!
//	 */ 
//	/* The total number of segments. */	
//	private static final int NUM_SEGMENTS = 10;
//	
//	/* The width and height of each segment of the body. */
//	private static final double SEGMENT_SIZE = 80;
//	
//	/* The horizontal and vertical spacing between the segments. */
//	private static final double SEGMENT_SPACING = 50;
//	
//	/* This designates the internal color of the body segments */
//	private static final Color FILL_IN_COLOR= Color.CYAN;
//	
//	/* This designates the border color for each body segment */
//	private static final Color BORDER_COLOR = Color.MAGENTA;
//	
//	/*This designates where the stupid body begins for the x axis*/
//	private static final double X_START= 12;
//	
//	/*This designates where the stupid body begins for the y axis*/
//	private static final double Y_START= 48;
//	
//	/*This makes the Y_offset*/
//	private static final double Y_OFFSET= 25;
//	
//	/*This makes the program go*/
//	
//	public void run() {
//		drawCaterpillar(X_START, Y_START, NUM_SEGMENTS);
//		//jason chris whole foods
//	}
//	/*This draws a whole caterpillar, depending on how many segments you give it*/
//	
//	private void drawCaterpillar (double x, double y, int numberSegments) {
//		for (int i = 0; i < numberSegments; i++) {
//			double offsetY = 0;
//			if (isEven(i)) {
//				offsetY = y + Y_OFFSET;
//			}
//			else {
//				offsetY = y;
//			}
//			
//			
//			bodySegment(x + i * SEGMENT_SPACING, offsetY, SEGMENT_SIZE);
//		}
//		
//	}
//	
//	/**
//	 * isEven
//	 * @param value value to be evaluated
//	 * @return boolean: true if value is even
//	 */
//	private boolean isEven(int value) {
//		return (value % 2 == 0);
//	}
//	
//	/*This draws a body circle in the caterpillar*/
//	
//	private void bodySegment (double x, double y, double diameter) {
//		GOval segment= new GOval (x, y, diameter, diameter);
//		segment.setColor(BORDER_COLOR);
//		segment.setFilled(true);
//		segment.setFillColor(FILL_IN_COLOR);
//		add(segment);
//				
//	}
//	
//}
//
