package gamelab;

public class World {
	// Builds the game world.
	// Returns the room the player starts in.
	public static Room buildWorld() {
	Room cockpit = new Room("You are in the cockpit.", "cockpit");
	Room hallway = new Room("You are in the hallway.", "hallway");
	Room kitchen = new Room("You are in the kitchen.", "kitchen");
	Room escape_pods = new Room("You are in the escape pod room.", "escape pods");
	Room armory = new Room("You are in the armory.", "armory");
	Room engine = new Room("You are in the engine room.", "engine");
	Item crowbar = new Item("crowbar", "A black metal bar that can be used to open or break things.");
	Item flashlight = new Item("flashlight", "a red flashlight that you can use to see in dark places.");
	Item battery_pack = new Item("battery pack", " a battery pack that can be used to provide elctricty to something");
	Item key = new Key("Key", "A gold key to unlock door");
	Combination combination = new Combination("combination", "the combination to the safe");
	Safe safe = new Safe("safe", "A big safe with something maybe in it");

	
	
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
	hallway.setItem("flashlight",flashlight);
	engine.setItem("battery pack",battery_pack);
	engine.setItem("combination", combination);
	kitchen.setItem("safe", safe);
	engine.setLock(true);
	kitchen.setItem("key", key);
	
	return cockpit;
	}
}
