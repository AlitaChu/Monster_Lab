package Models.Monsters.Aberations;

import Models.Environments.Terrestrial;
import Models.Monsters.EnumHeight;

public class Strangler extends Aberation implements Terrestrial {
	
	private static EnumHeight height = EnumHeight.MOYEN;
	
	public Strangler(String name) {
		super(name, height);
	}

	@Override
	public String toString() {
		return super.toString() + " Strangler []";
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
