package rooms;

import java.util.*;

public class Room {

		public String name;
		public Room next;
		public List<Room> nextRooms;
		
		public Room(String name) {
			this.name = name;
	
		}
		
}
