package gamelab;

public class Safe extends Item{
	
	public Safe(String name2,String desc2) {
		super(name2,desc2);
	}
	
	public void open() {
		if(Game.getItemInventory("combination")==null) {
			Game.print("The safe is locked and you don't have the combo");
		}
		else {
			Game.print("Using the combination, you open the safe and find a diamond inside! Naturally, you pocket the diamond.");
			Item diamond = new Item("diamond", "a shiny diamond");
			Game.inventory.add(diamond);
		}
	}
}
