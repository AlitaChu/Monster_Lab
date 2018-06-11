package Models.Monsters.Aberations;

import Models.Environments.Aquatic;

public class Aboleth extends Aberation implements Aquatic {

	@Override
	public boolean eat() {
		return false;
	}

	@Override
	public boolean breathe() {
		return false;
	}

}
