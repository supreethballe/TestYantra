package assignment1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratehashmapAdvancedForloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> hm =
				new HashMap<String, Integer>();

	
	hm.put("Bangalore", 5700);
	hm.put("Hyderabad", 6500);
	hm.put("Chennai", 4300);

	System.out.println("covid-19 cases by State" + hm);

	Iterator hmIterator = hm.entrySet().iterator();

	System.out.println("Covid-19 cases after adding new cases:");

	while (hmIterator.hasNext()) {
		Map.Entry mapElement = (Map.Entry)hmIterator.next();
		int marks = ((int)mapElement.getValue() + 1800);
		System.out.println(mapElement.getKey() + " : " + marks);
	}
}
}
