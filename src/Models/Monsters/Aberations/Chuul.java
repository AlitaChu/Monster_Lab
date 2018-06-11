package Models.Monsters.Aberations;

import Models.Environments.Aquatic;
import Models.Monsters.EnumHeight;

public class Chuul extends Aberation implements Aquatic{
	
	private static EnumHeight height = EnumHeight.MOYEN;
	
	public Chuul(String name) {
		super(name, height);
	}

	@Override
	public String toString() {
		return super.toString() + " Chuul []";
	}

	@Override
	public boolean eat() {
		return false;
	}

	@Override
	public boolean breathe() {
		return false;
	}

}
