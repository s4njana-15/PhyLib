package tx.copp.oak.fin;

public class Holding {
	
	private int numberofshares;
	private Security stock;
	
	
	
	
	
	public int getNumberofshares() {
		return numberofshares;
	}

	
	public void setNumberofshares(int numberofshares) {
		this.numberofshares = numberofshares;
	}

	

	public Security getStock() {
		return stock;
	}



	public void setStock(Security stock) {
		this.stock = stock;
	}



	@Override
	public String toString() {
		return "Holding [numberofshares=" + numberofshares + ", stock=" + stock + "]";
	}


	public static void main(String[] args) {
		
		

	}

}
