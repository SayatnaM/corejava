package Controlstatement.looping;

public class EnhancedfForLoop {
/*
 * ===============Enhance for loop=================
 * 
 * #use to read data from collection*
 * syntax :
 * for(data type var: collection){
 * 
 * 				statement
 * 
 * 		}
 */ 
	public static void main(String[] args) {
		int values[] = {4,6,5,6,5,1,2,1,5,4,5,6,1,3,6,2,5};
		int s=0;
		
		for(int x:values) {
			System.out.println(x);
			s=s+x;
			
		}
		System.out.println("Total"+s);
	}
	
}
