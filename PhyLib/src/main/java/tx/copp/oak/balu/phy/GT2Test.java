package tx.copp.oak.balu.phy;

import java.io.IOException;

public class GT2Test {
	
	
	public static void main(String[] args) {   // methods are API
		
		WriteElements wwr = new WriteElements();
		
		// try has piece of code with exception in it, catch has "caught" the exception
		
		try {
			System.out.println("Writing now...");
			wwr.writeChems("Sanjana.txt");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
