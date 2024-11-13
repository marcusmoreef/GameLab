package gamelab;

public class Alien {

	public Alien(String name3, String desc3) {
		super(name3, desc3);
	}
	
	public void use() {
		Room escape_pods = Game.currentRoom.getExit('e');
		if((escape_pods != null) && escape_pods.getName().equals("escape pods")) {
			Game.print("The alien inhales the burger and gets wayyyyyyy too full. He immedieately starts throwing up everything in his stomach, which was pretty gross. You notice a large fuel container come out too and pick it up");
			Item fuel = new Item("fuel", "Fuel for escape pods to get out of here!");
			Game.inventory.add(fuel);
		}
		else {
			System.out.println("Why would you think of using the burger here idiot?");
		}
	}
}
