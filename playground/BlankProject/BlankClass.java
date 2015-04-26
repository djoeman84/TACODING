/*
 * File: BlankClass.java
 * ---------------------
 * This class is a blank one that you can change at will. Remember, if you change
 * the class name, you'll need to change the filename so that it matches.
 * Then you can extend GraphicsProgram, ConsoleProgram, or DialogProgram as you like.
 */

import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class BlankClass extends ConsoleProgram {
		
	public void run() {	
		doDingo();
		doMonkey();
		doSoup(getSoupNumber());
	}
	
	private void doDingo() {
		println("hello world I am a dingo");
		doDingoBark();
		doDingoBark();
		doDingoBark();
	}
	
	private void doDingoBark() {
		println("dingo RUFF");
	}
	
	private void doMonkey() {
		getBanannas(3);
	}
	
	private void getBanannas(int numBanannas) {
		for (int i = 0; i < numBanannas; i++) {
			getBananna(i, numBanannas);
		}
	}
	
	private void getBananna(int currentBanannaIndex, int totalBanannas) {
		println("getting bananna number " + (currentBanannaIndex + 1) + " of " + totalBanannas);
	}
	
	private int getSoupNumber() {
		return 3;
	}
	
	private void doSoup(int numberSoups) {
		println("SOUPPPP");
		if (numberSoups > 0) {
			doSoup(numberSoups - 1);	
		}
	}
	


}

