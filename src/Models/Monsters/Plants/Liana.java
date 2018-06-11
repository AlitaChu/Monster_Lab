package Models.Monsters.Plants;

import Models.Monsters.EnumHeight;

public class Liana extends Plant {
	
	private static EnumHeight height = EnumHeight.PETIT;
	
	public Liana(String name) {
		super(name, height);
	}

	@Override
	public String toString() {
		return super.toString() + " Liana []";
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
