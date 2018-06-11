package Models.Monsters.Plants;

import Models.Monsters.Monster;

public abstract class Plant extends Monster{
	
	// Récolter des matières premières pour l'alchimie
	public Object collect() {
		return false;
	}

}
