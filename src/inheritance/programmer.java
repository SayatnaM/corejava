package inheritance;

public class programmer extends Employee {

	String progLang;
	String project;
	int bonus;
	
	void p() {
		super.p();
		
		System.out.println("Programming language=   "+progLang);
		System.out.println("Project=   "+project);
		System.out.println("Bonus=   "+bonus);
	}
}
