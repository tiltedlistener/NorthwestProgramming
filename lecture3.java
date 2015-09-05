package Main;

public class HelloWorld {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		blah();
		System.out.println(addTwo(4));
	}
	
	public static int addTwo(int x) {
		x = x + 1;
		return x + 1;
	}
	
	public static void blah() {
		System.out.println("Hello World!");
	}

}
