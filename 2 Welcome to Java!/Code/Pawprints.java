//* THIS MAKES BABY BELLA'S TINY PAWS, GOD DAMN IT
    
  
import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Pawprints extends GraphicsProgram {
	
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
		drawPawprint(20, 20, Color.PINK);
		drawPawprint(180, 70, Color.PINK);
	}
	
	
	private void drawPawprint(double x, double y, Color pawColor) {
		 toe(x + FIRST_TOE_OFFSET_X , y + FIRST_TOE_OFFSET_Y,   TOE_WIDTH,  TOE_HEIGHT,  pawColor);
	     toe(x + SECOND_TOE_OFFSET_X, y + SECOND_TOE_OFFSET_Y,  TOE_WIDTH,  TOE_HEIGHT,  pawColor);
	     toe(x + THIRD_TOE_OFFSET_X,  y + THIRD_TOE_OFFSET_Y,   TOE_WIDTH,  TOE_HEIGHT,  pawColor);
	     toe(x + HEEL_OFFSET_X,       y + HEEL_OFFSET_Y,        HEEL_WIDTH, HEEL_HEIGHT, pawColor);
	}
		
    private void toe(double x, double y, double width, double height, Color color ) {
    	 GOval toe = new GOval(x, y, width, height);
         toe.setColor (color);
         toe.setFillColor(color);
         toe.setFilled(true);
         add(toe);  	
    }
    
}
/**
 * Draws a pawprint. The parameters should specify the upper-left corner of the
 * bounding box containing that pawprint.
 * 
 * @param x The x coordinate of the upper-left corner of the bounding box for the pawprint.
 * @param y The y coordinate of the upper-left corner of the bounding box for the pawprint.
 */
//
//private GObject toe1(Color toeColor) {
//    
//    GOval toe1 = new GOval(FIRST_TOE_OFFSET_X, FIRST_TOE_OFFSET_Y, TOE_WIDTH, TOE_HEIGHT);
//    toe1.setColor (toeColor);
//    toe1.setFillColor(toeColor);
//    toe1.setFilled(true);
//    add(toe1);
//    return toe1;
//     
//}
// 
//private GObject toe2(Color toeColor) {
//     
//    GOval toe2 = new GOval(SECOND_TOE_OFFSET_X, SECOND_TOE_OFFSET_Y, TOE_WIDTH, TOE_HEIGHT);
//    toe2.setColor (toeColor);
//    toe2.setFillColor(toeColor);
//    toe2.setFilled(true);
//    add(toe2);
//    return toe2;
//     
//}
// 
//private GObject toe3(Color toeColor) {
//     
//    GOval toe3 = new GOval(THIRD_TOE_OFFSET_X, THIRD_TOE_OFFSET_Y, TOE_WIDTH, TOE_HEIGHT);
//    toe3.setColor (toeColor);
//    toe3.setFillColor(toeColor);
//    toe3.setFilled(true);
//    add(toe3);
//    return toe3;
//}
//
// 
//private GObject heel(Color toeColor) {
//     
//    GOval heel = new GOval(HEEL_OFFSET_X, HEEL_OFFSET_Y, HEEL_WIDTH, HEEL_HEIGHT);
//    heel.setColor (toeColor);
//    heel.setFillColor(toeColor);
//    heel.setFilled(true);
//    add(heel);
//    return heel;
//}
