package Models.Monsters.Humanoids;

import Models.Environments.Aquatic;
import Models.Monsters.EnumHeight;

public class Sahuagin extends Humanoid implements Aquatic {
	
	private static EnumHeight height = EnumHeight.GRAND;
	
	public Sahuagin(String name) {
		super(name, height);
	}

	@Override
	public String toString() {
		return super.toString() + " Sahuagin []";
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
