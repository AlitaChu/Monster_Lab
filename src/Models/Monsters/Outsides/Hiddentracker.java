package Models.Monsters.Outsides;

import Models.Environments.Extraplanar;

public class Hiddentracker extends Outside implements Extraplanar {

	@Override
	public boolean eat() {
		return false;
	}

	@Override
	public boolean breathe() {
		return false;
	}

}
