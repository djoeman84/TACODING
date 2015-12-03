/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;

public class RaiseToPower extends ConsoleProgram {
	public void run() {
		/* Sit in a loop reading bases and exponents and printing out the values
		 * produced by raising the base to the exponent.
		 */
		while (true) {
			double base  = readDouble("Enter base: ");
			int exponent = readInt("Enter exponent: ");
			println(base + " ^ " + exponent + " = " + raiseToPower(base, exponent));
		}
	}
	
	private double raiseToPower(double base, int exponent) {
		double total = 1;
		for (int i = 0; i < exponent; i++) {
			total *= base;
		}
		
		return total;
	}
	
}


//for (int i=0; i < NUM_DAYS_PER_WEEK; i++) {
//	int amountExercise= readInt(dayNumber+": ");
//	total += amountExercise;