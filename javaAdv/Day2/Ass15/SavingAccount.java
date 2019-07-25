package javaAdvance.Day2.Ass15_Dynamic_Binding;

public class SavingAccount extends Account {
	
	private double minimumBalance =500;;
	private int interestRate=12;
	
	 SavingAccount(){}
	 SavingAccount(int accountNo,Customer customerName, double balance){
		 super(accountNo,customerName,balance);
		 
	 }
	
	
	


	
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(this.balanceEnquiry()-amount>=minimumBalance) {
			this.balance=this.balanceEnquiry()-amount;
		}else {
			System.out.println("Failed:Minimum balance should be maintaned");
		}
	}


	public void calculateInterest() {
		System.out.println("Interest amount:"+this.balanceEnquiry()*interestRate);
	}
	
	
	

}
