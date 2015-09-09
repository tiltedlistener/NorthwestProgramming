package Main;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * Primitives List
		 */
		// Number Types
		byte smallNum = 127; 
		short classNumber = 254;
		int currentUnixTime = 1441739195;	
		double numWithDecimalsDouble = 14417343439195.213;		
		
		// Non-number types
		boolean classIsHappening = true;  
		char firstLetter = 'N';
		
		// Anti-pattern for double quotes on Char
		// char otherLetter = "N";

		// Anti-pattern Double Declaration
		// byte smallNum;

		// Alternative Declaration and assignment
		int x;
		x = 254; // Look! You don't need to reference type		
		
		// Anti-pattern of assignment before declaration
		// y = 12
		// int y;
		

		// Reassignment
		x = 123;
		
		// Reassignment
		x = currentUnixTime;		
		
		// Example Output
		// System.out.println can print any Primitive type
		System.out.println(classIsHappening);
		System.out.println(firstLetter);
		System.out.println(numWithDecimalsDouble);		
	
		// Example Reassignment
		int t = 4;
		int z = 12;
		System.out.println(t);
		System.out.println(z);
		t = z;
		t = t + 1;
		System.out.println(t);
		System.out.println(z);
	}

}
