
public class TestBankAccount {

	//This is the Test for Bank Account
	public static void main(String[] args) {
	
		BankAccount billGates = new BankAccount(0,"0",0.0);
		Customer billGates = new Customer(4650,billGatesCustomerName,556789345.00);
		Customer markZuckerberg = new Customer(550665734000.00);
		Customer arthurSimon = new Customer();
		
		billGates.setAccNum(4651);
		billGates.setAccBal(99550555000.00);
		
		System.out.println(" Bill Gate's Account Number is " + billGates.getCustomerAccNumber() + " and his Account Balance is " + billGates.getCustomerAccBalance());
		System.out.println(" Mark Zuckerbert's Account Number is " + markZuckerberg.getCustomerAccNumber() + " and his Account Balance is " + markZuckerberg.getCustomerAccBalance());
		
		
	}

}
