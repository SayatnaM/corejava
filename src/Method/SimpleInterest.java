package Method;

import java.util.Scanner;

public class SimpleInterest {

	
public static void main(String[] args) {
		
		input();
		
	}
	
	static void input() {
		 
		int amount,P,T,R;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter amount:");
		amount = sc.nextInt();
		
		System.out.println("Enter value of P:");
		P = sc.nextInt();
		
		System.out.println("Enter value of T:");
		T = sc.nextInt();
		
		System.out.println("Enter value of R:");
		R = sc.nextInt();
		
		processing(amount,P,T,R);
		
	}
	
	static void processing(double amount, int P, int T, int R) {
		
		double SI;
		SI = (P*T*R)/100;
		amount =amount +SI*amount;
		
		output(amount,SI);
		
	}
	
	static void output(double amount, double SI) {
		
		System.out.println("Simple Interest is:"+SI);
		System.out.println("Total Amount is:"+amount);
		
	
		
}



	static void input(int p, int t, int r) {
		processing(p,t,r);
		
	}
	
	static void processing(int p, int t, int r){
		float SI = (float)(p*t*r)/100;
		float amount = p + SI;
		output(SI, amount);
	}
	
	static void output(float SI, float a) {
		System.out.println("Simple Interest = " + SI);
		System.out.println("Amount= " +a);
	
	
			
	

	
	
}

}
