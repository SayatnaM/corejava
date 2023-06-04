package practice;

import java.util.Scanner;

public class PrintMultiplicationTable {
	public static void main(String[] args) {
		

	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter the number you want the multiplication of ");
	
	int a =sc.nextInt();
	
	for (int i=1;i<=100;i++) {
		
		int m=a*i;
		
		System.out.println(a+" * "+i+" = "+m);
		
	}
	
	}
	

}

