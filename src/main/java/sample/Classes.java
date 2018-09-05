package sample;

import java.util.*;

public class Classes {

	public static void main(String[] args) {
	
		assertTrue ( power (2, 0) == 1 );
		assertTrue ( power (3, 4) == 81 );
		System.out.println("ok");
		
		Client john;
		Client mary;
		
		john = new Client();
		mary = new Client();
		
		john.country = "Switzerland";
		john.name = "John";
		john.budget = 50;
		john.isCompany = false;
		
		mary.name = "Mary";
		mary.budget = 100;
				
		
		//System.out.println(john.name + " has a budget of " + john.budget);
		//displayBudget(john);
		//displayBudget(mary);
		
		List<Client> clients; 
		clients = new ArrayList<Client>();
		
		clients.add(john);
		clients.add(mary);
		
		for (Client client : clients) {
			displayBudget (client);
		}
	}
	
	static void assertTrue(boolean test) {

		if (!test) {
			throw new RuntimeException("wrong!");
		}
	}
	/** Returns the power of the base to exponent */
	
	static double power (double base, int exponent) {
		double result = 1;
		for (int index = 0; index < exponent; index++) {
			result = result * base;
		}	
		return result;
	}
	

	/** Displays the budget of the client */
	static void displayBudget(Client client) {
		System.out.println(client.name + " has a budget of " + client.budget);
	}

}

class Client {
	// fields / properties
	String country;
	String name;
	double budget;
	boolean isCompany;
}


