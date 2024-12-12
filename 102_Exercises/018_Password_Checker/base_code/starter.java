import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		count = 0;
		int strength1 = 0;
		int strength2 = 0;
		int strength3 = 0;
		while (count < passwords.length - 1) {
		    if (passwords[count].length() >= 8 && (passwords[count].contains("!") || passwords[count].contains("@") || passwords[count].contains("#") || passwords[count].contains("$") || passwords[count].contains("%") || passwords[count].contains("^") || passwords[count].contains("&") || passwords[count].contains("*"))) {
		        strength3++;
		    } else if (passwords[count].length() >= 8) {
		        strength1++;
		    } else if (passwords[count].contains("!") || passwords[count].contains("@") || passwords[count].contains("#") || passwords[count].contains("$") || passwords[count].contains("%") || passwords[count].contains("^") || passwords[count].contains("&") || passwords[count].contains("*")) {
		        strength2++;
		    }
		    count++;
		}
        System.out.println("There are " + strength1 + " passwords of strength 1 with 8 or more characters.");
        System.out.println("There are " + strength2 + " passwords of strength 2 with a special symbol.");
        System.out.println("There are " + strength3 + " passwords of strength 3 with both strength 1 and 2.");
		
	}
}
