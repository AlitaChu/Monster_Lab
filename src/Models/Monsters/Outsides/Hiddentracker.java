package Models.Monsters.Outsides;

import Models.Environments.Extraplanar;
import Models.Monsters.EnumHeight;

public class Hiddentracker extends Outside implements Extraplanar {
	
	private static EnumHeight height = EnumHeight.MOYEN;
	
	public Hiddentracker(String name) {
		super(name, height);
	}

	@Override
	public String toString() {
		return super.toString() + " Hiddentracker []";
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
