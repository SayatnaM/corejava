package Method;

public class MethodTest {
	public static void main(String[] args) {
		
		int x =findsmall(20,15);
		System.out.println(x);
			
		}
			
		
		
	
	// 1. no retun type with no argument 
	
	/*static void sum() {
		
		int x=5;
		int y=6;
		
		int s=x+y;
		System.out.println("total= "+s);
		
	}*/
	
	//2. No retun type with auruguments
	
	/*static void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n+ "x"+i+"="+(n*i));*/
		
		
			// return type with no argument
			/*static int getSum() {
				int s=0;
				for(int i=1;i<=10;i++) {
					s=s+i;
					}
				return s;
				}*/
			
			
	// Retun type with argument
			
			static int findsmall (int a , int b) {
				if (a<b)
				{
					return a; 
					}
				return b;
				}
				
			
	// find area and volume
			
				//a. get area:1.pass l and b as parameter
				// calculate area, return area, call gerArea in main method
				//b Volume : pass area and height as parameter, calculate voulme, print area, volume, cal method in main
				
			// find SI and amount
			/*
			 * a. input
			 * b. processing: call in input
			 * c. output: call in processing 
			 */
	}


