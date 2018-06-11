package Models.Monsters.Magicals;

import Models.Environments.Aquatic;
import Models.Monsters.EnumHeight;

public class Kraken extends Magical implements Aquatic {
	
	private static EnumHeight height = EnumHeight.GIGANTESQUE;
	
	public Kraken(String name) {
		super(name, height);
	}

	@Override
	public String toString() {
		return super.toString() + " Kraken []";
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
