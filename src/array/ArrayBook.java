package array;

public class ArrayBook {
	public static void main(String[] args) {
		int book[]=new int[10];
		
		for (int i=0;i<book.length;i++) {
			
			book[i]=250;
			
		}
		
		for (int total: book) {
			
			System.out.println(total);
			
		}
	}

}
