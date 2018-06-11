package Models.Monsters.Muds;

import Models.Environments.Voltaic;
import Models.Monsters.EnumHeight;

public class Ocherjelly extends Mud implements Voltaic { 
	
	private static EnumHeight height = EnumHeight.MINUSCULE;
	
	public Ocherjelly(String name) {
		super(name, height);
	}

	@Override
	public String toString() {
		return super.toString() + " Ocherjelly []";
	}

	@Override
	public boolean eat() {
		return false;
	}

	@Override
	public boolean breathe() {
		return false;
	}

}
