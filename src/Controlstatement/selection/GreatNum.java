package Controlstatement.selection;

import java.util.Scanner;

public class GreatNum {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println(" Enter the first number");
		
		int a=sc.nextInt();
		
		System.out.println(" Enter the Second number");
		int b=sc.nextInt();
		
		if(a>b) {
			System.out.println(a+"  is the greatest number ");
			}
		else {
			System.out.println(b+ "   is the greatest number");
		}
	}
}
