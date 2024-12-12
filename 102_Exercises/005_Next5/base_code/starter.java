/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a number: "); 
		int x = sc.nextInt();
		
		System.out.println("Here are the next 5 numbers!"); 
		System.out.println(x + ", " +(x + 1) + ", " + (x + 2) + ", " + (x + 3) + ", " + (x + 4) + ", " + (x + 5));
		System.out.println("Here are the next 5 multiples of " + x + "!");
		System.out.println(x + ", " + (x * 2) + ", " + (x * 3) + ", " + (x * 4) + ", " + (x * 5) + ", " + (x * 6));
		System.out.println("Here is " + x + " divided by 100!");
		System.out.println(x / 100.0);
		System.out.println("Here is " + x + " divided by 10!");
		System.out.println(x / 10.0);

	}
}
