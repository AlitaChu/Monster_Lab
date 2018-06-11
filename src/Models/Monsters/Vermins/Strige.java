package Models.Monsters.Vermins;

import Models.Environments.Aerial;

public class Strige extends Vermin implements Aerial {

	@Override
	public boolean eat() {
		return false;
	}

	@Override
	public boolean breathe() {
		return false;
	}

}
