package Models.Monsters.Plants;

import Models.Environments.Terrestrial;
import Models.Monsters.EnumHeight;

public class Knoll extends Plant implements Terrestrial{
	
	private static EnumHeight height = EnumHeight.MOYEN;
	
	public Knoll(String name) {
		super(name, height);
	}

	@Override
	public String toString() {
		return super.toString() + " Knoll []";
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
