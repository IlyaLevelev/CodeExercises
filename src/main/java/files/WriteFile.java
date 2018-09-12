package files;

import java.io.*;
import java.util.*;

public class WriteFile {

	public static void main(String[] args) throws Exception {
		
		PrintWriter writer = new PrintWriter("example.txt");
		
		int i = 1;
		while (i <= 10) {
			writer.println(i);
			i = i + 1;
		}
		
		writer.close();
	}

}
