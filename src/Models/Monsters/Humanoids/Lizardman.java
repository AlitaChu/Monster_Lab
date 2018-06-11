package Models.Monsters.Humanoids;

import Models.Monsters.EnumHeight;

public class Lizardman extends Humanoid {
	
	private static EnumHeight height = EnumHeight.MOYEN;
	
	public Lizardman(String name) {
		super(name, height);
	}

	@Override
	public String toString() {
		return super.toString() + " Lizardman []";
	}

	@Override
	public boolean eat() {
		return false;
	}

	@Override
	public boolean breathe() {
		return false;
	}

}
