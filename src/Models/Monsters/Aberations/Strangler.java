package Models.Monsters.Aberations;

import Models.Environments.Terrestrial;

public class Strangler extends Aberation implements Terrestrial {

	@Override
	public boolean eat() {
		return false;
	}

	@Override
	public boolean breathe() {
		return false;
	}

}
