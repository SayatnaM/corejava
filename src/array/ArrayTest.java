package array;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		int age[]=new int[5];
		
		/*
		 * 0 1 2 3 4
		 * [][][][][][]
		 * ===age======
		 * 
		 * */
	//write data in array
	Scanner sc=new Scanner(System.in);
		for(int i=0;i<age.length;i++){
			System.out.println("enter your age");
			age[i]=sc.nextInt();
			
			
			
		}
		// read data from array
		for(int x:age) {
			System.out.println(x);
			
		}
		
		//WAP to store and print total and average of 10 Books 
}

}
