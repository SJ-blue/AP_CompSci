/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program
		Scanner sc = new Scanner(System.in);
		int money = 100;
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your money.");
		System.out.println("   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");
		System.out.println("--------------------------------------------------");
		System.out.println();
		String answer = "y";
		boolean isValid = false;
		while (!isValid) {
			System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");
        	answer = sc.nextLine();
        	if (answer.equals("yes") || answer.equals("Yes") ||
            	  answer.equals("y") || answer.equals("Y") ||
        		  answer.equals("no") || answer.equals("No") ||
            	  answer.equals("n") || answer.equals("N")) {
        		isValid = true;
        	}
			if (!isValid) {
				System.out.println("That wasn't quite the correct answer. Try again.");
				System.out.println("--------------------------------------------------");
			}
		}	
		while (answer.equals("Yes") || answer.equals("yes") || answer.equals("Y") || answer.equals("y")) {
			if (answer.equals("Yes") || answer.equals("yes") || answer.equals("Y") || answer.equals("y")) {
				System.out.print("You have $" + money + ". How much would you like to wager? ");
				int wager = sc.nextInt();
				sc.nextLine();
				System.out.println();
				System.out.println("Great! Let's play!");
				System.out.println("Your rolls are:");
				System.out.println("_______________________");
				int num1 = (int)(Math.random() * 10 + 1);
				int num2 = (int)(Math.random() * 10 + 1);
				int num3 = (int)(Math.random() * 10 + 1);
				System.out.println(" | " + num1 + " | " + num2 + " | " + num3 + " |" );
				System.out.println("_______________________");
				if (num1 == num2 && num1 == num3) {
					System.out.println("Jackpot! Your wager has now been tripled.");
					wager = wager * 2;
					money = money + wager;
					System.out.println("You now have $" + money + ".");
					System.out.println("--------------------------------------------------");
				} else if (num1 == num2 || num1 == num3 || num2 == num3) {
					System.out.println("You won! Your wager has now been doubled!");
					money = money + wager;
					System.out.println("You now have $" + money + ".");
					System.out.println("--------------------------------------------------");
				} else {
					System.out.println("Didn't win this time, better luck next time!");
					money = money - wager;
					System.out.println("You now have $" + money + ".");
					System.out.println("--------------------------------------------------");
				}	
				if (money == 0) {
					System.out.print("You've run out of money! Thanks for coming! Come back soon!");
					break;
				}
			} else if (answer.equals("No") || answer.equals("no") || answer.equals("N") || answer.equals("n")){
				System.out.println("Sad to see you go! You still have $" + money + " left. Come again soon! Thanks!");
			}
			isValid = false;
			while (!isValid) {
				System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");
        		answer = sc.nextLine();
        		if (answer.equals("yes") || answer.equals("Yes") ||
            		  answer.equals("y") || answer.equals("Y") ||
        			  answer.equals("no") || answer.equals("No") ||
            		  answer.equals("n") || answer.equals("N")) {
        			isValid = true;
        		}
				if (!isValid) {
					System.out.println("That wasn't quite the correct answer. Try again.");
					System.out.println("--------------------------------------------------");
				}
			}
		}
		if (answer.equals("No") || answer.equals("no") || answer.equals("N") || answer.equals("n")){
			System.out.println("Sad to see you go! You still have $" + money + " left. Come again soon! Thanks!");
		}
	}
}
