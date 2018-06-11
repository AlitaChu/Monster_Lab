package Models.Monsters.Humanoids;

import Models.Environments.Aquatic;
import Models.Monsters.EnumHeight;

public class Mermaid extends Humanoid implements Aquatic {
	
	private static EnumHeight height = EnumHeight.MOYEN;
	
	public Mermaid(String name) {
		super(name, height);
	}

	@Override
	public String toString() {
		return super.toString() + " Mermaid []";
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
