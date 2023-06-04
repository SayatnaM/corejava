package CodeWithHarry;

public class stringTest {
public static void main(String[] args) {
	String name="Sayatna";
	System.out.println(name);
	String lstring= name.toLowerCase();
	System.out.println(lstring);
			String ustring=name.toUpperCase();
			System.out.println(ustring);
	System.out.println(name.replace("ay", "tu"));
	
	System.out.println(name.startsWith("Pay"));
	System.out.println(name.endsWith("tna"));
}
}
