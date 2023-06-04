package methodoverriding;

public class NabilBank extends CentralBank {
	public static void main(String[] args) {
		
	}
	@Override
	protected void getBankName() {
		// TODO Auto-generated method stub
		System.out.println("Nabil Bank");
		//super.getBankName();
	}
	@Override
	protected void getInterestRate() {
		// TODO Auto-generated method stub
		System.out.println("0");
		//super.getInterestRate();
	}
	

}
