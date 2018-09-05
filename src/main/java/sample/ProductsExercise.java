package sample;

import java.util.*;

public class ProductsExercise {

	public static void main(String[] args) {


		// Declare 3 variables with the type Product
		Product playstation = new Product();
		Product macbook = new Product();
		Product tv = new Product();

		// Create 3 objects and assign them to the variables.
		playstation.name = "Playstation";
		playstation.price = 900;
		playstation.available = true;

		macbook.name = "MacBook";
		macbook.price = 1500;
		macbook.available = false;

		tv.name = "TV";
		tv.price = 300;
		tv.available = true;

		// Create a list of products and add the 3 products to the list
		List<Product> products;
		products = new ArrayList<Product>();
		products.add(playstation);
		products.add(macbook);
		products.add(tv);

		// Second list for testing exercise 6
		List<Product> products2;
		products2 = new ArrayList<Product>();
		products2.add(playstation);
		products2.add(tv);


		displayAvailableNamePrice(products);
		Util.assertEquals (availableProducts (products) , products2);
		Util.assertEquals (meanPrices (products) , 900.0);
		Util.assertEquals (meanPrices2 (products, true) , 600.0);
		Util.assertEquals (meanPrices2 (products, false) , 900.0);
		System.out.println("ok");

	}


	// Define a function that receives that receives a list of products and displays the name and price of the available ones
	static void displayAvailableNamePrice (List<Product> products) {

		for (Product product : products) {
			if (product.available) {
				System.out.println(product.name + " has a price of " + product.price);
			}
		}
	}
	// Define a function that receives a list of products and returns a list of available products
	static List<Product> availableProducts (List<Product> products){
		List<Product> result = new ArrayList<Product>();
		for (Product product : products) {
			if (product.available) {
				result.add(product);
			}

		}

		return result;
	}
	// Define a function that receives a list of products and returns the mean of the prices of the products

	static double meanPrices (List<Product> products){
		double sum = 0;
		double mean = 0;
		for (Product product : products) {
			sum = sum + product.price;

		}
		mean = sum / products.size();

		return mean;
	}
	// Change the meanPrices function and add a Boolean for available Products only. If this parameter is true, calculate the mean only for available products
	static double meanPrices2 (List<Product> products, boolean onlyAvailable){
		int counter = 0;
		double sum = 0;
		
		
		// AND, OR, NOT
		// A -> B
		
		// Si como mucho me engordo
		// no estoy gordo
		
		// A -> B
		// !B
		// !A
		
		// !A || B
		
		
		for (Product product : products) {
			
			// !onlyAvailable || product.available
			if ((onlyAvailable && product.available) || !onlyAvailable) {
				counter = counter + 1;
				sum = sum + product.price;
			}
			
		}
		
		double mean = sum / counter;
		return mean;
	}

}

// Create a class with the properties of name, price, unit and available

class Product{
	String name;
	double price;
	int unit;
	boolean available;
}
