package Models.Monsters.Plants;

import Models.Monsters.Monster;

public abstract class Plant extends Monster{
	
	// R�colter des mati�res premi�res pour l'alchimie
	public Object collect() {
		return false;
	}

}
