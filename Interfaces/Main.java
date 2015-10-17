package main;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Freelancer());
		employees.add(new Professor());
		
		int totalPay = 0;
		for (int i = 0; i < employees.size(); i++) {
			totalPay += employees.get(i).pay();
			
			Employee current = employees.get(i);
			current.pay();
		}
		System.out.println(totalPay);

	}

}
