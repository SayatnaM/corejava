package DataType;

import java.math.BigDecimal;
import java.math.BigInteger;

public class WrapperTest {
	public static void main(String[] args) {
		/*every primitive data type has respective class is known as Wrapper class
		 *
		 *Primitive type		Wrapper classs
		 *--------------		--------------
		 *byte					Byte
		 *short					Short
		 *int					Integer
		 *long					Long
		 *float					Float
		 *double				Double
		 *char					Char
		 *boolean				Boolean
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 **/
		// a is int variable only
		/*int a=5;
		
		x is int variable and object also
		Integer x=6;*/
		
		/*
		 * =============Auto Boxing=====================
		 * 
		 * Conversion of primitive type into wrapper type*/
		
		int p=3456;
		Integer m=p; // auto boxing
		
		//==============Auto Unboxing ================
		// Conversion of wrapper type into primitive type
		
		
		Double h=345643.4565;
		double l=h;// auto unboxing
		
		
		//System.out.println(a);System.out.println(x);
		
		//===========Big numbers===========
		//1. BigInteger
		//2. BigDecimal
		
		
		Integer a1= Integer.MAX_VALUE;
		Integer b1=Integer.MAX_VALUE;
		BigInteger c= BigInteger.valueOf(a1).add(BigInteger.valueOf(b1));
		
		BigDecimal bd= BigDecimal.valueOf(Double.MAX_VALUE).add(BigDecimal.valueOf(Double.MAX_VALUE));
		
	
		
		
		
		
		
	}

}
