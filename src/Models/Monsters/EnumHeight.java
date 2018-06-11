package Models.Monsters;

public enum EnumHeight {

	INFIME(0), MINUSCULE(1), PETIT(2), MOYEN(3), GRAND(4), GIGANTESQUE(5);
	
	private int index;

	EnumHeight(int i) {
		this.setIndex(i);
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	
}
