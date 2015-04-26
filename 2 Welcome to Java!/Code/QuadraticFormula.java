/* DONE! This program here is for the complete love and justice of princess Isabella Basheeba 2003 taco tiko ruff batman bunny rabbit pigeon killer the fourth.
 * It solves a quadratic problem (which finds the roots of the quadratic equation). It is equipped to handle imaginary numbers as well. 
 */
import acm.program.*;

public class QuadraticFormula extends ConsoleProgram {
	public void run() {
		println ("Please enter the coefficients for the quadratic equation");
		int a= readInt("Enter a:");
		int b= readInt("Enter b:"); 
		int c= readInt("Enter c:");
		int y= ((b*b) - (4*a*c));
		double x1= (-b-Math.sqrt(y))/(2*a);
		double x2= (-b+Math.sqrt(y))/(2*a);
		if (imaginary(y)) {
			println("The equation has no real solution.");
		} else if (sameAnswer(x1, x2)) {
			println("The equation has one solution " + x1);
			
        } else {
			println("The first solution is: " + x1);
    		println("The second solution is: " + x2);
        }
    }
     
    private boolean imaginary(double y) {
        if (y < 0) {
            return true;
        } else {
            return false;
        } 
    }
    private boolean sameAnswer (double x1, double x2) {
    	if (x1 == x2) {
    		return true;
    	} else {
    		return false;
    	}
    }

}
		