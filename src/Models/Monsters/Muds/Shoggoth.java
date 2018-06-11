package Models.Monsters.Muds;

import Models.Environments.Aquatic;
import Models.Monsters.EnumHeight;

public class Shoggoth extends Mud implements Aquatic {
	
	private static EnumHeight height = EnumHeight.GRAND;
	
	public Shoggoth(String name) {
		super(name, height);
	}

	@Override
	public String toString() {
		return super.toString() + " Shoggoth []";
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
