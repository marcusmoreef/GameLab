package gamelab;

import java.util.Scanner;
import java.util.ArrayList;

public class Game {
	public static ArrayList<Item> inventory = new ArrayList<Item>();
	
	public static void main(String[] args) {
		runGame();
	}
	
	public static Room currentRoom = World.buildWorld();
	
	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
	
	public static Item getItemInventory(String a) {
		for(Item b : inventory) {
			String c = b.toString();
			if(c.equals(a)) {
				return b;
			}
		}
		return null;
	}
	
	public static void runGame() {
		Scanner input = new Scanner(System.in);
		
		String command; // player's command
		do {
			System.out.println(currentRoom);
			System.out.print("Where do you want to go? ");
			command = input.nextLine();
			String[] words = command.split(" ");
			
			switch(words[0]) {
			case "e":
			case "w":
			case "n":
			case "s":
			case "u":
			case "d":
				Room nextRoom = currentRoom.getExit(command.charAt(0));
				if(nextRoom ==null) {
					System.out.println("You can't go that way");
				}
				else if(nextRoom.getLock() == true) {
					System.out.println("This room is locked");
				}
				else {
					currentRoom = nextRoom;
				}
				break;
			case "x":
				System.out.println("Thanks for walking through my game!");
				break;
			case "i":
				if(inventory.size()==0) {
					System.out.println("You have no items.");
				}
				else {
					System.out.println(inventory.toString());
				}
				break;
			case "take":
				System.out.println("You are trying to take the "+words[1]);
				Item i = currentRoom.getItem(words[1]);
				if(i==null) {
					System.out.println("There is no item");
				}
				else {
					inventory.add(i);
					currentRoom.setItem(null,null);
					System.out.println("You are now carrying the "+i);
				}
				break;
			case "look":
				if(currentRoom.getItem(words[1])!=null) {
					System.out.println(currentRoom.getItem(words[1]).getDesc());
				}
				else{
					boolean found = false;
					for(Item y : inventory) {
						if(y.getName().equals(words[1])) {
							found = true;
							System.out.println(y.getDesc());
							break;
						}
					}
					if(found == false) {
						System.out.println("This item is not in your inventory or in the this room");
					}
				}
				break;
			case "open":
				if(currentRoom.getItem(words[1])!=null) {
					currentRoom.getItem(words[1]).open();
				}
				else{
					if(getItemInventory(words[1])==null) {
						System.out.println("There is no such item");
					}
					else {
						getItemInventory(words[1]).open();
					}
				}
				break;
			case "use":
				if(currentRoom.getItem(words[1])!=null) {
					currentRoom.getItem(words[1]).use();
				}
				else{
					if(getItemInventory(words[1])==null) {
						System.out.println("There is no such item");
					}
					else {
						getItemInventory(words[1]).use();
					}
				}
				break;
			default:
				System.out.println("I don't know what that means.");
			
			}
		} while(!command.equals("x"));
		
		input.close();
	}
	
}


