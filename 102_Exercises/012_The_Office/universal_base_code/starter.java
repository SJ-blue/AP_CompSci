/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.raiseSalary(70);
		dwight.employeeToString();
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.raiseSalary(70);
		jim.employeeToString();
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		pam.raiseSalary(70);
		pam.employeeToString();
		Employee ryan = new Employee(7611, "Ryan", "King", 120908);
		ryan.raiseSalary(29);
		ryan.employeeToString();
	}
}
