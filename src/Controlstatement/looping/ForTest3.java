package Controlstatement.looping;

import java.util.Scanner;

public class ForTest3 {
public static void main(String[] args) {
	System.out.println("enter range");
	int sn;
	int en;
	Scanner sc= new Scanner (System.in);
	System.out.println("enter start number");
	sn=sc.nextInt();
	System.out.println("enter end number");
	en=sc.nextInt();
	
	
	for (int i=sn;i<=en;i++) {
		System.out.println(i);
	}
	
}
}
