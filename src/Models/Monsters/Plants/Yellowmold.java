package Models.Monsters.Plants;

import Models.Monsters.EnumHeight;

public class Yellowmold extends Plant{
	
	private static EnumHeight height = EnumHeight.INFIME;
	
	public Yellowmold(String name) {
		super(name, height);
	}

	@Override
	public String toString() {
		return super.toString() + " Yellowmold []";
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
