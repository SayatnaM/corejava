package oops;

import java.util.Scanner;

public class average {
	
	public static void main(String[] args) {
		get3Num();
	}
	
	
	float a ;
	float b;
	float c;
	
public static void  get3Num() {
	
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter your 1st number:  ");
	float a=sc.nextInt();
	System.out.println("enter your second number"  );
	float b=sc.nextInt();
	System.out.println("enter your Third Number: ");
	float c= sc.nextFloat();
	
	float av= (a+b+c)/3;
	System.out.println(" The average of the three numbers is :  "+av);
	
}
}
