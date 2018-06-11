package Models.Monsters.Magicals;

import Models.Environments.Voltaic;

public class Electriclizard extends Magical implements Voltaic{

	@Override
	public boolean eat() {
		return false;
	}

	@Override
	public boolean breathe() {
		return false;
	}

}
