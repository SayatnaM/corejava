package constructor;

public class CountTest {
	int count=0;
	CountTest(){
		count++;
		
	}
	public void showCount() {
		System.out.println(count);
	}
	public static void main(String[] args) {
		new CountTest().showCount();
		new CountTest().showCount();
		new CountTest().showCount();
	}

}
