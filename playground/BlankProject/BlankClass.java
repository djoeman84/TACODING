/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class BlankClass extends GraphicsProgram {
	
	private static final double BOTTOM_DIAMETER = 200;
	private static final double MIDDLE_DIAMETER = 125;
		
	public void run() {
		
		setBackground(Color.GRAY);
		addSnowmanPart(BOTTOM_DIAMETER, getHeight() - BOTTOM_DIAMETER);
		addSnowmanPart(MIDDLE_DIAMETER, getHeight() - BOTTOM_DIAMETER - MIDDLE_DIAMETER);
		
		  
	}

	private void addSnowmanPart(double diameter, double yCoord) {

	  double x = (getWidth() - diameter) / 2.0;
	  double y = yCoord;
	  GOval part = new GOval(x, y, diameter, diameter);

	  part.setFilled(true);
	  part.setColor(Color.WHITE);
	  add(part);

	}

}

