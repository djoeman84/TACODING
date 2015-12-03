/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.program.*;
// get number from user
// int n= readInt
//int steps
//while not 1, while loops using mod to determine if even or odd, then 
//println it took so many steps
public class Hailstone extends ConsoleProgram {
	public void run() {
		int n= readInt ("Please enter your desired number: ");
		int steps= 0;
		while (n >1) {
			if (n%2==0) {
				println( n + " is even, so take half:" + (n/2));
				n = (n/2);
			} else {	
				println( n+ " is odd, so take 3n+1:" +((3*n)+1));
				n= ((3*n)+1);
			}
			steps++;
		} 
		println("It took " + steps + " steps to reach 1");
	}
}

// what's wrong? :( '