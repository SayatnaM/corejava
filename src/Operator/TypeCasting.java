package Operator;

public class TypeCasting {
	public static void main(String[] args) {
		/*=============Type Casting- change value type==================
		 * 
		 * syntax
		 * 	data type variable=(data_type) value;
		 * a. Implicit (auto Casting)
		 * 
		 * 	byte-. short->int ->long->float> double
		 * b. Explicit(by force)
		 * 
		 * 		double ->float-> long ->int ->byte
		 * */
		byte k=5;
		double c=k;// autocasting
		float p=6565.5454f;
		int m= (int)p;
		System.out.println(m);
		long v=(long)p;
		System.out.println(v);System.out.println(c);
		
		int a =45;
		int b =8;
		float c1=(float)a/b;
		System.out.println(c1);
		System.out.printf("%.2f",c1);// round to 2 decimals
		
		
	}

}
