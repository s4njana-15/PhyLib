package tx.copp.oak.balu.lroom;

public class Cat extends Mammal{
	
	public int claws;
	public String info;
	
	
	public int getClaws() {
		return claws;
		
		
	}
	public void setClaws(int claws) {
		this.claws = claws;
		
		
	}
	public String getInfo() {
		return info;
		
		
	}
	public void setInfo(String info) {
		this.info = info;
		
		
	}
	
	@Override
	public String toString() {
		return "Cat [claws=" + claws + ", info=" + info + ", getLegs()=" + getLegs() + ", getEyes()=" + getEyes() + "]";
	}
	

}
