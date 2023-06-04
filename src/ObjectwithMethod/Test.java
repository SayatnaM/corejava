package ObjectwithMethod;

public class Test {
	
	public static void main(String[] args) {
		
		
		
	Test t=new Test();
	Account account= t.getAcountData();
	t.printAccountData(account);
	}
	
		
		//===================object with parameter=======
		void printAccountData(Account ac) {
			
			System.out.println("Acc.Number=   "+ac.getNunber());
			System.out.println("NAme=   "+ac.getName());
			System.out.println("Bank=   "+ac.getBankName());
			System.out.println("Balance=   "+ac.getBalance());
			System.out.println("Acc.NType=   "+ac.getType());
					
			
		
	}
		
		//========Obejct as return type=======
		
		Account getAcountData() {
			Account a= new Account();
			a.setBankName("Sayatna");
			a.setBalance(50000);
			a.setNunber(123456789);
			a.setType("private");
			a.setName("Arjun");
			
			return null;
			
		}

}
