package Controlstatement.looping;

public class ForTest2 {
	public static void main(String[] args) {
		
		int es=0;
		int os=0;
		//print 1 to 100
		for(int i=1;i<=100;i++) {
			//int s=0;
			//s +=i ;
			if (i%2==0) {
				es=es+i;
			}
			else {
				os=os+i;
			}
		}
		System.out.println("Sum Even"+es);
		System.out.println("sum Odd"+os);
		System.out.println("====================");
		System.out.println("\t Total"+(es+os));
	}

}
