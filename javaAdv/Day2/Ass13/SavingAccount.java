package javaAdvance.Day2.Ass13_Inheritance;

public class SavingAccount extends Account {
	
	
	public int interest;
	
	
	 SavingAccount(int accountNo,String customerName, int balance,int interest){
		 this.accountNo=accountNo;
		 this.customerName=customerName;
		 this.balance=balance;
		 this.interest=interest;
	 }
	
	
	public int getInterest() {
		return interest;
	}
	public void setInterest(int interest) {
		this.interest = interest;
	}


	
	public int getMaxAmountWithdraw() {
		// TODO Auto-generated method stub
		return ((100+interest)*this.balance)-500;
	}


	@Override
	public void depositAmount(int amount) {
		// TODO Auto-generated method stub
		this.balance+=amount;
	}


	@Override
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
