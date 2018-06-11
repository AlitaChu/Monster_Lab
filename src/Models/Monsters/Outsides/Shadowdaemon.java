package Models.Monsters.Outsides;

import Models.Environments.Extraplanar;

public class Shadowdaemon extends Outside implements Extraplanar{

	@Override
	public boolean eat() {
		return false;
	}

	@Override
	public boolean breathe() {
		return false;
	}

}
