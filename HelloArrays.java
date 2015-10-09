package Main;

public class HelloArrays {
	
	public static void main(String[] args) {

		// Define an array
		int[] arrayOfInts;

		// Define and assign an array
		int[] arrayOfNumbers = { 1, 3, 4, 5, 6, 7 };

		// Define and allocate memory for an array
		// Note this array can only hold 10 items ever!
		int[] moreNumbers = new int[10];

		// Accessing a value in an array
		System.out.println(arrayOfNumbers[0]); // will print '1'

		// Remember arrays start counting at zero
		// To access the SECOND value of arrayOfNums
		System.out.println(arrayOfNumbers[1]);

		// Get the size of an array
		System.out.println(arrayOfNumbers.length); // Will print '6'

		// Looping through an array
		// Use Array.length to figure out how many times we need to loop
		// Then use the variable counter 'i' to access each index
		for (int i = 0; i < arrayOfNumbers.length; i++) {
			System.out.println(arrayOfNumbers[i]);
		}

	}
	

}