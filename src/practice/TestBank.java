package practice;

public class TestBank {
public static void main(String[] args) {
	Bank b1= new BankA();
	b1.getBalance();
	
	Bank b2=new BankB();
	b2.getBalance();
	Bank b3=new BankC();
	b3.getBalance();
}
}
