package methodoverriding;

public class Test {
	public static void main(String[] args) {
		
		//static or early binding object
		NabilBank nb =new NabilBank();
		nb.getBankName();
		nb.getInterestRate();
		//up-casting
		CentralBank b=new CentralBank();
		b.getBankName();
		b.getInterestRate();
		
		
	}
	
	//late or dynamic binding of object
	
	//run time polymorphism
	void printBankInfo(CentralBank b) {
		b.getBankName();
		b.getInterestRate();
		
		//System.out.print(b.getBankName());
		
	}
}
