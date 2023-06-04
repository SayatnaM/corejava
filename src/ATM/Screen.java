package ATM;

public class Screen extends Account {
 public static void main(String[] args) {
	

	Account a= new Account();
	
	
	System.out.println("Please enter the name ofa account holder");
	
	a.setName("Sayatna"); 
	a.setPin(4500);
	a.setTotal_bal(100000);
	a.setAvail_bal(50000);
	
	
	System.out.println("Name of the Account Holder 		= "+a.getName());
	System.out.println("Pin Number					    = "+a.getPin());
	System.out.println("Available balance				= "+a.getAvail_bal());
	System.out.println("Total balance 					= "+a.getTotal_bal());
	
	
	
 }
}
