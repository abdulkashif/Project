package javaAdv.Day3.Assignment26;
public class CurrentAccount extends Account{

	
	private double currentAmount ;
	
	CurrentAccount(){}
	
	public CurrentAccount(int accountNo,Customer customerName, double balance,double currentAmount){
		 super(accountNo,customerName,balance);
		 this.currentAmount=currentAmount;
	 }

	public double getEligibilityAmount() {
		
		return this.currentAmount+this.balance;
				
	}




	public void withdrawAmount(double amount) throws InsufficientBalanceExcpetion {
		// TODO Auto-generated method stub
		if(this.balanceEnquiry()<=amount) {
			throw new InsufficientBalanceExcpetion();
		}else {
			this.balance = this.balance-amount;
		}
	}
	
}