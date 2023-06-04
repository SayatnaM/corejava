package Controlstatement.selection;

public class SwitchTest {
	
	/*=============Switch =================
	 * 
	 * Syntax:
	 * 		switch (variable/expression){
	 * 
	 * 			case 1 :
	 * 			// Statement
	 * 			break;
	 * 
	 * 			case 2:
	 * 				//Statement
	 * 			break;
	 * 
	 * 			........
	 * 			........
	 * 			..........
	 * 			default:
	 *			//Statements
	 * 			 
	 * 
	 * 		}
	 * 
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
		int day=14;
		
		switch(day){
		
		case 1: System.out.println("sunday");
			break;
		case 2: System.out.println("Mon");
		break;
		case 3: System.out.println("Tue");
		break;
		case 4: System.out.println("Wed");
		break;
		case 5: System.out.println("Thur");
		break;
		case 6: System.out.println("Fir");
		break;
		case 7: System.out.println("sat");
		break;
		default:
			System.out.println("invalid");
		
		}
		
	}

}
