package Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
	
	public static void main(String[] args) {
		//Student Name and Age
//		Map<String, Integer> map =new HashMap<>();// Random
		//Map<String, Integer> map =new TreeMap<>();// Sorted
		Map<String, Integer> map =new LinkedHashMap<>();// Jastako testai
		map.put("Sayatna", 25);
		map.put("Pritam", 35);
		map.put("laxmi", 50);
		for (String key: map.keySet()) {
			System.out.println(key+"="+map.get(key));
		}
	}

}
