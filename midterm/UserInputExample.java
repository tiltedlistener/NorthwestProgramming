package Main;

import java.util.ArrayList;

public class UserInputExample {

	public static void main(String[] args) {
		
		
		// Instantiating an InputHelper object
		InputHelper helper = new InputHelper();
		int t = 0;
		
		
		// Repetitive User input example
		while (t < 3) {
			// This will halt the program until we get a response
			// User can enter content in the console and then complete by hitting enter/return
			String output = helper.getUserInput("Give me a number: ");
			
			// Use the Integer class's static method to 
			// change our String into an int
			int num = Integer.parseInt(output);
			
			// Display Number
			System.out.println(num);
		}

		
		// Creating an Array List
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(4);
		num.add(5);
		System.out.println(num.size()); // Checking its size
		
		
	}
	
}
