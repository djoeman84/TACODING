/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;

public class SyllableCounting extends ConsoleProgram {
	public void run() {
		/* Repeatedly prompt the user for a word and print out the estimated
		 * number of syllables in that word.
		 */
		while (true) {
			String word = readLine("Enter a single word: ");
			println("  Syllable count: " + syllablesIn(word));
		}
	}
	
	/**
	 * Given a word, estimates the number of syllables in that word according to the
	 * heuristic specified in the handout.
	 * 
	 * @param word A string containing a single word. 
	 * @return An estimate of the number of syllables in that word.
	 */
	private int syllablesIn(String word) {
		// TODO: Delete this comment and implement this method.
		return 0;
	}
}
