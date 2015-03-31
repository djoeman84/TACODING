/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {
		// this program finds the midpoint in any world that is as wide as it is tall
	
	public void run() {
		findMidPoint();
		deleteNonMidPointBeepers();
	}
	
	/**
	 * Distributes beepers across the whole board
	 * @before: Karel is in the SW corner of the board facing E
	 * 			and the board is empty
	 * @after: Karel is standing on one of the center positions
	 * 			on the S border of he board, and the bottom row
	 * 			is covered with tiles
	 */
	private void findMidPoint() {
		while (noBeepersPresent()) {
			moveToNoBeeper();
			putBeeper();
			turnAround();
			move();
		}
		// HINT: we talked about a special
		// case where Karel wouldn't meet the after state detailed
		// above. See if you can write code that will fix it only
		// if it is in that state here (after the while loop)
	}
	
	/**
	 * Moves Karel forward until she has found the last position
	 * without either a Beeper or a wall.
	 * @before: Karel is facing any direction anywhere on the board
	 * @after: Karel is facing the same direction in the last nonBeeper/
	 * 			non-final position in that row/column
	 */
	private void moveToNoBeeper() {
		while (frontIsClear() && noBeepersPresent()) {
			move();
		}
		if (beepersPresent()) {
			backup();
		}
	}
	
	/**
	 * TODO: add description
	 * @before:
	 * @after:
	 */
	private void backup() {
		turnAround();
		if (frontIsClear()) {
			move();
		}
		turnAround();
	}
	
	/**
	 * TODO: add description
	 * @before:
	 * @after:
	 */
	private void deleteNonMidPointBeepers() {
		faceEast();
		putBeeper();
		moveToWall();
		sweepOneRow();
	}
	
	/**
	 * TODO: add description
	 * @before:
	 * @after:
	 */
	private void faceEast() {
		// HINT: is there anything different
		// between this implementation faceEast
		// and StoneMasonKarel's turnEast?
		if (notFacingEast()) {
			turnRight();
		}
	}
	
	/**
	 * TODO: add description
	 * @before:
	 * @after:
	 */
	private void moveToWall() {
		while (frontIsClear()) {
			move();
		}
		turnAround();
	}
	
	/**
	 * TODO: add description
	 * @before:
	 * @after:
	 */
	private void sweepOneRow() {
		pickBeeper();
		while (frontIsClear()) {
			move();
			pickBeeper();
		}
	}
	
	// nala is the most beautiful nala and she is queen of the codes
	// PS when bella was up with me last night I taught her all the
	// answers so if you give her enough kisses and blueberries she
	// might give you some hints.
	//    also I gunna snuggle you color and give you all da kisses
	//    when I get home to your colo
}
