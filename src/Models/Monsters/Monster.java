package Models.Monsters;

public abstract class Monster {
	
	private String name;
	private int level;
	private EnumHeight height;
	
	public Monster() {
	} 
	
	public Monster(String name, EnumHeight height) {
		//super();
		this.setName(name);
		this.setHeight(height);
	}

	@Override
	public String toString() {
		return "Monster [name=" + name + ", level=" + level + ", height=" + height + "]";
	}

	public abstract boolean eat();

	public abstract boolean breathe();
	
	// ---------------------

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public EnumHeight getHeight() {
		return height;
	}

	public void setHeight(EnumHeight height) {
		this.height = height;
	}

}
