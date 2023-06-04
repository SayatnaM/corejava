package oops;

public class CallTriangle {
	int a;
	int b;
	int c;
	int P;
	
	void getTraingleDetails(){
		System.out.println("1st Corner of the Triangle"+a);
		System.out.println(" 2nd Corner of the Triangle"+b);
		System.out.println("3rd Corner of the Triangle"+c);
		int P=a+b+c;
		System.out.println(" The perimeter of the Triangle is =  "+P);
	}
}
