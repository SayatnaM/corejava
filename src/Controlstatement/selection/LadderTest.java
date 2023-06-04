package Controlstatement.selection;

public class LadderTest {
	
	/*
	 * 
	 * =========else if=============
	 * 
	 * Syntax:
	 * 
	 * 	if (condition-1){
	 * 
	 * 		}
	 * 		else if(Condition-2){
	 * 		}
	 * 		.........
	 * 		............
	 * 		......
	 * 		..
	 * 		else{
	 * 		}
	 * 		
	 * 
	 * 
	 * **/
	
	public static void main(String[] args) {
		
		int age =5;
		
		if (age>=70) {
				
				System.out.println(" Old Age!! Do rest");
			
		}
		else if(age>=45) {
				System.out.println("Adult.. do less work");
			
		}
		
		else if (age>=30) {
				System.out.println("Young do more work");
		}
		else if (age>=19) {
				System.out.println("Bachelor.... do party");
		}
		
		else if (age>=13) {
			
				System.out.println("Teenager");
			
		}
		else {
				System.out.println("Your are a child");
		}
	}

}
