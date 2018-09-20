package rooms;

import java.util.Arrays;

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

		Room livingroom = new Room ("living Room");
		Room kitchen = new Room ("kitchen");
		Room dorm1 = new Room ("dorm1");
		Room dorm2 = new Room ("dorm2");
		Room bathroom = new Room ("bathroom");
		
		livingroom.nextRooms = Arrays.asList(dorm1, dorm2, kitchen, bathroom);
		kitchen.next = livingroom;
		dorm1.nextRooms = Arrays.asList(livingroom, bathroom, dorm2);
		dorm2.nextRooms = Arrays.asList(livingroom, dorm1);
		bathroom.nextRooms = Arrays.asList(dorm1, livingroom);
	}

}
