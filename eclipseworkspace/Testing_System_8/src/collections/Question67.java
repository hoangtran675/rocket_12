package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Question67 {
	public static void main(String[] args) {
		Map<Integer, String> students = new HashMap<>();
		students.put(1, "Hoang");
		students.put(2, "Le");
		students.put(3, "Tuan");
		students.put(4, "Thai");
		Set<Integer> keyOfMap = students.keySet();
		System.out.println("KeySet : " + keyOfMap);
		Collection<String> valueOfMap = students.values();
		System.out.println("Values : " + valueOfMap);
		System.out.println("Display Key and Value");
		for (Integer key : keyOfMap) {
			System.out.println("Key : " + key + "             Value : " + students.get(key));
		}
		System.out.println("Display Map");
		System.out.println(students);
		SortedMap<Integer, String> sm = new TreeMap<Integer, String>(students);
		
	}
	
}
