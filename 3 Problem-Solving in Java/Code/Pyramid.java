/* TODO: Replace these file comments with a description of what your program
 * does.
 * draw first row
 * draw each row up, with one less brick, still centered to create pyramid layout
 * stop when there is only one in top level --> use a while loop to do this
 */
import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class Pyramid extends GraphicsProgram {
	/** Width of each brick in pixels */
	private static final double BRICK_WIDTH = 30;

	/** Height of each brick in pixels */
	private static final double BRICK_HEIGHT = 12;

	/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
		builddatPyramid();
	}
	
	private void builddatPyramid() {
		for (int row=0; row < BRICKS_IN_BASE; row++ ) {
			int bricksInRow = BRICKS_IN_BASE - row;
			
			for (int brickNumber=0; brickNumber < bricksInRow; brickNumber++) {
				double x= (getWidth()/2) - (BRICK_WIDTH*bricksInRow)/2 + BRICK_WIDTH*brickNumber;
			
				double y= getHeight()-BRICK_HEIGHT *(row);
		
				GRect individualBrick= new GRect (x, y, BRICK_WIDTH, BRICK_HEIGHT);
				individualBrick.setFilled(true);
				individualBrick.setColor(Color.orange);
				individualBrick.setFillColor(Color.black);
				add(individualBrick);
			}
		}
	}
}
//for (int rowIndex = 0; rowIndex < NUM_ROWS; rowIndex++) {
//	buildRow(topLeftX, topLeftY + rowIndex * (BOX_SIZE + BOX_SPACING));
//}
//}
