package tx.copp.oak.balu.lroom;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class LrnHashSet {
	
	HashSet<String> northHs = new HashSet<String>();
	ArrayList<String> northArray = new ArrayList<String>();
	
	public void addStudents() {
		northHs.add("Arjun");
		northHs.add("Varun");
		northHs.add("Arya");
		northHs.add("Rishvik");
		northHs.add("Sanjana");
		northHs.add("Advaita");
		northHs.add("Rishi");
		
		for (int i = 0; i < 20; i++) {
			northHs.add("Arjun");
			
		}
		
		
		northArray.add("Arjun");
		northArray.add("Varun");
		northArray.add("Arya");
		northArray.add("Rishvik");
		northArray.add("Sanjana");
		northArray.add("Advaita");
		northArray.add("Rishi");
		
		for (int i = 0; i < 20; i++) {
			northArray.add("Arjun");
		}
		

	}
	
	
	public HashSet<String> getNorthHs() {
		return northHs;
	}


	public ArrayList<String> getNorthArray() {
		return northArray;
	}
	

	public static void main(String[] args) {
		
		//String words = "The quick brown fox jumped over the lazy dog.";
		//System.out.println("Length is:);
		
		
		
		LrnHashSet nh1 = new LrnHashSet();
		nh1.addStudents();
		
		System.out.println("================");
		System.out.println(nh1.getNorthHs());
		System.out.println("================");
		
		System.out.println("================");
		System.out.println(nh1.getNorthArray());
		System.out.println("================");
	}

}