package tx.copp.oak.balu.lroom;

public class Rat extends Mammal{
	
	public int tail;
	public String info;
	
	
	
	public int getTail() {
		return tail;
		
		
	}
	public void setTail(int tail) {
		this.tail = tail;
		
		
	}
	public String getInfo() {
		return info;
		
		
	}
	public void setInfo(String info) {
		this.info = info;
		
		
	}
	
	@Override
	public String toString() {
		return "Rat [tail=" + tail + ", info=" + info + ", getLegs()=" + getLegs() + ", getEyes()=" + getEyes() + "]";
	}
	
	
	

}
