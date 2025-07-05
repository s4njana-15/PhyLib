package tx.copp.oak.balu.lroom;

import java.util.Scanner;

public class Item {

	// if and else statements
	
	public static void main(String[] args) {
		
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter a The Number: ");
		num = scanner.nextInt();
		
		
		if (num > 18) {
			System.out.println(num + " is greater than 18.");
		} else if (num == 18) {
			System.out.println(num + " is 18.");
		} else if (num < 18 && num >= 12){
			System.out.println(num + " is lucky!");
		} else if (num < 12 && num >= 6) {
			System.out.println(num + " is fun!");
		} else {
			System.out.println(num + " ; BAD SELECTION!!");
		}	
		
		while (num > 100) {
			System.out.println("I am sorry I screwed up!!! " + num);
			num = num + 1;
			
			if (num == 100000) {
					System.out.println("Finally Exiting... I am freeeeee! " + num);
					System.exit(1);
			}
		}
		
	}
}
	