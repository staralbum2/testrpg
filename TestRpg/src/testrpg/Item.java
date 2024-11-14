package testrpg;

public abstract class Item {
	private String name;
	private int atk;
	private int magicAtk;
	private int accuracy;
	private int armor;
	private int evasion;
	
	
	public Item(String name,int atk,int magicAtk,int accuracy){
		this.name=name;
		this.atk = atk;
		this.magicAtk = magicAtk;
		this.accuracy = accuracy;
	}
	
	public Item(String name,int armor, int evation) {
		this.name = name;
		this.armor = armor;
		this.evasion = evation;
	}
}
