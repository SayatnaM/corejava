package array;

import java.util.Arrays;

public class ArraywithMethod {
	
	/*
	 * ===============Array wih method================
	 * 
	 * a. array as parameter
	 * 
	 * 	void sum(int a , int b....50th)
	 * 
	 * 	void sum(int a[]){// array as a arguement 
	 * }
	 * b. Array as return type:
	 * 
	 * 	int[] getValue(){// array value halne ani retuen garne
	 * }
	 * return 500;
	 * */
	
	public static void main(String[] args) {
		int[] data = {1,2,3,5,2,64,31,64,31,64};
	//	addArray(data);
		//addArray(new int[] {10,2,3,5,2,64,31,64,31,64}); //can be passed like this //anonymous array w
		
		int[] odd= 	getOddNumsFrom1to100();
		System.out.println(Arrays.toString(odd));
		System.out.println(Arrays.toString(evenNos(data)));
	}
	//=================array as parameter===========
	static void addArray(int values[]) {
		int s=0;
		//int sv=values[0];
		for (int x:values) {
			s +=x;
			
			/*if(sv>x) {
				sv=x;
				
			}*/
		}
		
		System.out.println("total=" +s);
		//System.out.println("Smallest number"+sv);
	}
	// even number
	/*void evenNumber(int values[]) {
		int e=0;
		if (int ev:values) {
			
		}*/
		
		
	//==============array as return type================4
	
	static int[] getOddNumsFrom1to100() {
		int[] oddnos=new int[50];	
		int j=0;
		for (int i=1;i<=100;i++) {
			if(i%2 !=0) {
				oddnos[j]=i;
				j++;
				
			}
			
		}
		return oddnos;
		
	}
	static int[] evenNos()int values[] {
		int[] evenNos=new int[50];
		int size=0;
		 	for(int x:values) {
		 		if(x%2==0){
		 			size++;}
		 			
		 		}
		 			int[] evens=new int[size];
		 			int i=0;
		 			
		 			for (int x:value){
		 				if (x%2==0) {
		 					evenNos[i]=x;
		 					
		 				}
		 				
		 		}
		 		
	}
		
		return null;
		
	}
}
