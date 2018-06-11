package Models.Monsters.Vermins;

import Models.Monsters.EnumHeight;
import Models.Monsters.Monster;

public abstract class Vermin extends Monster{
	
	public Vermin(String name, EnumHeight height) {
		super(name, height);
	}
	
	@Override
	public String toString() {
		return super.toString() + " Vermin []";
	}

	// Multiplication = invasion; la vermine peut également servir de nourriture
	public Vermin multiply() {
		return null;
	}

}
