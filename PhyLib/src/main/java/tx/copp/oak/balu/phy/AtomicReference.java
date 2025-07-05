package tx.copp.oak.balu.phy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;



public class AtomicReference {
	
	
		
	public void loadFile() {
		
		String fileName = "./chem.dat";
		File chemF = new File(fileName);
		
		try {
			Scanner scan = new Scanner(chemF);
			
			String line = "";
			while(scan.hasNextLine()) {
				line = scan.nextLine();
				
				 if (line.contains("^")) continue;    // <- how to make the code ignore special character and keep going
				
				String[] elRay = line.split(",");  // making an array
				
				Element temp = new Element();
				
				temp.setName(elRay[0].toUpperCase());
				temp.setSymbol(elRay[1]);
				temp.setAtomicNumber(Integer.parseInt(elRay[2]));
				temp.setAtomicMass(Double.parseDouble(elRay[3]));
				
				// chemMap.put(temp.getSymbol(), temp);
				
				 System.err.println(elRay[0]); // every number of sentence shows a diff part of the element
				
			}
			
			scan.close();
				
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		
		
	}
	
	
	// public float averageVelocity(float time, float distance1) {
		//float avg = 1.4f; 
		
		   //sometimes will work without casting float but best to cast float
		//avg = (distance1)/time;
		
		//return avg
		
	
	
	
	//public float finalVelocity(float time, float acc, float vi){  
		//float vf = 0.0f;
		//vf = vi + acc*time;
		
		//return vf;
		
		
		
	
	
	
	
	//public Element search (String key) {
		//return chemMap.get(key);
		
	
	
	//public void display() {
		//Set<String> keyList = chemMap.keySet();
		
		//for (String symbol : keyList) {
			//Element ele = chemMap.get(symbol);
			//System.err.println(ele); }
			
	
	
	public static void main(String[] args) {
		
		AtomicReference n1 = new AtomicReference();
		n1.loadFile();
		
		while(true) {
			System.out.println("~~~~~~~ Bro Enter the Symbol ~~~~~~~~~~~");
			Scanner scn = new Scanner (System.in);
			String sym = scn.nextLine();
			
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println(n1.getChemMap().get(sym));
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					
					
		}
		
		//n1.modFile("C://Temp//chem.dat");
		//n1.loadElements();
	//	System.out.println(n1.getChemMap());
		
		//System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		//System.out.println(n1.getChemMap().get("H"));
		//System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		//float test = n1.finalVelocity(5.0f, 12.0f, 40.0f);
		//System.out.println("Final velocity is " + test + "!!");
		
		
		
		//n1.display();

		
		//System.out.println(n1.search("Th"));
	}

	


		public void modFile(String name) throws IOException {
				
				File chemdat = new File(name);
				File newChemdat = new File(name + "_.bak");
					
				if (chemdat.exists()) {
					System.err.println("Thank God, the file exists: " + chemdat.getAbsolutePath());
					Scanner scan = new Scanner(chemdat);
					FileWriter wrtt = new FileWriter(newChemdat);
					
					while(scan.hasNextLine())  {
						String temp = scan.nextLine();
						
						temp = temp.replace(",", "#");
						System.err.println(temp);
						
						wrtt.write(temp + "\n");
						
					}
					
					System.err.println(wrtt);
					
					scan.close();
					wrtt.close();
			}
		}

	}

