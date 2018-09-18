package files;

import java.io.*;
import java.util.*;

public class WriteCsvProducts {

	public static void main(String[] args) throws Exception {
		
		Product product1 = new Product("TV", 1000);
		Product product2 = new Product("Phone", 500);
		Product product3 = new Product("Pen", 5);
		Product product4 = new Product("Book", 15);
		
		List<Product> products = new ArrayList<>();
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);

		
		PrintWriter writer = new PrintWriter("products.csv");
		
		writer.println("Name;Price");
		
		
		
		for (Product product : products) { // try to use the for(:)
			
			writer.println(product.name + ";" + product.price);
			
		}
		

		writer.close();
	}

}
