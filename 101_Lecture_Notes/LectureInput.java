/* 
    Lecture note example - Input and Scanner
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
    Scanner sc = new Scanner (System.in);
    
    System.out.print("Please enter your name. "); 
	String name = sc.nextLine();
	
	System.out.println();
	System.out.println("Hello " + name + "."); 
	
	System.out.println();
	System.out.println("Please enter a number ");
	int x = sc.nextInt();
	sc.nextLine();
	System.out.println("Please enter another number ");
	int y = sc.nextInt();
	sc.nextLine();
	System.out.println("The sum of these numbers is " + (x + y));
	
	System.out.print("Please enter your favorite food. "); 
	String food = sc.nextLine();
    }
}