package array;

import java.util.Scanner;

public class Book {
	
	//WAP to store and print total and average of 10 Books 
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int bookPrice[]=new int[5];
		
		for(int i=0;i<bookPrice.length;i++) {
			System.out.println("Enter the price of the books");
			bookPrice[i]=sc.nextInt();
			
		}
		
		for (int p:bookPrice) {
	
			System.out.println("The total of all the books is "+p);
			
		}
		
	}

}
