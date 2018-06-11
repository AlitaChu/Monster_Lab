package Models.Monsters.Muds;

import Models.Environments.Aquatic;

public class Shoggoth extends Mud implements Aquatic{

	@Override
	public boolean eat() {
		return false;
	}

	@Override
	public boolean breathe() {
		return false;
	}

}
