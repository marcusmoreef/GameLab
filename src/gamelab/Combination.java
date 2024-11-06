package gamelab;

public class Combination extends Item{
	
	public Combination(String name1, String desc1) {
		super(name1,desc1);
	}
	
	public void use() {
		Game.print("If you find safe, try opening it!");
	}
	
}
