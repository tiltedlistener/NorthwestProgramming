package CarFun;

public class Car {
	
	String type;
	String model;

	double cost;
	boolean hasAc;
	
	Engine engine;
	
	Tire tireOne;
	Tire tireTwo;
	Tire tireThree;
	Tire tireFour;
	
	// Look a constructor function with multiple variables!
	public Car(Engine _engine, boolean ac) {
		engine = _engine;
		hasAc = ac;
	}
	
}
