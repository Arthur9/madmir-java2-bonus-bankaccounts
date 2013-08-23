
public class BankAccount {

	private int customerAccNumber;
	private float customerName;
	private double customerAccBalance;


//Overloaded Constructor
public void Customer (int accNum, float custName, int accBal){
	this.customerAccNumber = accNum;
	this.customerName = custName;
	this.customerAccBalance = accBal;
	
}

//Default constructor
public BankAccount() {
	this(0,0,0.0));
}

//Accessor Methods
public int getCustomerAccNumber(){
	return customerAccNumber;
}

public float getCustomerName(){
	return customerName;
}

public double getCustomerAccBalance(){
	return customerAccBalance;
}

//Mutator Methods
public void setCustomerAccNumber(int newAccNum){
	customerAccNumber = newAccNum;
}
public void setCustomerName(float newCustName){
	customerName = newCustName;
}
public void setCustomerAccBalance(double newAccBal){
	customerAccBalance = newAccBal;
}
}
