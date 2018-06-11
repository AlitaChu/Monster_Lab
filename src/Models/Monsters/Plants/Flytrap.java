package Models.Monsters.Plants;

import Models.Environments.Terrestrial;
import Models.Monsters.EnumHeight;

public class Flytrap extends Plant implements Terrestrial {

	private static EnumHeight height = EnumHeight.GRAND;
	
	public Flytrap(String name) {
		super(name, height);
	}
	
	@Override
	public String toString() {
		return super.toString() + " Flytrap []";
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
