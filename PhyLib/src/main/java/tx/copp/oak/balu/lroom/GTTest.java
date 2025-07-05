package tx.copp.oak.balu.lroom;

import tx.copp.oak.balu.phy.Newton;
import java.util.ArrayList;
import java.util.Scanner;

public class GTTest {
	
	public static void doLoop() {
		
		String[] test = new String[4];  // array list that no one uses these days
		test[0] = "oxygen";
		test[1] = "sulfur";
		test[2] = "selenium";
		test[3] = "tellurium";
		
		
		for (String zztop : test) {
			System.out.println(zztop.toUpperCase());
		}
		
		for (int i = 0; i < test.length; i++) {
			System.err.println(test[i].toLowerCase());
			
		}
		
		int count = 0;
		
		while (true) {
			System.out.println("Enter Your Password: ");
			
			Scanner scan = new Scanner(System.in);
			String pass = scan.nextLine();
			
			if(pass.equals("pablo")) {
				System.out.println("Congratulations! You stole my diamonds.");
				break;
			} else if (count < 5){
				count ++;
				System.out.println("Sorry bro please retry or go to jail.");
			} else {
				System.out.println("The safe is locked! Nice try.");
				break;
				
				
		}
		
		
		
		
		
		// while(true) {
			//System.out.println("Mouse Squeak Squeak!!!");
			//try {
				//System.err.println("Zzzzzzz...");
				//Thread.sleep(1000);
				//count ++;
				//if(count == 5) {
				//	break;
				}
				
			//} catch (InterruptedException e) {
			//	e.printStackTrace();
		//	}
		//}
		//}
		
		
	}
		
		
		
	public static void main(String[] args) {
		
		GTTest.doLoop();
		
		Person pablo = new Person();
		
		pablo.setName("Pablo Exco");
		pablo.setAge(5);
		pablo.setSsn("12212");
		pablo.setAddress("111 Colombia");
		
		// System.out.println(pablo);
		
		Newton nt = new Newton();
		
		
		Bat manBat = new Bat();
		manBat.setEyes(2);
		manBat.setInfo("Bats rock");
		manBat.setLegs(2);
		manBat.setWings(2);

		
		Rat manRat = new Rat();
		manRat.setEyes(2);
		manRat.setLegs(4);
		manRat.setTail(1);
		manRat.setInfo("Rats like cheese");
		
		
		Cat womanCat = new Cat();
		womanCat.setClaws(20);
		womanCat.setEyes(2);
		womanCat.setInfo("Cats are cool");
		womanCat.setLegs(4);
		
		
		ArrayList<Mammal> manRay = new ArrayList<Mammal>();
		manRay.add(manRat);
		manRay.add(womanCat);
		manRay.add(manBat);
		
		
		System.err.println("=======================");
		System.out.println(manRay);
		System.err.println("=======================");
		
		for (Mammal mammal : manRay) {
			System.out.println(mammal.getLegs());
			
			
			
		}
		
	}

}
