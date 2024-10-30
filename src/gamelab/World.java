package gamelab;

public class World {
	// Builds the game world.
	// Returns the room the player starts in.
	public static Room buildWorld() {
	Room cockpit = new Room("You are in the cockpit.");
	Room hallway = new Room("You are in the hallway.");
	Room kitchen = new Room("You are in the kitchen.");
	Room escape_pods = new Room("You are in the escape pod room.");
	Room armory = new Room("You are in the armory.");
	Room engine = new Room("You are in the engine room.");
	Item crowbar = new Item("crowbar", "A black metal bar that can be used to open or break things.");
	Item flashlight = new Item("flashlight", "a red flashlight that you can use to see in dark places.");
	Item battery_pack = new Item("battery pack", " a battery pack that can be used to provide elctricty to something");
	Item cup = new Item("cup", "a cup");
	Item milk = new Item("milk", "its milk");
	
	cockpit.addExit(hallway, 's');
	hallway.addExit(cockpit, 'n');
	hallway.addExit(armory, 'd');
	hallway.addExit(kitchen,'w');
	hallway.addExit(escape_pods,'e');
	kitchen.addExit(hallway,'e');
	escape_pods.addExit(hallway,'w');
	armory.addExit(hallway, 'u');
	armory.addExit(engine,'d');
	engine.addExit(armory,'u');
	cockpit.setItem("crowbar",crowbar);
	cockpit.setItem("cup",cup);
	cockpit.setItem("milk",milk);
	hallway.setItem("flashlight",flashlight);
	engine.setItem("battery pack",battery_pack);
	
	
	return cockpit;
	}
}
