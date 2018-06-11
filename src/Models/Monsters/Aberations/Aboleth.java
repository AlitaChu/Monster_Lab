package Models.Monsters.Aberations;

import Models.Environments.Aquatic;
import Models.Monsters.EnumHeight;

public class Aboleth extends Aberation implements Aquatic {
	
	private static EnumHeight height = EnumHeight.GRAND;
	
	public Aboleth(String name) {
		super(name, height);
	}

	@Override
	public String toString() {
		return super.toString() + " Aboleth []";
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
