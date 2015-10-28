package mina;

import java.util.ArrayList;

public class CarPark {	
	
	// Instance Variables
	public InputHelper helper = new InputHelper();
	public ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

	
	// Run Program
	public static void main(String[] args) {
		CarPark park = new CarPark();
		park.displayMenu();
	}
	
	public void displayMenu() {
		
		boolean running = true;
		
		while (running) {

			// Intro Menu
			System.out.println("\nCAR PARK APP!");
			System.out.println("Enter:");
			System.out.println("1 - Add Vehicle");
			System.out.println("2 - List Vehicles");
			System.out.println("3 - Quit\n\n");		
		
			String result = helper.getUserInput("What is your choice: ");	
			if (result.equals("1")) {			
				
				String vehicleType = helper.getUserInput("Car or Truck (c/t): ");	
				String makeResult = helper.getUserInput("What is the vehicle's make: ");	
				
				if (vehicleType.equals("c")) {
					Car currentCar = new Car();
					currentCar.setMake(makeResult);
					vehicles.add(currentCar);					
				} else if (vehicleType.equals("t")) {
					Truck currentTruck = new Truck();
					currentTruck.setMake(makeResult);
					vehicles.add(currentTruck);
				}

			} else if (result.equals("2")) {
				System.out.print ("\n\n--------------LIST OF VEHICLES------------------\n");
				for (int i = 0; i < vehicles.size(); i++) {
					Vehicle current = vehicles.get(i);
					System.out.println(current.getMake());
				}				
				System.out.print ("----------------------------------------------------\n");
			} else {
				running = false;
			}
			
		}

	}
	
	
}
