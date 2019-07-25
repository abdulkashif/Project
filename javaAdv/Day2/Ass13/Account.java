package javaAdvance.Day2.Ass13_Inheritance;

public abstract class Account {
	
	protected int accountNo;
	protected String customerName;
	protected int balance;
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public abstract int getMaxAmountWithdraw();
	
	public abstract void depositAmount(int amount);
	
	public abstract void withdrawAmount(int amount);
	
	

}
