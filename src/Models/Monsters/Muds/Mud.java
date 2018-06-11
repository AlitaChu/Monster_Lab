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

	// engluer (sur �quipement): necessite grand nettoyage des �quipements pour pouvoir les utiliser � nouveau
	public boolean ensnare() {
		return false;
	}

}
