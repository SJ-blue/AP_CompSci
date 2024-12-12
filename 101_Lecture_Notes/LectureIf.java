/* 
    Lecture note example - If Statements
*/

import java.util.Scanner;
class LectureIf{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("You've joined an alien exchange program! ");
		System.out.println("Pick an alien to take in.");
		System.out.println("1. Joe, a fat bellied alien who loves eating pizza.");
		System.out.println("2. Bob, a blue alien who loves trees.");
		System.out.println("3. Barney, a purple tailed alien who loves shoes.");
		System.out.print("Please choose an alien: ");
		int answer1 = sc.nextInt();
		
		if (answer1 == 1) {
			System.out.print("Nice, you chose Joe!");
		} else if (answer1 == 2) {
 			System.out.print("Nice, you chose Bob!");
		} else if (answer1 == 3) {
			System.out.print("Nice, you chose Barney!");
		} else {
			System.out.print("That is not one of the aliens you can take in.");
		}
	}
}