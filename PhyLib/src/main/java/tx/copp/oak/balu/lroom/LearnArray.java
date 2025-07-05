package tx.copp.oak.balu.lroom;

import java.lang.reflect.Array;

// Arrays

import java.util.ArrayList;

public class LearnArray {

	
	public void testArray() {
		ArrayList<String> arr = new ArrayList<String>();
		
		ArrayList<String> select = new ArrayList<String>();
		
		arr.add("Biryani");
		arr.add("Chips");
		arr.add("Puri");
		arr.add("Chips-Lemon");
		arr.add("Chips-Banana");
		arr.add("Chips-Doritos");
		arr.add("Samosa");
		arr.add("Chicken 65");
		arr.add("Gobi Manchurian");
		arr.add("Pizza");
		arr.add("Fried Chicken");
		arr.add("Pakoda");
		arr.add("Ice Cream");
		
				
		
		for (int i = 0; i < arr.size(); i++) {
			String test = arr.get(i);
			
			if(test.toUpperCase().contains("CHIP") ) {
				System.out.println("Found my favorite: " + test.toUpperCase());
				select.add(test);
			}
		
		}
		
		System.out.println("Final Selection: " + select);
		
	}

	
	public static void main(String[] args) {
		
		LearnArray lrn = new LearnArray();
		lrn.testArray();
	}
}
