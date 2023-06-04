package Method;

import java.util.Scanner;

public class CalculateArea {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter length");
		double l=sc.nextDouble();
		System.out.println("enter breadth");
		double b=sc.nextDouble();
		System.out.println("length is "+l+ "breadth  is  " +b);
		
		double area=getArea(50,50);
		System.out.println("Total Area is "+area);
		
	}
 

public static double getArea (double l, double b){
	double area=(l*b);
	
	return area;
}

}
