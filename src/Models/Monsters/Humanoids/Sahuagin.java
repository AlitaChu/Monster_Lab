package Models.Monsters.Humanoids;

import Models.Environments.Aquatic;

public class Sahuagin extends Humanoid implements Aquatic {

	@Override
	public boolean eat() {
		return false;
	}

	@Override
	public boolean breathe() {
		return false;
	}

}
