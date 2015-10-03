package Main;

public class Student {

	private int age = 18;
	
	public void getAge() {
		System.out.println(age);
	}
	
	public void setAge(int newAge) {
		if (newAge > 17) {
			age = newAge;
		}
	}
	
	public Student cloneStudent() {
		Student temp = new Student();
		temp.age = this.age;
		return temp;
	}
	
	public boolean isOverTwentyOne() {
		if (age >= 21) {
			return true;
		} else {
			return false;
		}
	}
	
}