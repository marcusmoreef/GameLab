package gamelab;

public class Item {
	private String name;
	private String desc;
	
	public Item(String n, String d) {
		name = n;
		desc = d;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setDesc(String d) {
		desc = d;
	}
	
	public String toString() {
		return name;
	}
	
	public void open() {
		Game.print("you can't open that!");
	}
	
	public void use() {
		Game.print("you can't use that!");
	}
}
