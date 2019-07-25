package javaAdvance.Day2.Ass13_Inheritance;

public class OverdraftAccount extends Account{

	
	public final int overdraftAmount ;
	
	public OverdraftAccount(int accountNo,String customerName, int balance,int overdraftAmount){
		 this.accountNo=accountNo;
		 this.customerName=customerName;
		 this.balance=balance;
		 this.overdraftAmount=overdraftAmount;
	 }

	

	public int getOverdraftAmount() {
		return overdraftAmount;
	}


	
	public int getMaxAmountWithdraw() {
		return this.balance+this.overdraftAmount;
	}


	public void depositAmount(int amount) {
		// TODO Auto-generated method stub
		this.balance+=amount;
	}



	public void withdrawAmount(int amount) {
		// TODO Auto-generated method stub
		if(amount<=getMaxAmountWithdraw() && this.balance-amount>=0) {
			this.balance-=amount;
		}
		else {
			System.out.println("low balance Alert..no withdrawl allowed");
		}
	}
	
}
