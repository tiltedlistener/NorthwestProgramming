package mina;

public class CarPark {	
	
	// Instance Variable
	public InputHelper helper = new InputHelper();

	
	// Run Program. We have chosen to run this here for simplicity
	public static void main(String[] args) {
		CarPark park = new CarPark();
		park.displayMenu();
		
	}

	// Shows the user the initial menu
	public void displayMenu() {
		
		// Let's us continue to run the menu unil the user quits
		boolean running = true;
		
		while (running) {

			// Intro Menu
			System.out.println("CAR PARK APP!");
			System.out.println("Enter:");
			System.out.println("1 - Add Vehicle");
			System.out.println("2 - List Vehicles");
			System.out.println("3 - Quit");		
		
			// GET USER INPUT - the application will pause the loop here
			String result = helper.getUserInput("What is your choice: ");
			
			System.out.println(result);
			if (result.equals("1")) {
				// add vehicle
				System.out.println("CREATING VEHICLE");
			} else if (result.equals("2")) {
				// List Vehicles
				System.out.println("LISTING VEHICLE");
			} else {
				// Stop running the loop and end the program
				running = false;
			}
			
		}

	}
	
	
}
