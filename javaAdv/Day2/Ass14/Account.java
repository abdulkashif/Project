package javaAdvance.Day2.Ass14_Inheritance;

public class Account {
	
	private int accountNo;
	private Customer customer;
	protected double balance;
	
	Account(){}
	
	Account(int account, Customer customer, double balance){
		
		this.accountNo=account;
		this.customer=customer;
		this.balance=balance;
	}
	

	public Customer getCustomer() {
		return customer;
	}

	public double balanceEnquiry() {
		return balance;}
	
	public void deposit(double amount) {
		this.balance+=amount;
	}
	
	

}
