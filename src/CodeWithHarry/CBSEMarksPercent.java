package CodeWithHarry;

import java.util.Scanner;

public class CBSEMarksPercent {
	public static void main(String[] args) {
		
		
		/*System.out.println("Please enter the marks of Maths");
			int m=sc.nextInt();
		System.out.println("Sciene");
			int sci=sc.nextInt();
		System.out.println("Social");
			int so=sc.nextInt();
		int t=(so+sci+m);
	
		int tp=t/300;
		int ttp=tp*100;
		
		System.out.println(" Your total percentage for the test is  "+ttp+" %");*/
		
		/*System.out.println("Enter your marks of 5 subjects");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of subject 1");
        float a = sc.nextFloat();
        System.out.println("Enter marks of subject 2");
        float b = sc.nextFloat();
        System.out.println("Enter marks  of subject 3");
        float c = sc.nextFloat();
        System.out.println("Enter marks of subject 4");
        float d = sc.nextFloat();
        System.out.println("Enter marks of subject 5");
        float e = sc.nextFloat();
        System.out.println("Your percentage");
        float total = (a + b + c + d + e);
        float result = ((total / 500) * 100);
        System.out.println(result + "%");*/
		
		System.out.println("enter your 3 marks subject here");
		Scanner sc= new Scanner(System.in);
	System.out.println("enter maths");
	float m=sc.nextFloat();
	System.out.println("enter scince");
	float sci=sc.nextFloat();
	System.out.println("enter social");
	float so=sc.nextFloat();
	
	System.out.println(" your percentage");
	float t=(m+sci+so);
	float result= ((t/300)*100);
	System.out.println(" dududuududuudu  "+result+"%");
		
		
		/*=========check if it is integer or not
		System.out.println("enter ");
		Scanner sc=new Scanner(System.in);
		System.out.println(sc.hasNextInt());*/
		
		
		
	}

}
