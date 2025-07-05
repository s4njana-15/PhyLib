package tx.copp.oak.balu.phy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class ModifierTest  {
	
	public static void main(String[] args) {
		
		ModifierTest test = new ModifierTest();
		test.modifyFile();
		
	}
	
	
	public void modifyFile() {
		
		String fileName = "./chem.dat";
		File chemF = new File (fileName);
		
		try {
			Scanner scan = new Scanner(chemF);
			
			String line = "";
			while(scan.hasNextLine()) {
				line = scan.nextLine();
				
				String[] elRay = line.split(",");
				
				System.out.println(elRay[0].toUpperCase());
				
			}
			
			scan.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		
	}
}
	
	
}
