package Models.Monsters.Outsides;

import Models.Environments.Extraplanar;
import Models.Monsters.EnumHeight;

public class Shadowdaemon extends Outside implements Extraplanar { 
	
	private static EnumHeight height = EnumHeight.GRAND;
	
	public Shadowdaemon(String name) {
		super(name, height);
	}

	@Override
	public String toString() {
		return super.toString() + " Shadowdaemon []";
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
