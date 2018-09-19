package rooms;

import java.util.Arrays;
import java.util.List;

import statistics.Statistics;

public class Main {

	public static void main(String[] args) {
	

		Room blue = new Room("blue");
		Room red = new Room("red");	
		Room green = new Room("green");
		Room purple = new Room("purple");

		
		red.next = green;
		green.next = blue;
		blue.next = purple;
		
		Room r1 = red;
		r1.next = blue;
		
		blue.next.next = r1.next;
		
		red.nextRooms = Arrays.asList(green, blue, purple);


	}

}
