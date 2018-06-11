package Models.Monsters.Muds;

import Models.Monsters.EnumHeight;
import Models.Monsters.Monster;

public abstract class Mud extends Monster {
	
	public Mud(String name, EnumHeight height) {
		super(name, height);
	}
	
	@Override
	public String toString() {
		return super.toString() + " Mud []";
	}

	// engluer (sur équipement): necessite grand nettoyage des équipements pour pouvoir les utiliser à nouveau
	public boolean ensnare() {
		return false;
	}

}
