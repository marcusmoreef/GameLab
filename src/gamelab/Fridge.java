package gamelab;

public class Fridge extends Item {
	
	public Fridge(String name2,String desc2) {
		super(name2,desc2);
	}
	
	public void open() {
		if(Game.getItemInventory("paper with numbers")==null) {
			Game.print("You typed random numbers in and the fridge did not open");
		}
		else {
			Game.print("Using the paper wiht the numbers on it, you type it into the keypad on the fridge and it opens! All that is in there is a single double cheeseburger, and you put it in your pocket");
			Item burger = new Item("burger", "a double cheeseburger");
			Game.inventory.add(burger);
		}
	}
}
