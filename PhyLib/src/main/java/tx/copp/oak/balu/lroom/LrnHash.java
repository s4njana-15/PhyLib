package tx.copp.oak.balu.lroom;

import java.util.HashMap;

public class LrnHash {
	
	HashMap<String,String> northHs = new HashMap<String,String>();
	
	public void addStudents() {
		northHs.put("001", "Arjun");
		northHs.put("002", "Varun");
		northHs.put("003", "Arya");
		northHs.put("004", "Rishvik");
		northHs.put("005", "Sanjana");
		northHs.put("006", "Advaita");
		northHs.put("007", "Rishi");
	}
	
	
	public static void main(String[] args) {
		LrnHash nh1 = new LrnHash();
		nh1.addStudents();
		
		System.err.println(nh1.northHs);
	}

}