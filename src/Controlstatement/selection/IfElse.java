package Controlstatement.selection;

import java.util.Scanner;

public class IfElse {
public static void main(String[] args) {
	/*===if else=====
	 * 
	 * syntax:
	 * if(condition){
	 * statement
	 * }
	 * else 
	 * {
	 * statement}*/
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("enter a number");
	
	int n= sc.nextInt();
	if(n%2==0) {// is reminder is 0 in the given number while dividing the given number then it wil print this
		
		System.out.println(n+"   is even number");
}
	else { 
		System.out.println(n+"  is odd number");
		}
	}
	
}
