package Controlstatement.selection;

public class NestedIfTest {
	
	/*
	 * 	=================Nested if-else=============
	 * Syntax:
	 * 
	 * 	if (condition 1){
	 * 		
	 * 			if (Condition 2){
	 * 				
	 * 				if(condition-3){
	 * 
	 * 					.................
	 * 
	 * 					.................	
	 * 			}else{
	 * 			
	 * 			
	 * 			}else{
	 * 			
	 * 
	 * 				}
	 * 				}
	 * 				
	 * 
	 * 				}
	 *
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
		
		String Citizen="Nepali";
		int age=40;
		boolean haveVoterId= true;
		
		
			if (Citizen.equals("Nepali")) {
					
				if (age>=18) {
					
						
						if(haveVoterId) {
							System.out.println("u have voter id ");
							
						}else {
							System.out.println("you dont have voter idid");
							
						}
					
				}else {
					System.out.println("you are under age");
					
				}
				
			}
			else {
				
				System.out.println("Invalid Citizenship");
				
			}
		
	}

}
