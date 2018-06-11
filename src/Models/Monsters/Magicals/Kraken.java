package Models.Monsters.Magicals;

import Models.Environments.Aquatic;

public class Kraken extends Magical implements Aquatic{

	@Override
	public boolean eat() {
		return false;
	}

	@Override
	public boolean breathe() {
		return false;
	}

}
