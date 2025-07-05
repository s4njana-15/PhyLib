package tx.copp.oak.balu.lroom;

public class Mammal {
	
	private int legs;
	private int eyes;
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public int getEyes() {
		return eyes;
	}
	public void setEyes(int eyes) {
		this.eyes = eyes;
	}
	
	@Override
	public String toString() {
		return "Mammal [legs=" + legs + ", eyes=" + eyes + "]";
	}
	
	
	
}
