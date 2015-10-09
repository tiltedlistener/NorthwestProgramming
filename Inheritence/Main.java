package main;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car();
		Olds olds = new Olds();
		Lambo lam = new Lambo();

		car.drive();
		olds.drive();
		lam.drive();
		
		olds.honk();


	}

}
