package Models.Monsters.Outsides;

import Models.Monsters.Monster;

public abstract class Outside extends Monster {

	// L'entit� peut se dissoudre et disparaitre si les modalit�s alchimiques ne sont pas respect�es
	public boolean disolve() {
		return false;
	}
	
}
