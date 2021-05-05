package assignment1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map < String, Integer > map = new HashMap < > (); 
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter a string:");
		  String sentence = sc.nextLine();

		  String[] tokens = sentence.split(" "); 

		  for (String token: tokens) {

		   String word = token.toLowerCase();
		   if (map.containsKey(word)) {
		    int count = map.get(word);  
		    map.put(word, count + 1);
		    
		   } else {
		    map.put(word, 1); 
		   }
		  }
		  
		  Set < String > keys = map.keySet(); 

		  TreeSet < String > sortedKeys = new TreeSet < > (keys); 

		  for (String str: sortedKeys) {

		   System.out.println("Word =" + str + " and it's count = " + map.get(str));
		 
		  }
	   }

	
	}
	

