package Controlstatement.looping;

public class WhileTest {
	
	/*
	 * 
	 * Syntax:
	 * 
	 * while(condition){
	 * 
	 * Statement 
	 //inc/dec
	 }*/
	
	public static void main(String[] args) {
		//6!=6*5*4*3*2=720
		int n=6;
		int fact=1;
		while(n>1) {
			
			fact=fact*n;
			n--;
			
		}
		System.out.println("resust="+fact);
	}

}
