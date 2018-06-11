package Models.Monsters.Outsides;

import Models.Monsters.EnumHeight;
import Models.Monsters.Monster;

public abstract class Outside extends Monster {
	
	public Outside(String name, EnumHeight height) {
		super(name, height);
	}

	@Override
	public String toString() {
		return super.toString() + " Outside []";
	}

	// L'entité peut se dissoudre et disparaitre si les modalités alchimiques ne sont pas respectées
	public boolean disolve() {
		return false;
	}
	
}
