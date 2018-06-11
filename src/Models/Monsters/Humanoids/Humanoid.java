package Models.Monsters.Humanoids;

import Models.Monsters.EnumHeight;
import Models.Monsters.Monster;

public abstract class Humanoid extends Monster {
	
	public Humanoid(String name, EnumHeight height) {
		super(name, height);
	}
	
	@Override
	public String toString() {
		return super.toString() + " Humanoid []";
	}

	public boolean learn() {
		return false;
	}

}
