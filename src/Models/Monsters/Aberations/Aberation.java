package Models.Monsters.Aberations;

import Models.Monsters.EnumHeight;
import Models.Monsters.Monster;

public abstract class Aberation extends Monster{
	
	public Aberation(String name, EnumHeight height) {
		super(name, height);
	}


	@Override
	public String toString() {
		return super.toString() + " Aberation []";
	}



	// Pétage de plomb = devient instable - voire incontrôlable
	public boolean disjunction() {
		return false;
	}
	
}
