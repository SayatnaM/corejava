package methodoverriding;

public class LaxmiBank extends CentralBank{
	
	@Override
	protected void getBankName() {
		
		System.out.println("Laxmi Bank");
	}
	@Override
	protected void getInterestRate() {
		
		System.out.println("1.5%");
	}

}
