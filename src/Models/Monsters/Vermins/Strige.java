package Models.Monsters.Vermins;

import Models.Environments.Aerial;
import Models.Monsters.EnumHeight;

public class Strige extends Vermin implements Aerial {
	
	private static EnumHeight height = EnumHeight.PETIT;
	
	public Strige(String name) {
		super(name, height);
	}

	@Override
	public String toString() {
		return super.toString() + " Strige []";
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
