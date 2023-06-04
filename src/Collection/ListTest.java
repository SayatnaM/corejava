package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();//string is class here
		
		list.add("Korea");
		list.add("jungkook");
		list.add("jin");
		list.add("Rm");
		
		//liat.remove(a);
		list.remove("Rm");
		
		
//		for (String s: list ) {
//			System.out.println(s);
//		}
		
		list.forEach(s-> System.out.println(s));
		
	}

}
