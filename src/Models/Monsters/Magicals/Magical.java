package Models.Monsters.Magicals;

import Models.Monsters.EnumHeight;
import Models.Monsters.Monster;

public abstract class Magical extends Monster{
	
	public Magical(String name, EnumHeight height) {
		super(name, height);
	}

	@Override
	public String toString() {
		return super.toString() + " Magical []";
	}

	// lancer un sort : portée sur l'ensemble du batiment
	public boolean castSpell() {
		return false;
	}
	
}
