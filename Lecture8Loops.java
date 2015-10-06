package LoopFun;

public class Fun {

	public static void main(String[] args) {
		basicFor();
	}
	
	public static void basicWhile() {
		int max = 10;
		int counter = 0;
		while (counter < max) {
			System.out.println("Printing!");
			counter++;
		}	
	}
	
	public static void randomWhile() {
		
		// Note this is always true, so will run indefinitely
		while (true) {
			double random = Math.random();  // Using the Java Library Math object's function random(). Will give a number from 0 - 1.0
			
			System.out.println("We got: " + random);  // Using String concatenation to get feedback on our number
			
			if (random > 0.7) {	// We test for the number being greater than 0.7
				break; // Break will pop us out of this code block
			}
		}
	}
	
	public static void basicFor() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Printing!");
		}
	}
	
	public static void randomFor() {
		double i = 0;
		for (i = 0; i < 0.7; i = Math.random()) {
			System.out.println("We got: " + i);
		}
		System.out.println("We got: " + i);
	}

	public static void basicdoWhile(int max) {
		int counter = 0;
		do {
			System.out.println("Printing!");
			counter++;
		} while (counter < max);
	}
	
}
