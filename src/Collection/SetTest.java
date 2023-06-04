package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
		
		Set<String> hset=new HashSet<>();
		//Set<String> hset=new TreeSet<>();
		//Set<String> hset=new LinkedHashSet<>();
		hset.add("aa");
		hset.add("ddad");
		hset.add("sdsad");
		hset.add("1233");
		
		
		for (String s :hset) {
			System.out.println(s);
			
		}
		
		}

}
