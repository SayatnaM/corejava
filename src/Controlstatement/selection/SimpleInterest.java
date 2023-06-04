package Controlstatement.selection;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();
        if (principal <= 0) {
            System.out.println("Invalid input. Principal amount must be greater than 0.");
            return;
        }

        System.out.print("Enter the interest rate (as a percentage): ");
        double rate = input.nextDouble();
        if (rate <= 0) {
            System.out.println("Invalid input. Interest rate must be greater than 0.");
            return;
        }

        System.out.print("Enter the time period (in years): ");
        double time = input.nextDouble();
        if (time <= 0) {
            System.out.println("Invalid input. Time period must be greater than 0.");
            return;
        }

        double interest = (principal * rate * time) / 100;
        System.out.println("The simple interest is: " + interest);
    }
		
		
		
		
		}
		
	
	
		


