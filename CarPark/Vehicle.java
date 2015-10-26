package mina;

public class Vehicle {

	// Protected means we can inherit this variable, but it's 
	// still not public
	protected String make;
	
	public void setMake(String _make) {
		// Make sure we don't empty an empty string
		if (_make.length() > 0) {
			make = _make;
		}
	}
	
	public String getMake() {
		return make;
	}
}
