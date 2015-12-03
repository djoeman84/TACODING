/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;
import acm.util.RandomGenerator;

public class SaintPetersburgGame extends ConsoleProgram {
	public void run() {
		int numGames= 0;
		int totalWinnings= 0;
		while (totalWinnings < 20) {
			int winnings = playSaintPetersburgGame();
			println("This game you earned " + winnings);
			totalWinnings += winnings;
			println("Your total is " + totalWinnings);
			numGames += 1;
		}
		println("It took you " + numGames + " games to win");
	}
	
	/**
	 * this runs one entire iteration of the game
	 * @return int PSPG: returns total money earned during game
	 */
	private int playSaintPetersburgGame() {
		int total= 1; 
		while (true) {
			boolean isTails = flip();
			if (isTails) {
				total *= 2;
			}
			else {
				return total;
			}
		}
	}
	
	/** 
	 * This method, aka flip, returns true if the flip landed on tails
	 * @return boolean isTails: true if flip resulted in tails
	 */
	private boolean flip() {
		RandomGenerator rgen = RandomGenerator.getInstance();
		boolean isTails = rgen.nextBoolean(0.5);
		return isTails;
		
	}

}
