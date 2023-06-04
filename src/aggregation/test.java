package aggregation;

public class test {
	public static void main(String[] args) {
		
	
	Car c=new Car();
	c.setColor("Black");
	c.setCompany("Toyotaa");
	c.setModel("spring");
	c.setPrice(5000000);
	
	Employee em= new Employee();
	
	em.setCar(c);
	em.setId(1);
	em.setName("Sayatna");
	em.setPost("IT Head");
	em.setSalary(150000);
	
	System.out.println("  ID        =    "+em.getId());
	System.out.println("  Name      =    "+em.getName());
	System.out.println("  Salary    =    "+em.getSalary());
	System.out.println("  =========Car Info+=======");
	System.out.println("  Color     =    "+em.getCar().getColor());
	System.out.println("  model     =    "+em.getCar().getCompany());
	
	}
}
