package encapsulation;

public class Customer {
	
	//POJO Model or entity class
	
	private int id;
	private String Name;
	private String city;
	public int getId() {
		return id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", Name=" + Name + ", city=" + city + "]";
	}
	
	

}
