package CarFun;

public class CarFun {

	public static void main(String[] args) {
		
		// Instantiating our Car class
		Car newCar = new Car(new Engine(6.1), true);
		
		// Using dot notation to set values on our car object
		newCar.cost = 1231231;
		newCar.type = "luxury";
		newCar.model = "Bugatti";
	
		// Again using dot notation to set values, but while instantiating our Tire class
		newCar.tireOne = new Tire(6);
		newCar.tireTwo = new Tire(6);
		newCar.tireThree = new Tire(6);
		newCar.tireFour = new Tire(6);
	
		// Let's save our new car!
		saveToDatabase(newCar);
	}
	
	// Simple function to show our program compiles and runs
	public static void saveToDatabase(Car car) {
		// Pretend complicated stuff happens here
		System.out.println("YEAH SAVED");
	}

}
