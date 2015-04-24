/* DONE! Replace these file comments with a description of what your program
 * does.
 */
import java.awt.Color;

import acm.program.*;
import acm.graphics.*;

public class BoxesIllusion extends GraphicsProgram {
	/* The number of rows and columns in the grid, respectively. */
	private static final int NUM_ROWS = 5;
	private static final int NUM_COLS = 6;
	
	/* The width and height of each box. */
	private static final double BOX_SIZE = 40;
	
	/* The horizontal and vertical spacing between the boxes. */
	private static final double BOX_SPACING = 10;
	
	/* The default width and height of the window. These constants will tell Java to
	 * create a window whose size is *approximately* given by these dimensions. You should
	 * not directly use these constants in your program; instead, use getWidth() and
	 * getHeight().
	 */
	public static final int APPLICATION_WIDTH = 350;
	public static final int APPLICATION_HEIGHT = 300;

	public void run() {
		double superBoxHeight = BOX_SIZE * NUM_ROWS + BOX_SPACING * (NUM_ROWS - 1);
		double superBoxWidth = BOX_SIZE * NUM_COLS + BOX_SPACING * (NUM_COLS - 1);

		double topLeftX = (APPLICATION_WIDTH - superBoxWidth) / 2.0;
		double topLeftY = (APPLICATION_HEIGHT - superBoxHeight) / 2.0;

		  // i = 0 -> topLeftX
		  // i = 1 -> topLeftX + 1 *(BOX_SIZE + BOX_SPACING) 

		// i = 2 -> topLeftX + 2 * (BOX_SIZE + BOX_SPACING) 
		  // i = 3 -> topLeftX + 3 * (BOX_SIZE + BOX_SPACING)
		
		// buildRow(topLeftX, topLeftY + 0 * (BOX_SIZE + BOX_SPACING));
		// buildRow(topLeftX * 2, topLeftY + 1 * (BOX_SIZE + BOX_SPACING));
		// buildRow(4, topLeftY + 1.5  * (BOX_SIZE + BOX_SPACING));
		// buildRow(topLeftX, topLeftY + 3 * (BOX_SIZE + BOX_SPACING));
		
		for (int rowIndex = 0; rowIndex < NUM_ROWS; rowIndex++) {
			buildRow(topLeftX, topLeftY + rowIndex * (BOX_SIZE + BOX_SPACING));
		}
	}
	
	private void buildRow(double x, double y) {
		for (int colIndex = 0; colIndex < NUM_COLS; colIndex++) {
			double rectX = x + colIndex * (BOX_SIZE + BOX_SPACING);
			double rectY = y;
			
			GRect r = new GRect(rectX, rectY, BOX_SIZE, BOX_SIZE);
			r.setFilled(true);
			r.setColor(Color.PINK);
			add(r);
		}
	}
}
