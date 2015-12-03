/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;

public class AlgorismAlgorithms extends ConsoleProgram {
	public void run() {
		testSimple();
//		testVariableLength();
//		testCarryOver();
//		testAll();
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
		return "2";
	}
	
	private void runTests(String[][] t, String testName) {
		println("Hi pretty baby nalu:) I love you you are the best coder. Now we are testing: " + testName);
		for(int i = 0; i < t.length; i++) {
			String n1 = t[i][0];
			String n2 = t[i][1];
			String expected = t[i][2];
			String result = addNumericStrings(n1, n2);
			if (result.equals(expected)) {
				println("Success! " + n1 + " + " + n2 + " = " + result + " V.v.V <3");
			} else {
				println("Almost pretty dingo: " + n1 + " + " + n2 + " != " + result + ". should be " + expected);
			}
		}
	}
	
	private void testSimple() {
		String[][] tests = {
				{"1", "1", "2"},
				{"10", "10", "20"},
				{"15", "52", "67"},
				{"1000", "2323", "3323"},
				{"4", "5", "9"}
		};
		runTests(tests, "testSimple");
	}
	
	private void testVariableLength() {
		
	}
	
	private void testCarryOver() {
		
	}
	
	private void testAll() {
		
	}
}
