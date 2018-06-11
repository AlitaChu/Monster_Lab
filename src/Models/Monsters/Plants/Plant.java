package Models.Monsters.Plants;

import Models.Monsters.EnumHeight;
import Models.Monsters.Monster;

public abstract class Plant extends Monster{
	
	
	public Plant(String name, EnumHeight height) {
		super(name, height);
	}

	@Override
	public String toString() {
		return super.toString() + " Plant []";
	}

	// Récolter des matières premières pour l'alchimie
	public Object collect() {
		return false;
	}

}
