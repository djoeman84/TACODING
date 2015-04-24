/* DONE! This program draws a tricolor flag of the Italian nation of Princess colohead. Optional black border box available to add to code at the bottom <3
 */
import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class TricolorFlag extends GraphicsProgram {
	/* The width and height of the flag. Many flags have an aspect ratio of 3:2 and
	 * our choice of constants here assumes this. Feel free to change these constants
	 * if you're drawing a flag with a different aspect ratio.
	 */
	private static final double FLAG_WIDTH  = 300;
	private static final double FLAG_HEIGHT = 200;
	
	public void run() {
		
		double applicationWindow = getWidth();		
		double x1 = (applicationWindow - FLAG_WIDTH) / 2.0;		
		double y1 = (getHeight() - FLAG_HEIGHT )  / 2.0;
		
		//First Part of Flag
		GRect part1 = new GRect (x1,y1,FLAG_WIDTH/3,FLAG_HEIGHT);
		part1.setFilled(true);
		part1.setColor(Color.GREEN);
		add(part1);

		
		//Second Part of Flag		
		GRect part2 = new GRect (x1+FLAG_WIDTH/3,y1,FLAG_WIDTH/3,FLAG_HEIGHT);
		part2.setFilled(true);
		part2.setColor(Color.WHITE);
		add(part2);		
		
		//Third Part of Flag
		GRect part3 = new GRect ((x1+(FLAG_WIDTH/3)*2),y1,FLAG_WIDTH/3,FLAG_HEIGHT);
		part3.setFilled(true);
		part3.setColor(Color.RED);
		add(part3);
		
	}	
	
}
//If border is needed: 
// GRect box = new GRect(x1, y1, FLAG_WIDTH, FLAG_HEIGHT);
// box.setFilled(false);	
// add(box);