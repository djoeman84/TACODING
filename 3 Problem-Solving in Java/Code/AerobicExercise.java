/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;

//prompts user to enter values CHECK
//adds information CHECK
//use boolean to determine if cardio health met
//uses boolean to determine if bp health met

public class AerobicExercise extends ConsoleProgram {
	private static final int NUM_DAYS_PER_WEEK=7;

	public void run() { 
		int total= 0;
		int numDaysCV= 0;
		int numDaysBP=0;
		println ("Please enter how many minutes of exercise you completed on day: ");
		for (int i=0; i < NUM_DAYS_PER_WEEK; i++) {
			int dayNumber= i+1;
			int amountExercise= readInt(dayNumber+": ");
			total += amountExercise;
			
			if (amountExercise>=30) {
				numDaysCV+=1;
			}
			if (amountExercise>=40) {
				numDaysBP+=1;
			}
		
		}
		println ("You worked out for a total of " + total + " minutes");
		println("You did " + numDaysBP + " day(s) of BP exercise this week");
		println("You did " + numDaysCV + " day(s) of CV exercise this week");
		
		if (numDaysCV<5) {
			println(" You needed 30 or more minutes of aerobic exercise for cardiovascular health on at least " + (5-numDaysBP) + " day(s)");
		}
		else {
			println("You sexy beast! You've done exercise to meet minimum daily requirements of the AHA. Grrrrr");
		}
		
		if (numDaysBP<3) {
			println(" You needed 40 or more minutes of aerobic exercise for bp health on at least " + (3-numDaysBP) + " day(s)");
		}
		else {
			println("You sexy beast! You've done exercise to meet minimum daily requirements of the AHA. Grrrrr");	
		}
		
	}		
		
}		