package tx.copp.oak.balu.lroom;

// My first Java class

/* drfgvhbn 
 * (anything can be put inside a comment) (This is a multi-line comment)
 * fghjk
 * tyuiop
 * qwertyuiop
 */

public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String book = "Harry Not a Potter Balu has no daughter";
		// book = "I don't like you";
		
		int index1 = book.indexOf("Balu"); // index is used to find the position of a letter/word
		System.out.println("Index is: " + index1);
		
		System.out.println("Substring: " + book.substring(index1, index1+4));
		
		System.out.println("Substring: " + book.substring(5));
		
		
		int x = 5, y = 6, z = 50, prod=0;
		
		prod = x * y * z;
		System.out.println("Product is: " + prod);
		
		int num = 10;
		
		num = num * 5;
		
		book = book + " : " + book;
		
		System.out.print("Welcome to Library \n\n\n\n ");
		System.out.println("Lets \t work!!! ");
		
		System.out.println(book.toUpperCase()  );
		System.out.println("\n Wow I got my book '" + book + "'. Thank you so much!");
		
		System.out.println(" Length " + book.length()  );
		System.out.println("Book count is: " + num);
		
	}

}
