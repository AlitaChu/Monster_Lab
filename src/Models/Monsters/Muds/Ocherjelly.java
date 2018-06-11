package Models.Monsters.Muds;

import Models.Environments.Voltaic;

public class Ocherjelly extends Mud implements Voltaic{

	@Override
	public boolean eat() {
		return false;
	}

	@Override
	public boolean breathe() {
		return false;
	}

}
