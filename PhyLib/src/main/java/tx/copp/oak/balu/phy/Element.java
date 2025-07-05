package tx.copp.oak.balu.phy;

public class Element {
	private String name;
	private String symbol;
	private int atomicNumber;
	private double atomicMass;
	
	public String getName() {
		return name;
		
		
	}
	public void setName(String name) {
		this.name = name;
		
		
	}
	public String getSymbol() {
		return symbol;
		
		
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
		
		
	}
	public int getAtomicNumber() {
		return atomicNumber;
		
		
	}
	public void setAtomicNumber (int elRay) {
		this.atomicNumber = elRay;
		
		
	}
	public double getAtomicMass() {
		return atomicMass;
		
		
	}
	public void setAtomicMass(double atomicMass) {
		this.atomicMass = atomicMass;
		
		
	}
	
	@Override
	public String toString() {
		return "Element [name=" + name + ", symbol=" + symbol + ", atomicNumber=" + atomicNumber + ", atomicMass="
				+ atomicMass + "]";
	}
	

}
