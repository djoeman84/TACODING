/* TODO: Replace these file comments with a description of what your program
 * does. This will be particularly important for this program, since you have
 * complete control over what your animation does!
 */
import acm.program.*;
import acm.util.RandomGenerator;
import acm.graphics.*;
import java.awt.*;

public class FiveSecondsOfFame extends GraphicsProgram {
	private static final double BALL_SIZE = 100;
	private static final double PAUSE_TIME= 1000.0 / 100.0;
	private static final double HORIZONTAL_VELOCITY = 1.5;
	private static final double GRAVITY= 0.25;
	private static final double ELASTICITY = 0.8; 
	
	
	public void run() {
		GOval ball = getCircle();
		add(ball); 
		double dx = HORIZONTAL_VELOCITY;
		double dy = 0;
		while (true) {
			ball.move(dx, dy);
			dy += GRAVITY;
			if (atBottom(ball) && dy>=0) {
				dy*=-ELASTICITY;
				ball.setColor(getColor());
				ball.setFillColor(getColor());
			}
			pause(PAUSE_TIME);
		}
		
	}
		
	private GOval getCircle() {
//		(new GOval(0, 0, 50, 50)).setColor(Color.BLUE);
		GOval r = new GOval(0, 0, BALL_SIZE, BALL_SIZE);
		r.setColor (Color.cyan);
		r.setFillColor(Color.blue);
		r.setFilled(true);
		return r;  	
	}
	private boolean atBottom(GOval ball) {
		double ballBottom= ball.getHeight() + ball.getY();
		double screenBottom= getHeight();
		return ballBottom > screenBottom;
		
	}
	private Color getColor() {
		RandomGenerator rgen = RandomGenerator.getInstance();
		Color color = rgen.nextColor();
		return color;
	}
}


//while (animation-not-finished) { update graphics;
//pause(pause-time); }

