package Models.Monsters.Muds;

import Models.Monsters.Monster;

public abstract class Mud extends Monster {
	
	// engluer (sur �quipement): necessite grand nettoyage des �quipements pour pouvoir les utiliser � nouveau
	public boolean ensnare() {
		return false;
	}

}
