package ATM;

import java.util.Scanner;

public class AnyTimeMachine {
	
	public static void main(String[] args) {
		Account a =new Account();
		a.setAvail_bal(50000);
		a.setTotal_bal(100000);
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println(" please enter the type of account balane you want to see");
		String balance= sc.next();
		
		//balance Inquiry, withdrawal, Deposit operation
		
		switch (balance) {
		
		case "current":
			System.out.println(" your current balance is = "+a.getAvail_bal());
			break;
		case "total":
			System.out.println("Your total balace is = "+a.getTotal_bal());
		break;
		default:
			System.out.println("Please enter valid type");
		}
		
	}

}
