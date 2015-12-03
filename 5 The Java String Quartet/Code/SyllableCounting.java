/* This program attempts to count the number of syllables in any word supplied by a user. It does this based on vowel presence, accounting for silent "e"s at
 * the end of words
 */
import acm.program.*;

public class SyllableCounting extends ConsoleProgram {
	public void run() {
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
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
		}
		return 0;
	}
}
}
