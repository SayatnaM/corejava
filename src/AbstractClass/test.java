package AbstractClass;

public class test {

	public static void main(String[] args) {
		CentralBank p=new PrabhuBank();
		p.getBankName();
		p.getInterestRate();
		
		UserService us=new UserServiceimp();
		us.addUser();
		us.deleteUser();
		us.print();
		
//		CommonService cs=new UserServiceimp();
//		cs.print();
		
		}
		
	
}
