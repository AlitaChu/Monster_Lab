package Models.Monsters.Muds;

import Models.Monsters.Monster;

public abstract class Mud extends Monster {
	
	// engluer (sur équipement): necessite grand nettoyage des équipements pour pouvoir les utiliser à nouveau
	public boolean ensnare() {
		return false;
	}

}
