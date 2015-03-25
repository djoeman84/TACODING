/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;

public class AlgorismAlgorithms extends ConsoleProgram {
	public void run() {
		/* Sit in a loop, reading numbers and adding them. */
		while (true) {
			String n1 = readLine("Enter first number:  ");
			String n2 = readLine("Enter second number: ");
			println(n1 + " + " + n2 + " = " + addNumericStrings(n1, n2));
			println();
		}
	}
	
	/**
	 * Given two string representations of nonnegative integers, adds the
	 * numbers represented by those strings and returns the result.
	 * 
	 * @param n1 The first number.
	 * @param n2 The second number.
	 * @return A String representation of n1 + n2
	 */
	private String addNumericStrings(String n1, String n2) {
		// TODO: Replace this comment with your implementation of this method!
		return "";
	}
}
