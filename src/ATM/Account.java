package ATM;

public class Account {
//account number, pin,available balance, total balance
	
	String name;
	int pin;
	int avail_bal;
	int total_bal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public float getAvail_bal() {
		return avail_bal;
	}
	public void setAvail_bal(int avail_bal) {
		this.avail_bal = avail_bal;
	}
	public float getTotal_bal() {
		return total_bal;
	}
	public void setTotal_bal(int total_bal) {
		this.total_bal = total_bal;
	}
	
}
