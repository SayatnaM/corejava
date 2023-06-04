package constructor;

public class Triangle {
	int a1;
	int b1;
	int c1;
	
	public static void main(String[] args) {
		Triangle t=new Triangle(5,4,3);
		t.print();
		
		
	}
	

	
	Triangle  (int a, int b,int c){
	a1=a;
	b1=b;
	c1=c;
	int area=a+b+c;
	System.out.println(" Traiangle area= " +area);
	
	
	
	
}

void print() {
	System.out.println("a=  "+a1);
	System.out.println("b=  "+b1);
	System.out.println("c=  "+c1);
}



}
