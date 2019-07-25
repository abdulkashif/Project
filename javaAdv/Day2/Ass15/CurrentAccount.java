package javaAdvance.Day2.Ass15_Dynamic_Binding;

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




	public void withdrawAmount(double amount) {
		// TODO Auto-generated method stub
		if( this.balance-amount>=-this.getEligibilityAmount()) {
			this.balance-=amount;
		}
		else {
			System.out.println("low balance Alert..no withdrawl allowed");
		}
	}
	
}
