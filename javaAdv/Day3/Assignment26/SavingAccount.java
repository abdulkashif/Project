package javaAdv.Day3.Assignment26;
public class SavingAccount extends Account {
	
	private double minimumBalance =500;;
	private int interestRate=12;
	
	 SavingAccount(){}
	 SavingAccount(int accountNo,Customer customerName, double balance){
		 super(accountNo,customerName,balance);
		 
	 }
	
	
	


	
	public void withdraw(double amount) throws InsufficientBalanceExcpetion {
		// TODO Auto-generated method stub
		if(this.balanceEnquiry()<=amount) {
			throw new InsufficientBalanceExcpetion();
		}else {
			this.balance = this.balance-amount;
		}
	}


	public void calculateInterest() {
		System.out.println("Interest amount:"+this.balanceEnquiry()*interestRate);
	}
	
	
	

}