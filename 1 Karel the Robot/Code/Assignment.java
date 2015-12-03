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
  private static final int NUM_SEGMENTS = 10;
  
  /* The width and height of each segment of the body. */
  private static final double SEGMENT_SIZE = 80;
  
  /* The horizontal and vertical spacing between the segments. */
  private static final double SEGMENT_SPACING = 50;
  
  /* This designates the internal color of the body segments */
  private static final Color FILL_IN_COLOR= Color.CYAN;
  
  /* This designates the border color for each body segment */
  private static final Color BORDER_COLOR = Color.MAGENTA;
  
  /*This designates where the stupid body begins for the x axis*/
  private static final double X_START= 12;
  
  /*This designates where the stupid body begins for the y axis*/
  private static final double Y_START= 48;
  
  /*This makes the Y_offset*/
  private static final double Y_OFFSET= 25;
  
  /*This makes the program go*/
  
  public void run() {
    drawCaterpillar(X_START, Y_START, NUM_SEGMENTS);
    //jason chris whole foods
  }
  /*This draws a whole caterpillar, depending on how many segments you give it*/
  
  private void drawCaterpillar (double x, double y, int numberSegments) {
    for (int i = 0; i < numberSegments; i++) {
      double offsetY = 0;
      if (isEven(i)) {
        offsetY = y + Y_OFFSET;
      }
      else {
        offsetY = y;
      }
      
      
      bodySegment(x + i * SEGMENT_SPACING, offsetY, SEGMENT_SIZE);
    }
    
  }
  
  /**
   * isEven
   * @param value value to be evaluated
   * @return boolean: true if value is even
   */
  private boolean isEven(int value) {
    return (value % 2 == 0);
  }
  
  /*This draws a body circle in the caterpillar*/
  
  private void bodySegment (double x, double y, double diameter) {
    GOval segment= new GOval (x, y, diameter, diameter);
    segment.setColor(BORDER_COLOR);
    segment.setFilled(true);
    segment.setFillColor(FILL_IN_COLOR);
    add(segment);
        
  }
  
}

  