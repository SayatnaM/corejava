package CodeWithHarry;

public class PracticeSet3 {
	public static void main(String[] args) {
		String s="Sayatna is a very very good girl. She has been a student of Broadway infosis.";
		//1. to lower case
		System.out.println(s.toLowerCase());
		//To replace spaces with underscores
		System.out.println(s.replace(' ', '_'));
		//Replace name with the given string
		
		String letter ="Dear <|name|>, Thank you";
		System.out.println(letter.replace("<|name|>", "sayatna"));
		System.out.println(s.indexOf(' '));
		
		// escape sequence characters
		
		System.out.println("Dear Harry,\nThis Java Course is nice.\n\t\t  Thank you");
		
	}
	
	

}
