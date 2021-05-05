package assignment1;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      String original, reverse="";
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter");
	      original = in.nextLine();
	 
	      int length = original.length();
	 
	      for ( int i = length - 1 ; i >= 0 ; i-- )
	         reverse = reverse + original.charAt(i);
	 
	      if (original.equals(reverse))
	         System.out.println("It is a palindrome.");
	      else
	         System.out.println(" Not a palindrome.");
	 
	   }
	}    
	
