package Models.Monsters;

public abstract class Monster {
	
	private String name;
	private int level;
	
	public Monster() {
	} 
	
	public Monster(String name) {
		super();
		this.name = name;
	}

	public abstract boolean eat();

	public abstract boolean breathe();

}
