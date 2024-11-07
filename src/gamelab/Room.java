package gamelab;

import java.util.HashMap;

public class Room {
		
		private HashMap<String, Item> Item = new HashMap<String,Item>();
		
		private String description;
		private Room north;
		private Room south;
		private Room east;
		private Room west;
		private Room up;
		private Room down;
		private boolean lock;
		private String name;
	
		public Room(String d, String n) {
			description = d;
			name = n;
		}
		public Room getExit(char exit) {
			if (exit=='n') {
				return north;
			}
			else if (exit=='s') {
				return south;
			}
			else if (exit=='e') {
				return east;
			}
			else if (exit=='w') {
				return west;
			}
			else if (exit=='u') {
				return up;
			}
			else if (exit=='d') {
				return down;
			}
			else{
				return null;
			}
		}
		public void addExit(Room r, char c) {
			if(c=='n') {
				north = r;
			}
			else if(c=='s') {
				south = r;
			}
			else if(c=='e') {
				east = r;
			}
			else if(c=='w') {
				west = r;
			}
			else if(c=='u') {
				up = r;
			}
			else if(c=='d') {
				down = r;
			}
		}
		public String toString() {
			return description;
		}
		
		public void setItem(String s, Item i) {
			Item.put(s,i);
		}
		
		public Item getItem(String s) {
			return Item.get(s);
		}
		public void removeItem(String s) {
			Item.remove(s);
		}
		public void setLock(Boolean b) {
			lock = b;
		}
		public boolean getLock() {
			return lock;
		}
		public String getName() {
			return name;
		}
		public void setName(String b) {
			name = b;
		}
	}
