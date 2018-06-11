package Models.Monsters.Vermins;

import Models.Environments.Aquatic;
import Models.Monsters.EnumHeight;

public class Leech extends Vermin implements Aquatic { 
	
	private static EnumHeight height = EnumHeight.MINUSCULE;
	
	public Leech(String name) {
		super(name, height);
	}

	@Override
	public String toString() {
		return super.toString() + " Leech []";
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
