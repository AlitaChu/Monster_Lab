package Models.Monsters.Outsides;

import Models.Monsters.Monster;

public abstract class Outside extends Monster {

	// L'entité peut se dissoudre et disparaitre si les modalités alchimiques ne sont pas respectées
	public boolean disolve() {
		return false;
	}
	
}
