/* TODO:
    
   //How can I make two and move them?
 * This great program will build two darling pawprints in separate locations to honor her great royal highness princess Isabella <3
 */
import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Pawprints extends GraphicsProgram {
	/* Constants controlling the relative positions of the
	 * three toes to the upper-left corner of the pawprint.
	 * 
	 * (Yes, I know that actual pawprints have four toes.
	 * Just pretend it's a cartoon animal. ^_^)
	 */
	private static final double FIRST_TOE_OFFSET_X = 0;
	private static final double FIRST_TOE_OFFSET_Y = 20;
	private static final double SECOND_TOE_OFFSET_X = 30;
	private static final double SECOND_TOE_OFFSET_Y = 0;
	private static final double THIRD_TOE_OFFSET_X = 60;
	private static final double THIRD_TOE_OFFSET_Y = 20;
	
	/* The position of the heel relative to the upper-left
	 * corner of the pawprint.
	 */
	private static final double HEEL_OFFSET_X = 20;
	private static final double HEEL_OFFSET_Y = 40;
	
	/* Each toe is an oval with this width and height. */
	private static final double TOE_WIDTH = 20;
	private static final double TOE_HEIGHT = 30;
	
	/* The heel is an oval with this width and height. */
	private static final double HEEL_WIDTH = 40;
	private static final double HEEL_HEIGHT = 60;
	
	/* The default width and height of the window. These constants will tell Java to
	 * create a window whose size is *approximately* given by these dimensions. You should
	 * not directly use these constants in your program; instead, use getWidth() and
	 * getHeight(), which return the *exact* width and height of the window.
	 */
	public static final int APPLICATION_WIDTH = 270;
	public static final int APPLICATION_HEIGHT = 220;
	
	public void run() {
		drawPawprint(20, 20);
		drawPawprint(180, 70);
	}
	
	/**
	 * Draws a pawprint. The parameters should specify the upper-left corner of the
	 * bounding box containing that pawprint.
	 * 
	 * @param x The x coordinate of the upper-left corner of the bounding box for the pawprint.
	 * @param y The y coordinate of the upper-left corner of the bounding box for the pawprint.
	 */
	
	private void drawPawprint(double x, double y) {
		// drawPawprint(x + X_Offset, y + Y_Offset, Color.PINK);
		 toe1();
	     toe2();
	     toe3();
	     heel();
		}
	
	// private X_Offset() {
		
		
//	}
	
	// private Y_Offset() {
		
	// }
		
     
    private GObject toe1() {
         
        GOval toe1 = new GOval(FIRST_TOE_OFFSET_X, FIRST_TOE_OFFSET_Y, TOE_WIDTH, TOE_HEIGHT);
        toe1.setColor (Color.PINK);
        toe1.setFillColor(Color.PINK);
        toe1.setFilled(true);
        add(toe1);
        return toe1;
         
    }
     
    private GObject toe2() {
         
        GOval toe2 = new GOval(SECOND_TOE_OFFSET_X, SECOND_TOE_OFFSET_Y, TOE_WIDTH, TOE_HEIGHT);
        toe2.setColor (Color.PINK);
        toe2.setFillColor(Color.PINK);
        toe2.setFilled(true);
        add(toe2);
        return toe2;
         
    }
     
    private GObject toe3() {
         
        GOval toe3 = new GOval(THIRD_TOE_OFFSET_X, THIRD_TOE_OFFSET_Y, TOE_WIDTH, TOE_HEIGHT);
        toe3.setColor (Color.PINK);
        toe3.setFillColor(Color.PINK);
        toe3.setFilled(true);
        add(toe3);
        return toe3;
    }

     
    private GObject heel() {
         
        GOval heel = new GOval(HEEL_OFFSET_X, HEEL_OFFSET_Y, HEEL_WIDTH, HEEL_HEIGHT);
        heel.setColor (Color.PINK);
        heel.setFillColor(Color.PINK);
        heel.setFilled(true);
        add(heel);
        return heel;
    }
    
}
