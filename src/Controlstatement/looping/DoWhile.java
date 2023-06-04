package Controlstatement.looping;

public class DoWhile {
/*
 * 	===============do while=============
 * 
 * do{
 * 	//statement
 * }
 * 
 * while(condition)
 * */
	
	public static void main(String[] args) {
		/*
		 * 9 x1 =9
		 * 9x2 =18
		 * 
		 * .
		 * .
		 * 9x10=90
		 * 
		 * */
		
		int n=2;
		int i=1;
		
		do {
			System.out.println(n+" x "+i+" = "+(n*i));
			
			i++;
		}
		while(i<=10);
		
	}
}
