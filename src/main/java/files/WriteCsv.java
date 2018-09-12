package files;

import java.io.*;
import java.util.*;

public class WriteCsv {

	public static void main(String[] args) throws Exception {
		
		PrintWriter writer = new PrintWriter("example.csv");
		
		writer.println("Name of product;Price");
		writer.println("TV;1000");
		writer.println("Phone;500");
			
		writer.close();
	}

}
