/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	// Will create a checkerboard on any blank world so long as it is four sided
	public void run() {
		// HINT: Honey this is great work you is doing:)
		// I don't want to write in too big of hints here
		// or influence your thinking here too much. I'll
		// text you from work and maybe we can work on a
		// a simpler way to do this
		//
		// Great decomposition and implementation using
		// all of the things we talked about yesterday:)
		// You is really the smartest peekin I know I am
		// thouroughly impressed:)
		//
		// My hint is this, this might be too vauge but
		// oh well.
		//    In this one it may be best to forget any
		//    notion of efficiency of the program.
		//    I would recommend trying to rewrite
		//    firstRow as checkerRowOrColumn() as I
		//    detailed below. and make sure it matches
		//    the javadoc.
		//    If you can test this in isolation like
		//    we did together to make sure sure sure
		//    it works, I think it can help you build
		//    the program more easily.
		createFirstRow ();
		createAllOtherRows();
	}
	
	/**
	 * Fills in every other corner in a given row/column
	 * @before: Karel is facing any direction
	 * @after: Karel is in the same position facing the
	 * 			same direction.
	 * 		   Beepers have been placed on every other
	 * 			position in front of where Karel was
	 * 			standing
	 */
	private void checkerRowOrColumn() {
		// TODO: nale makes the great codes to this
	}
	
	/**
	 * TODO: add description
	 * @before:
	 * @after:
	 */
	private void createFirstRow() {
		while (frontIsClear()) {
			putBeeper();
			moveTwice();
		}
		if (frontIsBlocked() && beepersPresent()) {
			faceNorth();
			move();
			turnRight();
		} else {
			faceNorth();
			move();
			putBeeper();
			turnLeft();		
		}
											
	}
	
	/**
	 * TODO: add description
	 * @before:
	 * @after:
	 */
	private void moveTwice() {
		if (frontIsClear()) {
			move();
		}
		if (frontIsClear()) {
			move();
		}
	}
	
	/**
	 * Ensures that Karel is facing North
	 * @before: Karel is facing in any direction (NWSE)
	 * @after: Karel is facing North
	 */
	private void faceNorth() {
		while (notFacingNorth()) {
			turnRight();
		}
	}
	
	/**
	 * TODO: add description
	 * @before:
	 * @after:
	 */
	private void createAllOtherRows() {
		if (beepersPresent()) {
			while (frontIsClear()) {
				moveTwice();
				putBeeper();
			}
			faceNorth();
			move();
			aboutFace();
		}
		putBeeper();
		while (frontIsClear()) {
			moveTwice();
			putBeeper();
		}
		faceNorth();
		move();
		aboutFace();
	
	}
	
	/**
	 * TODO: add description
	 * @before:
	 * @after:
	 */
	private void aboutFace() {
		if (frontIsBlocked()) {
			turnAround();
		}
	}

}