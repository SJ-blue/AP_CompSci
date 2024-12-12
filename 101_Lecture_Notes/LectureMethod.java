/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        printAnimal();
        
        greeting("Catherine");
        greeting("Alana");
        
        double num = raise(6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        num = raise(num + 6000, 6);
        System.out.println(num);
    }
	public static void greeting(String name) {
	    System.out.println("Hi, " + name + ".");
	}
	public static double raise(double salary, int percent){
        double amount = salary + (salary * (percent / 100.0));
        return amount;
	}
	public static void printAnimal() {
	    System.out.println("  /\\_/\\");
	    System.out.println(" ( o.o ) ");
	    System.out.println("  > ^ < ");
	}
}