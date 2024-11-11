package gamelab;

public class Key extends Item {

	public Key(String name3, String desc3) {
		super(name3, desc3);
	}
	
	public void use() {
		Room engine = Game.currentRoom.getExit('d');
		if((engine != null) && engine.getName().equals("engine")) {
			engine.setLock(false);
			Game.print("Door has been locked");
		}
		else {
			System.out.println("This key does not unlock this door");
		}
	}
}
