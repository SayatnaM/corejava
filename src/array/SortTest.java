package array;

import java.util.Arrays;

public class SortTest {
	public static void main(String[] args) {
		int data[]= {1,2,3,5,6,65,5,45,45,4,54,54};
		Arrays.sort(data);// sort wala
		System.out.println(Arrays.toString(data));
		
		for (int i=data.length-1;i>=0;i--) {
			//System.out.print(data[i]+" ,");
			//descending order
			
		}
		Arrays.fill(data, 20);
		System.out.println(Arrays.toString(data));
	}

}
