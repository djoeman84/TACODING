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

	public void run() {
		findMidPoint();
		deleteNonMidPointBeepers();
	}
	private void findMidPoint() {
		while (noBeepersPresent()) {
			moveToNoBeeper();
			putBeeper();
			turnAround();
			move();
		}
		putBeeper();
		
	}
	private void moveToNoBeeper() {
		while (frontIsClear() && noBeepersPresent()) {
			move();
		}
		if (beepersPresent()) {
			backup();
		}
	}
	private void backup() {
		turnAround();
		if (frontIsClear()) {
			move();
		}
		turnAround();
	}
	private void deleteNonMidPointBeepers() {
		faceEast();
		putExtraBeeper();
		moveToWall();
		sweepOneRow();
	}
	
	private void faceEast() {
		if (notFacingEast()) {
			turnRight();
			move();
		}
	}
	private void putExtraBeeper() {
		putBeeper();
	}
	
	private void moveToWall() {
		while (frontIsClear()) {
			move();
		}
		turnAround();
	}
	private void sweepOneRow() {
		pickBeeper();
		while (frontIsClear()) {
			move();
			pickBeeper();
		}
	}
}
