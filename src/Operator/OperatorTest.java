package Operator;

public class OperatorTest {
public static void main(String[] args) {
	int x=10;
	
	System.out.println(x++);//10
	System.out.println(x+5);//16(added 1 to the value of x)
	System.out.println(++x);//12 (added 1 again to the value of x)
	System.out.println(++x + x++);//26
	System.out.println(x);//14
}
}
