package Models.Monsters.Magicals;

import Models.Environments.Voltaic;
import Models.Monsters.EnumHeight;

public class Electriclizard extends Magical implements Voltaic {
	
	private static EnumHeight height = EnumHeight.PETIT;
	
	public Electriclizard(String name) {
		super(name, height);
	}

	@Override
	public String toString() {
		return super.toString() + " Electriclizard []";
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
