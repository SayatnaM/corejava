package constructor;

public class User {

	String userName;
	String password;
	
	//===========Default Constructor================
	/*User(){
		userName="Sayatna";
		password="123456";
		
	}*/
	User(String u, String p){
		
		//this();// calling constructor (all type)
		u=userName;
		p=password;// instance variable calling
		//this.print(); // instant method calling
		/*
		 * 
		 * #this keyword represents current object
		 * # we call  instance variable, method and constructor using "this" keyword
		 * 
		 * */
		
	}
	// =============parameterized constructor
	void print() {
		System.out.println("Username=  "+userName);
		System.out.println("Pasword=  "+password);
	}
	
	public static void main(String[] args) {
		
      User u=new User("Ram", " 5648");//constructor "User()"// parameterized constructor User("","");
		u.print();
		//new User("Ramesh","55555").print();// if only one to be called or print
	}
	
}
