package ATM;

import java.util.Scanner;

public class BankDataBase {
	
static void Ram() {
	
	String name="Ram";
	String acNo="12345aaaa";
	String acType="Savings";
	String coName="National Insurance Co. Ltd";
	double phoneNo= 9841255262d;
	String address="Kalimati";
	int pin=5000;
	int avail_bal=25000;
	int total_bal=30000;
	
	
	System.out.println("Name of Account Holder ="+name);
	System.out.println("Account No.= "+acNo);
	System.out.println("type of Account in our Bank = "+acType);
	System.out.println("Company Name ="+coName);
	System.out.println("Address ="+address);
	System.out.println("Conact Number = "+phoneNo);
	System.out.println("Pin No of Mr."+name+" is ="+pin);
	System.out.println("Available Balance of MR. "+name+" is "+avail_bal);
	System.out.println("Total Balance of MR. "+name+" is "+total_bal);
}
static void Shyam() {
	
	String name="Shyam Shrestha";
	String acNo="456755aaa";
	String acType="Current";
	String coName="Big Holding Pvt Ltd";
	double phoneNo= 9851222132d;
	String address="Nuwakot";
	int pin=2558;
	int avail_bal=10000;
	int total_bal=15000;
	
	
	System.out.println("Name of Account Holder ="+name);
	System.out.println("Account No.= "+acNo);
	System.out.println("type of Account in our Bank = "+acType);
	System.out.println("Company Name ="+coName);
	System.out.println("Address ="+address);
	System.out.println("Conact Number = "+phoneNo);
	System.out.println("Pin No of Mr."+name+" is ="+pin);
	System.out.println("Available Balance of MR. "+name+" is "+avail_bal);
	System.out.println("Total Balance of MR. "+name+" is "+total_bal);
}
static void Hari() {
	
	String name="Hari Maharjan";
	String acNo="89456bbb";
	String acType="Savings";
	String coName="Logpoint Pvt Ltd";
	double phoneNo= 9845578555d;
	String address="Ramechhap";
	int pin=8502;
	int avail_bal=1000;
	int total_bal=20000;
	
	
	System.out.println("Name of Account Holder ="+name);
	System.out.println("Account No.= "+acNo);
	System.out.println("type of Account in our Bank = "+acType);
	System.out.println("Company Name ="+coName);
	System.out.println("Address ="+address);
	System.out.println("Conact Number = "+phoneNo);
	System.out.println("Pin No of Mr."+name+" is ="+pin);
	System.out.println("Available Balance of MR. "+name+" is "+avail_bal);
	System.out.println("Total Balance of MR. "+name+" is "+total_bal);
}
static void Krishna() {
	
	String name="Krishna";
	String acNo="56485aaa";
	String acType="Current";
	String coName="Everest Momo Center";
	double phoneNo= 9855648262d;
	String address="Sankhamul";
	int pin=7895;
	int avail_bal=12345;
	int total_bal=32678;
	
	
	System.out.println("Name of Account Holder \t=\t"+name);
	System.out.println("Account No. \t= \t"+acNo);
	System.out.println("type of Account in our Bank \t= \t"+acType);
	System.out.println("Company Name \t=\t"+coName);
	System.out.println("Address =\t"+address);
	System.out.println("Conact Number = \t"+phoneNo);
	System.out.println("Pin No of Mr."+name+" is =\t"+pin);
	System.out.println("Available Balance of MR. "+name+" is \t"+avail_bal);
	System.out.println("Total Balance of MR. "+name+" is \t"+total_bal);
}

public static void main(String[] args) {
	//System.out.println("Please enter your name for your details ");
	
	Scanner sc= new Scanner(System.in);
	System.out.println(" Please enter your name");
	String name =sc.next();
	
		if(name=="Ram") {
			Ram();}
		 else if (name=="Shyam"){
			Shyam();
			
		}else if (name=="Krishna") {
			Krishna();
		}else if(name=="Hari") {
			Hari();}
		else {
			System.out.println(" This name doesnot have the account in this bank");
		}
	
}
}
