package assignment1;

import java.util.HashMap;
import java.util.Map;

public class IterateHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  HashMap<String, Integer> items = new HashMap();
	        items.put("Effected", 5251);
	        items.put("Recovered", 5142);
	        items.put("Deaths", 109);
	        
	        for (Map.Entry<String, Integer> pair: items.entrySet()) {
	            System.out.format("key: %s, value: %d%n", pair.getKey(), pair.getValue());
	        }
	    }
	}
	
	
