package Models.Monsters.Humanoids;

import Models.Monsters.EnumHeight;

public class Moth extends Humanoid{
	
	private static EnumHeight height = EnumHeight.PETIT;
	
	public Moth(String name) {
		super(name, height);
	}

	@Override
	public String toString() {
		return super.toString() + " Moth []";
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
