package Models.Monsters.Vermins;

import Models.Environments.Aquatic;

public class Leech extends Vermin implements Aquatic{

	@Override
	public boolean eat() {
		return false;
	}

	@Override
	public boolean breathe() {
		return false;
	}

}
