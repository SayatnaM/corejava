package AbstractClass;

public interface UserService extends CommonService{
	
	// service is methods
	//int MAX=700;
	//20 times//5
	void addUser();
	void deleteUser();
	void print();
	
	
	default void update(Integer a) {
		// self implementation in implementation class
	}
	
	static void getUser() {
		//common implementation for all impl. class
		
	}

}
