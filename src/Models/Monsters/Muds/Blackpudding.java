package Models.Monsters.Muds;

import Models.Monsters.EnumHeight;

public class Blackpudding extends Mud { 
	
	private static EnumHeight height = EnumHeight.PETIT;
	
	public Blackpudding(String name) {
		super(name, height);
	}

	@Override
	public String toString() {
		return super.toString() + " Blackpudding []";
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
