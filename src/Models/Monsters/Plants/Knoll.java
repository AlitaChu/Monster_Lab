package Models.Monsters.Plants;

import Models.Environments.Terrestrial;

public class Knoll extends Plant implements Terrestrial{

	@Override
	public boolean eat() {
		return false;
	}

	@Override
	public boolean breathe() {
		return false;
	}

}
