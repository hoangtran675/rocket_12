package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>(); // String is key, Integer is value
		// add element to map
		map.put("John", 70);
		map.put("Tom", 60);
		map.put("Lee", 99);
		map.put("Hoang", 80);
		// return all key in the map
		Set<String> keys = map.keySet();
		System.out.println("Keys : " + keys);
		Collection<Integer> values = map.values();
		System.out.println("Values : " + values);
	}

}
