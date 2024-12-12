/* 
    Lecture note example - Variables (String, int, double)
*/

class LectureVariables{
    public static void main(String args[]) {
        // Your Code Goes here!
        String name;
        name = new String("Cat");
        
        int number;
        number = 16;
        
        double amount;
        amount = 25.16;
        
        System.out.println(name + " lives in Beverly Hills.");
        System.out.println(name + " has " + number + " rooms in her house.");
        System.out.print(name + ", with her " + number + " rooms is $" + amount+ " in debt.");
	}
}