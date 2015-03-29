/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
		constructColumn(); 
		
		while (frontIsClear()) {
			moveToNextColumn();
			constructColumn();
		}
	}
	private void constructColumn() {
		tryPutBeeper();
		turnNorth();
		buildOneColumn();
		faceBase();
		moveToBase();
		turnLeft();
	}
	private void tryPutBeeper() {
		if (noBeepersPresent()) {
			putBeeper();
		}
	}
	private void turnNorth() {
		while (notFacingNorth()) {
			turnLeft();
		}
	}
	private void buildOneColumn() {
		while (frontIsClear()) {
			move();
			tryPutBeeper();
		}
	}
	private void moveToNextColumn() {
		if (frontIsClear()) {
			moveFourTimes();
		}

	}
	private void faceBase() {
		while (notFacingSouth()) {
			turnLeft();
		}
	}
	private void moveToBase() {
		while (frontIsClear()) {
			move();
		}
	}
	private void moveFourTimes() {
		for (int i = 0; i < 4; i++) {
			move();
		}
	}
}
