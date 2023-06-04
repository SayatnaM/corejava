package Controlstatement.selection;

import java.util.Scanner;

public class Iftest {
	/*if condition
	 * 
	 * syntax 
	 * if (condition)*/
public static void main(String[] args) {
	
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println(" enter the salary of employee");
	int salary= sc.nextInt();
	
	
	
	if(salary<20000){
		salary=salary+6000;
		
	}
	
	System.out.println("Total Salary=  "+salary);
	
}
}
